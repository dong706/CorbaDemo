package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL interface "FilterFactory"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class FilterFactoryPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosNotifyFilter.FilterFactoryOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "create_mapping_filter", new java.lang.Integer(0));
		m_opsHash.put ( "create_filter", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyFilter/FilterFactory:1.0"};
	public org.omg.hw.CosNotifyFilter.FilterFactory _this()
	{
		return org.omg.hw.CosNotifyFilter.FilterFactoryHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyFilter.FilterFactory _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyFilter.FilterFactoryHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // create_mapping_filter
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				org.omg.CORBA.Any _arg1=_input.read_any();
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.MappingFilterHelper.write(_out,create_mapping_filter(_arg0,_arg1));
			}
			catch(org.omg.hw.CosNotifyFilter.InvalidGrammar _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.InvalidGrammarHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // create_filter
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.FilterHelper.write(_out,create_filter(_arg0));
			}
			catch(org.omg.hw.CosNotifyFilter.InvalidGrammar _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.InvalidGrammarHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
