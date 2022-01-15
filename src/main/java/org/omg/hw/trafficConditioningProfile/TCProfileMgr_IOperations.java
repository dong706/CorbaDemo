package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL interface "TCProfileMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TCProfileMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTCProfiles(int how_many, org.omg.hw.trafficConditioningProfile.TCProfileList_THolder tcProfileList, org.omg.hw.trafficConditioningProfile.TCProfileIterator_IHolder tcProfileIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.TCProfile_THolder tcProfile) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTCProfileAssociatedTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createTCProfile(org.omg.hw.trafficConditioningProfile.TCProfileCreateData_T newTCProfileCreateData, org.omg.hw.trafficConditioningProfile.TCProfile_THolder newTCProfile) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.TCProfileCreateData_T tcProfileModifyData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.trafficConditioningProfile.TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getAllTCProfileNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder tcProfile) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_getAllTCProfiles(int how_many, org.omg.hw.trafficConditioningProfile.HW_TCProfileList_THolder tcProfileList, org.omg.hw.trafficConditioningProfile.HW_TCProfileIterator_IHolder tcProfileIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_createTCProfile(org.omg.hw.trafficConditioningProfile.HW_TCProfileCreateData_T newTCProfileCreateData, org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder newTCProfile) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void HW_modifyTCProfile(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.HW_TCProfileCreateData_T tcProfileModifyData, org.omg.hw.trafficConditioningProfile.HW_TCProfile_THolder modifiedTCProfile, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void assignTrafficConditioningProfile(org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssign_T[] resourceList, org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder failedResourceList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deassignTrafficConditioningProfile(org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassign_T[] resourceList, org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileDeassignList_THolder failedResourceList) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTCProfileAssociatedResouces(org.omg.hw.globaldefs.NameAndStringValue_T[] tcProfileName, org.omg.hw.trafficConditioningProfile.TrafficConditioningProfileAssignList_THolder resourceList) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
