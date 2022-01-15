package org.omg.hw.CosNotifyChannelAdmin;

/**
 *	Generated from IDL interface "SupplierAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class SupplierAdminPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosNotifyChannelAdmin.SupplierAdminOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "obtain_notification_push_consumer", new java.lang.Integer(0));
		m_opsHash.put ( "get_all_filters", new java.lang.Integer(1));
		m_opsHash.put ( "obtain_pull_consumer", new java.lang.Integer(2));
		m_opsHash.put ( "_get_pull_consumers", new java.lang.Integer(3));
		m_opsHash.put ( "_get_MyID", new java.lang.Integer(4));
		m_opsHash.put ( "get_qos", new java.lang.Integer(5));
		m_opsHash.put ( "obtain_push_consumer", new java.lang.Integer(6));
		m_opsHash.put ( "validate_qos", new java.lang.Integer(7));
		m_opsHash.put ( "get_filter", new java.lang.Integer(8));
		m_opsHash.put ( "_get_push_consumers", new java.lang.Integer(9));
		m_opsHash.put ( "_get_MyOperator", new java.lang.Integer(10));
		m_opsHash.put ( "set_qos", new java.lang.Integer(11));
		m_opsHash.put ( "add_filter", new java.lang.Integer(12));
		m_opsHash.put ( "get_proxy_consumer", new java.lang.Integer(13));
		m_opsHash.put ( "remove_filter", new java.lang.Integer(14));
		m_opsHash.put ( "offer_change", new java.lang.Integer(15));
		m_opsHash.put ( "remove_all_filters", new java.lang.Integer(16));
		m_opsHash.put ( "_get_MyChannel", new java.lang.Integer(17));
		m_opsHash.put ( "destroy", new java.lang.Integer(18));
		m_opsHash.put ( "obtain_notification_pull_consumer", new java.lang.Integer(19));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyChannelAdmin/SupplierAdmin:1.0","IDL:omg.org/CosEventChannelAdmin/SupplierAdmin:1.0","IDL:omg.org/CosNotifyComm/NotifyPublish:1.0","IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0","IDL:omg.org/CosNotification/QoSAdmin:1.0"};
	public org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin _this()
	{
		return org.omg.hw.CosNotifyChannelAdmin.SupplierAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyChannelAdmin.SupplierAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyChannelAdmin.SupplierAdminHelper.narrow(_this_object(orb));
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
			case 0: // obtain_notification_push_consumer
			{
			try
			{
				org.omg.hw.CosNotifyChannelAdmin.ClientType _arg0=org.omg.hw.CosNotifyChannelAdmin.ClientTypeHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				org.omg.hw.CosNotifyChannelAdmin.ProxyConsumerHelper.write(_out,obtain_notification_push_consumer(_arg0,_arg1));
				_out.write_long(_arg1.value);
			}
			catch(org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // get_all_filters
			{
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.FilterIDSeqHelper.write(_out,get_all_filters());
				break;
			}
			case 2: // obtain_pull_consumer
			{
				_out = handler.createReply();
				org.omg.hw.CosEventChannelAdmin.ProxyPullConsumerHelper.write(_out,obtain_pull_consumer());
				break;
			}
			case 3: // _get_pull_consumers
			{
			_out = handler.createReply();
			org.omg.hw.CosNotifyChannelAdmin.ProxyIDSeqHelper.write(_out,pull_consumers());
				break;
			}
			case 4: // _get_MyID
			{
			_out = handler.createReply();
			_out.write_long(MyID());
				break;
			}
			case 5: // get_qos
			{
				_out = handler.createReply();
				org.omg.hw.CosNotification.PropertySeqHelper.write(_out,get_qos());
				break;
			}
			case 6: // obtain_push_consumer
			{
				_out = handler.createReply();
				org.omg.hw.CosEventChannelAdmin.ProxyPushConsumerHelper.write(_out,obtain_push_consumer());
				break;
			}
			case 7: // validate_qos
			{
			try
			{
				org.omg.hw.CosNotification.Property[] _arg0=org.omg.hw.CosNotification.PropertySeqHelper.read(_input);
				org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder _arg1= new org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder();
				_out = handler.createReply();
				validate_qos(_arg0,_arg1);
				org.omg.hw.CosNotification.NamedPropertyRangeSeqHelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.CosNotification.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotification.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // get_filter
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.FilterHelper.write(_out,get_filter(_arg0));
			}
			catch(org.omg.hw.CosNotifyFilter.FilterNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // _get_push_consumers
			{
			_out = handler.createReply();
			org.omg.hw.CosNotifyChannelAdmin.ProxyIDSeqHelper.write(_out,push_consumers());
				break;
			}
			case 10: // _get_MyOperator
			{
			_out = handler.createReply();
			org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.write(_out,MyOperator());
				break;
			}
			case 11: // set_qos
			{
			try
			{
				org.omg.hw.CosNotification.Property[] _arg0=org.omg.hw.CosNotification.PropertySeqHelper.read(_input);
				_out = handler.createReply();
				set_qos(_arg0);
			}
			catch(org.omg.hw.CosNotification.UnsupportedQoS _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotification.UnsupportedQoSHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // add_filter
			{
				org.omg.hw.CosNotifyFilter.Filter _arg0=org.omg.hw.CosNotifyFilter.FilterHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(add_filter(_arg0));
				break;
			}
			case 13: // get_proxy_consumer
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				org.omg.hw.CosNotifyChannelAdmin.ProxyConsumerHelper.write(_out,get_proxy_consumer(_arg0));
			}
			catch(org.omg.hw.CosNotifyChannelAdmin.ProxyNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyChannelAdmin.ProxyNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // remove_filter
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				remove_filter(_arg0);
			}
			catch(org.omg.hw.CosNotifyFilter.FilterNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // offer_change
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
			case 16: // remove_all_filters
			{
				_out = handler.createReply();
				remove_all_filters();
				break;
			}
			case 17: // _get_MyChannel
			{
			_out = handler.createReply();
			org.omg.hw.CosNotifyChannelAdmin.EventChannelHelper.write(_out,MyChannel());
				break;
			}
			case 18: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 19: // obtain_notification_pull_consumer
			{
			try
			{
				org.omg.hw.CosNotifyChannelAdmin.ClientType _arg0=org.omg.hw.CosNotifyChannelAdmin.ClientTypeHelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				org.omg.hw.CosNotifyChannelAdmin.ProxyConsumerHelper.write(_out,obtain_notification_pull_consumer(_arg0,_arg1));
				_out.write_long(_arg1.value);
			}
			catch(org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.write(_out, _ex0);
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
