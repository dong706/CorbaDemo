package org.omg.hw.maintenanceOps;

/**
 *	Generated from IDL definition of struct "PRBSTestResult_T"
 *	@author JacORB IDL compiler 
 */

public final class PRBSTestResult_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PRBSTestResult_T(){}
	public org.omg.hw.maintenanceOps.PRBSTestParameter_T testPara;
	public java.lang.String startTime;
	public org.omg.hw.maintenanceOps.SampleResult_T[] sampleResultList;
	public int totalBitError;
	public org.omg.hw.maintenanceOps.TestDuration_T realDuration;
	public PRBSTestResult_T(org.omg.hw.maintenanceOps.PRBSTestParameter_T testPara, java.lang.String startTime, org.omg.hw.maintenanceOps.SampleResult_T[] sampleResultList, int totalBitError, org.omg.hw.maintenanceOps.TestDuration_T realDuration)
	{
		this.testPara = testPara;
		this.startTime = startTime;
		this.sampleResultList = sampleResultList;
		this.totalBitError = totalBitError;
		this.realDuration = realDuration;
	}
}
