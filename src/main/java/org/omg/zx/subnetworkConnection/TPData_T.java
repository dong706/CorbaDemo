package org.omg.zx.subnetworkConnection;

/**
 *	Generated from IDL definition of struct "TPData_T"
 *	@author JacORB IDL compiler 
 */

public final class TPData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TPData_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] tpName;
	public org.omg.zx.terminationPoint.TerminationMode_T tpMappingMode;
	public org.omg.zx.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName;
	public org.omg.zx.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName;
	public TPData_T(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, org.omg.zx.terminationPoint.TerminationMode_T tpMappingMode, org.omg.zx.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.zx.globaldefs.NameAndStringValue_T[] ingressTrafficDescriptorName, org.omg.zx.globaldefs.NameAndStringValue_T[] egressTrafficDescriptorName)
	{
		this.tpName = tpName;
		this.tpMappingMode = tpMappingMode;
		this.transmissionParams = transmissionParams;
		this.ingressTrafficDescriptorName = ingressTrafficDescriptorName;
		this.egressTrafficDescriptorName = egressTrafficDescriptorName;
	}
}
