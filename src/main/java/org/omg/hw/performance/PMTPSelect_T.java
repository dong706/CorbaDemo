package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PMTPSelect_T"
 *	@author JacORB IDL compiler 
 */

public final class PMTPSelect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMTPSelect_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] name;
	public short[] layerRateList;
	public java.lang.String[] pMLocationList;
	public java.lang.String[] granularityList;
	public PMTPSelect_T(org.omg.hw.globaldefs.NameAndStringValue_T[] name, short[] layerRateList, java.lang.String[] pMLocationList, java.lang.String[] granularityList)
	{
		this.name = name;
		this.layerRateList = layerRateList;
		this.pMLocationList = pMLocationList;
		this.granularityList = granularityList;
	}
}
