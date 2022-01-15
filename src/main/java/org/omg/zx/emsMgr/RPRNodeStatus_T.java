package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "RPRNodeStatus_T"
 *	@author JacORB IDL compiler 
 */

public final class RPRNodeStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RPRNodeStatus_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public org.omg.zx.globaldefs.NameAndStringValue_T[] nodeStatus;
	public RPRNodeStatus_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, org.omg.zx.globaldefs.NameAndStringValue_T[] nodeStatus)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nodeStatus = nodeStatus;
	}
}
