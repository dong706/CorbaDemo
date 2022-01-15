package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNP_T"
 *	@author JacORB IDL compiler 
 */

public final class SNP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNP_T(){}
	public java.lang.String sNPId = "";
	public org.omg.zx.globaldefs.NameAndStringValue_T[] tPName;
	public java.lang.String tNAName;
	public SNP_T(java.lang.String sNPId, org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, java.lang.String tNAName)
	{
		this.sNPId = sNPId;
		this.tPName = tPName;
		this.tNAName = tNAName;
	}
}
