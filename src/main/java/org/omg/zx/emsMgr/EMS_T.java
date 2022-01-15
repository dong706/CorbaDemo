package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "EMS_T"
 *	@author JacORB IDL compiler 
 */

public final class EMS_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EMS_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String location = "";
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String emsVersion = "";
	public java.lang.String emsType = "";
	public java.lang.String vendorName = "";
	public org.omg.zx.managedElement.NetAddress_T netAddress;
	public org.omg.zx.alarmMgr.PerceivedSeverity_T alarmState;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EMS_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String location, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String emsVersion, java.lang.String emsType, java.lang.String vendorName, org.omg.zx.managedElement.NetAddress_T netAddress, org.omg.zx.alarmMgr.PerceivedSeverity_T alarmState, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.location = location;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.emsVersion = emsVersion;
		this.emsType = emsType;
		this.vendorName = vendorName;
		this.netAddress = netAddress;
		this.alarmState = alarmState;
		this.additionalInfo = additionalInfo;
	}
}
