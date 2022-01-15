package org.omg.zx.mLSNPP;

/**
 *	Generated from IDL definition of struct "MultiLayerSNPP_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MultiLayerSNPP_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.zx.terminationPoint.Directionality_T direction;
	public org.omg.zx.mLSNPP.LayeredSNPP_T[] layeredSNPPList;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultiLayerSNPP_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.zx.terminationPoint.Directionality_T direction, org.omg.zx.mLSNPP.LayeredSNPP_T[] layeredSNPPList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.layeredSNPPList = layeredSNPPList;
		this.additionalInfo = additionalInfo;
	}
}
