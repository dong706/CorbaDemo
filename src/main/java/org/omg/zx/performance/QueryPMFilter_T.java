package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "QueryPMFilter_T"
 *	@author JacORB IDL compiler 
 */

public final class QueryPMFilter_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public QueryPMFilter_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[][] pmSourceSelect;
	public java.lang.String[] pmParameterSelect;
	public java.lang.String pmGranularitySelect;
	public short[] layerRateList;
	public java.lang.String[] pMLocationList;
	public java.lang.String raiseTime;
	public java.lang.String clearTime;
	public QueryPMFilter_T(org.omg.zx.globaldefs.NameAndStringValue_T[][] pmSourceSelect, java.lang.String[] pmParameterSelect, java.lang.String pmGranularitySelect, short[] layerRateList, java.lang.String[] pMLocationList, java.lang.String raiseTime, java.lang.String clearTime)
	{
		this.pmSourceSelect = pmSourceSelect;
		this.pmParameterSelect = pmParameterSelect;
		this.pmGranularitySelect = pmGranularitySelect;
		this.layerRateList = layerRateList;
		this.pMLocationList = pMLocationList;
		this.raiseTime = raiseTime;
		this.clearTime = clearTime;
	}
}
