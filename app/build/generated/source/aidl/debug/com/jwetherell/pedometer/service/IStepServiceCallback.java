/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\remya\\AndroidStudioProjects\\android-fitness-application\\app\\src\\main\\aidl\\com\\jwetherell\\pedometer\\service\\IStepServiceCallback.aidl
 */
package com.jwetherell.pedometer.service;
public interface IStepServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.jwetherell.pedometer.service.IStepServiceCallback
{
private static final java.lang.String DESCRIPTOR = "com.jwetherell.pedometer.service.IStepServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.jwetherell.pedometer.service.IStepServiceCallback interface,
 * generating a proxy if needed.
 */
public static com.jwetherell.pedometer.service.IStepServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.jwetherell.pedometer.service.IStepServiceCallback))) {
return ((com.jwetherell.pedometer.service.IStepServiceCallback)iin);
}
return new com.jwetherell.pedometer.service.IStepServiceCallback.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_stepsChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.stepsChanged(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.jwetherell.pedometer.service.IStepServiceCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void stepsChanged(int value) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(value);
mRemote.transact(Stub.TRANSACTION_stepsChanged, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_stepsChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void stepsChanged(int value) throws android.os.RemoteException;
}
