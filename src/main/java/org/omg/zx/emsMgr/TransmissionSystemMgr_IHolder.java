package org.omg.zx.emsMgr;

/**
 *	Generated from IDL interface "TransmissionSystemMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class TransmissionSystemMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransmissionSystemMgr_I value;
	public TransmissionSystemMgr_IHolder()
	{
	}
	public TransmissionSystemMgr_IHolder (final TransmissionSystemMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransmissionSystemMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransmissionSystemMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransmissionSystemMgr_IHelper.write (_out,value);
	}
}
