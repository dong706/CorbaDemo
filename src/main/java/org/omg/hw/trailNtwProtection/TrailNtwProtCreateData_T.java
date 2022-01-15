package org.omg.hw.trailNtwProtection;

/**
 *	Generated from IDL definition of struct "TrailNtwProtCreateData_T"
 *	@author JacORB IDL compiler 
 */

public final class TrailNtwProtCreateData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TrailNtwProtCreateData_T(){}
	public short rate;
	public java.lang.String trailNtwProtectionType = "";
	public org.omg.hw.globaldefs.NameAndStringValue_T[][][] workerTrailList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] protectionTrail;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupAName;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupZName;
	public org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_T modifiableAttributes;
	public TrailNtwProtCreateData_T(short rate, java.lang.String trailNtwProtectionType, org.omg.hw.globaldefs.NameAndStringValue_T[][][] workerTrailList, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectionTrail, org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupAName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupZName, org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_T modifiableAttributes)
	{
		this.rate = rate;
		this.trailNtwProtectionType = trailNtwProtectionType;
		this.workerTrailList = workerTrailList;
		this.protectionTrail = protectionTrail;
		this.protectionGroupAName = protectionGroupAName;
		this.protectionGroupZName = protectionGroupZName;
		this.modifiableAttributes = modifiableAttributes;
	}
}
