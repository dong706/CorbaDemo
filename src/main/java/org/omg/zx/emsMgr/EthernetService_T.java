package org.omg.zx.emsMgr;

/**
 *	Generated from IDL definition of struct "EthernetService_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetService_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EthernetService_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public org.omg.zx.emsMgr.EthernetServiceType_T serviceType;
	public org.omg.zx.terminationPoint.TerminationPoint_T[] sourceTPList;
	public org.omg.zx.terminationPoint.TerminationPoint_T[] sinkTPList;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] sourceVBNameList;
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] sinkVBNameList;
	public org.omg.zx.globaldefs.ConnectionDirection_T direction;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EthernetService_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, org.omg.zx.emsMgr.EthernetServiceType_T serviceType, org.omg.zx.terminationPoint.TerminationPoint_T[] sourceTPList, org.omg.zx.terminationPoint.TerminationPoint_T[] sinkTPList, org.omg.zx.globaldefs.NameAndStringValue_T[][] sourceVBNameList, org.omg.zx.globaldefs.NameAndStringValue_T[][] sinkVBNameList, org.omg.zx.globaldefs.ConnectionDirection_T direction, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.serviceType = serviceType;
		this.sourceTPList = sourceTPList;
		this.sinkTPList = sinkTPList;
		this.sourceVBNameList = sourceVBNameList;
		this.sinkVBNameList = sinkVBNameList;
		this.direction = direction;
		this.additionalInfo = additionalInfo;
	}
}
