package org.omg.hw.performance;
/**
 *	Generated from IDL definition of enum "ActivityStatusEnum_T"
 *	@author JacORB IDL compiler 
 */

public final class ActivityStatusEnum_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _NOT_STARTED = 0;
	public static final ActivityStatusEnum_T NOT_STARTED = new ActivityStatusEnum_T(_NOT_STARTED);
	public static final int _ACTIVE = 1;
	public static final ActivityStatusEnum_T ACTIVE = new ActivityStatusEnum_T(_ACTIVE);
	public static final int _SUSPENDED = 2;
	public static final ActivityStatusEnum_T SUSPENDED = new ActivityStatusEnum_T(_SUSPENDED);
	public int value()
	{
		return value;
	}
	public static ActivityStatusEnum_T from_int(int value)
	{
		switch (value) {
			case _NOT_STARTED: return NOT_STARTED;
			case _ACTIVE: return ACTIVE;
			case _SUSPENDED: return SUSPENDED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NOT_STARTED: return "NOT_STARTED";
			case _ACTIVE: return "ACTIVE";
			case _SUSPENDED: return "SUSPENDED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ActivityStatusEnum_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
