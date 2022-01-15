package org.omg.hw.protection;

/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface ProtectionMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.ProtectionGroupList_THolder pgList, org.omg.hw.protection.ProtectionGroupIterator_IHolder pgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.ProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createProtectionGroup(org.omg.hw.protection.PGPCreateData_T pgpCreateData, org.omg.hw.protection.ProtectionGroup_THolder thePGP) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgpName, org.omg.hw.globaldefs.NameAndStringValue_T[] swapTPName, org.omg.hw.protection.ProtectionGroup_THolder deletedPGP) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgpName, org.omg.hw.protection.PGPModifyData_T pgpModifyData, org.omg.hw.protection.ProtectionGroup_THolder modifiedPGP) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.protection.ProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllNUTTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllPreemptibleTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllProtectedTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void retrieveSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.protection.SwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void performProtectionCommand(org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.globaldefs.NameAndStringValue_T[] fromTp, org.omg.hw.globaldefs.NameAndStringValue_T[] toTp, org.omg.hw.protection.SwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAdjacentTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllEProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.EProtectionGroupList_THolder epgpList, org.omg.hw.protection.EProtectionGroupIterator_IHolder epgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getEProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] ePGPname, org.omg.hw.protection.EProtectionGroup_THolder eProtectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void retrieveESwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] ePGPName, org.omg.hw.protection.ESwitchDataList_THolder eSwitchDataList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllProtectionSubnetworks(int how_many, org.omg.hw.protection.ProtectionSubnetworkList_THolder psnList, org.omg.hw.protection.ProtectionSubnetworkIterator_IHolder psnIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllWDMProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.WDMProtectionGroupList_THolder wpgpList, org.omg.hw.protection.WDMProtectionGroupIterator_IHolder wpgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getWDMProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.protection.WDMProtectionGroup_THolder wProtectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void retrieveWDMSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.protection.WDMSwitchDataList_THolder wSwitchDataList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void performWDMProtectionCommand(org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.globaldefs.NameAndStringValue_T[] fromTp, org.omg.hw.globaldefs.NameAndStringValue_T[] toTp, org.omg.hw.protection.WDMSwitchData_THolder wSwitchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getIPProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.IPProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllIPProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.IPProtectionGroupList_THolder pgList, org.omg.hw.protection.IPProtectionGroupIterator_IHolder pgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void retrieveIPSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.protection.IPSwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getAllXPICGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.HW_XPICGroupList_THolder xpicList, org.omg.hw.protection.HW_XPICGroupIterator_IHolder xpicIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getXPICGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] xpicGroupName, org.omg.hw.protection.HW_XPICGroup_THolder xpicGroup) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getAllERPSProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.protection.HW_ERPSProtectionGroupList_THolder pgList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getERPSProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.HW_ERPSProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getAllIFProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.protection.HW_IFProtectionGroupList_THolder pgList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getIFProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.HW_IFProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void retrieveIFSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.IFSwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
