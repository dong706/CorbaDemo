package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PerformanceCreateResource_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceCreateResource_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PerformanceCreateResource_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] resourceRef;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] resourceSLA;
	public PerformanceCreateResource_T(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceRef, org.omg.hw.globaldefs.NameAndStringValue_T[] resourceSLA)
	{
		this.resourceRef = resourceRef;
		this.resourceSLA = resourceSLA;
	}
}
