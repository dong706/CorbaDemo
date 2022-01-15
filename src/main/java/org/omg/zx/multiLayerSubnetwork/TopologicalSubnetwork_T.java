package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "TopologicalSubnetwork_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalSubnetwork_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TopologicalSubnetwork_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public boolean ifTopLevel;
	public org.omg.zx.multiLayerSubnetwork.TopoMember_T[] includingMemberNameList;
	public java.lang.String coordinate = "";
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TopologicalSubnetwork_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, boolean ifTopLevel, org.omg.zx.multiLayerSubnetwork.TopoMember_T[] includingMemberNameList, java.lang.String coordinate, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.ifTopLevel = ifTopLevel;
		this.includingMemberNameList = includingMemberNameList;
		this.coordinate = coordinate;
		this.additionalInfo = additionalInfo;
	}
}
