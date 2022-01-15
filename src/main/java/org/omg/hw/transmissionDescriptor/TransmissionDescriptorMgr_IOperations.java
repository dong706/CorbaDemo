package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL interface "TransmissionDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TransmissionDescriptorMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTransmissionDescriptors(int how_many, org.omg.hw.transmissionDescriptor.TransmissionDescriptorList_THolder transmissionDescList, org.omg.hw.transmissionDescriptor.TransmissionDescriptorIterator_IHolder transmissionDescIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllTransmissionDescriptorNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTransmissionDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tmdName, org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder tmd) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAssociatedTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] transmissionDescriptorName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createTransmissionDescriptor(org.omg.hw.transmissionDescriptor.TMDCreateData_T newTMDCreateData, org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder newTransmissionDescriptor) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteTransmissionDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] transmissionDescriptorName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyTransmissionDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tmdName, org.omg.hw.transmissionDescriptor.TMDModifyData_T tmdModifyData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.transmissionDescriptor.TransmissionDescriptor_THolder modifiedTransmissionDescriptor, org.omg.hw.globaldefs.NamingAttributesList_THolder failedMEList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPsMFDsList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void validateTMDAssignmentToObject(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.CORBA.StringHolder objectAssignmentState, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams, org.omg.hw.globaldefs.NVSList_THolder additionalTPInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setTMDAssociation(org.omg.hw.globaldefs.NameAndStringValue_T[] tmdName, org.omg.hw.transmissionDescriptor.TPorMFDorFDFr_THolder tPorMFDorFDFr) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
