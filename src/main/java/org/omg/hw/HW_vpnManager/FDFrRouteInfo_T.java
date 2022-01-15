package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "FDFrRouteInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class FDFrRouteInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public FDFrRouteInfo_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName;
	public org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_T[] route;
	public FDFrRouteInfo_T(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_T[] route)
	{
		this.fdfrName = fdfrName;
		this.route = route;
	}
}
