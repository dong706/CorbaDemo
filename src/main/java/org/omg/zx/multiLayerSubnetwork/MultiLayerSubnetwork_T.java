package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "MultiLayerSubnetwork_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSubnetwork_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MultiLayerSubnetwork_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.zx.multiLayerSubnetwork.Topology_T subnetworkType;
	public short[] supportedRates;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MultiLayerSubnetwork_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.zx.multiLayerSubnetwork.Topology_T subnetworkType, short[] supportedRates, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.subnetworkType = subnetworkType;
		this.supportedRates = supportedRates;
		this.additionalInfo = additionalInfo;
	}
}
