package org.omg.hw.encapsulationLayerLink;

/**
 *	Generated from IDL interface "EncapsulationLayerLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public final class EncapsulationLayerLinkMgr_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EncapsulationLayerLinkMgr_I value;
	public EncapsulationLayerLinkMgr_IHolder()
	{
	}
	public EncapsulationLayerLinkMgr_IHolder (final EncapsulationLayerLinkMgr_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EncapsulationLayerLinkMgr_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EncapsulationLayerLinkMgr_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EncapsulationLayerLinkMgr_IHelper.write (_out,value);
	}
}
