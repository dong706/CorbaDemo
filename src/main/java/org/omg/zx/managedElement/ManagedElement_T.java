package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of struct "ManagedElement_T"
 *	@author JacORB IDL compiler 
 */

public final class ManagedElement_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ManagedElement_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String location = "";
	public java.lang.String hardwareVersion = "";
	public java.lang.String softwareVersion = "";
	public java.lang.String productName = "";
	public java.lang.String meType = "";
	public org.omg.zx.managedElement.CommunicationState_T communicationState;
	public java.lang.String nativeEMSName = "";
	public short[] connectionRates;
	public java.lang.String vendorName = "";
	public java.lang.String operationalStatus = "";
	public org.omg.zx.managedElement.NetAddress_T netAddress;
	public org.omg.zx.alarmMgr.PerceivedSeverity_T alarmStatus;
	public java.lang.String descriptionInfo = "";
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public ManagedElement_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String location, java.lang.String hardwareVersion, java.lang.String softwareVersion, java.lang.String productName, java.lang.String meType, org.omg.zx.managedElement.CommunicationState_T communicationState, java.lang.String nativeEMSName, short[] connectionRates, java.lang.String vendorName, java.lang.String operationalStatus, org.omg.zx.managedElement.NetAddress_T netAddress, org.omg.zx.alarmMgr.PerceivedSeverity_T alarmStatus, java.lang.String descriptionInfo, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.location = location;
		this.hardwareVersion = hardwareVersion;
		this.softwareVersion = softwareVersion;
		this.productName = productName;
		this.meType = meType;
		this.communicationState = communicationState;
		this.nativeEMSName = nativeEMSName;
		this.connectionRates = connectionRates;
		this.vendorName = vendorName;
		this.operationalStatus = operationalStatus;
		this.netAddress = netAddress;
		this.alarmStatus = alarmStatus;
		this.descriptionInfo = descriptionInfo;
		this.additionalInfo = additionalInfo;
	}
}
