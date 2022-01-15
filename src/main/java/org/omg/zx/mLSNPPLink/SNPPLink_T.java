package org.omg.zx.mLSNPPLink;

/**
 *	Generated from IDL definition of struct "SNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class SNPPLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNPPLink_T(){}
	public java.lang.String SNPPLinkId = "";
	public org.omg.zx.mLSNPP.SNPP_T aEnd;
	public org.omg.zx.mLSNPP.SNPP_T zEnd;
	public SNPPLink_T(java.lang.String SNPPLinkId, org.omg.zx.mLSNPP.SNPP_T aEnd, org.omg.zx.mLSNPP.SNPP_T zEnd)
	{
		this.SNPPLinkId = SNPPLinkId;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
	}
}
