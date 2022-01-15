package org.omg.zx.performance;


/**
 *	Generated from IDL definition of struct "PMParameterWithThresholds_T"
 *	@author JacORB IDL compiler 
 */

public final class PMParameterWithThresholds_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(org.omg.zx.performance.PMParameterWithThresholds_THelper.id(),"PMParameterWithThresholds_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("pmParameterName", org.omg.zx.performance.PMParameterName_THelper.type(), null),new org.omg.CORBA.StructMember("pmThresholdList", org.omg.zx.performance.PMThresholdList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final org.omg.zx.performance.PMParameterWithThresholds_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.zx.performance.PMParameterWithThresholds_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMParameterWithThresholds_T:1.0";
	}
	public static org.omg.zx.performance.PMParameterWithThresholds_T read (final org.omg.CORBA.portable.InputStream in)
	{
		org.omg.zx.performance.PMParameterWithThresholds_T result = new org.omg.zx.performance.PMParameterWithThresholds_T();
		result.pmParameterName=in.read_string();
		result.pmThresholdList = org.omg.zx.performance.PMThresholdList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final org.omg.zx.performance.PMParameterWithThresholds_T s)
	{
		out.write_string(s.pmParameterName);
		org.omg.zx.performance.PMThresholdList_THelper.write(out,s.pmThresholdList);
	}
}
