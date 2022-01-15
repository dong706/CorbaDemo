package org.omg.zx.subscription;

/**
 *	Generated from IDL interface "EMSSubscriptionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class EMSSubscriptionMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.subscription.EMSSubscriptionMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "synchronizeEvent", new java.lang.Integer(0));
		m_opsHash.put ( "suspendSubscription", new java.lang.Integer(1));
		m_opsHash.put ( "setLocation", new java.lang.Integer(2));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(3));
		m_opsHash.put ( "setSubscriptionFilter", new java.lang.Integer(4));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(5));
		m_opsHash.put ( "resumeSubscription", new java.lang.Integer(6));
		m_opsHash.put ( "subscribe", new java.lang.Integer(7));
		m_opsHash.put ( "getSubscriptionStatus", new java.lang.Integer(8));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(9));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(10));
		m_opsHash.put ( "unsubscribe", new java.lang.Integer(11));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/subscription/EMSSubscriptionMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.zx.subscription.EMSSubscriptionMgr_I _this()
	{
		return org.omg.zx.subscription.EMSSubscriptionMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.subscription.EMSSubscriptionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.subscription.EMSSubscriptionMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // synchronizeEvent
			{
			try
			{
				org.omg.CosNotifyComm.StructuredPushConsumer _arg0=org.omg.CosNotifyComm.StructuredPushConsumerHelper.read(_input);
				org.omg.CosNotifyFilter.ConstraintExp[] _arg1=org.omg.CosNotifyFilter.ConstraintExpSeqHelper.read(_input);
				org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHolder _arg2= new org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHolder();
				_out = handler.createReply();
				_out.write_boolean(synchronizeEvent(_arg0,_arg1,_arg2));
				org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // suspendSubscription
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				_out.write_boolean(suspendSubscription(_arg0));
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setLocation
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setLocation(_arg0,_arg1);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setNativeEMSName
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setSubscriptionFilter
			{
			try
			{
				int _arg0=_input.read_long();
				org.omg.CosNotifyFilter.ConstraintExp[] _arg1=org.omg.CosNotifyFilter.ConstraintExpSeqHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(setSubscriptionFilter(_arg0,_arg1));
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setUserLabel
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // resumeSubscription
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				_out.write_boolean(resumeSubscription(_arg0));
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // subscribe
			{
			try
			{
				org.omg.CosNotifyComm.StructuredPushConsumer _arg0=org.omg.CosNotifyComm.StructuredPushConsumerHelper.read(_input);
				org.omg.CosNotifyFilter.ConstraintExp[] _arg1=org.omg.CosNotifyFilter.ConstraintExpSeqHelper.read(_input);
				org.omg.CORBA.IntHolder _arg2= new org.omg.CORBA.IntHolder();
				org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHolder _arg3= new org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHolder();
				_out = handler.createReply();
				_out.write_boolean(subscribe(_arg0,_arg1,_arg2,_arg3));
				_out.write_long(_arg2.value);
				org.omg.CosNotifyChannelAdmin.StructuredProxyPushSupplierHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getSubscriptionStatus
			{
			try
			{
				int _arg0=_input.read_long();
				org.omg.CosNotifyFilter.ConstraintExpSeqHolder _arg1= new org.omg.CosNotifyFilter.ConstraintExpSeqHolder();
				org.omg.zx.subscription.SubscriptionState_THolder _arg2= new org.omg.zx.subscription.SubscriptionState_THolder();
				_out = handler.createReply();
				getSubscriptionStatus(_arg0,_arg1,_arg2);
				org.omg.CosNotifyFilter.ConstraintExpSeqHelper.write(_out,_arg1.value);
				org.omg.zx.subscription.SubscriptionState_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setAdditionalInfo
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NVSList_THolder _arg1= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getCapabilities
			{
			try
			{
				org.omg.zx.common.CapabilityList_THolder _arg0= new org.omg.zx.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				org.omg.zx.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // unsubscribe
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				_out.write_boolean(unsubscribe(_arg0));
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
