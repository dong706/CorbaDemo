package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPTNAData_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNPTNAData_T(){}
	public java.lang.String sNPPId = "";
	public short layerRate;
	public java.lang.String rAId = "";
	public org.omg.zx.mLSNPP.SNPTNAPair_T[] sNPTNAPairList;
	public SNPTNAData_T(java.lang.String sNPPId, short layerRate, java.lang.String rAId, org.omg.zx.mLSNPP.SNPTNAPair_T[] sNPTNAPairList)
	{
		this.sNPPId = sNPPId;
		this.layerRate = layerRate;
		this.rAId = rAId;
		this.sNPTNAPairList = sNPTNAPairList;
	}
}
