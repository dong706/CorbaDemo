package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "TrafficConditioningProfileAssign_T"
 *	@author JacORB IDL compiler 
 */

public final class TrafficConditioningProfileAssign_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrafficConditioningProfileAssign_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] tcpRef;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName;
	public org.omg.hw.terminationPoint.Directionality_T direction;
	public short layerRate;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public TrafficConditioningProfileAssign_T(org.omg.hw.globaldefs.NameAndStringValue_T[] tcpRef, org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName, org.omg.hw.terminationPoint.Directionality_T direction, short layerRate, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.tcpRef = tcpRef;
		this.resourceName = resourceName;
		this.direction = direction;
		this.layerRate = layerRate;
		this.additionalInfo = additionalInfo;
	}
}
