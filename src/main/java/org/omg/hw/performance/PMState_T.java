package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PMState_T"
 *	@author JacORB IDL compiler 
 */

public final class PMState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMState_T(){}
	public org.omg.hw.globaldefs.NameAndStringValue_T[] tpName;
	public short layerRate;
	public java.lang.String granularity;
	public org.omg.hw.performance.PMEventState_T[] pmEventStateList;
	public PMState_T(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.omg.hw.performance.PMEventState_T[] pmEventStateList)
	{
		this.tpName = tpName;
		this.layerRate = layerRate;
		this.granularity = granularity;
		this.pmEventStateList = pmEventStateList;
	}
}
