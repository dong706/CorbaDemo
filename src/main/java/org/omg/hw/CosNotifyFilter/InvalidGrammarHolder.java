package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidGrammar"
 *	@author JacORB IDL compiler 
 */

public final class InvalidGrammarHolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.CosNotifyFilter.InvalidGrammar value;

	public InvalidGrammarHolder ()
	{
	}
	public InvalidGrammarHolder(final org.omg.hw.CosNotifyFilter.InvalidGrammar initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.CosNotifyFilter.InvalidGrammarHelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.CosNotifyFilter.InvalidGrammarHelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.CosNotifyFilter.InvalidGrammarHelper.write(_out, value);
	}
}
