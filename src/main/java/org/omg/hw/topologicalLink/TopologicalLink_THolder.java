package org.omg.hw.topologicalLink;

/**
 *	Generated from IDL definition of struct "TopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLink_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public org.omg.hw.topologicalLink.TopologicalLink_T value;

	public TopologicalLink_THolder ()
	{
	}
	public TopologicalLink_THolder(final org.omg.hw.topologicalLink.TopologicalLink_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return org.omg.hw.topologicalLink.TopologicalLink_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = org.omg.hw.topologicalLink.TopologicalLink_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		org.omg.hw.topologicalLink.TopologicalLink_THelper.write(_out, value);
	}
}
