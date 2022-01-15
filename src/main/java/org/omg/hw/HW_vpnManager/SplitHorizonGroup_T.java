package org.omg.hw.HW_vpnManager;

/**
 *	Generated from IDL definition of struct "SplitHorizonGroup_T"
 *	@author JacORB IDL compiler 
 */

public final class SplitHorizonGroup_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SplitHorizonGroup_T(){}
	public int shgID;
	public org.omg.hw.globaldefs.NameAndStringValue_T[][] shgMemberNameList;
	public org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo;
	public SplitHorizonGroup_T(int shgID, org.omg.hw.globaldefs.NameAndStringValue_T[][] shgMemberNameList, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.shgID = shgID;
		this.shgMemberNameList = shgMemberNameList;
		this.additionalInfo = additionalInfo;
	}
}
