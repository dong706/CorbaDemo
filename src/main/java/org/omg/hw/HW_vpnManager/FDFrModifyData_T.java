package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "FDFrModifyData_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrModifyData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrModifyData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.hw.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.subnetworkConnection.TPData_T[] aEnd;
	public org.omg.hw.subnetworkConnection.TPData_T[] zEnd;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public FDFrModifyData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.hw.HW_vpnManager.MultipointServiceAttr_T multipointServiceAttr, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.subnetworkConnection.TPData_T[] aEnd, org.omg.hw.subnetworkConnection.TPData_T[] zEnd, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.multipointServiceAttr = multipointServiceAttr;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.additionalInfo = additionalInfo;
	}
}
