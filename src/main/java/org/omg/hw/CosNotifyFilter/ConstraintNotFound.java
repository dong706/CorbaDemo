package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of exception "ConstraintNotFound"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintNotFound
	extends org.omg.CORBA.UserException
{
	public ConstraintNotFound()
	{
		super(org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.id());
	}

	public int id;
	public ConstraintNotFound(java.lang.String _reason,int id)
	{
		super(org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.id()+ " " + _reason);
		this.id = id;
	}
	public ConstraintNotFound(int id)
	{
		super(org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.id());
		this.id = id;
	}
}
