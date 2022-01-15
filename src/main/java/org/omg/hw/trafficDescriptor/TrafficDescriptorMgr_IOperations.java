package org.omg.hw.trafficDescriptor;

/**
 *	Generated from IDL interface "TrafficDescriptorMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TrafficDescriptorMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTrafficDescriptors(int how_many, org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getAllTrafficDescriptors(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.trafficDescriptor.TrafficDescriptorList_THolder trafficDescList, org.omg.hw.trafficDescriptor.TrafficDescriptorIterator_IHolder trafficDescIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAllTrafficDescriptorNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getAllTrafficDescriptorNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tdName, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder td) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void activateTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tdName, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder td) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deactivateTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] tdName, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder td) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getAssociatedCTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficDescriptorName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createTrafficDescriptor(org.omg.hw.trafficDescriptor.TDCreateData_T newTDCreateData, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_createTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.trafficDescriptor.TDCreateData_T newTDCreateData, org.omg.hw.trafficDescriptor.TrafficDescriptor_THolder newTrafficDescriptor) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteTrafficDescriptor(org.omg.hw.globaldefs.NameAndStringValue_T[] descriptorName) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
