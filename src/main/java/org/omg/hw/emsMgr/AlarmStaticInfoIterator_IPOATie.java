package org.omg.hw.emsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "AlarmStaticInfoIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class AlarmStaticInfoIterator_IPOATie
	extends AlarmStaticInfoIterator_IPOA
{
	private AlarmStaticInfoIterator_IOperations _delegate;

	private POA _poa;
	public AlarmStaticInfoIterator_IPOATie(AlarmStaticInfoIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public AlarmStaticInfoIterator_IPOATie(AlarmStaticInfoIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.emsMgr.AlarmStaticInfoIterator_I _this()
	{
		return org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHelper.narrow(_this_object());
	}
	public org.omg.hw.emsMgr.AlarmStaticInfoIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHelper.narrow(_this_object(orb));
	}
	public AlarmStaticInfoIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AlarmStaticInfoIterator_IOperations delegate)
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
	public int getLength() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public boolean next_n(int how_many, org.omg.hw.emsMgr.AlarmStaticInfoList_THolder alarmStaticInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,alarmStaticInfoList);
	}

	public void destroy() throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
