package org.omg.hw.CosNotifyChannelAdmin;


/**
 *	Generated from IDL interface "ConsumerAdmin"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _ConsumerAdminStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.CosNotifyChannelAdmin.ConsumerAdmin
{
	private String[] ids = {"IDL:omg.org/CosNotifyChannelAdmin/ConsumerAdmin:1.0","IDL:omg.org/CosEventChannelAdmin/ConsumerAdmin:1.0","IDL:omg.org/CosNotifyComm/NotifySubscribe:1.0","IDL:omg.org/CosNotifyFilter/FilterAdmin:1.0","IDL:omg.org/CosNotification/QoSAdmin:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.CosNotifyChannelAdmin.ConsumerAdminOperations.class;
	public int[] get_all_filters()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_all_filters", true);
				_is = _invoke(_os);
				int[] _result = org.omg.hw.CosNotifyFilter.FilterIDSeqHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_all_filters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			int[] _result;			try
			{
			_result = _localServant.get_all_filters();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier obtain_pull_supplier()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_pull_supplier", true);
				_is = _invoke(_os);
				org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier _result = org.omg.hw.CosEventChannelAdmin.ProxyPullSupplierHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_pull_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosEventChannelAdmin.ProxyPullSupplier _result;			try
			{
			_result = _localServant.obtain_pull_supplier();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxySupplier get_proxy_supplier(int proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.ProxyNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_proxy_supplier", true);
				_os.write_long(proxy_id);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyChannelAdmin.ProxySupplier _result = org.omg.hw.CosNotifyChannelAdmin.ProxySupplierHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/ProxyNotFound:1.0"))
				{
					throw org.omg.hw.CosNotifyChannelAdmin.ProxyNotFoundHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_proxy_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotifyChannelAdmin.ProxySupplier _result;			try
			{
			_result = _localServant.get_proxy_supplier(proxy_id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public int MyID()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_MyID",true);
				_is = _invoke(_os);
				return _is.read_long();
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_MyID", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			int _result;
		try
		{
			_result = _localServant.MyID();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.hw.CosNotification.Property[] get_qos()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_qos", true);
				_is = _invoke(_os);
				org.omg.hw.CosNotification.Property[] _result = org.omg.hw.CosNotification.PropertySeqHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotification.Property[] _result;			try
			{
			_result = _localServant.get_qos();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.MappingFilter lifetime_filter()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_lifetime_filter",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyFilter.MappingFilterHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_lifetime_filter", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.MappingFilter _result;
		try
		{
			_result = _localServant.lifetime_filter();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void subscription_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "subscription_change", true);
				org.omg.hw.CosNotification.EventTypeSeqHelper.write(_os,added);
				org.omg.hw.CosNotification.EventTypeSeqHelper.write(_os,removed);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyComm/InvalidEventType:1.0"))
				{
					throw org.omg.hw.CosNotifyComm.InvalidEventTypeHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "subscription_change", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			try
			{
			_localServant.subscription_change(added,removed);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.MappingFilter priority_filter()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_priority_filter",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyFilter.MappingFilterHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_priority_filter", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.MappingFilter _result;
		try
		{
			_result = _localServant.priority_filter();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void validate_qos(org.omg.hw.CosNotification.Property[] required_qos, org.omg.hw.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "validate_qos", true);
				org.omg.hw.CosNotification.PropertySeqHelper.write(_os,required_qos);
				_is = _invoke(_os);
				available_qos.value = org.omg.hw.CosNotification.NamedPropertyRangeSeqHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
				{
					throw org.omg.hw.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "validate_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			try
			{
			_localServant.validate_qos(required_qos,available_qos);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyFilter.Filter get_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "get_filter", true);
				_os.write_long(filter);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyFilter.Filter _result = org.omg.hw.CosNotifyFilter.FilterHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/FilterNotFound:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "get_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotifyFilter.Filter _result;			try
			{
			_result = _localServant.get_filter(filter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxySupplier obtain_notification_pull_supplier(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_notification_pull_supplier", true);
				org.omg.hw.CosNotifyChannelAdmin.ClientTypeHelper.write(_os,ctype);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyChannelAdmin.ProxySupplier _result = org.omg.hw.CosNotifyChannelAdmin.ProxySupplierHelper.read(_is);
				proxy_id.value = _is.read_long();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/AdminLimitExceeded:1.0"))
				{
					throw org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_notification_pull_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotifyChannelAdmin.ProxySupplier _result;			try
			{
			_result = _localServant.obtain_notification_pull_supplier(ctype,proxy_id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator MyOperator()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_MyOperator",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperatorHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_MyOperator", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotifyChannelAdmin.InterFilterGroupOperator _result;
		try
		{
			_result = _localServant.MyOperator();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public int add_filter(org.omg.hw.CosNotifyFilter.Filter new_filter)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "add_filter", true);
				org.omg.hw.CosNotifyFilter.FilterHelper.write(_os,new_filter);
				_is = _invoke(_os);
				int _result = _is.read_long();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "add_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			int _result;			try
			{
			_result = _localServant.add_filter(new_filter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void set_qos(org.omg.hw.CosNotification.Property[] qos) throws org.omg.hw.CosNotification.UnsupportedQoS
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "set_qos", true);
				org.omg.hw.CosNotification.PropertySeqHelper.write(_os,qos);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotification/UnsupportedQoS:1.0"))
				{
					throw org.omg.hw.CosNotification.UnsupportedQoSHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "set_qos", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			try
			{
			_localServant.set_qos(qos);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void priority_filter(org.omg.hw.CosNotifyFilter.MappingFilter a)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_set_priority_filter",true);
				org.omg.hw.CosNotifyFilter.MappingFilterHelper.write(_os,a);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_set_priority_filter", _opsClass);
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
				try
				{
					_localServant.priority_filter(a);
				}
				finally
				{
					_servant_postinvoke(_so);
				}
				return;
			}
		}

	}

	public int[] pull_suppliers()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_pull_suppliers",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyChannelAdmin.ProxyIDSeqHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_pull_suppliers", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			int[] _result;
		try
		{
			_result = _localServant.pull_suppliers();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public org.omg.hw.CosNotifyChannelAdmin.ProxySupplier obtain_notification_push_supplier(org.omg.hw.CosNotifyChannelAdmin.ClientType ctype, org.omg.CORBA.IntHolder proxy_id) throws org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceeded
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_notification_push_supplier", true);
				org.omg.hw.CosNotifyChannelAdmin.ClientTypeHelper.write(_os,ctype);
				_is = _invoke(_os);
				org.omg.hw.CosNotifyChannelAdmin.ProxySupplier _result = org.omg.hw.CosNotifyChannelAdmin.ProxySupplierHelper.read(_is);
				proxy_id.value = _is.read_long();
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyChannelAdmin/AdminLimitExceeded:1.0"))
				{
					throw org.omg.hw.CosNotifyChannelAdmin.AdminLimitExceededHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_notification_push_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotifyChannelAdmin.ProxySupplier _result;			try
			{
			_result = _localServant.obtain_notification_push_supplier(ctype,proxy_id);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void lifetime_filter(org.omg.hw.CosNotifyFilter.MappingFilter a)
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_set_lifetime_filter",true);
				org.omg.hw.CosNotifyFilter.MappingFilterHelper.write(_os,a);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_set_lifetime_filter", _opsClass);
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
				try
				{
					_localServant.lifetime_filter(a);
				}
				finally
				{
					_servant_postinvoke(_so);
				}
				return;
			}
		}

	}

	public org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier obtain_push_supplier()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "obtain_push_supplier", true);
				_is = _invoke(_os);
				org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier _result = org.omg.hw.CosEventChannelAdmin.ProxyPushSupplierHelper.read(_is);
				return _result;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "obtain_push_supplier", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosEventChannelAdmin.ProxyPushSupplier _result;			try
			{
			_result = _localServant.obtain_push_supplier();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return _result;
		}

		}

	}

	public void remove_filter(int filter) throws org.omg.hw.CosNotifyFilter.FilterNotFound
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "remove_filter", true);
				_os.write_long(filter);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosNotifyFilter/FilterNotFound:1.0"))
				{
					throw org.omg.hw.CosNotifyFilter.FilterNotFoundHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_filter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			try
			{
			_localServant.remove_filter(filter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void remove_all_filters()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "remove_all_filters", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "remove_all_filters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			try
			{
			_localServant.remove_all_filters();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public org.omg.hw.CosNotifyChannelAdmin.EventChannel MyChannel()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_MyChannel",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyChannelAdmin.EventChannelHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_MyChannel", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			org.omg.hw.CosNotifyChannelAdmin.EventChannel _result;
		try
		{
			_result = _localServant.MyChannel();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public int[] push_suppliers()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request("_get_push_suppliers",true);
				_is = _invoke(_os);
				return org.omg.hw.CosNotifyChannelAdmin.ProxyIDSeqHelper.read(_is);
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}

		else
		{
		org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "_get_push_suppliers", _opsClass);
		if( _so == null )
			throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			int[] _result;
		try
		{
			_result = _localServant.push_suppliers();
		}
		finally
		{
			_servant_postinvoke(_so);
		}
		return _result;
		}
		}

	}

	public void destroy()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "destroy", true);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "destroy", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ConsumerAdminOperations _localServant = (ConsumerAdminOperations)_so.servant;
			try
			{
			_localServant.destroy();
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

}
