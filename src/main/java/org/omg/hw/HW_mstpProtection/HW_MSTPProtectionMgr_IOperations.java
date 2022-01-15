package org.omg.hw.HW_mstpProtection;

/**
 *	Generated from IDL interface "HW_MSTPProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_MSTPProtectionMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllRPRNode(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_RPRNodeList_THolder nodeList, org.omg.hw.HW_mstpProtection.HW_RPRNodeIterator_IHolder nodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getRPRNode(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRNode_THolder node) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyRPRNodePara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.globaldefs.NameAndStringValue_T[] rprNodeParameters, org.omg.hw.HW_mstpProtection.HW_RPRNode_THolder node) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getRPRTopoPara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_THolder topoInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void retrieveRPRSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void performRPRProtectionCommand(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.HW_mstpProtection.HW_SwitchPosition_T switchPosition, org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder pgIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] atmPgName, org.omg.hw.globaldefs.NameAndStringValue_T[] atmPGParameters, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void retrieveAtmPGSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void performAtmPGProtectionCommand(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchAction_T switchAction, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllRPRLinkInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_RPRLinkInfoList_THolder linkList, org.omg.hw.HW_mstpProtection.HW_RPRLinkIterator_IHolder rprLinkIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyRPRLinkPara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.globaldefs.NameAndStringValue_T[] rprLinkParameters, org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_THolder linkInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
