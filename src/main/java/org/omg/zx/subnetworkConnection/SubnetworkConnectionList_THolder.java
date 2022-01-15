package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of alias "SubnetworkConnectionList_T"
 *	@author JacORB IDL compiler 
 */

public final class SubnetworkConnectionList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.subnetworkConnection.SubnetworkConnection_T[] value;

	public SubnetworkConnectionList_THolder ()
	{
	}
	public SubnetworkConnectionList_THolder (final org.omg.zx.subnetworkConnection.SubnetworkConnection_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SubnetworkConnectionList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubnetworkConnectionList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SubnetworkConnectionList_THelper.write (out,value);
	}
}
