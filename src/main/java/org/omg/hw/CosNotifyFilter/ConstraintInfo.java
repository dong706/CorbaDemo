package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "ConstraintInfo"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintInfo
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConstraintInfo(){}
	public org.omg.hw.CosNotifyFilter.ConstraintExp constraint_expression;
	public int constraint_id;
	public ConstraintInfo(org.omg.hw.CosNotifyFilter.ConstraintExp constraint_expression, int constraint_id)
	{
		this.constraint_expression = constraint_expression;
		this.constraint_id = constraint_id;
	}
}
