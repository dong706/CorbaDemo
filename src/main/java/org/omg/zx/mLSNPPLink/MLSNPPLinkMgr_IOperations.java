package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MLSNPPLinkMgr_IOperations
	extends org.omg.zx.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getAvailableCapacity(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, org.omg.zx.mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void assignSignallingController(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingControllerIdentifier) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void deassignSignallingController(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setSignallingProtocolAndParameters(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingProtocol, org.omg.zx.globaldefs.NameAndStringValue_T[] signallingParameters) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setTNANameForMLSNPPLinkEnd(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.omg.zx.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.omg.zx.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THolder multiLayerSNPPLink) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void modifySignallingProtocolParameters(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.omg.zx.globaldefs.NVSList_THolder signallingParameters) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void enableSignalling(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void disableSignalling(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
