package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of alias "CallAndTopLevelConnectionsAndSNCsList_T"
 *	@author JacORB IDL compiler 
 */

public final class CallAndTopLevelConnectionsAndSNCsList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCs_T[] value;

	public CallAndTopLevelConnectionsAndSNCsList_THolder ()
	{
	}
	public CallAndTopLevelConnectionsAndSNCsList_THolder (final org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCs_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CallAndTopLevelConnectionsAndSNCsList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallAndTopLevelConnectionsAndSNCsList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CallAndTopLevelConnectionsAndSNCsList_THelper.write (out,value);
	}
}
