package org.omg.hw.trafficConditioningProfile;

/**
 *	Generated from IDL definition of struct "HW_TCProfile_T"
 *	@author JacORB IDL compiler 
 */

public final class HW_TCProfile_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public HW_TCProfile_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public org.omg.hw.trafficConditioningProfile.HW_TrafficClassifier_T[] classifierList;
	public org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public HW_TCProfile_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, org.omg.hw.trafficConditioningProfile.HW_TrafficClassifier_T[] classifierList, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.classifierList = classifierList;
		this.transmissionParams = transmissionParams;
		this.additionalInfo = additionalInfo;
	}
}
