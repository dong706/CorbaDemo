package org.omg.hw.HW_controlPlane;

/**
 *	Generated from IDL interface "HW_controlPlaneMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_controlPlaneMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllRoutingAreaNames(org.omg.hw.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllRoutingNodeNames(org.omg.hw.globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nodeNameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSnppLinks(org.omg.hw.globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, org.omg.hw.HW_controlPlane.HW_SnppLinkList_THolder snppLinkList, org.omg.hw.HW_controlPlane.HW_SnppLinkIterator_IHolder snppLinkIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getSnppLink(org.omg.hw.globaldefs.NameAndStringValue_T[] snppLinkName, org.omg.hw.HW_controlPlane.HW_SnppLink_THolder snppLink) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSnppNames(org.omg.hw.globaldefs.NameAndStringValue_T[] routingNodeName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllContainedSnpNames(org.omg.hw.globaldefs.NameAndStringValue_T[] snppName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setSRLG(int srlgID, boolean addOrRemove, org.omg.hw.globaldefs.NamingAttributesList_THolder snppLinkNameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getNodeIDByMEName(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrHolderName, org.omg.hw.HW_controlPlane.HW_controlPlaneMgr_IPackage.nodeIDList_THolder nodeID) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getMENameByNodeID(java.lang.String nodeID, org.omg.hw.globaldefs.NamingAttributesList_THolder meOrHolderNameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
