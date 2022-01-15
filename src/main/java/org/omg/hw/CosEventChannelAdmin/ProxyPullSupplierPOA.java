package org.omg.hw.CosEventChannelAdmin;

/**
 *	Generated from IDL interface "ProxyPullSupplier"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class ProxyPullSupplierPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosEventChannelAdmin.ProxyPullSupplierOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "disconnect_pull_supplier", new java.lang.Integer(0));
		m_opsHash.put ( "pull", new java.lang.Integer(1));
		m_opsHash.put ( "connect_pull_consumer", new java.lang.Integer(2));
		m_opsHash.put ( "try_pull", new java.lang.Integer(3));
	}
	private String[] ids = {"IDL:omg.org/CosEventChannelAdmin/ProxyPullSupplier:1.0","IDL:omg.org/CosEventComm/PullSupplier:1.0"};
	public org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier _this()
	{
		return org.omg.hw.CosEventChannelAdmin.ProxyPullSupplierHelper.narrow(_this_object());
	}
	public org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosEventChannelAdmin.ProxyPullSupplierHelper.narrow(_this_object(orb));
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
			case 0: // disconnect_pull_supplier
			{
				_out = handler.createReply();
				disconnect_pull_supplier();
				break;
			}
			case 1: // pull
			{
			try
			{
				_out = handler.createReply();
				_out.write_any(pull());
			}
			catch(org.omg.hw.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // connect_pull_consumer
			{
			try
			{
				org.omg.hw.CosEventComm.PullConsumer _arg0=org.omg.hw.CosEventComm.PullConsumerHelper.read(_input);
				_out = handler.createReply();
				connect_pull_consumer(_arg0);
			}
			catch(org.omg.hw.CosEventChannelAdmin.AlreadyConnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosEventChannelAdmin.AlreadyConnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // try_pull
			{
			try
			{
				org.omg.CORBA.BooleanHolder _arg0= new org.omg.CORBA.BooleanHolder();
				_out = handler.createReply();
				_out.write_any(try_pull(_arg0));
				_out.write_boolean(_arg0.value);
			}
			catch(org.omg.hw.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
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
