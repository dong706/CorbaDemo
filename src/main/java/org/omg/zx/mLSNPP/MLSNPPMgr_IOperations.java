package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL interface "MLSNPPMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface MLSNPPMgr_IOperations
	extends org.omg.zx.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getMLSNPP(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPName, org.omg.zx.mLSNPP.MultiLayerSNPP_THolder theMLSNPP) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void setTNANameForMLSNPP(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPName, org.omg.zx.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.omg.zx.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String tNAName, java.lang.String tNAGroupName, org.omg.zx.mLSNPP.MultiLayerSNPP_THolder multiLayerSNPP) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
