package org.omg.hw.common;

/**
 *	Generated from IDL interface "Common_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface Common_IOperations
{
	/* constants */
	/* operations  */
	void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
