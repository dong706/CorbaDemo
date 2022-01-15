package org.omg.zx.alarmMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "AlarmDataIterator_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class AlarmDataIterator_IPOATie
	extends AlarmDataIterator_IPOA
{
	private AlarmDataIterator_IOperations _delegate;

	private POA _poa;
	public AlarmDataIterator_IPOATie(AlarmDataIterator_IOperations delegate)
	{
		_delegate = delegate;
	}
	public AlarmDataIterator_IPOATie(AlarmDataIterator_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.alarmMgr.AlarmDataIterator_I _this()
	{
		return org.omg.zx.alarmMgr.AlarmDataIterator_IHelper.narrow(_this_object());
	}
	public org.omg.zx.alarmMgr.AlarmDataIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.alarmMgr.AlarmDataIterator_IHelper.narrow(_this_object(orb));
	}
	public AlarmDataIterator_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AlarmDataIterator_IOperations delegate)
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
	public boolean next_n(int how_many, org.omg.zx.alarmMgr.AlarmDataList_THolder alarmDataList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.next_n(how_many,alarmDataList);
	}

	public int getLength() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		return _delegate.getLength();
	}

	public void destroy() throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.destroy();
	}

}
