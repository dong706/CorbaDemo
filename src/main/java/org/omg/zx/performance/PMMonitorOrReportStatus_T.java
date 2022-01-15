package org.omg.zx.performance;
/**
 *	Generated from IDL definition of enum "PMMonitorOrReportStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class PMMonitorOrReportStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _Locked = 0;
	public static final PMMonitorOrReportStatus_T Locked = new PMMonitorOrReportStatus_T(_Locked);
	public static final int _Unlocked = 1;
	public static final PMMonitorOrReportStatus_T Unlocked = new PMMonitorOrReportStatus_T(_Unlocked);
	public int value()
	{
		return value;
	}
	public static PMMonitorOrReportStatus_T from_int(int value)
	{
		switch (value) {
			case _Locked: return Locked;
			case _Unlocked: return Unlocked;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _Locked: return "Locked";
			case _Unlocked: return "Unlocked";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected PMMonitorOrReportStatus_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
