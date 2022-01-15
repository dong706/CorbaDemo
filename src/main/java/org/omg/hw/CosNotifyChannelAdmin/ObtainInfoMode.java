package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ObtainInfoMode"
 *	@author JacORB IDL compiler 
 */

public final class ObtainInfoMode
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _ALL_NOW_UPDATES_OFF = 0;
	public static final ObtainInfoMode ALL_NOW_UPDATES_OFF = new ObtainInfoMode(_ALL_NOW_UPDATES_OFF);
	public static final int _ALL_NOW_UPDATES_ON = 1;
	public static final ObtainInfoMode ALL_NOW_UPDATES_ON = new ObtainInfoMode(_ALL_NOW_UPDATES_ON);
	public static final int _NONE_NOW_UPDATES_OFF = 2;
	public static final ObtainInfoMode NONE_NOW_UPDATES_OFF = new ObtainInfoMode(_NONE_NOW_UPDATES_OFF);
	public static final int _NONE_NOW_UPDATES_ON = 3;
	public static final ObtainInfoMode NONE_NOW_UPDATES_ON = new ObtainInfoMode(_NONE_NOW_UPDATES_ON);
	public int value()
	{
		return value;
	}
	public static ObtainInfoMode from_int(int value)
	{
		switch (value) {
			case _ALL_NOW_UPDATES_OFF: return ALL_NOW_UPDATES_OFF;
			case _ALL_NOW_UPDATES_ON: return ALL_NOW_UPDATES_ON;
			case _NONE_NOW_UPDATES_OFF: return NONE_NOW_UPDATES_OFF;
			case _NONE_NOW_UPDATES_ON: return NONE_NOW_UPDATES_ON;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _ALL_NOW_UPDATES_OFF: return "ALL_NOW_UPDATES_OFF";
			case _ALL_NOW_UPDATES_ON: return "ALL_NOW_UPDATES_ON";
			case _NONE_NOW_UPDATES_OFF: return "NONE_NOW_UPDATES_OFF";
			case _NONE_NOW_UPDATES_ON: return "NONE_NOW_UPDATES_ON";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ObtainInfoMode(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
