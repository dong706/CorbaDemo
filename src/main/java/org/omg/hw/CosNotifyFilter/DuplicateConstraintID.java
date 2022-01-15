package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "DuplicateConstraintID"
 *	@author JacORB IDL compiler 
 */

public final class DuplicateConstraintID
	extends org.omg.CORBA.UserException
{
	public DuplicateConstraintID()
	{
		super(org.omg.hw.CosNotifyFilter.DuplicateConstraintIDHelper.id());
	}

	public int id;
	public DuplicateConstraintID(java.lang.String _reason,int id)
	{
		super(org.omg.hw.CosNotifyFilter.DuplicateConstraintIDHelper.id()+ " " + _reason);
		this.id = id;
	}
	public DuplicateConstraintID(int id)
	{
		super(org.omg.hw.CosNotifyFilter.DuplicateConstraintIDHelper.id());
		this.id = id;
	}
}
