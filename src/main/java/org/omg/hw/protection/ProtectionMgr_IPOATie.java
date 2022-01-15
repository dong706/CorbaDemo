package org.omg.hw.protection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class ProtectionMgr_IPOATie
	extends ProtectionMgr_IPOA
{
	private ProtectionMgr_IOperations _delegate;

	private POA _poa;
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public ProtectionMgr_IPOATie(ProtectionMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.protection.ProtectionMgr_I _this()
	{
		return org.omg.hw.protection.ProtectionMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.protection.ProtectionMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.protection.ProtectionMgr_IHelper.narrow(_this_object(orb));
	}
	public ProtectionMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(ProtectionMgr_IOperations delegate)
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
	public void retrieveWDMSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.protection.WDMSwitchDataList_THolder wSwitchDataList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.retrieveWDMSwitchData(wpgpName,wSwitchDataList);
	}

	public void getAllProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.ProtectionGroupList_THolder pgList, org.omg.hw.protection.ProtectionGroupIterator_IHolder pgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectionGroups(meName,how_many,pgList,pgpIt);
	}

	public void retrieveSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.protection.SwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.retrieveSwitchData(reliableSinkCtpOrGroupName,switchData);
	}

	public void HW_getAllERPSProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.protection.HW_ERPSProtectionGroupList_THolder pgList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllERPSProtectionGroups(meName,pgList);
	}

	public void getWDMProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.protection.WDMProtectionGroup_THolder wProtectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getWDMProtectionGroup(wpgpName,wProtectionGroup);
	}

	public void HW_getIFProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.HW_IFProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getIFProtectionGroup(pgName,protectionGroup);
	}

	public void retrieveESwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] ePGPName, org.omg.hw.protection.ESwitchDataList_THolder eSwitchDataList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.retrieveESwitchData(ePGPName,eSwitchDataList);
	}

	public void retrieveIFSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.IFSwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.retrieveIFSwitchData(pgName,switchData);
	}

	public void getEProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] ePGPname, org.omg.hw.protection.EProtectionGroup_THolder eProtectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getEProtectionGroup(ePGPname,eProtectionGroup);
	}

	public void getAllNUTTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllNUTTPNames(pgName,how_many,nameList,nameIt);
	}

	public void performProtectionCommand(org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.globaldefs.NameAndStringValue_T[] fromTp, org.omg.hw.globaldefs.NameAndStringValue_T[] toTp, org.omg.hw.protection.SwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.performProtectionCommand(protectionCommand,reliableSinkCtpOrGroupName,fromTp,toTp,switchData);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getIPProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.IPProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getIPProtectionGroup(pgName,protectionGroup);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void HW_getAllXPICGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.HW_XPICGroupList_THolder xpicList, org.omg.hw.protection.HW_XPICGroupIterator_IHolder xpicIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllXPICGroups(meName,how_many,xpicList,xpicIt);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllPreemptibleTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllPreemptibleTPNames(pgName,how_many,nameList,nameIt);
	}

	public void modifyProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgpName, org.omg.hw.protection.PGPModifyData_T pgpModifyData, org.omg.hw.protection.ProtectionGroup_THolder modifiedPGP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyProtectionGroup(pgpName,pgpModifyData,modifiedPGP);
	}

	public void getAllProtectedTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectedTPNames(pgName,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getAllEProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.EProtectionGroupList_THolder epgpList, org.omg.hw.protection.EProtectionGroupIterator_IHolder epgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllEProtectionGroups(meName,how_many,epgpList,epgpIt);
	}

	public void HW_getERPSProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.HW_ERPSProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getERPSProtectionGroup(pgName,protectionGroup);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.protection.ProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setProtectionGroup(pgName,paraList,protectionGroup);
	}

	public void getAllWDMProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.WDMProtectionGroupList_THolder wpgpList, org.omg.hw.protection.WDMProtectionGroupIterator_IHolder wpgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllWDMProtectionGroups(meName,how_many,wpgpList,wpgpIt);
	}

	public void performWDMProtectionCommand(org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.globaldefs.NameAndStringValue_T[] fromTp, org.omg.hw.globaldefs.NameAndStringValue_T[] toTp, org.omg.hw.protection.WDMSwitchData_THolder wSwitchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.performWDMProtectionCommand(protectionCommand,wpgpName,fromTp,toTp,wSwitchData);
	}

	public void createProtectionGroup(org.omg.hw.protection.PGPCreateData_T pgpCreateData, org.omg.hw.protection.ProtectionGroup_THolder thePGP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createProtectionGroup(pgpCreateData,thePGP);
	}

	public void HW_getXPICGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] xpicGroupName, org.omg.hw.protection.HW_XPICGroup_THolder xpicGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getXPICGroup(xpicGroupName,xpicGroup);
	}

	public void deleteProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgpName, org.omg.hw.globaldefs.NameAndStringValue_T[] swapTPName, org.omg.hw.protection.ProtectionGroup_THolder deletedPGP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteProtectionGroup(pgpName,swapTPName,deletedPGP);
	}

	public void HW_getAllIFProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.protection.HW_IFProtectionGroupList_THolder pgList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.HW_getAllIFProtectionGroups(meName,pgList);
	}

	public void retrieveIPSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.protection.IPSwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.retrieveIPSwitchData(reliableSinkCtpOrGroupName,switchData);
	}

	public void getAdjacentTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAdjacentTPs(tpName,tpNameList);
	}

	public void getAllProtectionSubnetworks(int how_many, org.omg.hw.protection.ProtectionSubnetworkList_THolder psnList, org.omg.hw.protection.ProtectionSubnetworkIterator_IHolder psnIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllProtectionSubnetworks(how_many,psnList,psnIt);
	}

	public void getProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.ProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getProtectionGroup(pgName,protectionGroup);
	}

	public void getAllIPProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.IPProtectionGroupList_THolder pgList, org.omg.hw.protection.IPProtectionGroupIterator_IHolder pgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllIPProtectionGroups(meName,how_many,pgList,pgpIt);
	}

}
