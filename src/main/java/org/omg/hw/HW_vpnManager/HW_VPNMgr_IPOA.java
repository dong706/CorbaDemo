package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL interface "HW_VPNMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class HW_VPNMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.HW_vpnManager.HW_VPNMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getIPCrossConnection", new java.lang.Integer(0));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(1));
		m_opsHash.put ( "activateTrafficTrunk", new java.lang.Integer(2));
		m_opsHash.put ( "activateMFDFr", new java.lang.Integer(3));
		m_opsHash.put ( "deleteTrafficTrunk", new java.lang.Integer(4));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(5));
		m_opsHash.put ( "getAllTrafficTrunkNames", new java.lang.Integer(6));
		m_opsHash.put ( "modifyMFDFr", new java.lang.Integer(7));
		m_opsHash.put ( "getAllTrafficTrunksWithME", new java.lang.Integer(8));
		m_opsHash.put ( "getAllTrafficTrunks", new java.lang.Integer(9));
		m_opsHash.put ( "deactivateTrafficTrunk", new java.lang.Integer(10));
		m_opsHash.put ( "deactivateMFDFr", new java.lang.Integer(11));
		m_opsHash.put ( "getMFDFr", new java.lang.Integer(12));
		m_opsHash.put ( "getIPRoutesByTrafficTrunks", new java.lang.Integer(13));
		m_opsHash.put ( "getSelfLearningMACAddressTable", new java.lang.Integer(14));
		m_opsHash.put ( "modifyTrafficTrunk", new java.lang.Integer(15));
		m_opsHash.put ( "createTrafficTrunk", new java.lang.Integer(16));
		m_opsHash.put ( "getAllFDFrNames", new java.lang.Integer(17));
		m_opsHash.put ( "getFDFrsByUserLabel", new java.lang.Integer(18));
		m_opsHash.put ( "modifyFDFr", new java.lang.Integer(19));
		m_opsHash.put ( "getFDFrRoute", new java.lang.Integer(20));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(21));
		m_opsHash.put ( "getFDFrRoutes", new java.lang.Integer(22));
		m_opsHash.put ( "getTrafficTrunksWithTP", new java.lang.Integer(23));
		m_opsHash.put ( "getAllFDFrs", new java.lang.Integer(24));
		m_opsHash.put ( "createFDFr", new java.lang.Integer(25));
		m_opsHash.put ( "deleteFDFr", new java.lang.Integer(26));
		m_opsHash.put ( "deleteIPCrossConnections", new java.lang.Integer(27));
		m_opsHash.put ( "getFDFrsWithME", new java.lang.Integer(28));
		m_opsHash.put ( "getAllTrafficTrunkNamesWithME", new java.lang.Integer(29));
		m_opsHash.put ( "deactivateFDFr", new java.lang.Integer(30));
		m_opsHash.put ( "getFDFrsWithTP", new java.lang.Integer(31));
		m_opsHash.put ( "getAllIPCrossConnectionNames", new java.lang.Integer(32));
		m_opsHash.put ( "activateFDFr", new java.lang.Integer(33));
		m_opsHash.put ( "getTrafficTrunksByUserLabel", new java.lang.Integer(34));
		m_opsHash.put ( "createMFDFr", new java.lang.Integer(35));
		m_opsHash.put ( "deleteMFDFr", new java.lang.Integer(36));
		m_opsHash.put ( "getTrafficTrunkRoute", new java.lang.Integer(37));
		m_opsHash.put ( "createIPCrossConnections", new java.lang.Integer(38));
		m_opsHash.put ( "setOwner", new java.lang.Integer(39));
		m_opsHash.put ( "getAllMFDFrs", new java.lang.Integer(40));
		m_opsHash.put ( "modifyIPCrossConnection", new java.lang.Integer(41));
		m_opsHash.put ( "getTrafficTrunksByNativeEmsName", new java.lang.Integer(42));
		m_opsHash.put ( "activateIPCrossConnections", new java.lang.Integer(43));
		m_opsHash.put ( "getFDFr", new java.lang.Integer(44));
		m_opsHash.put ( "getIPRoutes", new java.lang.Integer(45));
		m_opsHash.put ( "getTrafficTrunk", new java.lang.Integer(46));
		m_opsHash.put ( "getFDFrServerTrail", new java.lang.Integer(47));
		m_opsHash.put ( "getAllMFDFrNames", new java.lang.Integer(48));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(49));
		m_opsHash.put ( "deactivateIPCrossConnections", new java.lang.Integer(50));
		m_opsHash.put ( "getAllIPCrossConnections", new java.lang.Integer(51));
	}
	private String[] ids = {"IDL:mtnm.huawei.com/HW_vpnManager/HW_VPNMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public org.omg.hw.HW_vpnManager.HW_VPNMgr_I _this()
	{
		return org.omg.hw.HW_vpnManager.HW_VPNMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_vpnManager.HW_VPNMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_vpnManager.HW_VPNMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getIPCrossConnection
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.IPCrossConnection_THolder _arg1= new org.omg.hw.HW_vpnManager.IPCrossConnection_THolder();
				_out = handler.createReply();
				getIPCrossConnection(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.IPCrossConnection_THelper.write(_out,_arg1.value);
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
			case 2: // activateTrafficTrunk
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THolder _arg1= new org.omg.hw.HW_vpnManager.TrafficTrunk_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateTrafficTrunk(_arg0,_arg1,_arg2);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // activateMFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg2= new org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateMFDFr(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // deleteTrafficTrunk
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteTrafficTrunk(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // setAdditionalInfo
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
			case 6: // getAllTrafficTrunkNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficTrunkNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // modifyMFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.MFDFrModifyData_T _arg1=org.omg.hw.HW_vpnManager.MFDFrModifyData_THelper.read(_input);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg2= new org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg4= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyMFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getAllTrafficTrunksWithME
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder _arg3= new org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder();
				org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder _arg4= new org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficTrunksWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // getAllTrafficTrunks
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder _arg3= new org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder();
				org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder _arg4= new org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficTrunks(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // deactivateTrafficTrunk
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THolder _arg1= new org.omg.hw.HW_vpnManager.TrafficTrunk_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateTrafficTrunk(_arg0,_arg1,_arg2);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // deactivateMFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg2= new org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateMFDFr(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getMFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg1= new org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				_out = handler.createReply();
				getMFDFr(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getIPRoutesByTrafficTrunks
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.IPRouteInfoList_THolder _arg1= new org.omg.hw.HW_vpnManager.IPRouteInfoList_THolder();
				_out = handler.createReply();
				getIPRoutesByTrafficTrunks(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.IPRouteInfoList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // getSelfLearningMACAddressTable
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableList_THolder _arg2= new org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableList_THolder();
				org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableIterator_IHolder _arg3= new org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableIterator_IHolder();
				_out = handler.createReply();
				getSelfLearningMACAddressTable(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableList_THelper.write(_out,_arg2.value);
				org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // modifyTrafficTrunk
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T _arg1=org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_THelper.read(_input);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THolder _arg2= new org.omg.hw.HW_vpnManager.TrafficTrunk_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyTrafficTrunk(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // createTrafficTrunk
			{
			try
			{
				org.omg.hw.HW_vpnManager.TrafficTrunkCreateData_T _arg0=org.omg.hw.HW_vpnManager.TrafficTrunkCreateData_THelper.read(_input);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THolder _arg1= new org.omg.hw.HW_vpnManager.TrafficTrunk_THolder();
				org.omg.CORBA.StringHolder _arg2= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createTrafficTrunk(_arg0,_arg1,_arg2);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg1.value);
				_out.write_string(_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllFDFrNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getFDFrsByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder _arg1= new org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder();
				_out = handler.createReply();
				getFDFrsByUserLabel(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // modifyFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.FDFrModifyData_T _arg1=org.omg.hw.HW_vpnManager.FDFrModifyData_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.hw.subnetworkConnection.GradesOfImpact_T _arg3=org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.read(_input);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder _arg4= new org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getFDFrRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				boolean _arg1=_input.read_boolean();
				org.omg.hw.HW_vpnManager.FDFrRoute_THolder _arg2= new org.omg.hw.HW_vpnManager.FDFrRoute_THolder();
				_out = handler.createReply();
				getFDFrRoute(_arg0,_arg1,_arg2);
				org.omg.hw.HW_vpnManager.FDFrRoute_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // setUserLabel
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
			case 22: // getFDFrRoutes
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.FDFrRouteInfoList_THolder _arg1= new org.omg.hw.HW_vpnManager.FDFrRouteInfoList_THolder();
				_out = handler.createReply();
				getFDFrRoutes(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.FDFrRouteInfoList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getTrafficTrunksWithTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder _arg2= new org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder();
				org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder _arg3= new org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder();
				_out = handler.createReply();
				getTrafficTrunksWithTP(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg2.value);
				org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllFDFrs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				short[] _arg2=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder _arg3= new org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder();
				org.omg.hw.HW_vpnManager.FDFrIterator_IHolder _arg4= new org.omg.hw.HW_vpnManager.FDFrIterator_IHolder();
				_out = handler.createReply();
				getAllFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_vpnManager.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // createFDFr
			{
			try
			{
				org.omg.hw.HW_vpnManager.FDFrCreateData_T _arg0=org.omg.hw.HW_vpnManager.FDFrCreateData_THelper.read(_input);
				org.omg.hw.flowDomain.ConnectivityRequirement_T _arg1=org.omg.hw.flowDomain.ConnectivityRequirement_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg2= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg2._read (_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg3= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg3._read (_input);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THolder _arg4= new org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THolder();
				_arg4._read (_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg5= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg5._read (_input);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder _arg6= new org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder();
				org.omg.CORBA.StringHolder _arg7= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6,_arg7);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg2.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THelper.write(_out,_arg4.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg5.value);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg6.value);
				_out.write_string(_arg7.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // deleteFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				deleteFDFr(_arg0,_arg1);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // deleteIPCrossConnections
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				deleteIPCrossConnections(_arg0,_arg1,_arg2);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getFDFrsWithME
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder _arg3= new org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder();
				org.omg.hw.HW_vpnManager.FDFrIterator_IHolder _arg4= new org.omg.hw.HW_vpnManager.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_vpnManager.FDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // getAllTrafficTrunkNamesWithME
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllTrafficTrunkNamesWithME(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // deactivateFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder _arg1= new org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder();
				_out = handler.createReply();
				deactivateFDFr(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // getFDFrsWithTP
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder _arg2= new org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder();
				org.omg.hw.HW_vpnManager.FDFrIterator_IHolder _arg3= new org.omg.hw.HW_vpnManager.FDFrIterator_IHolder();
				_out = handler.createReply();
				getFDFrsWithTP(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THelper.write(_out,_arg2.value);
				org.omg.hw.HW_vpnManager.FDFrIterator_IHelper.write(_out,_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // getAllIPCrossConnectionNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllIPCrossConnectionNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // activateFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder _arg1= new org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder();
				_out = handler.createReply();
				activateFDFr(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getTrafficTrunksByUserLabel
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder _arg1= new org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder();
				_out = handler.createReply();
				getTrafficTrunksByUserLabel(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // createMFDFr
			{
			try
			{
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_T _arg0=org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.read(_input);
				org.omg.hw.subnetworkConnection.TPDataList_THolder _arg1= new org.omg.hw.subnetworkConnection.TPDataList_THolder();
				_arg1._read (_input);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder _arg2= new org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg4= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg5= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				createMFDFr(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_out,_arg1.value);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_out,_arg2.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg4.value);
				_out.write_string(_arg5.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 36: // deleteMFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteMFDFr(_arg0);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 37: // getTrafficTrunkRoute
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder _arg1= new org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder();
				_out = handler.createReply();
				getTrafficTrunkRoute(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 38: // createIPCrossConnections
			{
			try
			{
				org.omg.hw.HW_vpnManager.IPCrossConnection_T[] _arg0=org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder _arg1= new org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder();
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder _arg2= new org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder();
				_out = handler.createReply();
				createIPCrossConnections(_arg0,_arg1,_arg2);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg1.value);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg2.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 39: // setOwner
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
			case 40: // getAllMFDFrs
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THolder _arg3= new org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THolder();
				org.omg.hw.HW_vpnManager.MFDFrIterator_IHolder _arg4= new org.omg.hw.HW_vpnManager.MFDFrIterator_IHolder();
				_out = handler.createReply();
				getAllMFDFrs(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_vpnManager.MFDFrIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 41: // modifyIPCrossConnection
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.transmissionParameters.LayeredParameters_T _arg1=org.omg.hw.transmissionParameters.LayeredParameters_THelper.read(_input);
				org.omg.hw.HW_vpnManager.IPCrossConnection_THolder _arg2= new org.omg.hw.HW_vpnManager.IPCrossConnection_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				modifyIPCrossConnection(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.HW_vpnManager.IPCrossConnection_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 42: // getTrafficTrunksByNativeEmsName
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder _arg1= new org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder();
				_out = handler.createReply();
				getTrafficTrunksByNativeEmsName(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 43: // activateIPCrossConnections
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				activateIPCrossConnections(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 44: // getFDFr
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder _arg1= new org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder();
				_out = handler.createReply();
				getFDFr(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 45: // getIPRoutes
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder _arg1= new org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder();
				_out = handler.createReply();
				getIPRoutes(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 46: // getTrafficTrunk
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THolder _arg1= new org.omg.hw.HW_vpnManager.TrafficTrunk_THolder();
				_out = handler.createReply();
				getTrafficTrunk(_arg0,_arg1);
				org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 47: // getFDFrServerTrail
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getFDFrServerTrail(_arg0,_arg1);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 48: // getAllMFDFrNames
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg3= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesIterator_IHolder _arg4= new org.omg.hw.globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllMFDFrNames(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg3.value);
				org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg4.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 49: // setNativeEMSName
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
			case 50: // deactivateIPCrossConnections
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[][] _arg0=org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_input);
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg1= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.hw.globaldefs.NamingAttributesList_THolder _arg2= new org.omg.hw.globaldefs.NamingAttributesList_THolder();
				org.omg.CORBA.StringHolder _arg3= new org.omg.CORBA.StringHolder();
				_out = handler.createReply();
				deactivateIPCrossConnections(_arg0,_arg1,_arg2,_arg3);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				_out.write_string(_arg3.value);
			}
			catch(org.omg.hw.globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 51: // getAllIPCrossConnections
			{
			try
			{
				org.omg.hw.globaldefs.NameAndStringValue_T[] _arg0=org.omg.hw.globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=org.omg.hw.transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder _arg3= new org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder();
				org.omg.hw.HW_vpnManager.IPCrossConnectionIterator_IHolder _arg4= new org.omg.hw.HW_vpnManager.IPCrossConnectionIterator_IHolder();
				_out = handler.createReply();
				getAllIPCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(_out,_arg3.value);
				org.omg.hw.HW_vpnManager.IPCrossConnectionIterator_IHelper.write(_out,_arg4.value);
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
