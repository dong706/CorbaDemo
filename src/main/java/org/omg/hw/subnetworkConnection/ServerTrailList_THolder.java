package org.omg.hw.subnetworkConnection;

/**
 *	Generated from IDL definition of alias "ServerTrailList_T"
 *	@author JacORB IDL compiler 
 */

public final class ServerTrailList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.subnetworkConnection.ServerTrail_T[] value;

	public ServerTrailList_THolder ()
	{
	}
	public ServerTrailList_THolder (final org.omg.hw.subnetworkConnection.ServerTrail_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ServerTrailList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ServerTrailList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ServerTrailList_THelper.write (out,value);
	}
}
