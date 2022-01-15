package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNPP_T(){}
	public java.lang.String sNPPId = "";
	public org.omg.zx.mLSNPP.SNP_T[] sNPList;
	public java.lang.String tNAName;
	public java.lang.String groupTNAName;
	public java.lang.String rAId = "";
	public SNPP_T(java.lang.String sNPPId, org.omg.zx.mLSNPP.SNP_T[] sNPList, java.lang.String tNAName, java.lang.String groupTNAName, java.lang.String rAId)
	{
		this.sNPPId = sNPPId;
		this.sNPList = sNPList;
		this.tNAName = tNAName;
		this.groupTNAName = groupTNAName;
		this.rAId = rAId;
	}
}
