/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class FactSetTextConfig extends TextStyleConfig {
  private transient long swigCPtr;

  protected FactSetTextConfig(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.FactSetTextConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FactSetTextConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(FactSetTextConfig obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AdaptiveCardObjectModelJNI.delete_FactSetTextConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setWrap(boolean value) {
    AdaptiveCardObjectModelJNI.FactSetTextConfig_wrap_set(swigCPtr, this, value);
  }

  public boolean getWrap() {
    return AdaptiveCardObjectModelJNI.FactSetTextConfig_wrap_get(swigCPtr, this);
  }

  public void setMaxWidth(long value) {
    AdaptiveCardObjectModelJNI.FactSetTextConfig_maxWidth_set(swigCPtr, this, value);
  }

  public long getMaxWidth() {
    return AdaptiveCardObjectModelJNI.FactSetTextConfig_maxWidth_get(swigCPtr, this);
  }

  public static FactSetTextConfig Deserialize(JsonValue json, FactSetTextConfig defaultValue) {
    return new FactSetTextConfig(AdaptiveCardObjectModelJNI.FactSetTextConfig_Deserialize(JsonValue.getCPtr(json), json, FactSetTextConfig.getCPtr(defaultValue), defaultValue), true);
  }

  public FactSetTextConfig() {
    this(AdaptiveCardObjectModelJNI.new_FactSetTextConfig(), true);
  }

}
