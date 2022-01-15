package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of alias "MECoordinateList_T"
 *	@author JacORB IDL compiler 
 */

public final class MECoordinateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.zx.managedElement.MECoordinates_T[] value;

	public MECoordinateList_THolder ()
	{
	}
	public MECoordinateList_THolder (final org.omg.zx.managedElement.MECoordinates_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MECoordinateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MECoordinateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MECoordinateList_THelper.write (out,value);
	}
}
