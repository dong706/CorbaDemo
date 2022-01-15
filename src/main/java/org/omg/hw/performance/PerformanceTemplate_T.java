package org.omg.hw.performance;

/**
 *	Generated from IDL definition of struct "PerformanceTemplate_T"
 *	@author JacORB IDL compiler 
 */

public final class PerformanceTemplate_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PerformanceTemplate_T(){}
	public int id;
	public java.lang.String name = "";
	public org.omg.hw.performance.InstanceEnum_T type;
	public int period;
	public PerformanceTemplate_T(int id, java.lang.String name, org.omg.hw.performance.InstanceEnum_T type, int period)
	{
		this.id = id;
		this.name = name;
		this.type = type;
		this.period = period;
	}
}
