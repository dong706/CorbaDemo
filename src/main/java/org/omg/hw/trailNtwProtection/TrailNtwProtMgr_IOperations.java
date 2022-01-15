package org.omg.hw.trailNtwProtection;

/**
 *	Generated from IDL interface "TrailNtwProtMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface TrailNtwProtMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAllTrailNtwProtections(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName, int how_many, org.omg.hw.trailNtwProtection.TrailNtwProtectionList_THolder tnpList, org.omg.hw.trailNtwProtection.TrailNtwProtectionIterator_IHolder tnpIt) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getTrailNtwProtection(org.omg.hw.globaldefs.NameAndStringValue_T[] tnpName, org.omg.hw.trailNtwProtection.TrailNtwProtection_THolder trailNtwProtection) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void createTrailNtwProtection(org.omg.hw.trailNtwProtection.TrailNtwProtCreateData_T tnpCreateData, org.omg.hw.trailNtwProtection.TrailNtwProtection_THolder theTNP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void modifyTrailNtwProtection(org.omg.hw.globaldefs.NameAndStringValue_T[] tnpName, org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_T tnpModifyData, org.omg.hw.trailNtwProtection.TrailNtwProtection_THolder modifiedTNP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void deleteTrailNtwProtection(org.omg.hw.globaldefs.NameAndStringValue_T[] tnpName, boolean keepPGs, org.omg.hw.globaldefs.NameAndStringValue_T[] swapTPname, org.omg.hw.globaldefs.NVSList_THolder additionalInfo, org.omg.hw.protection.ProtectionGroupList_THolder deletedPGList, org.omg.hw.trailNtwProtection.TrailNtwProtection_THolder deletedTNP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void performTrailNtwProtectionCommand(org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.globaldefs.NameAndStringValue_T[] tnpName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupAName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupZName, org.omg.hw.globaldefs.NameAndStringValue_T[][][] workerTrailList, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectionTrail) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
