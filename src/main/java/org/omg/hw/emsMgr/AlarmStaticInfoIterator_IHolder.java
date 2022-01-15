package org.omg.hw.emsMgr;

/**
 *	Generated from IDL interface "AlarmStaticInfoIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class AlarmStaticInfoIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public AlarmStaticInfoIterator_I value;
	public AlarmStaticInfoIterator_IHolder()
	{
	}
	public AlarmStaticInfoIterator_IHolder (final AlarmStaticInfoIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return AlarmStaticInfoIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AlarmStaticInfoIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		AlarmStaticInfoIterator_IHelper.write (_out,value);
	}
}
