/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class BaseActionElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected BaseActionElement(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BaseActionElement obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_BaseActionElement(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public BaseActionElement(ActionType type) {
    this(AdaptiveCardObjectModelJNI.new_BaseActionElement(type.swigValue()), true);
  }

  public String GetElementTypeString() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_GetElementTypeString(swigCPtr, this);
  }

  public void SetElementTypeString(String value) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetElementTypeString(swigCPtr, this, value);
  }

  public String GetTitle() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_GetTitle(swigCPtr, this);
  }

  public void SetTitle(String value) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetTitle(swigCPtr, this, value);
  }

  public String GetId() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_GetId(swigCPtr, this);
  }

  public void SetId(String value) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetId(swigCPtr, this, value);
  }

  public ActionType GetElementType() {
    return ActionType.swigToEnum(AdaptiveCardObjectModelJNI.BaseActionElement_GetElementType(swigCPtr, this));
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.BaseActionElement_Serialize(swigCPtr, this);
  }

  public SWIGTYPE_p_Json__Value SerializeToJsonValue() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.BaseActionElement_SerializeToJsonValue(swigCPtr, this), true);
  }

  public SWIGTYPE_p_Json__Value GetAdditionalProperties() {
    return new SWIGTYPE_p_Json__Value(AdaptiveCardObjectModelJNI.BaseActionElement_GetAdditionalProperties(swigCPtr, this), true);
  }

  public void SetAdditionalProperties(SWIGTYPE_p_Json__Value additionalProperties) {
    AdaptiveCardObjectModelJNI.BaseActionElement_SetAdditionalProperties(swigCPtr, this, SWIGTYPE_p_Json__Value.getCPtr(additionalProperties));
  }

}
