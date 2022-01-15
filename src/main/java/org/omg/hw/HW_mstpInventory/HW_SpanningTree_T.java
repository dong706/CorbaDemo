package org.omg.hw.HW_mstpInventory;

/**
 *	Generated from IDL definition of struct "HW_SpanningTree_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_SpanningTree_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_SpanningTree_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] STInfo;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] STCurrentBridge;
	public org.omg.hw.HW_mstpInventory.HW_STCurrentPort_T[] STCurrentPort;
	public HW_SpanningTree_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.globaldefs.NameAndStringValue_T[] STInfo, org.omg.hw.globaldefs.NameAndStringValue_T[] STCurrentBridge, org.omg.hw.HW_mstpInventory.HW_STCurrentPort_T[] STCurrentPort)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.STInfo = STInfo;
		this.STCurrentBridge = STCurrentBridge;
		this.STCurrentPort = STCurrentPort;
	}
}
