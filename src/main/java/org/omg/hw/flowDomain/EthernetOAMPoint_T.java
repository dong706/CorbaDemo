package org.omg.hw.flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetOAMPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMPoint_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EthernetOAMPoint_T(){}
	public java.lang.String Name = "";
	public org.omg.hw.flowDomain.EthernetOAMPointType_T type;
	public org.omg.hw.flowDomain.EthernetOAMPointDirection_T direction;
	public int level;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EthernetOAMPoint_T(java.lang.String Name, org.omg.hw.flowDomain.EthernetOAMPointType_T type, org.omg.hw.flowDomain.EthernetOAMPointDirection_T direction, int level, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.Name = Name;
		this.type = type;
		this.direction = direction;
		this.level = level;
		this.additionalInfo = additionalInfo;
	}
}
