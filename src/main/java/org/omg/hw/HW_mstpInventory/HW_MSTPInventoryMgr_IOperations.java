package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL interface "HW_MSTPInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_MSTPInventoryMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllMstpEndPoints(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointList_THolder endPointList, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointIterator_IHolder endPointIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllMstpEndPointNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getMstpEndPoint(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setMstpEndPoint(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.transmissionParameters.LayeredParameters_T[] paraList, org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllVBs(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_VirtualBridgeList_THolder vbList, org.omg.hw.HW_mstpInventory.HW_VirtualBridgeIterator_IHolder vbIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllVBNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, org.omg.hw.HW_mstpInventory.HW_VirtualBridge_THolder vb) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, short vbId, java.lang.String vbName, org.omg.hw.HW_mstpInventory.HW_VirtualBridge_THolder vb) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, short vlanId, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllVLANs(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, int how_many, org.omg.hw.HW_mstpInventory.HW_VirtualLANList_THolder vlanList, org.omg.hw.HW_mstpInventory.HW_VirtualLANIterator_IHolder vlanIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllVLANNames(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void addVLANForwardPort(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void delVLANForwardPort(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setVLANData(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void addBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.terminationPoint.Directionality_T bindingDirect, org.omg.hw.globaldefs.NameAndStringValue_T[][] pathList, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void delBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.terminationPoint.Directionality_T bindingDirect, org.omg.hw.globaldefs.NameAndStringValue_T[][] pathList, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.CORBA.BooleanHolder enableState) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, boolean enableState) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllContainedCurrentTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllContainedInUseTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, org.omg.hw.HW_mstpInventory.HW_QosType_T qosType, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllQosRules(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_QosRuleList_THolder qosRuleList, org.omg.hw.HW_mstpInventory.HW_QosRuleIterator_IHolder qosRuleIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllQosRuleNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllFlows(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_FlowList_THolder flowList, org.omg.hw.HW_mstpInventory.HW_FlowIterator_IHolder flowIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllFlowNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName, org.omg.hw.globaldefs.NameAndStringValue_T[][] qosRuleNames, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[] mainPortName, org.omg.hw.globaldefs.NameAndStringValue_T[][] branchPortNameList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllLinkAggregationGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupList_THolder lagList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupIterator_IHolder lagIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllLinkAggregationGroupNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAvailablePortNames(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[][] addedBranchPortNameList, org.omg.hw.globaldefs.NameAndStringValue_T[][] deletedBranchPortNameList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setMstpEndPointShapingQueue(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getMstpEndPointShapingQueue(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSpanningTrees(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.HW_mstpInventory.HW_SpanningTreeList_THolder spanningTreeList, org.omg.hw.HW_mstpInventory.HW_SpanningTreeIterator_IHolder spanningTreeIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllSpanningTreeNames(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getSpanningTree(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.HW_mstpInventory.HW_SpanningTree_THolder spanningTree) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setSTProtocolParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setSTBridgeParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setSTPortParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] portName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
