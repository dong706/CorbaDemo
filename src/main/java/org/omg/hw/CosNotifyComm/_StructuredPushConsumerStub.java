package org.omg.hw.CosNotifyComm;


/**
 *	Generated from IDL interface "StructuredPushConsumer"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _StructuredPushConsumerStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.CosNotifyComm.StructuredPushConsumer
{
	private String[] ids = {"IDL:omg.org/CosNotifyComm/StructuredPushConsumer:1.0","IDL:omg.org/CosNotifyComm/NotifyPublish:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.CosNotifyComm.StructuredPushConsumerOperations.class;
	public void offer_change(org.omg.hw.CosNotification.EventType[] added, org.omg.hw.CosNotification.EventType[] removed) throws org.omg.hw.CosNotifyComm.InvalidEventType
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "offer_change", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "offer_change", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredPushConsumerOperations _localServant = (StructuredPushConsumerOperations)_so.servant;
			try
			{
			_localServant.offer_change(added,removed);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void push_structured_event(org.omg.hw.CosNotification.StructuredEvent notification) throws org.omg.hw.CosEventComm.Disconnected
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "push_structured_event", true);
				org.omg.hw.CosNotification.StructuredEventHelper.write(_os,notification);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:omg.org/CosEventComm/Disconnected:1.0"))
				{
					throw org.omg.hw.CosEventComm.DisconnectedHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "push_structured_event", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredPushConsumerOperations _localServant = (StructuredPushConsumerOperations)_so.servant;
			try
			{
			_localServant.push_structured_event(notification);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void disconnect_structured_push_consumer()
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disconnect_structured_push_consumer", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disconnect_structured_push_consumer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			StructuredPushConsumerOperations _localServant = (StructuredPushConsumerOperations)_so.servant;
			try
			{
			_localServant.disconnect_structured_push_consumer();
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
