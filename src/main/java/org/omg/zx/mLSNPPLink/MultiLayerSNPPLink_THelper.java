package org.omg.zx.mLSNPPLink;


/**
 *	Generated from IDL definition of struct "MultiLayerSNPPLink_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSNPPLink_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THelper.id(),"MultiLayerSNPPLink_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("direction", org.omg.zx.globaldefs.ConnectionDirection_THelper.type(), null),new org.omg.CORBA.StructMember("aMLRAName", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("zMLRAName", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("aTNAName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("zTNAName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("aTNAGroupName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("zTNAGroupName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("sNPPLinkList", org.omg.zx.mLSNPPLink.LayeredSNPPLinkList_THelper.type(), null),new org.omg.CORBA.StructMember("interfaceType", org.omg.zx.mLSNPPLink.InterfaceType_THelper.type(), null),new org.omg.CORBA.StructMember("signallingParameters", org.omg.zx.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("signallingControllerIdentifier", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("signallingProtocol", org.omg.zx.mLSNPPLink.SignallingProtocol_THelper.type(), null),new org.omg.CORBA.StructMember("signallingEnabled", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("cost", org.omg.zx.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("discovered", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("availability", org.omg.zx.globaldefs.NVSList_THelper.type(), null),new org.omg.CORBA.StructMember("linkSRG", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/mLSNPPLink/MultiLayerSNPPLink_T:1.0";
	}
	public static org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T result = new org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.direction=org.omg.zx.globaldefs.ConnectionDirection_THelper.read(in);
		result.aMLRAName = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.zMLRAName = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.aTNAName=in.read_string();
		result.zTNAName=in.read_string();
		result.aTNAGroupName=in.read_string();
		result.zTNAGroupName=in.read_string();
		result.sNPPLinkList = org.omg.zx.mLSNPPLink.LayeredSNPPLinkList_THelper.read(in);
		result.interfaceType=in.read_string();
		result.signallingParameters = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.signallingControllerIdentifier=in.read_string();
		result.signallingProtocol=in.read_string();
		result.signallingEnabled=in.read_boolean();
		result.cost = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.discovered=in.read_boolean();
		result.availability = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.linkSRG=in.read_string();
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.zx.globaldefs.ConnectionDirection_THelper.write(out,s.direction);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.aMLRAName);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.zMLRAName);
		out.write_string(s.aTNAName);
		out.write_string(s.zTNAName);
		out.write_string(s.aTNAGroupName);
		out.write_string(s.zTNAGroupName);
		org.omg.zx.mLSNPPLink.LayeredSNPPLinkList_THelper.write(out,s.sNPPLinkList);
		out.write_string(s.interfaceType);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.signallingParameters);
		out.write_string(s.signallingControllerIdentifier);
		out.write_string(s.signallingProtocol);
		out.write_boolean(s.signallingEnabled);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.cost);
		out.write_boolean(s.discovered);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.availability);
		out.write_string(s.linkSRG);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
