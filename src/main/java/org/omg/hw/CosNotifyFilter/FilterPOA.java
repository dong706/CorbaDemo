package org.omg.hw.CosNotifyFilter;

/**
 *	Generated from IDL interface "Filter"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public abstract class FilterPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, org.omg.hw.CosNotifyFilter.FilterOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "match", new java.lang.Integer(0));
		m_opsHash.put ( "get_callbacks", new java.lang.Integer(1));
		m_opsHash.put ( "detach_callback", new java.lang.Integer(2));
		m_opsHash.put ( "attach_callback", new java.lang.Integer(3));
		m_opsHash.put ( "match_typed", new java.lang.Integer(4));
		m_opsHash.put ( "get_all_constraints", new java.lang.Integer(5));
		m_opsHash.put ( "_get_constraint_grammar", new java.lang.Integer(6));
		m_opsHash.put ( "remove_all_constraints", new java.lang.Integer(7));
		m_opsHash.put ( "match_structured", new java.lang.Integer(8));
		m_opsHash.put ( "modify_constraints", new java.lang.Integer(9));
		m_opsHash.put ( "destroy", new java.lang.Integer(10));
		m_opsHash.put ( "add_constraints", new java.lang.Integer(11));
		m_opsHash.put ( "get_constraints", new java.lang.Integer(12));
	}
	private String[] ids = {"IDL:omg.org/CosNotifyFilter/Filter:1.0"};
	public org.omg.hw.CosNotifyFilter.Filter _this()
	{
		return org.omg.hw.CosNotifyFilter.FilterHelper.narrow(_this_object());
	}
	public org.omg.hw.CosNotifyFilter.Filter _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.CosNotifyFilter.FilterHelper.narrow(_this_object(orb));
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
			case 0: // match
			{
			try
			{
				org.omg.CORBA.Any _arg0=_input.read_any();
				_out = handler.createReply();
				_out.write_boolean(match(_arg0));
			}
			catch(org.omg.hw.CosNotifyFilter.UnsupportedFilterableData _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.UnsupportedFilterableDataHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // get_callbacks
			{
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.CallbackIDSeqHelper.write(_out,get_callbacks());
				break;
			}
			case 2: // detach_callback
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				detach_callback(_arg0);
			}
			catch(org.omg.hw.CosNotifyFilter.CallbackNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.CallbackNotFoundHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // attach_callback
			{
				org.omg.hw.CosNotifyComm.NotifySubscribe _arg0=org.omg.hw.CosNotifyComm.NotifySubscribeHelper.read(_input);
				_out = handler.createReply();
				_out.write_long(attach_callback(_arg0));
				break;
			}
			case 4: // match_typed
			{
			try
			{
				org.omg.hw.CosNotification.Property[] _arg0=org.omg.hw.CosNotification.PropertySeqHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(match_typed(_arg0));
			}
			catch(org.omg.hw.CosNotifyFilter.UnsupportedFilterableData _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.UnsupportedFilterableDataHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // get_all_constraints
			{
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.write(_out,get_all_constraints());
				break;
			}
			case 6: // _get_constraint_grammar
			{
			_out = handler.createReply();
			_out.write_string(constraint_grammar());
				break;
			}
			case 7: // remove_all_constraints
			{
				_out = handler.createReply();
				remove_all_constraints();
				break;
			}
			case 8: // match_structured
			{
			try
			{
				org.omg.hw.CosNotification.StructuredEvent _arg0=org.omg.hw.CosNotification.StructuredEventHelper.read(_input);
				_out = handler.createReply();
				_out.write_boolean(match_structured(_arg0));
			}
			catch(org.omg.hw.CosNotifyFilter.UnsupportedFilterableData _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.UnsupportedFilterableDataHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // modify_constraints
			{
			try
			{
				int[] _arg0=org.omg.hw.CosNotifyFilter.ConstraintIDSeqHelper.read(_input);
				org.omg.hw.CosNotifyFilter.ConstraintInfo[] _arg1=org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.read(_input);
				_out = handler.createReply();
				modify_constraints(_arg0,_arg1);
			}
			catch(org.omg.hw.CosNotifyFilter.ConstraintNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.write(_out, _ex0);
			}
			catch(org.omg.hw.CosNotifyFilter.InvalidConstraint _ex1)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.write(_out, _ex1);
			}
				break;
			}
			case 10: // destroy
			{
				_out = handler.createReply();
				destroy();
				break;
			}
			case 11: // add_constraints
			{
			try
			{
				org.omg.hw.CosNotifyFilter.ConstraintExp[] _arg0=org.omg.hw.CosNotifyFilter.ConstraintExpSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.write(_out,add_constraints(_arg0));
			}
			catch(org.omg.hw.CosNotifyFilter.InvalidConstraint _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.InvalidConstraintHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // get_constraints
			{
			try
			{
				int[] _arg0=org.omg.hw.CosNotifyFilter.ConstraintIDSeqHelper.read(_input);
				_out = handler.createReply();
				org.omg.hw.CosNotifyFilter.ConstraintInfoSeqHelper.write(_out,get_constraints(_arg0));
			}
			catch(org.omg.hw.CosNotifyFilter.ConstraintNotFound _ex0)
			{
				_out = handler.createExceptionReply();
				org.omg.hw.CosNotifyFilter.ConstraintNotFoundHelper.write(_out, _ex0);
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
