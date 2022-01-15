package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "InvalidValue"
 *	@author JacORB IDL compiler 
 */

public final class InvalidValue
	extends org.omg.CORBA.UserException
{
	public InvalidValue()
	{
		super(org.omg.hw.CosNotifyFilter.InvalidValueHelper.id());
	}

	public org.omg.hw.CosNotifyFilter.ConstraintExp constr;
	public org.omg.CORBA.Any value;
	public InvalidValue(java.lang.String _reason,org.omg.hw.CosNotifyFilter.ConstraintExp constr, org.omg.CORBA.Any value)
	{
		super(org.omg.hw.CosNotifyFilter.InvalidValueHelper.id()+ " " + _reason);
		this.constr = constr;
		this.value = value;
	}
	public InvalidValue(org.omg.hw.CosNotifyFilter.ConstraintExp constr, org.omg.CORBA.Any value)
	{
		super(org.omg.hw.CosNotifyFilter.InvalidValueHelper.id());
		this.constr = constr;
		this.value = value;
	}
}
