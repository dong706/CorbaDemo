package org.omg.hw.encapsulationLayerLink;

/**
 *	Generated from IDL interface "EncapsulationLayerLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EncapsulationLayerLinkMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllELLinks(int how_many, org.omg.hw.encapsulationLayerLink.ELLinkList_THolder ells, org.omg.hw.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllELLinkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getELLinkWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getConnectingELL(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getELLinkWithSncOrTl(org.omg.hw.globaldefs.NameAndStringValue_T[] sncOrTlName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllELLinksWithMeOrFd(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrFdName, int how_many, org.omg.hw.encapsulationLayerLink.ELLinkList_THolder ells, org.omg.hw.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getServerSNCsAndTLs(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.topologicalLink.TopologicalLinkList_THolder tlList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTransmissionParams(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createELLink(org.omg.hw.encapsulationLayerLink.ELLinkCreateData_T createData, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void activateELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deactivateELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.ELLinkModifyData_T ellModifyData, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void increaseBandwidthOfELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, boolean automatic, org.omg.hw.subnetworkConnection.SNCCreateData_T[] additionalSNCs, short numberOfSNCs, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalModificationInfo, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void decreaseBandwidthOfELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNames, short numberOfSNCs, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalModificationInfo, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setELLinkLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, boolean enableState) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
