package org.omg.hw.flowDomain;

/**
 *	Generated from IDL definition of struct "EthernetOAMOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMOperation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public EthernetOAMOperation_T(){}
	public org.omg.hw.flowDomain.EthernetOAMCommandType_T command;
	public org.omg.hw.flowDomain.EthernetOAMParamer_T srcPoint;
	public org.omg.hw.flowDomain.EthernetOAMParamer_T snkPoint;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public EthernetOAMOperation_T(org.omg.hw.flowDomain.EthernetOAMCommandType_T command, org.omg.hw.flowDomain.EthernetOAMParamer_T srcPoint, org.omg.hw.flowDomain.EthernetOAMParamer_T snkPoint, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.command = command;
		this.srcPoint = srcPoint;
		this.snkPoint = snkPoint;
		this.additionalInfo = additionalInfo;
	}
}
