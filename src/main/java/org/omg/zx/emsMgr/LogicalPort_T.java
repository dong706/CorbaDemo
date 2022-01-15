package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "LogicalPort_T"
 *	@author JacORB IDL compiler 
 */

public final class LogicalPort_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public LogicalPort_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public org.omg.zx.terminationPoint.TerminationPoint_T[] containedTPs;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] parameters;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public LogicalPort_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, org.omg.zx.terminationPoint.TerminationPoint_T[] containedTPs, org.omg.zx.globaldefs.NameAndStringValue_T[] parameters, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.containedTPs = containedTPs;
		this.parameters = parameters;
		this.additionalInfo = additionalInfo;
	}
}
