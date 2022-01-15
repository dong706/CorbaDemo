package org.omg.hw.ipMgr;

/**
 *	Generated from IDL definition of struct "StaticRouting_T"
 *	@author JacORB IDL compiler 
 */

public final class StaticRouting_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public StaticRouting_T(){}
	public java.lang.String destIP = "";
	public java.lang.String destMask = "";
	public java.lang.String nextHopIP = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] outPort;
	public java.lang.String priority = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[] bindingObject;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public StaticRouting_T(java.lang.String destIP, java.lang.String destMask, java.lang.String nextHopIP, org.omg.hw.globaldefs.NameAndStringValue_T[] outPort, java.lang.String priority, org.omg.hw.globaldefs.NameAndStringValue_T[] bindingObject, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.destIP = destIP;
		this.destMask = destMask;
		this.nextHopIP = nextHopIP;
		this.outPort = outPort;
		this.priority = priority;
		this.bindingObject = bindingObject;
		this.additionalInfo = additionalInfo;
	}
}
