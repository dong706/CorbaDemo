package org.omg.hw.HW_mstpInventory;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_MSTPInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_MSTPInventoryMgr_IPOATie
	extends HW_MSTPInventoryMgr_IPOA
{
	private HW_MSTPInventoryMgr_IOperations _delegate;

	private POA _poa;
	public HW_MSTPInventoryMgr_IPOATie(HW_MSTPInventoryMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_MSTPInventoryMgr_IPOATie(HW_MSTPInventoryMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_mstpInventory.HW_MSTPInventoryMgr_I _this()
	{
		return org.omg.hw.HW_mstpInventory.HW_MSTPInventoryMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_mstpInventory.HW_MSTPInventoryMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_mstpInventory.HW_MSTPInventoryMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_MSTPInventoryMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_MSTPInventoryMgr_IOperations delegate)
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
	public void getAllLinkAggregationGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupList_THolder lagList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupIterator_IHolder lagIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllLinkAggregationGroups(meName,how_many,lagList,lagIt);
	}

	public void getAllVBs(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_VirtualBridgeList_THolder vbList, org.omg.hw.HW_mstpInventory.HW_VirtualBridgeIterator_IHolder vbIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllVBs(meName,how_many,vbList,vbIt);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getSpanningTree(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.HW_mstpInventory.HW_SpanningTree_THolder spanningTree) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSpanningTree(spanningTreeName,spanningTree);
	}

	public void setSTBridgeParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setSTBridgeParam(spanningTreeName,paraList);
	}

	public void setMstpEndPointShapingQueue(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setMstpEndPointShapingQueue(endPointName,shapingQueueList);
	}

	public void createVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, short vbId, java.lang.String vbName, org.omg.hw.HW_mstpInventory.HW_VirtualBridge_THolder vb) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createVirtualBridge(equipmentName,vbId,vbName,vb);
	}

	public void createVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, short vlanId, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createVLAN(vbName,vlanId,forwardTPList,vlan);
	}

	public void getAllVLANNames(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllVLANNames(vbName,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, org.omg.hw.HW_mstpInventory.HW_VirtualBridge_THolder vb) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getVirtualBridge(vbName,vb);
	}

	public void setFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName, org.omg.hw.globaldefs.NameAndStringValue_T[][] qosRuleNames, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setFlow(flowName,qosRuleNames,flow);
	}

	public void getAllQosRules(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_QosRuleList_THolder qosRuleList, org.omg.hw.HW_mstpInventory.HW_QosRuleIterator_IHolder qosRuleIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllQosRules(meName,how_many,qosRuleList,qosRuleIt);
	}

	public void getAllFlowNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlowNames(meName,how_many,nameList,nameIt);
	}

	public void getAllContainedInUseTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedInUseTPNames(endPointName,layerRateList,how_many,nameList,nameIt);
	}

	public void getAllLinkAggregationGroupNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllLinkAggregationGroupNames(meName,how_many,nameList,nameIt);
	}

	public void getAllQosRuleNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllQosRuleNames(meName,how_many,nameList,nameIt);
	}

	public void modifyLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[][] addedBranchPortNameList, org.omg.hw.globaldefs.NameAndStringValue_T[][] deletedBranchPortNameList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyLinkAggregationGroup(lagName,paraList,addedBranchPortNameList,deletedBranchPortNameList,lag);
	}

	public void addVLANForwardPort(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.addVLANForwardPort(vlanName,forwardTPList,vlan);
	}

	public void getAllMstpEndPoints(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointList_THolder endPointList, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointIterator_IHolder endPointIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMstpEndPoints(meName,typeList,how_many,endPointList,endPointIt);
	}

	public void deleteLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteLinkAggregationGroup(lagName);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.CORBA.BooleanHolder enableState) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getLCASState(endPointName,enableState);
	}

	public void deleteVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteVLAN(vlanName);
	}

	public void setVLANData(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setVLANData(vlanName,paraList,vlan);
	}

	public void getQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getQosRule(qosRuleName,qosRule);
	}

	public void setSTPortParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] portName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setSTPortParam(spanningTreeName,portName,paraList);
	}

	public void setQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setQosRule(qosRuleName,paraList,qosRule);
	}

	public void deleteVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteVirtualBridge(vbName);
	}

	public void getAllFlows(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_FlowList_THolder flowList, org.omg.hw.HW_mstpInventory.HW_FlowIterator_IHolder flowIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFlows(meName,how_many,flowList,flowIt);
	}

	public void createQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, org.omg.hw.HW_mstpInventory.HW_QosType_T qosType, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createQosRule(equipmentName,qosType,paraList,qosRule);
	}

	public void getMstpEndPoint(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getMstpEndPoint(endPointName,endPoint);
	}

	public void getAllMstpEndPointNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllMstpEndPointNames(meName,typeList,how_many,nameList,nameIt);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFlow(flowName,flow);
	}

	public void createFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createFlow(equipmentName,paraList,flow);
	}

	public void getLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getLinkAggregationGroup(lagName,lag);
	}

	public void setSTProtocolParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setSTProtocolParam(spanningTreeName,paraList);
	}

	public void delVLANForwardPort(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.delVLANForwardPort(vlanName,forwardTPList,vlan);
	}

	public void getAllVBNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllVBNames(meName,how_many,nameList,nameIt);
	}

	public void getVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getVLAN(vlanName,vlan);
	}

	public void getAllSpanningTrees(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.HW_mstpInventory.HW_SpanningTreeList_THolder spanningTreeList, org.omg.hw.HW_mstpInventory.HW_SpanningTreeIterator_IHolder spanningTreeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSpanningTrees(equipmentName,how_many,spanningTreeList,spanningTreeIt);
	}

	public void getMstpEndPointShapingQueue(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getMstpEndPointShapingQueue(endPointName,shapingQueueList);
	}

	public void deleteFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteFlow(flowName);
	}

	public void getAvailablePortNames(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAvailablePortNames(equipmentName,how_many,nameList,nameIt);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllVLANs(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, int how_many, org.omg.hw.HW_mstpInventory.HW_VirtualLANList_THolder vlanList, org.omg.hw.HW_mstpInventory.HW_VirtualLANIterator_IHolder vlanIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllVLANs(vbName,how_many,vlanList,vlanIt);
	}

	public void getAllContainedCurrentTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedCurrentTPNames(endPointName,layerRateList,how_many,nameList,nameIt);
	}

	public void createLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[] mainPortName, org.omg.hw.globaldefs.NameAndStringValue_T[][] branchPortNameList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createLinkAggregationGroup(meName,paraList,mainPortName,branchPortNameList,lag);
	}

	public void deleteQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteQosRule(qosRuleName);
	}

	public void setMstpEndPoint(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.transmissionParameters.LayeredParameters_T[] paraList, org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setMstpEndPoint(endPointName,paraList,endPoint);
	}

	public void delBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.terminationPoint.Directionality_T bindingDirect, org.omg.hw.globaldefs.NameAndStringValue_T[][] pathList, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.delBindingPath(endPointName,bindingDirect,pathList,bindingPathList);
	}

	public void getBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getBindingPath(endPointName,bindingPathList);
	}

	public void addBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.terminationPoint.Directionality_T bindingDirect, org.omg.hw.globaldefs.NameAndStringValue_T[][] pathList, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.addBindingPath(endPointName,bindingDirect,pathList,bindingPathList);
	}

	public void getAllSpanningTreeNames(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSpanningTreeNames(equipmentName,how_many,nameList,nameIt);
	}

	public void setLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, boolean enableState) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setLCASState(endPointName,enableState);
	}

}
