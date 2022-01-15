package org.omg.hw.TopoManagementManager;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TopoMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TopoMgr_IPOATie
	extends TopoMgr_IPOA
{
	private TopoMgr_IOperations _delegate;

	private POA _poa;
	public TopoMgr_IPOATie(TopoMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TopoMgr_IPOATie(TopoMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.TopoManagementManager.TopoMgr_I _this()
	{
		return org.omg.hw.TopoManagementManager.TopoMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.TopoManagementManager.TopoMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.TopoManagementManager.TopoMgr_IHelper.narrow(_this_object(orb));
	}
	public TopoMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TopoMgr_IOperations delegate)
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
	public void getViewInfoByTopoSubnetwork(org.omg.hw.globaldefs.NameAndStringValue_T[] topoSubnetwork, int how_many, org.omg.hw.TopoManagementManager.NodeList_THolder nodeList, org.omg.hw.TopoManagementManager.NodeIterator_IHolder NodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getViewInfoByTopoSubnetwork(topoSubnetwork,how_many,nodeList,NodeIt);
	}

	public void getAllClockSourceViewlTopologicalLinks(int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllClockSourceViewlTopologicalLinks(how_many,topoList,topoIt);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getClockSourceSubnetworkViewInfo(int how_many, org.omg.hw.TopoManagementManager.NodeList_THolder nodeList, org.omg.hw.TopoManagementManager.NodeIterator_IHolder NodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getClockSourceSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getProtectSubnetworkViewInfo(int how_many, org.omg.hw.TopoManagementManager.NodeList_THolder nodeList, org.omg.hw.TopoManagementManager.NodeIterator_IHolder NodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getProtectSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void getTopoSubnetworkViewInfo(int how_many, org.omg.hw.TopoManagementManager.NodeList_THolder nodeList, org.omg.hw.TopoManagementManager.NodeIterator_IHolder NodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTopoSubnetworkViewInfo(how_many,nodeList,NodeIt);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}
