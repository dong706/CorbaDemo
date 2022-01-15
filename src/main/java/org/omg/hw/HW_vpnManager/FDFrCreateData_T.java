package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "FDFrCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public org.omg.hw.HW_vpnManager.ServerTrailType_T[] vendorExtensions;
	public java.lang.String fdfrType;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public FDFrCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, org.omg.hw.HW_vpnManager.ServerTrailType_T[] vendorExtensions, java.lang.String fdfrType, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.multipointServiceAttr = multipointServiceAttr;
		this.vendorExtensions = vendorExtensions;
		this.fdfrType = fdfrType;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
