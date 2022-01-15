package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of alias "CallIdList_T"
 *	@author JacORB IDL compiler 
 */

public final class CallIdList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public CallIdList_THolder ()
	{
	}
	public CallIdList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CallIdList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallIdList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CallIdList_THelper.write (out,value);
	}
}
