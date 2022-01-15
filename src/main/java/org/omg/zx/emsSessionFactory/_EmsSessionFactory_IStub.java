package org.omg.zx.emsSessionFactory;


/**
 *	Generated from IDL interface "EmsSessionFactory_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _EmsSessionFactory_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.zx.emsSessionFactory.EmsSessionFactory_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/emsSessionFactory/EmsSessionFactory_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.zx.emsSessionFactory.EmsSessionFactory_IOperations.class;
	public void getEmsSession(java.lang.String user, java.lang.String password, org.omg.zx.nmsSession.NmsSession_I client, org.omg.zx.emsSession.EmsSession_IHolder emsSessionInterface) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEmsSession", true);
				_os.write_string(user);
				_os.write_string(password);
				org.omg.zx.nmsSession.NmsSession_IHelper.write(_os,client);
				_is = _invoke(_os);
				emsSessionInterface.value = org.omg.zx.emsSession.EmsSession_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.zx.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEmsSession", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EmsSessionFactory_IOperations _localServant = (EmsSessionFactory_IOperations)_so.servant;
			try
			{
			_localServant.getEmsSession(user,password,client,emsSessionInterface);
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
