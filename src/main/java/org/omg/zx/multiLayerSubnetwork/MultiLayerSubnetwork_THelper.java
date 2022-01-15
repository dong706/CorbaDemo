package org.omg.zx.multiLayerSubnetwork;


/**
 *	Generated from IDL definition of struct "MultiLayerSubnetwork_T"
 *	@author JacORB IDL compiler 
 */

public final class MultiLayerSubnetwork_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.id(),"MultiLayerSubnetwork_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", org.omg.zx.globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeEMSName", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("subnetworkType", org.omg.zx.multiLayerSubnetwork.Topology_THelper.type(), null),new org.omg.CORBA.StructMember("supportedRates", org.omg.zx.transmissionParameters.LayerRateList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.zx.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetwork_T:1.0";
	}
	public static org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_T result = new org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_T();
		result.name = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.nativeEMSName=in.read_string();
		result.owner=in.read_string();
		result.subnetworkType=org.omg.zx.multiLayerSubnetwork.Topology_THelper.read(in);
		result.supportedRates = org.omg.zx.transmissionParameters.LayerRateList_THelper.read(in);
		result.additionalInfo = org.omg.zx.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_T s)
	{
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.name);
		out.write_string(s.userLabel);
		out.write_string(s.nativeEMSName);
		out.write_string(s.owner);
		org.omg.zx.multiLayerSubnetwork.Topology_THelper.write(out,s.subnetworkType);
		org.omg.zx.transmissionParameters.LayerRateList_THelper.write(out,s.supportedRates);
		org.omg.zx.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
