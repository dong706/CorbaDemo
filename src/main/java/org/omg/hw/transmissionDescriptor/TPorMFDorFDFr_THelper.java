package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL definition of union "TPorMFDorFDFr_T"
 *	@author JacORB IDL compiler 
 */

public final class TPorMFDorFDFr_THelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final org.omg.hw.transmissionDescriptor.TPorMFDorFDFr_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static org.omg.hw.transmissionDescriptor.TPorMFDorFDFr_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionDescriptor/TPorMFDorFDFr_T:1.0";
	}
	public static TPorMFDorFDFr_T read (org.omg.CORBA.portable.InputStream in)
	{
		TPorMFDorFDFr_T result = new TPorMFDorFDFr_T ();
		org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T disc = org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aTP:
			{
				org.omg.hw.terminationPoint.TerminationPoint_T _var;
				_var=org.omg.hw.terminationPoint.TerminationPoint_THelper.read(in);
				result.tp (_var);
				break;
			}
			case org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aMFD:
			{
				org.omg.hw.flowDomain.MatrixFlowDomain_T _var;
				_var=org.omg.hw.flowDomain.MatrixFlowDomain_THelper.read(in);
				result.mfd (_var);
				break;
			}
			case org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aFDFr:
			{
				org.omg.hw.flowDomainFragment.FlowDomainFragment_T _var;
				_var=org.omg.hw.flowDomainFragment.FlowDomainFragment_THelper.read(in);
				result.fdfr (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, TPorMFDorFDFr_T s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aTP:
			{
				org.omg.hw.terminationPoint.TerminationPoint_THelper.write(out,s.tp ());
				break;
			}
			case org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aMFD:
			{
				org.omg.hw.flowDomain.MatrixFlowDomain_THelper.write(out,s.mfd ());
				break;
			}
			case org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T._aFDFr:
			{
				org.omg.hw.flowDomainFragment.FlowDomainFragment_THelper.write(out,s.fdfr ());
				break;
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[3];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.insert(label_any, org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP);
			members[2] = new org.omg.CORBA.UnionMember ("tp", label_any, org.omg.hw.terminationPoint.TerminationPoint_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.insert(label_any, org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD);
			members[1] = new org.omg.CORBA.UnionMember ("mfd", label_any, org.omg.hw.flowDomain.MatrixFlowDomain_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.insert(label_any, org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr);
			members[0] = new org.omg.CORBA.UnionMember ("fdfr", label_any, org.omg.hw.flowDomainFragment.FlowDomainFragment_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"TPorMFDorFDFr_T",org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_THelper.type(), members);
		}
		return _type;
	}
}
