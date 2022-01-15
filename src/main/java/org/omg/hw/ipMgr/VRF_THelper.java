package org.omg.hw.ipMgr;


/**
 *	Generated from IDL definition of struct "VRF_T"
 *	@author JacORB IDL compiler 
 */

public final class VRF_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.ipMgr.VRF_THelper.id(),"VRF_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.hw.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vrfType", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("vrfLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("aEnd", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", org.omg.hw.subnetworkConnection.TPDataList_THelper.type(), null),new org.omg.CORBA.StructMember("rdFormat", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("rdAttr", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("importRTList", org.omg.hw.ipMgr.ImportRTList_THelper.type(), null),new org.omg.CORBA.StructMember("exportRTList", org.omg.hw.ipMgr.ExportRTList_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", org.omg.hw.transmissionParameters.LayeredParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.ipMgr.VRF_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.ipMgr.VRF_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/ipMgr/VRF_T:1.0";
	}
	public static org.omg.hw.ipMgr.VRF_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.ipMgr.VRF_T result = new org.omg.hw.ipMgr.VRF_T();
		result.name = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.vrfType=in.read_string();
		result.vrfLabel=in.read_string();
		result.aEnd = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.zEnd = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(in);
		result.rdFormat=in.read_string();
		result.rdAttr=in.read_string();
		result.importRTList = org.omg.hw.ipMgr.ImportRTList_THelper.read(in);
		result.exportRTList = org.omg.hw.ipMgr.ExportRTList_THelper.read(in);
		result.transmissionParams = org.omg.hw.transmissionParameters.LayeredParameterList_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.ipMgr.VRF_T s)
	{
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		out.write_string(s.vrfType);
		out.write_string(s.vrfLabel);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.aEnd);
		org.omg.hw.subnetworkConnection.TPDataList_THelper.write(out,s.zEnd);
		out.write_string(s.rdFormat);
		out.write_string(s.rdAttr);
		org.omg.hw.ipMgr.ImportRTList_THelper.write(out,s.importRTList);
		org.omg.hw.ipMgr.ExportRTList_THelper.write(out,s.exportRTList);
		org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(out,s.transmissionParams);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
