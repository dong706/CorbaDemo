package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of alias "CallAndTopLevelConnectionsList_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnectionsList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.callSNC.CallAndTopLevelConnections_T[] value;

	public CallAndTopLevelConnectionsList_THolder ()
	{
	}
	public CallAndTopLevelConnectionsList_THolder (final org.omg.zx.callSNC.CallAndTopLevelConnections_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CallAndTopLevelConnectionsList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallAndTopLevelConnectionsList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CallAndTopLevelConnectionsList_THelper.write (out,value);
	}
}
