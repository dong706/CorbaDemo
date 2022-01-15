package org.omg.hw.ipMgr;

/**
 *	Generated from IDL interface "IPMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface IPMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllBridges(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.BridgeList_THolder bridgeList, org.omg.hw.ipMgr.BridgeIterator_IHolder bridgeIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllStaticRoutings(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.StaticRoutingList_THolder srList, org.omg.hw.ipMgr.StaticRoutingIterator_IHolder srIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllVRFs(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.VRFList_THolder vrfList, org.omg.hw.ipMgr.VRFIterator_IHolder vrfIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFDFrVRFs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, int how_many, org.omg.hw.ipMgr.VRFList_THolder vrfList, org.omg.hw.ipMgr.VRFIterator_IHolder vrfIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllFRRs(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.FRRList_THolder frrList, org.omg.hw.ipMgr.FRRIterator_IHolder frrIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllVRRPs(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.VRRPList_THolder vrrpList, org.omg.hw.ipMgr.VRRPIterator_IHolder vrrpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
