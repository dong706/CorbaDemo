package org.omg.hw.emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class EMSMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.emsMgr.EMSMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getObjectRootAlarms", new java.lang.Integer(0));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(1));
		m_opsHash.put ( "setEMSHeartbeatInterval", new java.lang.Integer(2));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(3));
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(4));
		m_opsHash.put ( "getAllTopLevelTopologicalLinks", new java.lang.Integer(5));
		m_opsHash.put ( "getAllEMSAndMEActiveAlarms", new java.lang.Integer(6));
		m_opsHash.put ( "getAllTopLevelSubnetworks", new java.lang.Integer(7));
		m_opsHash.put ( "clearAlarms", new java.lang.Integer(8));
		m_opsHash.put ( "getAllAlarmStaticInfo", new java.lang.Integer(9));
		m_opsHash.put ( "getAllTopLevelSubnetworkNames", new java.lang.Integer(10));
		m_opsHash.put ( "getAllTopLevelTopologicalLinkNames", new java.lang.Integer(11));
		m_opsHash.put ( "getAllHistoryAlarms", new java.lang.Integer(12));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(13));
		m_opsHash.put ( "getAllEMSSystemActiveAlarms", new java.lang.Integer(14));
		m_opsHash.put ( "setEMSTime", new java.lang.Integer(15));
		m_opsHash.put ( "getEMS", new java.lang.Integer(16));
		m_opsHash.put ( "setAlarmReportingOn", new java.lang.Integer(17));
		m_opsHash.put ( "getEMSHeartbeatInterval", new java.lang.Integer(18));
		m_opsHash.put ( "getTPFaultStatus", new java.lang.Integer(19));
		m_opsHash.put ( "getTopLevelTopologicalLink", new java.lang.Integer(20));
		m_opsHash.put ( "getInventory", new java.lang.Integer(21));
		m_opsHash.put ( "getAllHistoryAlarmsByFTP", new java.lang.Integer(22));
		m_opsHash.put ( "setOwner", new java.lang.Integer(23));
		m_opsHash.put ( "redefineAlarmData", new java.lang.Integer(24));
		m_opsHash.put ( "getAlarmCount", new java.lang.Integer(25));
		m_opsHash.put ( "acknowledgeAlarms", new java.lang.Integer(26));
		m_opsHash.put ( "getHistoryAlarmDataByPull", new java.lang.Integer(27));
		m_opsHash.put ( "getObjectClockSourceStatus", new java.lang.Integer(28));
		m_opsHash.put ( "getAlarmAffectedServiceNames", new java.lang.Integer(29));
		m_opsHash.put ( "unacknowledgeAlarms", new java.lang.Integer(30));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(31));
		m_opsHash.put ( "getEMSTime", new java.lang.Integer(32));
		m_opsHash.put ( "getAllRedefineAlarmDatas", new java.lang.Integer(33));
		m_opsHash.put ( "getAllSecondlyAlarms", new java.lang.Integer(34));
		m_opsHash.put ( "setAlarmReportingOff", new java.lang.Integer(35));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.emsMgr.EMSMgr_I _this()
	{
		return org.omg.hw.emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getObjectRootAlarms
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				int _arg3=_input.read_ulong();
				org.omg.hw.notifications.EventList_THolder _arg4= new org.omg.hw.notifications.EventList_THolder();
				org.omg.hw.notifications.EventIterator_IHolder _arg5= new org.omg.hw.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getObjectRootAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg4.value);
				org.omg.hw.notifications.EventIterator_IHelper.write(_out,_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getCapabilities
			{
			try
			{
				org.omg.hw.common.CapabilityList_THolder _arg0= new org.omg.hw.common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				org.omg.hw.common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setEMSHeartbeatInterval
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				_out = handler.createReply();
				setEMSHeartbeatInterval(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setAdditionalInfo
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NVSList_THolder _arg1= new org.omg.hw.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAllActiveAlarms
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.emsMgr.ManagedElementTypeList_THelper.read(_input);
				java.lang.String[] _arg2=org.omg.hw.notifications.ProbableCauseList_THelper.read(_input);
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg3=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				int _arg6=_input.read_ulong();
				org.omg.hw.notifications.EventList_THolder _arg7= new org.omg.hw.notifications.EventList_THolder();
				org.omg.hw.notifications.EventIterator_IHolder _arg8= new org.omg.hw.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg7.value);
				org.omg.hw.notifications.EventIterator_IHelper.write(_out,_arg8.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // getAllTopLevelTopologicalLinks
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.topologicalLink.TopologicalLinkList_THolder _arg1= new org.omg.hw.topologicalLink.TopologicalLinkList_THolder();
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder _arg2= new org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinks(_arg0,_arg1,_arg2);
				org.omg.hw.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg1.value);
				org.omg.hw.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllEMSAndMEActiveAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.omg.hw.notifications.ProbableCauseList_THelper.read(_input);
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg1=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.notifications.EventList_THolder _arg3= new org.omg.hw.notifications.EventList_THolder();
				org.omg.hw.notifications.EventIterator_IHolder _arg4= new org.omg.hw.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSAndMEActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg3.value);
				org.omg.hw.notifications.EventIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getAllTopLevelSubnetworks
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.multiLayerSubnetwork.SubnetworkList_THolder _arg1= new org.omg.hw.multiLayerSubnetwork.SubnetworkList_THolder();
				org.omg.hw.multiLayerSubnetwork.SubnetworkIterator_IHolder _arg2= new org.omg.hw.multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworks(_arg0,_arg1,_arg2);
				org.omg.hw.multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg1.value);
				org.omg.hw.multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // clearAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.omg.hw.emsMgr.AlarmSerialNoList_THelper.read(_input);
				org.omg.hw.emsMgr.AlarmSerialNoList_THolder _arg1= new org.omg.hw.emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				clearAlarms(_arg0,_arg1);
				org.omg.hw.emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllAlarmStaticInfo
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.emsMgr.AlarmStaticInfoList_THolder _arg1= new org.omg.hw.emsMgr.AlarmStaticInfoList_THolder();
				org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHolder _arg2= new org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHolder();
				_out = handler.createReply();
				getAllAlarmStaticInfo(_arg0,_arg1,_arg2);
				org.omg.hw.emsMgr.AlarmStaticInfoList_THelper.write(_out,_arg1.value);
				org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getAllTopLevelSubnetworkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworkNames(_arg0,_arg1,_arg2);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllTopLevelTopologicalLinkNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinkNames(_arg0,_arg1,_arg2);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getAllHistoryAlarms
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg1=org.omg.hw.emsMgr.ManagedElementTypeList_THelper.read(_input);
				java.lang.String[] _arg2=org.omg.hw.notifications.ProbableCauseList_THelper.read(_input);
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg3=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				int _arg6=_input.read_ulong();
				org.omg.hw.notifications.EventList_THolder _arg7= new org.omg.hw.notifications.EventList_THolder();
				org.omg.hw.notifications.EventIterator_IHolder _arg8= new org.omg.hw.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllHistoryAlarms(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg7.value);
				org.omg.hw.notifications.EventIterator_IHelper.write(_out,_arg8.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // setUserLabel
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getAllEMSSystemActiveAlarms
			{
			try
			{
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg0=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.notifications.EventList_THolder _arg2= new org.omg.hw.notifications.EventList_THolder();
				org.omg.hw.notifications.EventIterator_IHolder _arg3= new org.omg.hw.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSSystemActiveAlarms(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg2.value);
				org.omg.hw.notifications.EventIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setEMSTime
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setEMSTime(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getEMS
			{
			try
			{
				org.omg.hw.emsMgr.EMS_THolder _arg0= new org.omg.hw.emsMgr.EMS_THolder();
				_out = handler.createReply();
				getEMS(_arg0);
				org.omg.hw.emsMgr.EMS_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // setAlarmReportingOn
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOn(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getEMSHeartbeatInterval
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				getEMSHeartbeatInterval(_arg0,_arg1);
				_out.write_ulong(_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getTPFaultStatus
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.emsMgr.EndTPFaultStatusList_THolder _arg1= new org.omg.hw.emsMgr.EndTPFaultStatusList_THolder();
				_out = handler.createReply();
				getTPFaultStatus(_arg0,_arg1);
				org.omg.hw.emsMgr.EndTPFaultStatusList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getTopLevelTopologicalLink
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.topologicalLink.TopologicalLink_THolder _arg1= new org.omg.hw.topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopLevelTopologicalLink(_arg0,_arg1);
				org.omg.hw.topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // getInventory
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.hw.emsMgr.InventoryType_T[] _arg3=org.omg.hw.emsMgr.InventoryTypeList_THelper.read(_input);
				_out = handler.createReply();
				getInventory(_arg0,_arg1,_arg2,_arg3);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllHistoryAlarmsByFTP
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg3=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg4=org.omg.hw.emsMgr.ManagedElementTypeList_THelper.read(_input);
				java.lang.String[] _arg5=org.omg.hw.notifications.ProbableCauseList_THelper.read(_input);
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg6=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg7=_input.read_string();
				java.lang.String _arg8=_input.read_string();
				_out = handler.createReply();
				getAllHistoryAlarmsByFTP(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7,_arg8);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // setOwner
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setOwner(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // redefineAlarmData
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.emsMgr.RedefineAlarmData_T[] _arg1=org.omg.hw.emsMgr.RedefineAlarmDataList_THelper.read(_input);
				org.omg.hw.emsMgr.RedefineAlarmDataList_THolder _arg2= new org.omg.hw.emsMgr.RedefineAlarmDataList_THolder();
				org.omg.hw.emsMgr.RedefineAlarmDataList_THolder _arg3= new org.omg.hw.emsMgr.RedefineAlarmDataList_THolder();
				org.omg.CORBA.StringHolder _arg4= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				redefineAlarmData(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.emsMgr.RedefineAlarmDataList_THelper.write(_out,_arg2.value);
				org.omg.hw.emsMgr.RedefineAlarmDataList_THelper.write(_out,_arg3.value);
				_out.write_string(_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAlarmCount
			{
			try
			{
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg0=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				getAlarmCount(_arg0,_arg1);
				_out.write_ulong(_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // acknowledgeAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.omg.hw.emsMgr.AlarmSerialNoList_THelper.read(_input);
				org.omg.hw.emsMgr.AlarmSerialNoList_THolder _arg1= new org.omg.hw.emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				acknowledgeAlarms(_arg0,_arg1);
				org.omg.hw.emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getHistoryAlarmDataByPull
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				java.lang.String[] _arg4=org.omg.hw.notifications.ProbableCauseList_THelper.read(_input);
				org.omg.hw.notifications.PerceivedSeverity_T[] _arg5=org.omg.hw.notifications.PerceivedSeverityList_THelper.read(_input);
				java.lang.String _arg6=_input.read_string();
				java.lang.String _arg7=_input.read_string();
				_out = handler.createReply();
				getHistoryAlarmDataByPull(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getObjectClockSourceStatus
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.emsMgr.ClockSourceStatusList_THolder _arg1= new org.omg.hw.emsMgr.ClockSourceStatusList_THolder();
				_out = handler.createReply();
				getObjectClockSourceStatus(_arg0,_arg1);
				org.omg.hw.emsMgr.ClockSourceStatusList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAlarmAffectedServiceNames
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.emsMgr.ServiceNameList_THolder _arg1= new org.omg.hw.emsMgr.ServiceNameList_THolder();
				_out = handler.createReply();
				getAlarmAffectedServiceNames(_arg0,_arg1);
				org.omg.hw.emsMgr.ServiceNameList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // unacknowledgeAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.omg.hw.emsMgr.AlarmSerialNoList_THelper.read(_input);
				org.omg.hw.emsMgr.AlarmSerialNoList_THolder _arg1= new org.omg.hw.emsMgr.AlarmSerialNoList_THolder();
				_out = handler.createReply();
				unacknowledgeAlarms(_arg0,_arg1);
				org.omg.hw.emsMgr.AlarmSerialNoList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // setNativeEMSName
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getEMSTime
			{
			try
			{
				org.omg.hw.globaldefs.NVSList_THolder _arg0= new org.omg.hw.globaldefs.NVSList_THolder();
				org.omg.CORBA.StringHolder _arg1= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				getEMSTime(_arg0,_arg1);
				org.omg.hw.globaldefs.NVSList_THelper.write(_out,_arg0.value);
				_out.write_string(_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getAllRedefineAlarmDatas
			{
			try
			{
				org.omg.hw.emsMgr.QueryRedefineAlarmData_T[] _arg0=org.omg.hw.emsMgr.QueryRedefineAlarmDataList_THelper.read(_input);
				org.omg.hw.emsMgr.RedefineAlarmDataList_THolder _arg1= new org.omg.hw.emsMgr.RedefineAlarmDataList_THolder();
				_out = handler.createReply();
				getAllRedefineAlarmDatas(_arg0,_arg1);
				org.omg.hw.emsMgr.RedefineAlarmDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllSecondlyAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.omg.hw.emsMgr.AlarmSerialNoList_THelper.read(_input);
				org.omg.hw.notifications.EventList_THolder _arg1= new org.omg.hw.notifications.EventList_THolder();
				_out = handler.createReply();
				getAllSecondlyAlarms(_arg0,_arg1);
				org.omg.hw.notifications.EventList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // setAlarmReportingOff
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				setAlarmReportingOff(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
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
