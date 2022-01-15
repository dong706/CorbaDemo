package org.omg.zx.aSAP;
/**
 *	Generated from IDL definition of enum "AssignedSeverity_T"
 *	@author JacORB IDL compiler 
 */

public final class AssignedSeverity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public AssignedSeverity_T value;

	public AssignedSeverity_THolder ()
	{
	}
	public AssignedSeverity_THolder (final AssignedSeverity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AssignedSeverity_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AssignedSeverity_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AssignedSeverity_THelper.write (out,value);
	}
}
