package org.omg.hw.performance;
/**
 *	Generated from IDL definition of enum "InstanceEnum_T"
 *	@author JacORB IDL compiler 
 */

public final class InstanceEnum_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _DATA = 0;
	public static final InstanceEnum_T DATA = new InstanceEnum_T(_DATA);
	public static final int _TCA = 1;
	public static final InstanceEnum_T TCA = new InstanceEnum_T(_TCA);
	public int value()
	{
		return value;
	}
	public static InstanceEnum_T from_int(int value)
	{
		switch (value) {
			case _DATA: return DATA;
			case _TCA: return TCA;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _DATA: return "DATA";
			case _TCA: return "TCA";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected InstanceEnum_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
