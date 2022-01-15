package org.omg.hw.topologicalLink;


/**
 *	Generated from IDL definition of struct "TopologicalLink_T"
 *	@author JacORB IDL compiler 
 */

public final class TopologicalLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.topologicalLink.TopologicalLink_THelper.id(),"TopologicalLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.hw.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("rate", org.omg.hw.transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("aEndTP", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("zEndTP", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.topologicalLink.TopologicalLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.topologicalLink.TopologicalLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/topologicalLink/TopologicalLink_T:1.0";
	}
	public static org.omg.hw.topologicalLink.TopologicalLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.topologicalLink.TopologicalLink_T result = new org.omg.hw.topologicalLink.TopologicalLink_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=org.omg.hw.globaldefs.ConnectionDirection_THelper.read(in);
		result.rate=in.read_short();
		result.aEndTP = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.zEndTP = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.topologicalLink.TopologicalLink_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.hw.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		out.write_short(s.rate);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.aEndTP);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.zEndTP);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
