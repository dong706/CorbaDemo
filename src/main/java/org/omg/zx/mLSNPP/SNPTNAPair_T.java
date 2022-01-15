package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of struct "SNPTNAPair_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPTNAPair_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNPTNAPair_T(){}
	public java.lang.String SNPId = "";
	public java.lang.String tNAName;
	public SNPTNAPair_T(java.lang.String SNPId, java.lang.String tNAName)
	{
		this.SNPId = SNPId;
		this.tNAName = tNAName;
	}
}
