package org.omg.hw.emsSessionFactory;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "EmsSessionFactory_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class EmsSessionFactory_IPOATie
	extends EmsSessionFactory_IPOA
{
	private EmsSessionFactory_IOperations _delegate;

	private POA _poa;
	public EmsSessionFactory_IPOATie(EmsSessionFactory_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EmsSessionFactory_IPOATie(EmsSessionFactory_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.emsSessionFactory.EmsSessionFactory_I _this()
	{
		return org.omg.hw.emsSessionFactory.EmsSessionFactory_IHelper.narrow(_this_object());
	}
	public org.omg.hw.emsSessionFactory.EmsSessionFactory_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.emsSessionFactory.EmsSessionFactory_IHelper.narrow(_this_object(orb));
	}
	public EmsSessionFactory_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EmsSessionFactory_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public java.lang.String getVersion()
	{
		return _delegate.getVersion();
	}

	public void getEmsSession(java.lang.String user, java.lang.String password, org.omg.hw.nmsSession.NmsSession_I client, org.omg.hw.emsSession.EmsSession_IHolder emsSessionInterface) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getEmsSession(user,password,client,emsSessionInterface);
	}

}
