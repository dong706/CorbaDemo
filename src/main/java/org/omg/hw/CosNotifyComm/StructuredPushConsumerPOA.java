package org.omg.hw.CosNotifyComm;

/**
 *	Generated from IDL interface "StructuredPushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class StructuredPushConsumerPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosNotifyComm.StructuredPushConsumerOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "offer_change", new java.lang.Integer(0));
		m_opsHash.put ( "push_structured_event", new java.lang.Integer(1));
		m_opsHash.put ( "disconnect_structured_push_consumer", new java.lang.Integer(2));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyComm/StructuredPushConsumer:1.0","IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"};
	public org.omg.hw.CosNotifyComm.StructuredPushConsumer _this()
	{
		return org.omg.hw.CosNotifyComm.StructuredPushConsumerHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyComm.StructuredPushConsumer _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyComm.StructuredPushConsumerHelper.narrow(_this_object(orb));
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
			case 0: // offer_change
			{
			try
			{
				org.omg.hw.CosNotification.EventType[] _arg0=org.omg.hw.CosNotification.EventTypeSeqHelper.read(_input);
				org.omg.hw.CosNotification.EventType[] _arg1=org.omg.hw.CosNotification.EventTypeSeqHelper.read(_input);
				_out = handler.createReply();
				offer_change(_arg0,_arg1);
			}
			catch(org.omg.hw.CosNotifyComm.InvalidEventType _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // push_structured_event
			{
			try
			{
				org.omg.hw.CosNotification.StructuredEvent _arg0=org.omg.hw.CosNotification.StructuredEventHelper.read(_input);
				_out = handler.createReply();
				push_structured_event(_arg0);
			}
			catch(org.omg.hw.CosEventComm.Disconnected _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosEventComm.DisconnectedHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // disconnect_structured_push_consumer
			{
				_out = handler.createReply();
				disconnect_structured_push_consumer();
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
