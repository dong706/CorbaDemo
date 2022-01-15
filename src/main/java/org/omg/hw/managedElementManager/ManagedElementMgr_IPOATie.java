package org.omg.hw.managedElementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ManagedElementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ManagedElementMgr_IPOATie
	extends ManagedElementMgr_IPOA
{
	private ManagedElementMgr_IOperations _delegate;

	private POA _poa;
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ManagedElementMgr_IPOATie(ManagedElementMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.managedElementManager.ManagedElementMgr_I _this()
	{
		return org.omg.hw.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
	}
	public ManagedElementMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ManagedElementMgr_IOperations delegate)
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
	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setADCInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T adcInfo, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedadcInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setADCInfo(adcInfo,modifiedadcInfo);
	}

	public void getContainingSubnetworkNames(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.hw.globaldefs.NamingAttributesList_THolder subnetNames) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainingSubnetworkNames(managedElementName,subnetNames);
	}

	public void getContainedPotentialTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getContainedCurrentTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void setTPData(org.omg.hw.subnetworkConnection.TPData_T tpInfo, org.omg.hw.terminationPoint.TerminationPoint_THolder modifiedTP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setTPData(tpInfo,modifiedTP);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void createFTP(org.omg.hw.flowDomain.FTPCreateData_T createData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.terminationPoint.TerminationPoint_THolder theFTP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFTP(createData,tpsToModify,theFTP);
	}

	public void getManagedElement(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.hw.managedElement.ManagedElement_THolder me) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getManagedElement(managedElementName,me);
	}

	public void getContainedInUseTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getADCInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objName, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder adcInfoLst) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getADCInfo(objName,adcInfoLst);
	}

	public void getTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.terminationPoint.TerminationPoint_THolder tp) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTP(tpName,tp);
	}

	public void getAllAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, org.omg.hw.globaldefs.NamingAttributesList_THolder failedMeNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllAlarmsByFTP(destination,userName,password,meNameList,excludeProbCauseList,excludeSeverityList,startTime,endTime,failedMeNameList);
	}

	public void getAllManagedElementNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(how_many,nameList,nameIt);
	}

	public void checkActiveAlarms(org.omg.hw.CosNotification.StructuredEvent[] activeEventList, org.omg.hw.notifications.EventList_THolder clearedEventList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.checkActiveAlarms(activeEventList,clearedEventList);
	}

	public void getAllActiveAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getContainedPotentialTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void getContainingTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPs(tpName,tpList);
	}

	public void getAPRInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objName, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THolder aprInfoLst) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAPRInfo(objName,aprInfoLst);
	}

	public void setwdmALCInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T wdmalcInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setwdmALCInfo(wdmalcInfo);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setAPEInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T apeInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAPEInfo(apeInfo);
	}

	public void getNEStaticInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder staticInfoList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder staticInfoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getNEStaticInfo(managedElementName,how_many,staticInfoList,staticInfoIt);
	}

	public void deleteCrossConnections(org.omg.hw.subnetworkConnection.CrossConnect_T[] ccList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder successedCCList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder failedCCList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void getFTPMembers(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFTPMembers(ftpName,tpList);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPs(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
	}

	public void getAllManagedElements(int how_many, org.omg.hw.managedElement.ManagedElementList_THolder meList, org.omg.hw.managedElement.ManagedElementIterator_IHolder meIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(how_many,meList,meIt);
	}

	public void modifyCrossConnection(org.omg.hw.subnetworkConnection.CrossConnect_T ccToModify, org.omg.hw.subnetworkConnection.CrossConnect_T newCc, org.omg.hw.subnetworkConnection.CrossConnect_THolder modifiedCc) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyCrossConnection(ccToModify,newCc,modifiedCc);
	}

	public void setAPRInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T aprInfo, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THolder modifiedaprInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAPRInfo(aprInfo,modifiedaprInfo);
	}

	public void modifyFTPMembers(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName, java.lang.String modifyType, org.omg.hw.subnetworkConnection.TPData_T[] tpList, org.omg.hw.subnetworkConnection.TPDataList_THolder successedTPList, org.omg.hw.subnetworkConnection.TPDataList_THolder failedTPList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyFTPMembers(ftpName,modifyType,tpList,successedTPList,failedTPList);
	}

	public void getAllCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.subnetworkConnection.CrossConnectList_THolder ccList, org.omg.hw.subnetworkConnection.CCIterator_IHolder ccIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllCrossConnections(managedElementName,connectionRateList,how_many,ccList,ccIt);
	}

	public void getActiveAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getActiveAlarms(objectNameList,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getContainedCurrentTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setotnALCInfo(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T otnalcInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setotnALCInfo(otnalcInfo);
	}

	public void getContainingTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainingTPNames(tpName,tpNameList);
	}

	public void deactivateCrossConnections(org.omg.hw.subnetworkConnection.CrossConnect_T[] ccList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder successedCCList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder failedCCList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deactivateCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void getAllPTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPNames(managedElementName,tpLayerRateList,connectionLayerRateList,how_many,nameList,nameIt);
	}

	public void activateCrossConnections(org.omg.hw.subnetworkConnection.CrossConnect_T[] ccList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder successedCCList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder failedCCList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.activateCrossConnections(ccList,successedCCList,failedCCList);
	}

	public void deleteFTP(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFTP(ftpName);
	}

	public void getContainedInUseTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPNames(tpName,layerRateList,how_many,nameList,nameIt);
	}

	public void createCrossConnections(org.omg.hw.subnetworkConnection.CrossConnect_T[] ccList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder successedCCList, org.omg.hw.subnetworkConnection.CrossConnectList_THolder failedCCList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createCrossConnections(ccList,successedCCList,failedCCList);
	}

}
