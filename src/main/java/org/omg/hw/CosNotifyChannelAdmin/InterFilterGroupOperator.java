package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "InterFilterGroupOperator"
 *	@author JacORB IDL compiler 
 */

public final class InterFilterGroupOperator
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _AND_OP = 0;
	public static final InterFilterGroupOperator AND_OP = new InterFilterGroupOperator(_AND_OP);
	public static final int _OR_OP = 1;
	public static final InterFilterGroupOperator OR_OP = new InterFilterGroupOperator(_OR_OP);
	public int value()
	{
		return value;
	}
	public static InterFilterGroupOperator from_int(int value)
	{
		switch (value) {
			case _AND_OP: return AND_OP;
			case _OR_OP: return OR_OP;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _AND_OP: return "AND_OP";
			case _OR_OP: return "OR_OP";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected InterFilterGroupOperator(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
