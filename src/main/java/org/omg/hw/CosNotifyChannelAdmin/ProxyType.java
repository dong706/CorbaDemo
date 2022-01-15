package org.omg.hw.CosNotifyChannelAdmin;
/**
 *	Generated from IDL definition of enum "ProxyType"
 *	@author JacORB IDL compiler 
 */

public final class ProxyType
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PUSH_ANY = 0;
	public static final ProxyType PUSH_ANY = new ProxyType(_PUSH_ANY);
	public static final int _PULL_ANY = 1;
	public static final ProxyType PULL_ANY = new ProxyType(_PULL_ANY);
	public static final int _PUSH_STRUCTURED = 2;
	public static final ProxyType PUSH_STRUCTURED = new ProxyType(_PUSH_STRUCTURED);
	public static final int _PULL_STRUCTURED = 3;
	public static final ProxyType PULL_STRUCTURED = new ProxyType(_PULL_STRUCTURED);
	public static final int _PUSH_SEQUENCE = 4;
	public static final ProxyType PUSH_SEQUENCE = new ProxyType(_PUSH_SEQUENCE);
	public static final int _PULL_SEQUENCE = 5;
	public static final ProxyType PULL_SEQUENCE = new ProxyType(_PULL_SEQUENCE);
	public static final int _PUSH_TYPED = 6;
	public static final ProxyType PUSH_TYPED = new ProxyType(_PUSH_TYPED);
	public static final int _PULL_TYPED = 7;
	public static final ProxyType PULL_TYPED = new ProxyType(_PULL_TYPED);
	public int value()
	{
		return value;
	}
	public static ProxyType from_int(int value)
	{
		switch (value) {
			case _PUSH_ANY: return PUSH_ANY;
			case _PULL_ANY: return PULL_ANY;
			case _PUSH_STRUCTURED: return PUSH_STRUCTURED;
			case _PULL_STRUCTURED: return PULL_STRUCTURED;
			case _PUSH_SEQUENCE: return PUSH_SEQUENCE;
			case _PULL_SEQUENCE: return PULL_SEQUENCE;
			case _PUSH_TYPED: return PUSH_TYPED;
			case _PULL_TYPED: return PULL_TYPED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _PUSH_ANY: return "PUSH_ANY";
			case _PULL_ANY: return "PULL_ANY";
			case _PUSH_STRUCTURED: return "PUSH_STRUCTURED";
			case _PULL_STRUCTURED: return "PULL_STRUCTURED";
			case _PUSH_SEQUENCE: return "PUSH_SEQUENCE";
			case _PULL_SEQUENCE: return "PULL_SEQUENCE";
			case _PUSH_TYPED: return "PUSH_TYPED";
			case _PULL_TYPED: return "PULL_TYPED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProxyType(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
