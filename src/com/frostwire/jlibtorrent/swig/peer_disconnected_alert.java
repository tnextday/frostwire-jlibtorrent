/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_disconnected_alert extends peer_alert {
  private long swigCPtr;

  protected peer_disconnected_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.peer_disconnected_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_disconnected_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_disconnected_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public peer_disconnected_alert(torrent_handle h, tcp_endpoint ep, sha1_hash peer_id, SWIGTYPE_p_operation_t op, int type, error_code e) {
    this(libtorrent_jni.new_peer_disconnected_alert(torrent_handle.getCPtr(h), h, tcp_endpoint.getCPtr(ep), ep, sha1_hash.getCPtr(peer_id), peer_id, SWIGTYPE_p_operation_t.getCPtr(op), type, error_code.getCPtr(e), e), true);
  }

  public int type() {
    return libtorrent_jni.peer_disconnected_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.peer_disconnected_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.peer_disconnected_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.peer_disconnected_alert_message(swigCPtr, this);
  }

  public void setSocket_type(int value) {
    libtorrent_jni.peer_disconnected_alert_socket_type_set(swigCPtr, this, value);
  }

  public int getSocket_type() {
    return libtorrent_jni.peer_disconnected_alert_socket_type_get(swigCPtr, this);
  }

  public void setOperation(SWIGTYPE_p_operation_t value) {
    libtorrent_jni.peer_disconnected_alert_operation_set(swigCPtr, this, SWIGTYPE_p_operation_t.getCPtr(value));
  }

  public SWIGTYPE_p_operation_t getOperation() {
    return new SWIGTYPE_p_operation_t(libtorrent_jni.peer_disconnected_alert_operation_get(swigCPtr, this), true);
  }

  public void setError(error_code value) {
    libtorrent_jni.peer_disconnected_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.peer_disconnected_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public final static int alert_type = libtorrent_jni.peer_disconnected_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.peer_disconnected_alert_static_category_get();
}
