package org.omg.zx.terminationPoint;


/**
 *	Generated from IDL definition of struct "TerminationPoint_T"
 *	@author JacORB IDL compiler 
 */

public final class TerminationPoint_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.terminationPoint.TerminationPoint_THelper.id(),"TerminationPoint_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("type", org.omg.zx.terminationPoint.TPType_THelper.type(), null),new org.omg.CORBA.StructMember("connectionState", org.omg.zx.terminationPoint.TPConnectionState_THelper.type(), null),new org.omg.CORBA.StructMember("tpMappingMode", org.omg.zx.terminationPoint.TerminationMode_THelper.type(), null),new org.omg.CORBA.StructMember("direction", org.omg.zx.terminationPoint.Directionality_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.zx.transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("tpProtectionAssociation", org.omg.zx.terminationPoint.TPProtectionAssociation_THelper.type(), null),new org.omg.CORBA.StructMember("edgePoint", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("includeTPList", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.notifications.NVList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.terminationPoint.TerminationPoint_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.terminationPoint.TerminationPoint_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/TerminationPoint_T:1.0";
	}
	public static org.omg.zx.terminationPoint.TerminationPoint_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.terminationPoint.TerminationPoint_T result = new org.omg.zx.terminationPoint.TerminationPoint_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.owner=in.read_string();
		result.type=org.omg.zx.terminationPoint.TPType_THelper.read(in);
		result.connectionState=org.omg.zx.terminationPoint.TPConnectionState_THelper.read(in);
		result.tpMappingMode=org.omg.zx.terminationPoint.TerminationMode_THelper.read(in);
		result.direction=org.omg.zx.terminationPoint.Directionality_THelper.read(in);
		result.transmissionParams = org.omg.zx.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.tpProtectionAssociation=org.omg.zx.terminationPoint.TPProtectionAssociation_THelper.read(in);
		result.edgePoint=in.read_boolean();
		result.includeTPList = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		result.additionalInfo = org.omg.zx.notifications.NVList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.terminationPoint.TerminationPoint_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.owner);
		org.omg.zx.terminationPoint.TPType_THelper.write(out,s.type);
		org.omg.zx.terminationPoint.TPConnectionState_THelper.write(out,s.connectionState);
		org.omg.zx.terminationPoint.TerminationMode_THelper.write(out,s.tpMappingMode);
		org.omg.zx.terminationPoint.Directionality_THelper.write(out,s.direction);
		org.omg.zx.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		org.omg.zx.terminationPoint.TPProtectionAssociation_THelper.write(out,s.tpProtectionAssociation);
		out.write_boolean(s.edgePoint);
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.includeTPList);
		org.omg.zx.notifications.NVList_THelper.write(out,s.additionalInfo);
	}
}
