package org.omg.hw.managedElementManager.ManagedElementMgr_IPackage;

/**
 *	Generated from IDL definition of alias "CommonObjSturctList_T"
 *	@author JacORB IDL compiler 
 */

public final class CommonObjSturctList_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T[] s)
	{
		any.type (type ());
		write (any.create_output_stream (), s);
	}

	public static org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T[] extract (final org.omg.CORBA.Any any)
	{
		return read (any.create_input_stream ());
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturctList_THelper.id(), "CommonObjSturctList_T",org.omg.CORBA.ORB.init().create_sequence_tc(0, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.type()));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I/CommonObjSturctList_T:1.0";
	}
	public static org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T[] read (final org.omg.CORBA.portable.InputStream _in)
	{
		org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T[] _result;
		int _l_result167 = _in.read_long();
		_result = new org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T[_l_result167];
		for (int i=0;i<_result.length;i++)
		{
			_result[i]=org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.read(_in);
		}

		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_T[] _s)
	{
		
		_out.write_long(_s.length);
		for (int i=0; i<_s.length;i++)
		{
			org.omg.hw.managedElementManager.ManagedElementMgr_IPackage.CommonObjSturct_THelper.write(_out,_s[i]);
		}

	}
}
