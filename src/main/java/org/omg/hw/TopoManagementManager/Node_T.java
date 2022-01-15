package org.omg.hw.TopoManagementManager;

/**
 *	Generated from IDL definition of struct "Node_T"
 *	@author JacORB IDL compiler 
 */

public final class Node_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public Node_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String nativeEMSName = "";
	public org.omg.hw.TopoManagementManager.NodeType_T nodeType;
	public org.omg.hw.TopoManagementManager.Position_T position;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] parent;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public Node_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String nativeEMSName, org.omg.hw.TopoManagementManager.NodeType_T nodeType, org.omg.hw.TopoManagementManager.Position_T position, org.omg.hw.globaldefs.NameAndStringValue_T[] parent, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.nativeEMSName = nativeEMSName;
		this.nodeType = nodeType;
		this.position = position;
		this.parent = parent;
		this.additionalInfo = additionalInfo;
	}
}
