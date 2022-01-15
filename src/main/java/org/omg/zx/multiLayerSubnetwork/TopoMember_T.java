package org.omg.zx.multiLayerSubnetwork;

/**
 *	Generated from IDL definition of struct "TopoMember_T"
 *	@author JacORB IDL compiler 
 */

public final class TopoMember_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TopoMember_T(){}
	public org.omg.zx.globaldefs.NameAndStringValue_T[] name;
	public java.lang.String rCoordiante = "";
	public TopoMember_T(org.omg.zx.globaldefs.NameAndStringValue_T[] name, java.lang.String rCoordiante)
	{
		this.name = name;
		this.rCoordiante = rCoordiante;
	}
}
