package org.omg.hw.flowDomain;

/**
 *	Generated from IDL interface "FlowDomainMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface FlowDomainMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllFlowDomains(int how_many, org.omg.hw.flowDomain.FDList_THolder flowDomains, org.omg.hw.flowDomain.FDIterator_IHolder fdIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllFlowDomainNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFlowDomainsByUserLabel(java.lang.String userLabel, org.omg.hw.flowDomain.FDList_THolder flowDomains) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain.FlowDomain_THolder flowDomain) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFDfromMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain.FlowDomain_THolder flowDomain) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTransmissionParams(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createFlowDomain(org.omg.hw.flowDomain.FDCreateData_T createData, org.omg.hw.globaldefs.NamingAttributesList_THolder fdEdgeCPTPs, org.omg.hw.flowDomain.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain.FDModifyData_T fdModifyData, org.omg.hw.flowDomain.FlowDomain_THolder newFD) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void associateMFDsWithFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfdNames) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deAssociateMFDsFromFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfdNames) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void associateCPTPsWithFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deAssociateCPTPsFromFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllMFDs(org.omg.hw.globaldefs.NameAndStringValue_T[] holderName, int how_many, org.omg.hw.flowDomain.MFDList_THolder mfds, org.omg.hw.flowDomain.MFDIterator_IHolder mfdIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllMFDNames(org.omg.hw.globaldefs.NameAndStringValue_T[] holderName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain.MatrixFlowDomain_THolder mfd) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAssigningMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] cptpName, org.omg.hw.flowDomain.MatrixFlowDomain_THolder mfd) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createMFD(org.omg.hw.flowDomain.MFDCreateData_T createData, org.omg.hw.flowDomain.MatrixFlowDomain_THolder theMFD) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain.MFDModifyData_T mfdModifyData, org.omg.hw.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.omg.hw.globaldefs.NVSList_THolder additionalModificationInfo, org.omg.hw.flowDomain.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void assignCPTPsToMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void unassignCPTPsFromMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createFTP(org.omg.hw.flowDomain.FTPCreateData_T createData, org.omg.hw.terminationPoint.TerminationPoint_THolder theFTP) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteFTP(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdOrMfdName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAssignableCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllFDFrs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, org.omg.hw.flowDomainFragment.FDFrList_THolder fdfrList, org.omg.hw.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllFDFrNames(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFDFrsWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, int how_many, org.omg.hw.flowDomainFragment.FDFrList_THolder fdfrList, org.omg.hw.flowDomainFragment.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFDFrsByUserLabel(java.lang.String userLabel, org.omg.hw.flowDomainFragment.FDFrList_THolder fdfrs) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createFDFr(org.omg.hw.flowDomainFragment.FDFrCreateData_T createData, org.omg.hw.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.globaldefs.NamingAttributesList_THolder endTPs, org.omg.hw.globaldefs.NamingAttributesList_THolder internalTPs, org.omg.hw.flowDomainFragment.MatrixFlowDomainFragmentList_THolder mfdfrs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void activateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deactivateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment.FDFrModifyData_T fdfrModifyData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.flowDomainFragment.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void addFPsToFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNames, org.omg.hw.globaldefs.NamingAttributesList_THolder internalTpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void removeFPsFromFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNames, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void validateTMDAssignmentToMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.CORBA.StringHolder tmdAssignmentState, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.omg.hw.globaldefs.NVSList_THolder additionalTPInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getFDFrServerTrail(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.globaldefs.NamingAttributesList_THolder serverNameList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllEthernetOAMPoint(org.omg.hw.globaldefs.NameAndStringValue_T[] Fdfrname, org.omg.hw.flowDomain.EthernetOAMPointList_THolder oamPointList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void performEthernetOAMCommand(org.omg.hw.flowDomain.EthernetOAMOperation_T operation, org.omg.hw.flowDomain.EthernetLTTestResultList_THolder ltTestResult) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
