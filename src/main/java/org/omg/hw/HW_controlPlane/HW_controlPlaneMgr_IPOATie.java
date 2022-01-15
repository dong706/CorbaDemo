package org.omg.hw.HW_controlPlane;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "HW_controlPlaneMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class HW_controlPlaneMgr_IPOATie
	extends HW_controlPlaneMgr_IPOA
{
	private HW_controlPlaneMgr_IOperations _delegate;

	private POA _poa;
	public HW_controlPlaneMgr_IPOATie(HW_controlPlaneMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public HW_controlPlaneMgr_IPOATie(HW_controlPlaneMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.HW_controlPlane.HW_controlPlaneMgr_I _this()
	{
		return org.omg.hw.HW_controlPlane.HW_controlPlaneMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.HW_controlPlane.HW_controlPlaneMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.HW_controlPlane.HW_controlPlaneMgr_IHelper.narrow(_this_object(orb));
	}
	public HW_controlPlaneMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(HW_controlPlaneMgr_IOperations delegate)
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
	public void getAllContainedSnpNames(org.omg.hw.globaldefs.NameAndStringValue_T[] snppName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllContainedSnpNames(snppName,how_many,nameList,nameIt);
	}

	public void getAllRoutingAreaNames(org.omg.hw.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllRoutingAreaNames(nameList);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getNodeIDByMEName(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrHolderName, org.omg.hw.HW_controlPlane.HW_controlPlaneMgr_IPackage.nodeIDList_THolder nodeID) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getNodeIDByMEName(meOrHolderName,nodeID);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getAllSnppLinks(org.omg.hw.globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, org.omg.hw.HW_controlPlane.HW_SnppLinkList_THolder snppLinkList, org.omg.hw.HW_controlPlane.HW_SnppLinkIterator_IHolder snppLinkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSnppLinks(routingAreaName,how_many,snppLinkList,snppLinkIt);
	}

	public void setSRLG(int srlgID, boolean addOrRemove, org.omg.hw.globaldefs.NamingAttributesList_THolder snppLinkNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setSRLG(srlgID,addOrRemove,snppLinkNameList);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getMENameByNodeID(java.lang.String nodeID, org.omg.hw.globaldefs.NamingAttributesList_THolder meOrHolderNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getMENameByNodeID(nodeID,meOrHolderNameList);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getSnppLink(org.omg.hw.globaldefs.NameAndStringValue_T[] snppLinkName, org.omg.hw.HW_controlPlane.HW_SnppLink_THolder snppLink) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getSnppLink(snppLinkName,snppLink);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getAllSnppNames(org.omg.hw.globaldefs.NameAndStringValue_T[] routingNodeName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllSnppNames(routingNodeName,how_many,nameList,nameIt);
	}

	public void getAllRoutingNodeNames(org.omg.hw.globaldefs.NameAndStringValue_T[] routingAreaName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nodeNameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllRoutingNodeNames(routingAreaName,how_many,nodeNameList,nodeIt);
	}

}
