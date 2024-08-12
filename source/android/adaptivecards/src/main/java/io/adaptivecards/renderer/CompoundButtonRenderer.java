// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package io.adaptivecards.renderer;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;

import io.adaptivecards.objectmodel.BaseCardElement;
import io.adaptivecards.objectmodel.CompoundButton;
import io.adaptivecards.objectmodel.ContainerStyle;
import io.adaptivecards.objectmodel.ForegroundColor;
import io.adaptivecards.objectmodel.HostConfig;
import io.adaptivecards.objectmodel.IconStyle;
import io.adaptivecards.renderer.actionhandler.ICardActionHandler;
import io.adaptivecards.renderer.readonly.ContainerRenderer;

public class CompoundButtonRenderer extends BaseCardElementRenderer {
    protected CompoundButtonRenderer()
    {
    }

    public static CompoundButtonRenderer getInstance()
    {
        if (s_instance == null)
        {
            s_instance = new CompoundButtonRenderer();
        }

        return s_instance;
    }

    @Nullable
    @Override
    public View render(@NonNull RenderedAdaptiveCard renderedCard,
                       @NonNull Context context,
                       @NonNull FragmentManager fragmentManager,
                       @NonNull ViewGroup viewGroup,
                       @NonNull BaseCardElement baseCardElement,
                       ICardActionHandler cardActionHandler,
                       @NonNull HostConfig hostConfig,
                       @NonNull RenderArgs renderArgs) throws Exception {
        CompoundButton compoundButton = Util.castTo(baseCardElement, io.adaptivecards.objectmodel.CompoundButton.class);
        ViewGroup compoundButtonLayout = getCompoundButtonLayout(context, compoundButton, renderedCard, hostConfig, renderArgs);
        compoundButtonLayout.setTag(new TagContent(compoundButton));
        viewGroup.addView(compoundButtonLayout);
        ContainerRenderer.setSelectAction(renderedCard, compoundButton.GetSelectAction(), compoundButtonLayout, cardActionHandler, renderArgs);
        return compoundButtonLayout;
    }

    private ViewGroup getCompoundButtonLayout(Context context, CompoundButton compoundButton, RenderedAdaptiveCard renderedCard, HostConfig hostConfig, RenderArgs renderArgs) {
        ContainerStyle style = renderArgs.getContainerStyle();
        String foregroundColor = hostConfig.GetForegroundColor(style, ForegroundColor.Default, false);
        String backgroundColor = hostConfig.GetBackgroundColor(style);

        // Create a LinearLayout
        LinearLayout layout = new LinearLayout(context);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.setOrientation(LinearLayout.VERTICAL);
        int paddingPx = dpToPx(context, 8);
        layout.setPadding(paddingPx, paddingPx, paddingPx, paddingPx);

        boolean isIconSet = compoundButton.getIcon() != null && !compoundButton.getIcon().GetName().isEmpty();

        // Create the inner LinearLayout (horizontal orientation)
        LinearLayout innerLayout = new LinearLayout(context);
        innerLayout.setLayoutParams(new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT));
        innerLayout.setOrientation(LinearLayout.HORIZONTAL);
        innerLayout.setGravity(Gravity.CENTER_VERTICAL);

        // Optional Image View
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams iconParams = new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT);
        iconParams.setMarginEnd(dpToPx(context, 8));
        imageView.setLayoutParams(iconParams);

        if (!isIconSet) {
            imageView.setVisibility(View.GONE);
        } else {
            boolean isFilledStyle = compoundButton.getIcon().getIconStyle() == IconStyle.Filled;
            String svgInfoURL = compoundButton.getIcon().GetSVGInfoURL();
            String foregroundColorIcon = hostConfig.GetForegroundColor(ContainerStyle.Default, compoundButton.getIcon().getForgroundColor(), false);
            FluentIconImageLoaderAsync fluentIconImageLoaderAsync = new FluentIconImageLoaderAsync(
                renderedCard,
                Util.getFluentIconSize(compoundButton.getIcon().getIconSize()),
                foregroundColorIcon,
                isFilledStyle,
                imageView
            );
            fluentIconImageLoaderAsync.execute(svgInfoURL);
        }

        // Title TextView
        TextView titleTextView = new TextView(context);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT);
        titleParams.setMarginEnd(dpToPx(context, 8));
        titleTextView.setLayoutParams(titleParams);
        titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        titleTextView.setSingleLine(true);
        titleTextView.setTypeface(null, Typeface.BOLD);
        titleTextView.setTextSize(16);
        titleTextView.setTextColor(Color.parseColor(foregroundColor));
        titleTextView.setText(compoundButton.getTitle());

        // Badge TextView
        TextView badgeTextView = new TextView(context);
        LinearLayout.LayoutParams badgeParams = new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT);
        badgeTextView.setLayoutParams(badgeParams);
        badgeTextView.setTextSize(12);
        badgeTextView.setTextColor(Color.parseColor(backgroundColor));
        badgeTextView.setBackground(createCustomDrawable(context, hostConfig.GetCompoundButtonConfig().getBadgeConfig().getBackgroundColor(), 12));
        badgeTextView.setPadding(dpToPx(context, 8), dpToPx(context, 3), dpToPx(context, 8), dpToPx(context, 3));
        badgeTextView.setText(compoundButton.getBadge());
        if (compoundButton.getBadge().isEmpty()) {
            badgeTextView.setVisibility(View.GONE);
        }

        // Add the ImageView and TextViews to the inner LinearLayout
        innerLayout.addView(imageView);
        innerLayout.addView(titleTextView);
        innerLayout.addView(badgeTextView);

        // Description TextView
        TextView descriptionTextView = new TextView(context);
        LinearLayout.LayoutParams descriptionParams = new LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT);
        descriptionTextView.setLayoutParams(descriptionParams);
        descriptionTextView.setTextSize(14);
        descriptionTextView.setTextColor(Color.parseColor(foregroundColor));
        descriptionTextView.setText(compoundButton.getDescription());
        if (compoundButton.getDescription().isEmpty()){
            descriptionTextView.setVisibility(View.GONE);
        }

        // Add the inner LinearLayout and Description TextView to the root LinearLayout
        layout.addView(innerLayout);
        layout.addView(descriptionTextView);

        return layout;
    }

    public Drawable createCustomDrawable(Context context, String backgroundColor, int cornerRadius) {
        // Create a GradientDrawable for the shape
        GradientDrawable drawable = new GradientDrawable();

        // Set the shape to a rectangle
        drawable.setShape(GradientDrawable.RECTANGLE);

        // Set the solid color
        drawable.setColor(Color.parseColor(backgroundColor));

        // Set the corner radius
        float cornerRadiusPx = dpToPx(context, cornerRadius);
        drawable.setCornerRadii(new float[] {
            cornerRadiusPx, cornerRadiusPx, // top left, top right
            cornerRadiusPx, cornerRadiusPx, // bottom right, bottom left
            cornerRadiusPx, cornerRadiusPx, // bottom left, bottom right
            cornerRadiusPx, cornerRadiusPx  // top right, top left
        });

        return drawable;
    }

    // Helper method to convert dp to pixels
    private int dpToPx(Context context, int dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * density);
    }

    private static CompoundButtonRenderer s_instance = null;
}
