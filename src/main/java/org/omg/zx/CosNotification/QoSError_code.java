package org.omg.zx.CosNotification;
/**
 *	Generated from IDL definition of enum "QoSError_code"
 *	@author JacORB IDL compiler 
 */

public final class QoSError_code
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _UNSUPPORTED_PROPERTY = 0;
	public static final QoSError_code UNSUPPORTED_PROPERTY = new QoSError_code(_UNSUPPORTED_PROPERTY);
	public static final int _UNAVAILABLE_PROPERTY = 1;
	public static final QoSError_code UNAVAILABLE_PROPERTY = new QoSError_code(_UNAVAILABLE_PROPERTY);
	public static final int _UNSUPPORTED_VALUE = 2;
	public static final QoSError_code UNSUPPORTED_VALUE = new QoSError_code(_UNSUPPORTED_VALUE);
	public static final int _UNAVAILABLE_VALUE = 3;
	public static final QoSError_code UNAVAILABLE_VALUE = new QoSError_code(_UNAVAILABLE_VALUE);
	public static final int _BAD_PROPERTY = 4;
	public static final QoSError_code BAD_PROPERTY = new QoSError_code(_BAD_PROPERTY);
	public static final int _BAD_TYPE = 5;
	public static final QoSError_code BAD_TYPE = new QoSError_code(_BAD_TYPE);
	public static final int _BAD_VALUE = 6;
	public static final QoSError_code BAD_VALUE = new QoSError_code(_BAD_VALUE);
	public int value()
	{
		return value;
	}
	public static QoSError_code from_int(int value)
	{
		switch (value) {
			case _UNSUPPORTED_PROPERTY: return UNSUPPORTED_PROPERTY;
			case _UNAVAILABLE_PROPERTY: return UNAVAILABLE_PROPERTY;
			case _UNSUPPORTED_VALUE: return UNSUPPORTED_VALUE;
			case _UNAVAILABLE_VALUE: return UNAVAILABLE_VALUE;
			case _BAD_PROPERTY: return BAD_PROPERTY;
			case _BAD_TYPE: return BAD_TYPE;
			case _BAD_VALUE: return BAD_VALUE;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _UNSUPPORTED_PROPERTY: return "UNSUPPORTED_PROPERTY";
			case _UNAVAILABLE_PROPERTY: return "UNAVAILABLE_PROPERTY";
			case _UNSUPPORTED_VALUE: return "UNSUPPORTED_VALUE";
			case _UNAVAILABLE_VALUE: return "UNAVAILABLE_VALUE";
			case _BAD_PROPERTY: return "BAD_PROPERTY";
			case _BAD_TYPE: return "BAD_TYPE";
			case _BAD_VALUE: return "BAD_VALUE";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected QoSError_code(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
