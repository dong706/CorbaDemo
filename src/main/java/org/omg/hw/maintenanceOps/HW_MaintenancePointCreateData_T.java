package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "HW_MaintenancePointCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_MaintenancePointCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_MaintenancePointCreateData_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] mdOrMaName;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] tpName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_MaintenancePointCreateData_T(org.omg.hw.globaldefs.NameAndStringValue_T[] mdOrMaName, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.mdOrMaName = mdOrMaName;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.transmissionParams = transmissionParams;
		this.tpName = tpName;
		this.additionalInfo = additionalInfo;
	}
}
