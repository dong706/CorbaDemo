package org.omg.hw.encapsulationLayerLink;

/**
 *	Generated from IDL definition of alias "ELLinkList_T"
 *	@author JacORB IDL compiler 
 */

public final class ELLinkList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.encapsulationLayerLink.ELLinkList_THelper.id(), "ELLinkList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/encapsulationLayerLink/ELLinkList_T:1.0";
	}
	public static org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_T[] _result;
		int _l_result95 = _in.read_long();
		_result = new org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_T[_l_result95];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.write(_out,_s[i]);
		}

	}
}
