package org.omg.hw.flowDomain;


/**
 *	Generated from IDL definition of struct "EthernetOAMOperation_T"
 *	@author JacORB IDL compiler 
 */

public final class EthernetOAMOperation_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.hw.flowDomain.EthernetOAMOperation_THelper.id(),"EthernetOAMOperation_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("command", org.omg.hw.flowDomain.EthernetOAMCommandType_THelper.type(), null),new org.omg.CORBA.StructMember("srcPoint", org.omg.hw.flowDomain.EthernetOAMParamer_THelper.type(), null),new org.omg.CORBA.StructMember("snkPoint", org.omg.hw.flowDomain.EthernetOAMParamer_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", org.omg.hw.globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.flowDomain.EthernetOAMOperation_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.flowDomain.EthernetOAMOperation_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/flowDomain/EthernetOAMOperation_T:1.0";
	}
	public static org.omg.hw.flowDomain.EthernetOAMOperation_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.hw.flowDomain.EthernetOAMOperation_T result = new org.omg.hw.flowDomain.EthernetOAMOperation_T();
		result.command=org.omg.hw.flowDomain.EthernetOAMCommandType_THelper.read(in);
		result.srcPoint=org.omg.hw.flowDomain.EthernetOAMParamer_THelper.read(in);
		result.snkPoint=org.omg.hw.flowDomain.EthernetOAMParamer_THelper.read(in);
		result.additionalInfo = org.omg.hw.globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.hw.flowDomain.EthernetOAMOperation_T s)
	{
		org.omg.hw.flowDomain.EthernetOAMCommandType_THelper.write(out,s.command);
		org.omg.hw.flowDomain.EthernetOAMParamer_THelper.write(out,s.srcPoint);
		org.omg.hw.flowDomain.EthernetOAMParamer_THelper.write(out,s.snkPoint);
		org.omg.hw.globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
