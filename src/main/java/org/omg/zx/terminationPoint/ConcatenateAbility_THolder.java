package org.omg.zx.terminationPoint;
/**
 *	Generated from IDL definition of enum "ConcatenateAbility_T"
 *	@author JacORB IDL compiler 
 */

public final class ConcatenateAbility_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public ConcatenateAbility_T value;

	public ConcatenateAbility_THolder ()
	{
	}
	public ConcatenateAbility_THolder (final ConcatenateAbility_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ConcatenateAbility_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ConcatenateAbility_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ConcatenateAbility_THelper.write (out,value);
	}
}
