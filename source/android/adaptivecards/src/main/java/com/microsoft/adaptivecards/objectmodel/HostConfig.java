/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class HostConfig {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected HostConfig(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HostConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_HostConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFontFamily(String value) {
    AdaptiveCardObjectModelJNI.HostConfig_fontFamily_set(swigCPtr, this, value);
  }

  public String getFontFamily() {
    return AdaptiveCardObjectModelJNI.HostConfig_fontFamily_get(swigCPtr, this);
  }

  public void setFontSizes(FontSizesConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_fontSizes_set(swigCPtr, this, FontSizesConfig.getCPtr(value), value);
  }

  public FontSizesConfig getFontSizes() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_fontSizes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FontSizesConfig(cPtr, false);
  }

  public void setSupportsInteractivity(boolean value) {
    AdaptiveCardObjectModelJNI.HostConfig_supportsInteractivity_set(swigCPtr, this, value);
  }

  public boolean getSupportsInteractivity() {
    return AdaptiveCardObjectModelJNI.HostConfig_supportsInteractivity_get(swigCPtr, this);
  }

  public void setColors(ColorsConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_colors_set(swigCPtr, this, ColorsConfig.getCPtr(value), value);
  }

  public ColorsConfig getColors() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_colors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ColorsConfig(cPtr, false);
  }

  public void setImageSizes(ImageSizesConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_imageSizes_set(swigCPtr, this, ImageSizesConfig.getCPtr(value), value);
  }

  public ImageSizesConfig getImageSizes() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_imageSizes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageSizesConfig(cPtr, false);
  }

  public void setMaxActions(long value) {
    AdaptiveCardObjectModelJNI.HostConfig_maxActions_set(swigCPtr, this, value);
  }

  public long getMaxActions() {
    return AdaptiveCardObjectModelJNI.HostConfig_maxActions_get(swigCPtr, this);
  }

  public void setSeparatorThickness(SeparatorThicknessConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_separatorThickness_set(swigCPtr, this, SeparatorThicknessConfig.getCPtr(value), value);
  }

  public SeparatorThicknessConfig getSeparatorThickness() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_separatorThickness_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SeparatorThicknessConfig(cPtr, false);
  }

  public void setSpacing(SpacingConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_spacing_set(swigCPtr, this, SpacingConfig.getCPtr(value), value);
  }

  public SpacingConfig getSpacing() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_spacing_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SpacingConfig(cPtr, false);
  }

  public void setAdaptiveCard(AdaptiveCardConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_adaptiveCard_set(swigCPtr, this, AdaptiveCardConfig.getCPtr(value), value);
  }

  public AdaptiveCardConfig getAdaptiveCard() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_adaptiveCard_get(swigCPtr, this);
    return (cPtr == 0) ? null : new AdaptiveCardConfig(cPtr, false);
  }

  public void setImageSet(ImageSetConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_imageSet_set(swigCPtr, this, ImageSetConfig.getCPtr(value), value);
  }

  public ImageSetConfig getImageSet() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_imageSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ImageSetConfig(cPtr, false);
  }

  public void setFactSet(FactSetConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_factSet_set(swigCPtr, this, FactSetConfig.getCPtr(value), value);
  }

  public FactSetConfig getFactSet() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_factSet_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FactSetConfig(cPtr, false);
  }

  public void setContainer(ContainerConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_container_set(swigCPtr, this, ContainerConfig.getCPtr(value), value);
  }

  public ContainerConfig getContainer() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_container_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ContainerConfig(cPtr, false);
  }

  public void setActions(ActionsConfig value) {
    AdaptiveCardObjectModelJNI.HostConfig_actions_set(swigCPtr, this, ActionsConfig.getCPtr(value), value);
  }

  public ActionsConfig getActions() {
    long cPtr = AdaptiveCardObjectModelJNI.HostConfig_actions_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ActionsConfig(cPtr, false);
  }

  public static HostConfig Deserialize(SWIGTYPE_p_Json__Value json) {
    return new HostConfig(AdaptiveCardObjectModelJNI.HostConfig_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(json)), true);
  }

  public static HostConfig DeserializeFromString(String jsonString) {
    return new HostConfig(AdaptiveCardObjectModelJNI.HostConfig_DeserializeFromString(jsonString), true);
  }

  public HostConfig() {
    this(AdaptiveCardObjectModelJNI.new_HostConfig(), true);
  }

}
