package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMTPParamSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPParamSelect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMTPParamSelect_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public short[] layerRateList;
	public java.lang.String[] pMLocationList;
	public java.lang.String[] granularityList;
	public java.lang.String[] pmParameterList;
	public PMTPParamSelect_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, short[] layerRateList, java.lang.String[] pMLocationList, java.lang.String[] granularityList, java.lang.String[] pmParameterList)
	{
		this.name = name;
		this.layerRateList = layerRateList;
		this.pMLocationList = pMLocationList;
		this.granularityList = granularityList;
		this.pmParameterList = pmParameterList;
	}
}
