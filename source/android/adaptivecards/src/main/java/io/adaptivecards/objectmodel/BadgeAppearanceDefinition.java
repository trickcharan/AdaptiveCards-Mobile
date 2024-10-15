/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class BadgeAppearanceDefinition {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BadgeAppearanceDefinition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BadgeAppearanceDefinition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_BadgeAppearanceDefinition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBackgroundColor(String value) {
    AdaptiveCardObjectModelJNI.BadgeAppearanceDefinition_backgroundColor_set(swigCPtr, this, value);
  }

  public String getBackgroundColor() {
    return AdaptiveCardObjectModelJNI.BadgeAppearanceDefinition_backgroundColor_get(swigCPtr, this);
  }

  public void setStrokeColor(String value) {
    AdaptiveCardObjectModelJNI.BadgeAppearanceDefinition_strokeColor_set(swigCPtr, this, value);
  }

  public String getStrokeColor() {
    return AdaptiveCardObjectModelJNI.BadgeAppearanceDefinition_strokeColor_get(swigCPtr, this);
  }

  public void setTextColor(String value) {
    AdaptiveCardObjectModelJNI.BadgeAppearanceDefinition_textColor_set(swigCPtr, this, value);
  }

  public String getTextColor() {
    return AdaptiveCardObjectModelJNI.BadgeAppearanceDefinition_textColor_get(swigCPtr, this);
  }

  public static BadgeAppearanceDefinition Deserialize(JsonValue json, BadgeAppearanceDefinition defaultValue) {
    return new BadgeAppearanceDefinition(AdaptiveCardObjectModelJNI.BadgeAppearanceDefinition_Deserialize(JsonValue.getCPtr(json), json, BadgeAppearanceDefinition.getCPtr(defaultValue), defaultValue), true);
  }

  public BadgeAppearanceDefinition() {
    this(AdaptiveCardObjectModelJNI.new_BadgeAppearanceDefinition(), true);
  }

}
