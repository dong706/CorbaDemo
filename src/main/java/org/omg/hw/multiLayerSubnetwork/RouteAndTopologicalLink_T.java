package org.omg.hw.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "RouteAndTopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class RouteAndTopologicalLink_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public RouteAndTopologicalLink_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] sncName;
	public org.omg.hw.subnetworkConnection.CrossConnect_T[] route;
	public org.omg.hw.topologicalLink.TopologicalLink_T[] topologicalLinkList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public RouteAndTopologicalLink_T(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.CrossConnect_T[] route, org.omg.hw.topologicalLink.TopologicalLink_T[] topologicalLinkList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.sncName = sncName;
		this.route = route;
		this.topologicalLinkList = topologicalLinkList;
		this.additionalInfo = additionalInfo;
	}
}
