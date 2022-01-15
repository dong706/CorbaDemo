package org.omg.hw.CosEventComm;

/**
 *	Generated from IDL interface "PushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class PushSupplierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosEventComm.PushSupplierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "disconnect_push_supplier", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:omg.org/CosEventComm/PushSupplier:1.0"};
	public org.omg.hw.CosEventComm.PushSupplier _this()
	{
		return org.omg.hw.CosEventComm.PushSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventComm.PushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventComm.PushSupplierHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // disconnect_push_supplier
			{
				_out = handler.createReply();
				disconnect_push_supplier();
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
