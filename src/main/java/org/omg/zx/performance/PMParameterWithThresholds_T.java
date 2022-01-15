package org.omg.zx.performance;

/**
 *	Generated from IDL definition of struct "PMParameterWithThresholds_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameterWithThresholds_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMParameterWithThresholds_T(){}
	public java.lang.String pmParameterName;
	public org.omg.zx.performance.PMThreshold_T[] pmThresholdList;
	public PMParameterWithThresholds_T(java.lang.String pmParameterName, org.omg.zx.performance.PMThreshold_T[] pmThresholdList)
	{
		this.pmParameterName = pmParameterName;
		this.pmThresholdList = pmThresholdList;
	}
}
