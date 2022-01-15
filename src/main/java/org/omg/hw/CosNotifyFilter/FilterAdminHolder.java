package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL interface "FilterAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class FilterAdminHolder	implements org.omg.CORBA.portable.Streamable{
	 public FilterAdmin value;
	public FilterAdminHolder()
	{
	}
	public FilterAdminHolder (final FilterAdmin initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return FilterAdminHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = FilterAdminHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		FilterAdminHelper.write (_out,value);
	}
}
