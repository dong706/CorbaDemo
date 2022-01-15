package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL definition of struct "ConstraintExp"
 *	@author JacORB IDL compiler 
 */

public final class ConstraintExp
	implements org.omg.CORBA.portable.IDLEntity
{
	public ConstraintExp(){}
	public org.omg.hw.CosNotification.EventType[] event_types;
	public java.lang.String constraint_expr = "";
	public ConstraintExp(org.omg.hw.CosNotification.EventType[] event_types, java.lang.String constraint_expr)
	{
		this.event_types = event_types;
		this.constraint_expr = constraint_expr;
	}
}
