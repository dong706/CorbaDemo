package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL interface "FilterAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class FilterAdminPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosNotifyFilter.FilterAdminOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "remove_all_filters", new java.lang.Integer(0));
		m_opsHash.put ( "get_filter", new java.lang.Integer(1));
		m_opsHash.put ( "add_filter", new java.lang.Integer(2));
		m_opsHash.put ( "get_all_filters", new java.lang.Integer(3));
		m_opsHash.put ( "remove_filter", new java.lang.Integer(4));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0"};
	public org.omg.hw.CosNotifyFilter.FilterAdmin _this()
	{
		return org.omg.hw.CosNotifyFilter.FilterAdminHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyFilter.FilterAdmin _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyFilter.FilterAdminHelper.narrow(_this_object(orb));
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
			case 0: // remove_all_filters
			{
				_out = handler.createReply();
				remove_all_filters();
				break;
			}
			case 1: // get_filter
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.FilterHelper.write(_out,get_filter(_arg0));
			}
			catch(org.omg.hw.CosNotifyFilter.FilterNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // add_filter
			{
				org.omg.hw.CosNotifyFilter.Filter _arg0=org.omg.hw.CosNotifyFilter.FilterHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(add_filter(_arg0));
				break;
			}
			case 3: // get_all_filters
			{
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.FilterIDSeqHelper.write(_out,get_all_filters());
				break;
			}
			case 4: // remove_filter
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				remove_filter(_arg0);
			}
			catch(org.omg.hw.CosNotifyFilter.FilterNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.write(_out, _ex0);
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
