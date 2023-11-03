/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public class StdOptionalHorizontalAlignment {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StdOptionalHorizontalAlignment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StdOptionalHorizontalAlignment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(StdOptionalHorizontalAlignment obj) {
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
        AdaptiveCardObjectModelJNI.delete_StdOptionalHorizontalAlignment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdOptionalHorizontalAlignment() {
    this(AdaptiveCardObjectModelJNI.new_StdOptionalHorizontalAlignment__SWIG_0(), true);
  }

  public StdOptionalHorizontalAlignment(HorizontalAlignment arg0) {
    this(AdaptiveCardObjectModelJNI.new_StdOptionalHorizontalAlignment__SWIG_1(arg0.swigValue()), true);
  }

  public boolean has_value() {
    return AdaptiveCardObjectModelJNI.StdOptionalHorizontalAlignment_has_value(swigCPtr, this);
  }

  public HorizontalAlignment value() {
    return HorizontalAlignment.swigToEnum(AdaptiveCardObjectModelJNI.StdOptionalHorizontalAlignment_value(swigCPtr, this));
  }

}
