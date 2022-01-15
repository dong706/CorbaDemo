package org.omg.hw.HW_vpnManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_VPNMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_VPNMgr_IPOATie
	extends HW_VPNMgr_IPOA
{
	private HW_VPNMgr_IOperations _delegate;

	private POA _poa;
	public HW_VPNMgr_IPOATie(HW_VPNMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_VPNMgr_IPOATie(HW_VPNMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_vpnManager.HW_VPNMgr_I _this()
	{
		return org.omg.hw.HW_vpnManager.HW_VPNMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_vpnManager.HW_VPNMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_vpnManager.HW_VPNMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_VPNMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_VPNMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void getIPCrossConnection(org.omg.hw.globaldefs.NameAndStringValue_T[] ipCCName, org.omg.hw.HW_vpnManager.IPCrossConnection_THolder ipCC) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getIPCrossConnection(ipCCName,ipCC);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void activateTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateTrafficTrunk(trafficTrunkName,theTrafficTrunk,errorReason);
	}

	public void activateMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateMFDFr(mfdfrName,tpsToModify,theMFDFr,errorReason);
	}

	public void deleteTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteTrafficTrunk(trafficTrunkName);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllTrafficTrunkNames(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunkNames(fdName,connectionRateList,how_many,nameList,nameIt);
	}

	public void modifyMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName, org.omg.hw.HW_vpnManager.MFDFrModifyData_T modifyData, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.hw.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, org.omg.hw.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyMFDFr(mfdfrName,modifyData,theMFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void getAllTrafficTrunksWithME(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunksWithME(managedElementName,connectionRateList,how_many,trafficTrunkList,trafficTrunkIt);
	}

	public void getAllTrafficTrunks(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunks(fdName,connectionRateList,how_many,trafficTrunkList,trafficTrunkIt);
	}

	public void deactivateTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateTrafficTrunk(trafficTrunkName,theTrafficTrunk,errorReason);
	}

	public void deactivateMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateMFDFr(mfdfrName,tpsToModify,theMFDFr,errorReason);
	}

	public void getMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getMFDFr(mfdfrName,theMFDFr);
	}

	public void getIPRoutesByTrafficTrunks(org.omg.hw.globaldefs.NameAndStringValue_T[][] trafficTrunkNameList, org.omg.hw.HW_vpnManager.IPRouteInfoList_THolder routeInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getIPRoutesByTrafficTrunks(trafficTrunkNameList,routeInfoList);
	}

	public void getSelfLearningMACAddressTable(org.omg.hw.globaldefs.NameAndStringValue_T[][] nameList, int how_many, org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableList_THolder tableList, org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableIterator_IHolder tableIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSelfLearningMACAddressTable(nameList,how_many,tableList,tableIt);
	}

	public void modifyTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T modifyData, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder newTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyTrafficTrunk(trafficTrunkName,modifyData,newTrafficTrunk,errorReason);
	}

	public void createTrafficTrunk(org.omg.hw.HW_vpnManager.TrafficTrunkCreateData_T createData, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createTrafficTrunk(createData,theTrafficTrunk,errorReason);
	}

	public void getAllFDFrNames(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrNames(fdName,how_many,connectionRateList,nameList,nameIt);
	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsByUserLabel(userLabel,fdfrList);
	}

	public void modifyFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.FDFrModifyData_T fdfrModifyData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyFDFr(fdfrName,fdfrModifyData,tpsToModify,tolerableImpact,newFDFr,errorReason);
	}

	public void getFDFrRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, boolean includeHigherOrderCCs, org.omg.hw.HW_vpnManager.FDFrRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoute(fdfrName,includeHigherOrderCCs,route);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getFDFrRoutes(org.omg.hw.globaldefs.NameAndStringValue_T[][] fdfrNameList, org.omg.hw.HW_vpnManager.FDFrRouteInfoList_THolder routeInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrRoutes(fdfrNameList,routeInfoList);
	}

	public void getTrafficTrunksWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, int how_many, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunksWithTP(tpName,how_many,trafficTrunkList,trafficTrunkIt);
	}

	public void getAllFDFrs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, org.omg.hw.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFDFrs(fdName,how_many,connectionRateList,fdfrList,fdfrIt);
	}

	public void createFDFr(org.omg.hw.HW_vpnManager.FDFrCreateData_T createData, org.omg.hw.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.subnetworkConnection.TPDataList_THolder endTPs, org.omg.hw.subnetworkConnection.TPDataList_THolder internalTPs, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFDFr(createData,connectivityRequirement,endTPs,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
	}

	public void deleteFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFDFr(fdfrName,tpsToModify);
	}

	public void deleteIPCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[][] ipCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder successedIPCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedIPCCNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList);
	}

	public void getFDFrsWithME(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, org.omg.hw.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithME(managedElementName,connectionRateList,how_many,fdfrList,fdfrIt);
	}

	public void getAllTrafficTrunkNamesWithME(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrafficTrunkNamesWithME(managedElementName,connectionRateList,how_many,nameList,nameIt);
	}

	public void deactivateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateFDFr(fdfrName,fdfr);
	}

	public void getFDFrsWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] cptpName, int how_many, org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, org.omg.hw.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrsWithTP(cptpName,how_many,fdfrList,fdfrIt);
	}

	public void getAllIPCrossConnectionNames(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllIPCrossConnectionNames(managedElementName,connectionRateList,how_many,nameList,nameIt);
	}

	public void activateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateFDFr(fdfrName,fdfr);
	}

	public void getTrafficTrunksByUserLabel(java.lang.String userLabel, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunksByUserLabel(userLabel,trafficTrunkList);
	}

	public void createMFDFr(org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_T createData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.hw.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, org.omg.hw.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createMFDFr(createData,tpsToModify,theMFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
	}

	public void deleteMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteMFDFr(mfdfrName);
	}

	public void getTrafficTrunkRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunkRoute(trafficTrunkName,route);
	}

	public void createIPCrossConnections(org.omg.hw.HW_vpnManager.IPCrossConnection_T[] ipCCList, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder successedIPCCList, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder failedIPCCList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createIPCrossConnections(ipCCList,successedIPCCList,failedIPCCList);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllMFDFrs(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrList, org.omg.hw.HW_vpnManager.MFDFrIterator_IHolder mfdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDFrs(meName,connectionRateList,how_many,mfdfrList,mfdfrIt);
	}

	public void modifyIPCrossConnection(org.omg.hw.globaldefs.NameAndStringValue_T[] ipCCName, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.HW_vpnManager.IPCrossConnection_THolder newIPCC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyIPCrossConnection(ipCCName,transmissionParams,newIPCC,errorReason);
	}

	public void getTrafficTrunksByNativeEmsName(java.lang.String nativeEmsName, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunksByNativeEmsName(nativeEmsName,trafficTrunkList);
	}

	public void activateIPCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[][] ipCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder successedIPCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList,errorReason);
	}

	public void getFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder theFDFr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFr(fdfrName,theFDFr);
	}

	public void getIPRoutes(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder routes) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getIPRoutes(trafficTrunkName,routes);
	}

	public void getTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder trafficTrunk) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTrafficTrunk(trafficTrunkName,trafficTrunk);
	}

	public void getFDFrServerTrail(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.globaldefs.NamingAttributesList_THolder serverNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrServerTrail(fdfrName,serverNameList);
	}

	public void getAllMFDFrNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMFDFrNames(meName,connectionRateList,how_many,nameList,nameIt);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void deactivateIPCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[][] ipCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder successedIPCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList,errorReason);
	}

	public void getAllIPCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder ipCCList, org.omg.hw.HW_vpnManager.IPCrossConnectionIterator_IHolder ipCCIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllIPCrossConnections(managedElementName,connectionRateList,how_many,ipCCList,ipCCIt);
	}

}
