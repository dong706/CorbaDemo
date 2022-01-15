package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class TransmissionDescriptorMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public TransmissionDescriptorMgr_I value;
	public TransmissionDescriptorMgr_IHolder()
	{
	}
	public TransmissionDescriptorMgr_IHolder (final TransmissionDescriptorMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return TransmissionDescriptorMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransmissionDescriptorMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		TransmissionDescriptorMgr_IHelper.write (_out,value);
	}
}
