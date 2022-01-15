package org.omg.hw.trafficDescriptor;

/**
 *	Generated from IDL definition of struct "TDCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TDCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TDCreateData_T(){}
	public java.lang.String userLabel = "";
	public boolean forceUniqueness;
	public java.lang.String owner = "";
	public org.omg.hw.trafficDescriptor.ServiceCategory_T serviceCategory;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] trafficParameters;
	public java.lang.String conformanceDefinition = "";
	public boolean activeState;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TDCreateData_T(java.lang.String userLabel, boolean forceUniqueness, java.lang.String owner, org.omg.hw.trafficDescriptor.ServiceCategory_T serviceCategory, org.omg.hw.globaldefs.NameAndStringValue_T[] trafficParameters, java.lang.String conformanceDefinition, boolean activeState, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.userLabel = userLabel;
		this.forceUniqueness = forceUniqueness;
		this.owner = owner;
		this.serviceCategory = serviceCategory;
		this.trafficParameters = trafficParameters;
		this.conformanceDefinition = conformanceDefinition;
		this.activeState = activeState;
		this.additionalInfo = additionalInfo;
	}
}
