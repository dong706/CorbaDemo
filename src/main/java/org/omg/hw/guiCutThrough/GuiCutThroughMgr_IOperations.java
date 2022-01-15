package org.omg.hw.guiCutThrough;

/**
 *	Generated from IDL interface "GuiCutThroughMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface GuiCutThroughMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getGCTProfileInfo(org.omg.hw.guiCutThrough.GCTProfileInfo_THolder gctProfileInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void launchGCT(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String gctContext, org.omg.hw.globaldefs.NameAndStringValue_T[] userInfo, java.lang.String displayAddress, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInputInfo, org.omg.CORBA.BooleanHolder closingEnabled, org.omg.hw.globaldefs.NVSList_THolder additionalOutputInfo) throws org.omg.hw.globaldefs.ProcessingFailureException;
	void destroyGCT(java.lang.String displayAddress) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
