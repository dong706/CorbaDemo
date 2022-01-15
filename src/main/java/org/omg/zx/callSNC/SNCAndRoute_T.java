package org.omg.zx.callSNC;

/**
 *	Generated from IDL definition of struct "SNCAndRoute_T"
 *	@author JacORB IDL compiler 
 */

public final class SNCAndRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCAndRoute_T(){}
	public org.omg.zx.subnetworkConnection.SubnetworkConnection_T connection;
	public org.omg.zx.subnetworkConnection.RouteDescriptor_T[] connectionRoutes;
	public org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T[] edgeMLSNPPLinks;
	public org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T[] internalMLSNPPLinks;
	public java.lang.String routeType;
	public SNCAndRoute_T(org.omg.zx.subnetworkConnection.SubnetworkConnection_T connection, org.omg.zx.subnetworkConnection.RouteDescriptor_T[] connectionRoutes, org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T[] edgeMLSNPPLinks, org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T[] internalMLSNPPLinks, java.lang.String routeType)
	{
		this.connection = connection;
		this.connectionRoutes = connectionRoutes;
		this.edgeMLSNPPLinks = edgeMLSNPPLinks;
		this.internalMLSNPPLinks = internalMLSNPPLinks;
		this.routeType = routeType;
	}
}
