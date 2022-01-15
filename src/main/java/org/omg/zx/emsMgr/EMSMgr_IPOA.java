package org.omg.zx.emsMgr;

/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class EMSMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.zx.emsMgr.EMSMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getTopologicalSubnetworksByLayer", new java.lang.Integer(0));
		m_opsHash.put ( "getAllMLSNPPLinksWithTP", new java.lang.Integer(1));
		m_opsHash.put ( "getAllASAPs", new java.lang.Integer(2));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(3));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(4));
		m_opsHash.put ( "deassignASAP", new java.lang.Integer(5));
		m_opsHash.put ( "getTopLevelTopologicalLink", new java.lang.Integer(6));
		m_opsHash.put ( "getVBs", new java.lang.Integer(7));
		m_opsHash.put ( "getASAPAssociatedResourceNames", new java.lang.Integer(8));
		m_opsHash.put ( "getEthernetServices", new java.lang.Integer(9));
		m_opsHash.put ( "createVLAN", new java.lang.Integer(10));
		m_opsHash.put ( "getAllEMSAndMEUnacknowledgedActiveAlarms", new java.lang.Integer(11));
		m_opsHash.put ( "modifyASAP", new java.lang.Integer(12));
		m_opsHash.put ( "getAllMLSNPPsWithTNA", new java.lang.Integer(13));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(14));
		m_opsHash.put ( "getAllASAPNames", new java.lang.Integer(15));
		m_opsHash.put ( "getAllTopLevelSubnetworkNames", new java.lang.Integer(16));
		m_opsHash.put ( "getVLANs", new java.lang.Integer(17));
		m_opsHash.put ( "getEMS", new java.lang.Integer(18));
		m_opsHash.put ( "getAllMLSNPPs", new java.lang.Integer(19));
		m_opsHash.put ( "createASAP", new java.lang.Integer(20));
		m_opsHash.put ( "acknowledgeAlarms", new java.lang.Integer(21));
		m_opsHash.put ( "getAllTopLevelTopologicalLinkNames", new java.lang.Integer(22));
		m_opsHash.put ( "getAllTopLevelSubnetworks", new java.lang.Integer(23));
		m_opsHash.put ( "createEthernetService", new java.lang.Integer(24));
		m_opsHash.put ( "getAllTopLevelTopologicalLinksByIterator", new java.lang.Integer(25));
		m_opsHash.put ( "deleteVLAN", new java.lang.Integer(26));
		m_opsHash.put ( "deleteVB", new java.lang.Integer(27));
		m_opsHash.put ( "getTopologicalSubnetwork", new java.lang.Integer(28));
		m_opsHash.put ( "assignASAP", new java.lang.Integer(29));
		m_opsHash.put ( "getAllMLSNPPLinks", new java.lang.Integer(30));
		m_opsHash.put ( "getASAPbyResource", new java.lang.Integer(31));
		m_opsHash.put ( "createVB", new java.lang.Integer(32));
		m_opsHash.put ( "getAllMLRAs", new java.lang.Integer(33));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(34));
		m_opsHash.put ( "getAllTopLevelTopologicalLinks", new java.lang.Integer(35));
		m_opsHash.put ( "getAllMLSNPPsWithTP", new java.lang.Integer(36));
		m_opsHash.put ( "deleteASAP", new java.lang.Integer(37));
		m_opsHash.put ( "deleteEthernetService", new java.lang.Integer(38));
		m_opsHash.put ( "getAllMLSNPPLinksWithMLSNs", new java.lang.Integer(39));
		m_opsHash.put ( "getAllMLSNPPLinksWithTNAs", new java.lang.Integer(40));
		m_opsHash.put ( "getAllActiveAlarmsByCond", new java.lang.Integer(41));
		m_opsHash.put ( "getASAP", new java.lang.Integer(42));
		m_opsHash.put ( "clearAlarms", new java.lang.Integer(43));
		m_opsHash.put ( "getRPRNodesStatus", new java.lang.Integer(44));
		m_opsHash.put ( "getAllActiveAlarms", new java.lang.Integer(45));
		m_opsHash.put ( "setLocation", new java.lang.Integer(46));
		m_opsHash.put ( "getAllTopologicalSubnetworks", new java.lang.Integer(47));
		m_opsHash.put ( "unacknowledgeAlarms", new java.lang.Integer(48));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.zx.emsMgr.EMSMgr_I _this()
	{
		return org.omg.zx.emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getTopologicalSubnetworksByLayer
			{
			try
			{
				int _arg0=_input.read_long();
				org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder _arg1= new org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder();
				_out = handler.createReply();
				getTopologicalSubnetworksByLayer(_arg0,_arg1);
				org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getAllMLSNPPLinksWithTP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder();
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinksWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllASAPs
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.zx.aSAP.ASAPList_THolder _arg1= new org.omg.zx.aSAP.ASAPList_THolder();
				org.omg.zx.aSAP.ASAPIterator_IHolder _arg2= new org.omg.zx.aSAP.ASAPIterator_IHolder();
				_out = handler.createReply();
				getAllASAPs(_arg0,_arg1,_arg2);
				org.omg.zx.aSAP.ASAPList_THelper.write(_out,_arg1.value);
				org.omg.zx.aSAP.ASAPIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // setUserLabel
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
			case 4: // getCapabilities
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
			case 5: // deassignASAP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				org.omg.zx.globaldefs.NVSList_THolder _arg2= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg2._read (_input);
				_out = handler.createReply();
				deassignASAP(_arg0,_arg1,_arg2);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getTopLevelTopologicalLink
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.topologicalLink.TopologicalLink_THolder _arg1= new org.omg.zx.topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopLevelTopologicalLink(_arg0,_arg1);
				org.omg.zx.topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getVBs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.zx.emsMgr.VBList_THolder _arg1= new org.omg.zx.emsMgr.VBList_THolder();
				_out = handler.createReply();
				getVBs(_arg0,_arg1);
				org.omg.zx.emsMgr.VBList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getASAPAssociatedResourceNames
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				org.omg.zx.globaldefs.NamingAttributesIterator_IHolder _arg3= new org.omg.zx.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getASAPAssociatedResourceNames(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				org.omg.zx.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getEthernetServices
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.zx.emsMgr.EthernetServiceList_THolder _arg1= new org.omg.zx.emsMgr.EthernetServiceList_THolder();
				_out = handler.createReply();
				getEthernetServices(_arg0,_arg1);
				org.omg.zx.emsMgr.EthernetServiceList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // createVLAN
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				org.omg.zx.emsMgr.LogicalPort_T[] _arg2=org.omg.zx.emsMgr.LogicalPortList_THelper.read(_input);
				org.omg.zx.emsMgr.VLAN_THolder _arg3= new org.omg.zx.emsMgr.VLAN_THolder();
				_out = handler.createReply();
				createVLAN(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.emsMgr.VLAN_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllEMSAndMEUnacknowledgedActiveAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.omg.zx.alarmMgr.ProbableCauseList_THelper.read(_input);
				org.omg.zx.alarmMgr.PerceivedSeverity_T[] _arg1=org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.notifications.EventList_THolder _arg3= new org.omg.zx.notifications.EventList_THolder();
				org.omg.zx.notifications.EventIterator_IHolder _arg4= new org.omg.zx.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllEMSAndMEUnacknowledgedActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.notifications.EventList_THelper.write(_out,_arg3.value);
				org.omg.zx.notifications.EventIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // modifyASAP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.aSAP.ASAPCreateModifyData_T _arg1=org.omg.zx.aSAP.ASAPCreateModifyData_THelper.read(_input);
				org.omg.zx.aSAP.ASAP_THolder _arg2= new org.omg.zx.aSAP.ASAP_THolder();
				org.omg.zx.globaldefs.NVSList_THolder _arg3= new org.omg.zx.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				modifyASAP(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.aSAP.ASAP_THelper.write(_out,_arg2.value);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllMLSNPPsWithTNA
			{
			try
			{
				java.lang.String[] _arg0=org.omg.zx.mLSNPP.TNAList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPP.MLSNPPList_THolder _arg3= new org.omg.zx.mLSNPP.MLSNPPList_THolder();
				org.omg.zx.mLSNPP.MLSNPPIterator_IHolder _arg4= new org.omg.zx.mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPsWithTNA(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPP.MLSNPPList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // setNativeEMSName
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
			case 15: // getAllASAPNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				org.omg.zx.globaldefs.NamingAttributesIterator_IHolder _arg2= new org.omg.zx.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllASAPNames(_arg0,_arg1,_arg2);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.zx.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getAllTopLevelSubnetworkNames
			{
			try
			{
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg0= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworkNames(_arg0);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getVLANs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.zx.emsMgr.VLANList_THolder _arg1= new org.omg.zx.emsMgr.VLANList_THolder();
				_out = handler.createReply();
				getVLANs(_arg0,_arg1);
				org.omg.zx.emsMgr.VLANList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getEMS
			{
			try
			{
				org.omg.zx.emsMgr.EMS_THolder _arg0= new org.omg.zx.emsMgr.EMS_THolder();
				_out = handler.createReply();
				getEMS(_arg0);
				org.omg.zx.emsMgr.EMS_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getAllMLSNPPs
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				int _arg1=_input.read_ulong();
				org.omg.zx.mLSNPP.MLSNPPList_THolder _arg2= new org.omg.zx.mLSNPP.MLSNPPList_THolder();
				org.omg.zx.mLSNPP.MLSNPPIterator_IHolder _arg3= new org.omg.zx.mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPs(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.mLSNPP.MLSNPPList_THelper.write(_out,_arg2.value);
				org.omg.zx.mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // createASAP
			{
			try
			{
				org.omg.zx.aSAP.ASAPCreateModifyData_T _arg0=org.omg.zx.aSAP.ASAPCreateModifyData_THelper.read(_input);
				org.omg.zx.aSAP.ASAP_THolder _arg1= new org.omg.zx.aSAP.ASAP_THolder();
				org.omg.zx.globaldefs.NVSList_THolder _arg2= new org.omg.zx.globaldefs.NVSList_THolder();
				_out = handler.createReply();
				createASAP(_arg0,_arg1,_arg2);
				org.omg.zx.aSAP.ASAP_THelper.write(_out,_arg1.value);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // acknowledgeAlarms
			{
			try
			{
				org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] _arg0=org.omg.zx.notifications.AlarmAndTCAIDList_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg1=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.notifications.AlarmAndTCAIDList_THolder _arg2= new org.omg.zx.notifications.AlarmAndTCAIDList_THolder();
				_out = handler.createReply();
				acknowledgeAlarms(_arg0,_arg1,_arg2);
				org.omg.zx.notifications.AlarmAndTCAIDList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllTopLevelTopologicalLinkNames
			{
			try
			{
				org.omg.zx.globaldefs.NamingAttributesList_THolder _arg0= new org.omg.zx.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinkNames(_arg0);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllTopLevelSubnetworks
			{
			try
			{
				org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder _arg0= new org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworks(_arg0);
				org.omg.zx.multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // createEthernetService
			{
			try
			{
				org.omg.zx.emsMgr.EthernetServiceCreateData_T _arg0=org.omg.zx.emsMgr.EthernetServiceCreateData_THelper.read(_input);
				org.omg.zx.emsMgr.EthernetService_THolder _arg1= new org.omg.zx.emsMgr.EthernetService_THolder();
				_out = handler.createReply();
				createEthernetService(_arg0,_arg1);
				org.omg.zx.emsMgr.EthernetService_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getAllTopLevelTopologicalLinksByIterator
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.zx.topologicalLink.TopologicalLinkList_THolder _arg1= new org.omg.zx.topologicalLink.TopologicalLinkList_THolder();
				org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder _arg2= new org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinksByIterator(_arg0,_arg1,_arg2);
				org.omg.zx.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg1.value);
				org.omg.zx.topologicalLink.TopologicalLinkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // deleteVLAN
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteVLAN(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // deleteVB
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteVB(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getTopologicalSubnetwork
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THolder _arg1= new org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THolder();
				_out = handler.createReply();
				getTopologicalSubnetwork(_arg0,_arg1);
				org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // assignASAP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg1=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short _arg2=_input.read_short();
				org.omg.zx.globaldefs.NVSList_THolder _arg3= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg3._read (_input);
				_out = handler.createReply();
				assignASAP(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllMLSNPPLinks
			{
			try
			{
				boolean _arg0=_input.read_boolean();
				int _arg1=_input.read_ulong();
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder _arg2= new org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder();
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg3= new org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinks(_arg0,_arg1,_arg2,_arg3);
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg2.value);
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getASAPbyResource
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.zx.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.aSAP.ASAPList_THolder _arg3= new org.omg.zx.aSAP.ASAPList_THolder();
				org.omg.zx.aSAP.ASAPIterator_IHolder _arg4= new org.omg.zx.aSAP.ASAPIterator_IHolder();
				_out = handler.createReply();
				getASAPbyResource(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.aSAP.ASAPList_THelper.write(_out,_arg3.value);
				org.omg.zx.aSAP.ASAPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // createVB
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				org.omg.zx.emsMgr.LogicalPort_T[] _arg3=org.omg.zx.emsMgr.LogicalPortList_THelper.read(_input);
				org.omg.zx.emsMgr.VB_THolder _arg4= new org.omg.zx.emsMgr.VB_THolder();
				_out = handler.createReply();
				createVB(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.emsMgr.VB_THelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // getAllMLRAs
			{
			try
			{
				int _arg0=_input.read_ulong();
				org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder _arg1= new org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder();
				org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder _arg2= new org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder();
				_out = handler.createReply();
				getAllMLRAs(_arg0,_arg1,_arg2);
				org.omg.zx.multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg1.value);
				org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHelper.write(_out,_arg2.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // setAdditionalInfo
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
			case 35: // getAllTopLevelTopologicalLinks
			{
			try
			{
				org.omg.zx.topologicalLink.TopologicalLinkList_THolder _arg0= new org.omg.zx.topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinks(_arg0);
				org.omg.zx.topologicalLink.TopologicalLinkList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // getAllMLSNPPsWithTP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPP.MLSNPPList_THolder _arg3= new org.omg.zx.mLSNPP.MLSNPPList_THolder();
				org.omg.zx.mLSNPP.MLSNPPIterator_IHolder _arg4= new org.omg.zx.mLSNPP.MLSNPPIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPsWithTP(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPP.MLSNPPList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPP.MLSNPPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // deleteASAP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.globaldefs.NVSList_THolder _arg1= new org.omg.zx.globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				deleteASAP(_arg0,_arg1);
				org.omg.zx.globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // deleteEthernetService
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteEthernetService(_arg0);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // getAllMLSNPPLinksWithMLSNs
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder();
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinksWithMLSNs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 40: // getAllMLSNPPLinksWithTNAs
			{
			try
			{
				java.lang.String[] _arg0=org.omg.zx.mLSNPP.TNAList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				int _arg2=_input.read_ulong();
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder _arg3= new org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder();
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder _arg4= new org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder();
				_out = handler.createReply();
				getAllMLSNPPLinksWithTNAs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.write(_out,_arg3.value);
				org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // getAllActiveAlarmsByCond
			{
			try
			{
				org.omg.zx.globaldefs.Duration_T _arg0=org.omg.zx.globaldefs.Duration_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg1=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				java.lang.String[] _arg2=org.omg.zx.alarmMgr.ProbableCauseList_THelper.read(_input);
				org.omg.zx.alarmMgr.PerceivedSeverity_T[] _arg3=org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.read(_input);
				org.omg.zx.alarmMgr.AlarmType_T[] _arg4=org.omg.zx.alarmMgr.AlarmTypeList_THelper.read(_input);
				int _arg5=_input.read_ulong();
				org.omg.zx.notifications.EventList_THolder _arg6= new org.omg.zx.notifications.EventList_THolder();
				org.omg.zx.notifications.EventIterator_IHolder _arg7= new org.omg.zx.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarmsByCond(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.zx.notifications.EventList_THelper.write(_out,_arg6.value);
				org.omg.zx.notifications.EventIterator_IHelper.write(_out,_arg7.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // getASAP
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg0=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.aSAP.ASAP_THolder _arg1= new org.omg.zx.aSAP.ASAP_THolder();
				_out = handler.createReply();
				getASAP(_arg0,_arg1);
				org.omg.zx.aSAP.ASAP_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // clearAlarms
			{
			try
			{
				org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] _arg0=org.omg.zx.notifications.AlarmAndTCAIDList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				org.omg.zx.notifications.AlarmAndTCAIDList_THolder _arg4= new org.omg.zx.notifications.AlarmAndTCAIDList_THolder();
				_out = handler.createReply();
				clearAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.notifications.AlarmAndTCAIDList_THelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getRPRNodesStatus
			{
			try
			{
				org.omg.zx.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.zx.emsMgr.RPRNodeStatusList_THolder _arg1= new org.omg.zx.emsMgr.RPRNodeStatusList_THolder();
				_out = handler.createReply();
				getRPRNodesStatus(_arg0,_arg1);
				org.omg.zx.emsMgr.RPRNodeStatusList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // getAllActiveAlarms
			{
			try
			{
				java.lang.String[] _arg0=org.omg.zx.alarmMgr.ProbableCauseList_THelper.read(_input);
				org.omg.zx.alarmMgr.PerceivedSeverity_T[] _arg1=org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.zx.notifications.EventList_THolder _arg3= new org.omg.zx.notifications.EventList_THolder();
				org.omg.zx.notifications.EventIterator_IHolder _arg4= new org.omg.zx.notifications.EventIterator_IHolder();
				_out = handler.createReply();
				getAllActiveAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.zx.notifications.EventList_THelper.write(_out,_arg3.value);
				org.omg.zx.notifications.EventIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // setLocation
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
			case 47: // getAllTopologicalSubnetworks
			{
			try
			{
				org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder _arg0= new org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder();
				_out = handler.createReply();
				getAllTopologicalSubnetworks(_arg0);
				org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THelper.write(_out,_arg0.value);
			}
			catch(org.omg.zx.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // unacknowledgeAlarms
			{
			try
			{
				org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] _arg0=org.omg.zx.notifications.AlarmAndTCAIDList_THelper.read(_input);
				org.omg.zx.globaldefs.NameAndStringValue_T[] _arg1=org.omg.zx.globaldefs.NVSList_THelper.read(_input);
				org.omg.zx.notifications.AlarmAndTCAIDList_THolder _arg2= new org.omg.zx.notifications.AlarmAndTCAIDList_THolder();
				_out = handler.createReply();
				unacknowledgeAlarms(_arg0,_arg1,_arg2);
				org.omg.zx.notifications.AlarmAndTCAIDList_THelper.write(_out,_arg2.value);
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
