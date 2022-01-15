package org.omg.hw.encapsulationLayerLink;

/**
 *	Generated from IDL definition of struct "ELLinkCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public ELLinkCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public java.lang.String networkAccessDomain = "";
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public short rate;
	public org.omg.hw.encapsulationLayerLink.LinkType_T type;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] endTPs;
	public boolean segment;
	public org.omg.hw.encapsulationLayerLink.BandwidthProvisioningMode_T provisioningMode;
	public org.omg.hw.subnetworkConnection.SNCCreateData_T[] sncList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] callName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo;
	public ELLinkCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, java.lang.String networkAccessDomain, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, short rate, org.omg.hw.encapsulationLayerLink.LinkType_T type, org.omg.hw.globaldefs.NameAndStringValue_T[][] endTPs, boolean segment, org.omg.hw.encapsulationLayerLink.BandwidthProvisioningMode_T provisioningMode, org.omg.hw.subnetworkConnection.SNCCreateData_T[] sncList, org.omg.hw.globaldefs.NameAndStringValue_T[] callName, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalCreationInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.networkAccessDomain = networkAccessDomain;
		this.transmissionParams = transmissionParams;
		this.rate = rate;
		this.type = type;
		this.endTPs = endTPs;
		this.segment = segment;
		this.provisioningMode = provisioningMode;
		this.sncList = sncList;
		this.callName = callName;
		this.additionalCreationInfo = additionalCreationInfo;
	}
}
