package org.omg.zx.emsMgr;


/**
 *	Generated from IDL definition of struct "EthernetService_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetService_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.emsMgr.EthernetService_THelper.id(),"EthernetService_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("serviceType", org.omg.zx.emsMgr.EthernetServiceType_THelper.type(), null),new org.omg.CORBA.StructMember("sourceTPList", org.omg.zx.terminationPoint.TerminationPointList_THelper.type(), null),new org.omg.CORBA.StructMember("sinkTPList", org.omg.zx.terminationPoint.TerminationPointList_THelper.type(), null),new org.omg.CORBA.StructMember("sourceVBNameList", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("sinkVBNameList", org.omg.zx.globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("direction", org.omg.zx.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.emsMgr.EthernetService_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.emsMgr.EthernetService_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/EthernetService_T:1.0";
	}
	public static org.omg.zx.emsMgr.EthernetService_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.emsMgr.EthernetService_T result = new org.omg.zx.emsMgr.EthernetService_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.serviceType=org.omg.zx.emsMgr.EthernetServiceType_THelper.read(in);
		result.sourceTPList = org.omg.zx.terminationPoint.TerminationPointList_THelper.read(in);
		result.sinkTPList = org.omg.zx.terminationPoint.TerminationPointList_THelper.read(in);
		result.sourceVBNameList = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		result.sinkVBNameList = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(in);
		result.direction=org.omg.zx.globaldefs.ConnectionDirection_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.emsMgr.EthernetService_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		org.omg.zx.emsMgr.EthernetServiceType_THelper.write(out,s.serviceType);
		org.omg.zx.terminationPoint.TerminationPointList_THelper.write(out,s.sourceTPList);
		org.omg.zx.terminationPoint.TerminationPointList_THelper.write(out,s.sinkTPList);
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.sourceVBNameList);
		org.omg.zx.globaldefs.NamingAttributesList_THelper.write(out,s.sinkVBNameList);
		org.omg.zx.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
