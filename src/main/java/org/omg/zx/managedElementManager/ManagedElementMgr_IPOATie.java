package org.omg.zx.managedElementManager;

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
	public org.omg.zx.managedElementManager.ManagedElementMgr_I _this()
	{
		return org.omg.zx.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
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
	public void getAllActiveAlarms(org.omg.zx.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void getAllPTPs(org.omg.zx.globaldefs.NameAndStringValue_T[] managedElementName, short[] tpLayerRateList, short[] connectionLayerRateList, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllPTPs(managedElementName,tpLayerRateList,connectionLayerRateList,tpList);
	}

	public void getContainedPotentialTPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList, org.omg.zx.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getMEClockCoordinates(org.omg.zx.globaldefs.NameAndStringValue_T[][] meNameList, org.omg.zx.managedElement.MECoordinateList_THolder meCoordList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getMEClockCoordinates(meNameList,meCoordList);
	}

	public void activateCrossConnections(org.omg.zx.subnetworkConnection.CrossConnect_T[] ccList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder successedList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder failedList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.activateCrossConnections(ccList,successedList,failedList);
	}

	public void getAllManagedElementNames(org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNames(nameList);
	}

	public void deactivateCrossConnections(org.omg.zx.subnetworkConnection.CrossConnect_T[] ccList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder successedList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder failedList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deactivateCrossConnections(ccList,successedList,failedList);
	}

	public void getContainedPotentialTPNames(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getContainedPotentialTPNames(tpName,layerRateList,nameList);
	}

	public void createCrossConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] meName, org.omg.zx.subnetworkConnection.CrossConnect_T[] add, org.omg.zx.subnetworkConnection.CrossConnectList_THolder addSuccess) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.createCrossConnections(meName,add,addSuccess);
	}

	public void getAllPSEs(org.omg.zx.globaldefs.NameAndStringValue_T[] meName, org.omg.zx.notifications.EventList_THolder activePSEList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllPSEs(meName,activePSEList);
	}

	public void getAllManagedElements(org.omg.zx.managedElement.ManagedElementList_THolder meList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElements(meList);
	}

	public void getManagedElement(org.omg.zx.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.zx.managedElement.ManagedElement_THolder me) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getManagedElement(managedElementName,me);
	}

	public void deleteCrossConnections(org.omg.zx.subnetworkConnection.CrossConnect_T[] ccList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder successedList, org.omg.zx.subnetworkConnection.CrossConnectList_THolder failedList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deleteCrossConnections(ccList,successedList,failedList);
	}

	public void getAllCrossConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.zx.subnetworkConnection.CrossConnectList_THolder crossConnections, org.omg.zx.subnetworkConnection.CCIterator_IHolder ccIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllCrossConnections(managedElementName,connectionRateList,how_many,crossConnections,ccIt);
	}

	public void getContainedCurrentTPNames(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPNames(tpName,layerRateList,nameList);
	}

	public void getContainedCurrentTPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList, org.omg.zx.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getContainedCurrentTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void getSFPInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] brdPortName, org.omg.zx.terminationPoint.BrdPortSFPInfoList_THolder brdPortInfoList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getSFPInfo(brdPortName,brdPortInfoList);
	}

	public void getContainedInUseTPNames(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPNames(tpName,layerRateList,nameList);
	}

	public void getCrossConnection(org.omg.zx.globaldefs.NameAndStringValue_T[] ccName, org.omg.zx.subnetworkConnection.CrossConnect_THolder crossConnection) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCrossConnection(ccName,crossConnection);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getMEconfigData(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String[] configDataTypes, org.omg.zx.managedElementManager.MEConfigData_THolder meConfigDatas) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getMEconfigData(name,configDataTypes,meConfigDatas);
	}

	public void getContainedInUseTPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] layerRateList, int how_many, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList, org.omg.zx.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getContainedInUseTPs(tpName,layerRateList,how_many,tpList,tpIt);
	}

	public void setTPData(org.omg.zx.subnetworkConnection.TPData_T tpInfo, org.omg.zx.terminationPoint.TerminationPoint_THolder modifiedTP) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setTPData(tpInfo,modifiedTP);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllManagedElementNamesByIterator(int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementNamesByIterator(how_many,nameList,nameIt);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllUnacknowledgedActiveAlarms(org.omg.zx.globaldefs.NameAndStringValue_T[] meName, java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllUnacknowledgedActiveAlarms(meName,excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getModifiedManagedElementNames(java.lang.String fromTime, int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getModifiedManagedElementNames(fromTime,how_many,nameList,nameIt);
	}

	public void setCrossConnections(org.omg.zx.subnetworkConnection.CrossConnect_T[] add, org.omg.zx.subnetworkConnection.CrossConnect_T[] remove, org.omg.zx.subnetworkConnection.CrossConnectList_THolder addSuccess, org.omg.zx.subnetworkConnection.CrossConnectList_THolder removeSuccess) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setCrossConnections(add,remove,addSuccess,removeSuccess);
	}

	public void getAllEquipmentInnerConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.zx.subnetworkConnection.CrossConnectList_THolder crossConnections, org.omg.zx.subnetworkConnection.CCIterator_IHolder ccIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllEquipmentInnerConnections(managedElementName,connectionRateList,how_many,crossConnections,ccIt);
	}

	public void getAllManagedElementsByIterator(int how_many, org.omg.zx.managedElement.ManagedElementList_THolder meList, org.omg.zx.managedElement.ManagedElementIterator_IHolder meIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAllManagedElementsByIterator(how_many,meList,meIt);
	}

	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void getMECoordinates(org.omg.zx.globaldefs.NameAndStringValue_T[][] meNameList, org.omg.zx.managedElement.MECoordinateList_THolder meCoordList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getMECoordinates(meNameList,meCoordList);
	}

	public void getTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, org.omg.zx.terminationPoint.TerminationPoint_THolder tp) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getTP(tpName,tp);
	}

}
