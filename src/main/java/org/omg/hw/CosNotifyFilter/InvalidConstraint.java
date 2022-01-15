package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidConstraint"
 *	@author JacORB IDL compiler 
 */

public final class InvalidConstraint
	extends org.omg.CORBA.UserException
{
	public InvalidConstraint()
	{
		super(org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.id());
	}

	public org.omg.hw.CosNotifyFilter.ConstraintExp constr;
	public InvalidConstraint(java.lang.String _reason,org.omg.hw.CosNotifyFilter.ConstraintExp constr)
	{
		super(org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.id()+ " " + _reason);
		this.constr = constr;
	}
	public InvalidConstraint(org.omg.hw.CosNotifyFilter.ConstraintExp constr)
	{
		super(org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.id());
		this.constr = constr;
	}
}
