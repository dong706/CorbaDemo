package org.omg.hw.encapsulationLayerLink;

/**
 *	Generated from IDL definition of struct "EncapsulationLayerLink_T"
 *	@author JacORB IDL compiler 
 */

public final class EncapsulationLayerLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EncapsulationLayerLink_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.encapsulationLayerLink.LinkType_T type;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public short rate;
	public java.lang.String networkAccessDomain = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] endTPs;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] route;
	public boolean segment;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] routeGroups;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EncapsulationLayerLink_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.encapsulationLayerLink.LinkType_T type, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, short rate, java.lang.String networkAccessDomain, org.omg.hw.globaldefs.NameAndStringValue_T[][] endTPs, org.omg.hw.globaldefs.NameAndStringValue_T[][] route, boolean segment, org.omg.hw.globaldefs.NameAndStringValue_T[][] routeGroups, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.type = type;
		this.transmissionParams = transmissionParams;
		this.rate = rate;
		this.networkAccessDomain = networkAccessDomain;
		this.endTPs = endTPs;
		this.route = route;
		this.segment = segment;
		this.routeGroups = routeGroups;
		this.additionalInfo = additionalInfo;
	}
}
