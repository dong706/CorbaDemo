package org.omg.zx.managedElement;

/**
 *	Generated from IDL definition of struct "TCInfo_T"
 *	@author JacORB IDL compiler 
 */

public final class TCInfo_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCInfo_T(){}
	public int tclNumber;
	public org.omg.zx.managedElement.TCCapability_T tcCapability;
	public TCInfo_T(int tclNumber, org.omg.zx.managedElement.TCCapability_T tcCapability)
	{
		this.tclNumber = tclNumber;
		this.tcCapability = tcCapability;
	}
}
