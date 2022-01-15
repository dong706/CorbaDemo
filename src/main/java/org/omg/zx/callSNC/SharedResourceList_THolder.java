package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of alias "SharedResourceList_T"
 *	@author JacORB IDL compiler 
 */

public final class SharedResourceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.callSNC.SharedResource_T[] value;

	public SharedResourceList_THolder ()
	{
	}
	public SharedResourceList_THolder (final org.omg.zx.callSNC.SharedResource_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SharedResourceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SharedResourceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SharedResourceList_THelper.write (out,value);
	}
}
