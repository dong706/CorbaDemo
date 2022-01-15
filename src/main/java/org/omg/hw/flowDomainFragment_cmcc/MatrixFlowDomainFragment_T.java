package org.omg.hw.flowDomainFragment_cmcc;

/**
 *	Generated from IDL definition of struct "MatrixFlowDomainFragment_T"
 *	@author JacORB IDL compiler 
 */

public final class MatrixFlowDomainFragment_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MatrixFlowDomainFragment_T(){}
	public org.omg.hw.globaldefs.ConnectionDirection_T direction;
	public org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] aEnd;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] zEnd;
	public boolean flexible;
	public boolean active;
	public java.lang.String mfdfrType;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public MatrixFlowDomainFragment_T(org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[][] aEnd, org.omg.hw.globaldefs.NameAndStringValue_T[][] zEnd, boolean flexible, boolean active, java.lang.String mfdfrType, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.direction = direction;
		this.transmissionParams = transmissionParams;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.flexible = flexible;
		this.active = active;
		this.mfdfrType = mfdfrType;
		this.additionalInfo = additionalInfo;
	}
}
