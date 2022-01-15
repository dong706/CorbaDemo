package org.omg.hw.CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPushSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class ProxyPushSupplierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosEventChannelAdmin.ProxyPushSupplierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "connect_push_consumer", new java.lang.Integer(0));
		m_opsHash.put ( "disconnect_push_supplier", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/CosEventChannelAdmin/ProxyPushSupplier:1.0","IDL:omg.org/CosEventComm/PushSupplier:1.0"};
	public org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier _this()
	{
		return org.omg.hw.CosEventChannelAdmin.ProxyPushSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventChannelAdmin.ProxyPushSupplierHelper.narrow(_this_object(orb));
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
			case 0: // connect_push_consumer
			{
			try
			{
				org.omg.hw.CosEventComm.PushConsumer _arg0=org.omg.hw.CosEventComm.PushConsumerHelper.read(_input);
				_out = handler.createReply();
				connect_push_consumer(_arg0);
			}
			catch(org.omg.hw.CosEventChannelAdmin.TypeError _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosEventChannelAdmin.TypeErrorHelper.write(_out, _ex0);
			}
			catch(org.omg.hw.CosEventChannelAdmin.AlreadyConnected _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosEventChannelAdmin.AlreadyConnectedHelper.write(_out, _ex1);
			}
				break;
			}
			case 1: // disconnect_push_supplier
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
