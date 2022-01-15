package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "MappingConstraintPair"
 *	@author JacORB IDL compiler 
 */

public final class MappingConstraintPair
	implements org.omg.CORBA.portable.IDLEntity
{
	public MappingConstraintPair(){}
	public org.omg.hw.CosNotifyFilter.ConstraintExp constraint_expression;
	public org.omg.CORBA.Any result_to_set;
	public MappingConstraintPair(org.omg.hw.CosNotifyFilter.ConstraintExp constraint_expression, org.omg.CORBA.Any result_to_set)
	{
		this.constraint_expression = constraint_expression;
		this.result_to_set = result_to_set;
	}
}
