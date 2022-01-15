package org.omg.hw.CORBA;

/**
 *	Generated from IDL interface "NamedValue"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class NamedValuePOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CORBA.NamedValueOperations
{
	private String[] ids = {"IDL:CORBA/NamedValue:1.0"};
	public org.omg.hw.CORBA.NamedValue _this()
	{
		return org.omg.hw.CORBA.NamedValueHelper.narrow(_this_object());
	}
	public org.omg.hw.CORBA.NamedValue _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CORBA.NamedValueHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
