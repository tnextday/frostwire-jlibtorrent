/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class listen_failed_alert extends alert {
  private long swigCPtr;

  protected listen_failed_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.listen_failed_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(listen_failed_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_listen_failed_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public listen_failed_alert(String iface, int op, error_code ec, listen_failed_alert.socket_type_t t) {
    this(libtorrent_jni.new_listen_failed_alert(iface, op, error_code.getCPtr(ec), ec, t.swigValue()), true);
  }

  public int type() {
    return libtorrent_jni.listen_failed_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.listen_failed_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.listen_failed_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.listen_failed_alert_message(swigCPtr, this);
  }

  public boolean discardable() {
    return libtorrent_jni.listen_failed_alert_discardable(swigCPtr, this);
  }

  public void set_interface(String value) {
    libtorrent_jni.listen_failed_alert__interface_set(swigCPtr, this, value);
  }

  public String get_interface() {
    return libtorrent_jni.listen_failed_alert__interface_get(swigCPtr, this);
  }

  public void setError(error_code value) {
    libtorrent_jni.listen_failed_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.listen_failed_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public void setOperation(int value) {
    libtorrent_jni.listen_failed_alert_operation_set(swigCPtr, this, value);
  }

  public int getOperation() {
    return libtorrent_jni.listen_failed_alert_operation_get(swigCPtr, this);
  }

  public void setSock_type(listen_failed_alert.socket_type_t value) {
    libtorrent_jni.listen_failed_alert_sock_type_set(swigCPtr, this, value.swigValue());
  }

  public listen_failed_alert.socket_type_t getSock_type() {
    return listen_failed_alert.socket_type_t.swigToEnum(libtorrent_jni.listen_failed_alert_sock_type_get(swigCPtr, this));
  }

  public enum socket_type_t {
    tcp,
    tcp_ssl,
    udp,
    i2p,
    socks5,
    utp_ssl;

    public final int swigValue() {
      return swigValue;
    }

    public static socket_type_t swigToEnum(int swigValue) {
      socket_type_t[] swigValues = socket_type_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (socket_type_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + socket_type_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private socket_type_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private socket_type_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private socket_type_t(socket_type_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

  public final static int alert_type = libtorrent_jni.listen_failed_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.listen_failed_alert_static_category_get();
  public enum op_t {
    parse_addr,
    open,
    bind,
    listen,
    get_peer_name,
    accept;

    public final int swigValue() {
      return swigValue;
    }

    public static op_t swigToEnum(int swigValue) {
      op_t[] swigValues = op_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (op_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + op_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private op_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private op_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private op_t(op_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
