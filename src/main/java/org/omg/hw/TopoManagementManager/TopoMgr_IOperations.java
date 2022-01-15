package org.omg.hw.TopoManagementManager;

/**
 *	Generated from IDL interface "TopoMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TopoMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getTopoSubnetworkViewInfo(int how_many, org.omg.hw.TopoManagementManager.NodeList_THolder nodeList, org.omg.hw.TopoManagementManager.NodeIterator_IHolder NodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getProtectSubnetworkViewInfo(int how_many, org.omg.hw.TopoManagementManager.NodeList_THolder nodeList, org.omg.hw.TopoManagementManager.NodeIterator_IHolder NodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getViewInfoByTopoSubnetwork(org.omg.hw.globaldefs.NameAndStringValue_T[] topoSubnetwork, int how_many, org.omg.hw.TopoManagementManager.NodeList_THolder nodeList, org.omg.hw.TopoManagementManager.NodeIterator_IHolder NodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getClockSourceSubnetworkViewInfo(int how_many, org.omg.hw.TopoManagementManager.NodeList_THolder nodeList, org.omg.hw.TopoManagementManager.NodeIterator_IHolder NodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllClockSourceViewlTopologicalLinks(int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
