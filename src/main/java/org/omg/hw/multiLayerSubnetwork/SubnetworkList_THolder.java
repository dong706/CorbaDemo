package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of alias "SubnetworkList_T"
 *	@author JacORB IDL compiler 
 */

public final class SubnetworkList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetwork_T[] value;

	public SubnetworkList_THolder ()
	{
	}
	public SubnetworkList_THolder (final org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetwork_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SubnetworkList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SubnetworkList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SubnetworkList_THelper.write (out,value);
	}
}
