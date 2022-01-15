package org.omg.hw.CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ConsumerAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class ConsumerAdminPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosEventChannelAdmin.ConsumerAdminOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "obtain_pull_supplier", new java.lang.Integer(0));
		m_opsHash.put ( "obtain_push_supplier", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0"};
	public org.omg.hw.CosEventChannelAdmin.ConsumerAdmin _this()
	{
		return org.omg.hw.CosEventChannelAdmin.ConsumerAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventChannelAdmin.ConsumerAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventChannelAdmin.ConsumerAdminHelper.narrow(_this_object(orb));
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
			case 0: // obtain_pull_supplier
			{
				_out = handler.createReply();
				org.omg.hw.CosEventChannelAdmin.ProxyPullSupplierHelper.write(_out,obtain_pull_supplier());
				break;
			}
			case 1: // obtain_push_supplier
			{
				_out = handler.createReply();
				org.omg.hw.CosEventChannelAdmin.ProxyPushSupplierHelper.write(_out,obtain_push_supplier());
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
