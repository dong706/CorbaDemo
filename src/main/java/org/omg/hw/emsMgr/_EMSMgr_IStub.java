package org.omg.hw.emsMgr;


/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _EMSMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.emsMgr.EMSMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.emsMgr.EMSMgr_IOperations.class;
	public void getObjectRootAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getObjectRootAlarms", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.omg.hw.notifications.EventList_THelper.read(_is);
				eventIt.value = org.omg.hw.notifications.EventIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getObjectRootAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getObjectRootAlarms(objectName,startTime,endTime,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCapabilities", true);
				_is = _invoke(_os);
				capabilities.value = org.omg.hw.common.CapabilityList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCapabilities(capabilities);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setEMSHeartbeatInterval(org.omg.hw.globaldefs.NameAndStringValue_T[] ems, int interval) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setEMSHeartbeatInterval", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ems);
				_os.write_ulong(interval);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setEMSHeartbeatInterval", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setEMSHeartbeatInterval(ems,interval);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAdditionalInfo", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,objectName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.omg.hw.globaldefs.NVSList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAdditionalInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setAdditionalInfo(objectName,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllActiveAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllActiveAlarms", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,meNameList);
				org.omg.hw.emsMgr.ManagedElementTypeList_THelper.write(_os,typeList);
				org.omg.hw.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.omg.hw.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.omg.hw.notifications.EventList_THelper.read(_is);
				eventIt.value = org.omg.hw.notifications.EventIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllActiveAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllActiveAlarms(meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopLevelTopologicalLinks(int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelTopologicalLinks", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				topoList.value = org.omg.hw.topologicalLink.TopologicalLinkList_THelper.read(_is);
				topoIt.value = org.omg.hw.topologicalLink.TopologicalLinkIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelTopologicalLinks(how_many,topoList,topoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEMSAndMEActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEMSAndMEActiveAlarms", true);
				org.omg.hw.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.omg.hw.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.omg.hw.notifications.EventList_THelper.read(_is);
				eventIt.value = org.omg.hw.notifications.EventIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEMSAndMEActiveAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEMSAndMEActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopLevelSubnetworks(int how_many, org.omg.hw.multiLayerSubnetwork.SubnetworkList_THolder sList, org.omg.hw.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelSubnetworks", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sList.value = org.omg.hw.multiLayerSubnetwork.SubnetworkList_THelper.read(_is);
				sIt.value = org.omg.hw.multiLayerSubnetwork.SubnetworkIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelSubnetworks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelSubnetworks(how_many,sList,sIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void clearAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "clearAlarms", true);
				org.omg.hw.emsMgr.AlarmSerialNoList_THelper.write(_os,alarmList);
				_is = _invoke(_os);
				failedAlarmList.value = org.omg.hw.emsMgr.AlarmSerialNoList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "clearAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.clearAlarms(alarmList,failedAlarmList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllAlarmStaticInfo(int how_many, org.omg.hw.emsMgr.AlarmStaticInfoList_THolder alarmInfoList, org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHolder alarmInfoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAlarmStaticInfo", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				alarmInfoList.value = org.omg.hw.emsMgr.AlarmStaticInfoList_THelper.read(_is);
				alarmInfoIt.value = org.omg.hw.emsMgr.AlarmStaticInfoIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAlarmStaticInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllAlarmStaticInfo(how_many,alarmInfoList,alarmInfoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopLevelSubnetworkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelSubnetworkNames", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelSubnetworkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelSubnetworkNames(how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopLevelTopologicalLinkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelTopologicalLinkNames", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.omg.hw.globaldefs.NamingAttributesIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelTopologicalLinkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelTopologicalLinkNames(how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllHistoryAlarms(org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllHistoryAlarms", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,meNameList);
				org.omg.hw.emsMgr.ManagedElementTypeList_THelper.write(_os,typeList);
				org.omg.hw.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.omg.hw.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.omg.hw.notifications.EventList_THelper.read(_is);
				eventIt.value = org.omg.hw.notifications.EventIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllHistoryAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllHistoryAlarms(meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setUserLabel", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(userLabel);
				_os.write_boolean(enforceUniqueness);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setUserLabel(objectName,userLabel,enforceUniqueness);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEMSSystemActiveAlarms(org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.hw.notifications.EventList_THolder eventList, org.omg.hw.notifications.EventIterator_IHolder eventIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEMSSystemActiveAlarms", true);
				org.omg.hw.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.omg.hw.notifications.EventList_THelper.read(_is);
				eventIt.value = org.omg.hw.notifications.EventIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEMSSystemActiveAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEMSSystemActiveAlarms(excludeSeverityList,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setEMSTime(org.omg.hw.globaldefs.NameAndStringValue_T[] emsName, java.lang.String settedTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setEMSTime", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,emsName);
				_os.write_string(settedTime);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setEMSTime", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setEMSTime(emsName,settedTime);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getEMS(org.omg.hw.emsMgr.EMS_THolder emsInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEMS", true);
				_is = _invoke(_os);
				emsInfo.value = org.omg.hw.emsMgr.EMS_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEMS", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getEMS(emsInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAlarmReportingOn(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAlarmReportingOn", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,resourceName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAlarmReportingOn", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setAlarmReportingOn(resourceName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getEMSHeartbeatInterval(org.omg.hw.globaldefs.NameAndStringValue_T[] ems, org.omg.CORBA.IntHolder interval) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEMSHeartbeatInterval", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ems);
				_is = _invoke(_os);
				interval.value = _is.read_ulong();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEMSHeartbeatInterval", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getEMSHeartbeatInterval(ems,interval);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTPFaultStatus(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.emsMgr.EndTPFaultStatusList_THolder tpFaultStatusList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTPFaultStatus", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,tpNameList);
				_is = _invoke(_os);
				tpFaultStatusList.value = org.omg.hw.emsMgr.EndTPFaultStatusList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTPFaultStatus", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTPFaultStatus(tpNameList,tpFaultStatusList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTopLevelTopologicalLink(org.omg.hw.globaldefs.NameAndStringValue_T[] topoLinkName, org.omg.hw.topologicalLink.TopologicalLink_THolder topoLink) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTopLevelTopologicalLink", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,topoLinkName);
				_is = _invoke(_os);
				topoLink.value = org.omg.hw.topologicalLink.TopologicalLink_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTopLevelTopologicalLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTopLevelTopologicalLink(topoLinkName,topoLink);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getInventory(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.emsMgr.InventoryType_T[] typeList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getInventory", true);
				_os.write_string(destination);
				_os.write_string(userName);
				_os.write_string(password);
				org.omg.hw.emsMgr.InventoryTypeList_THelper.write(_os,typeList);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getInventory", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getInventory(destination,userName,password,typeList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllHistoryAlarmsByFTP(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.globaldefs.NameAndStringValue_T[][] meNameList, java.lang.String[] typeList, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllHistoryAlarmsByFTP", true);
				_os.write_string(destination);
				_os.write_string(userName);
				_os.write_string(password);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,meNameList);
				org.omg.hw.emsMgr.ManagedElementTypeList_THelper.write(_os,typeList);
				org.omg.hw.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.omg.hw.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllHistoryAlarmsByFTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllHistoryAlarmsByFTP(destination,userName,password,meNameList,typeList,excludeProbCauseList,excludeSeverityList,startTime,endTime);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setOwner", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(owner);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setOwner", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setOwner(objectName,owner);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void redefineAlarmData(java.lang.String actionType, org.omg.hw.emsMgr.RedefineAlarmData_T[] redefineAlarmDataList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder successRedefineDataList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder failedRedefineDataList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "redefineAlarmData", true);
				_os.write_string(actionType);
				org.omg.hw.emsMgr.RedefineAlarmDataList_THelper.write(_os,redefineAlarmDataList);
				_is = _invoke(_os);
				successRedefineDataList.value = org.omg.hw.emsMgr.RedefineAlarmDataList_THelper.read(_is);
				failedRedefineDataList.value = org.omg.hw.emsMgr.RedefineAlarmDataList_THelper.read(_is);
				errorReason.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "redefineAlarmData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.redefineAlarmData(actionType,redefineAlarmDataList,successRedefineDataList,failedRedefineDataList,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAlarmCount(org.omg.hw.notifications.PerceivedSeverity_T[] severityList, org.omg.CORBA.IntHolder count) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAlarmCount", true);
				org.omg.hw.notifications.PerceivedSeverityList_THelper.write(_os,severityList);
				_is = _invoke(_os);
				count.value = _is.read_ulong();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAlarmCount", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAlarmCount(severityList,count);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void acknowledgeAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "acknowledgeAlarms", true);
				org.omg.hw.emsMgr.AlarmSerialNoList_THelper.write(_os,alarmList);
				_is = _invoke(_os);
				failedAlarmList.value = org.omg.hw.emsMgr.AlarmSerialNoList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "acknowledgeAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.acknowledgeAlarms(alarmList,failedAlarmList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getHistoryAlarmDataByPull(org.omg.hw.globaldefs.NameAndStringValue_T[][] nameList, java.lang.String taskName, java.lang.String compressType, java.lang.String packingType, java.lang.String[] excludeProbCauseList, org.omg.hw.notifications.PerceivedSeverity_T[] excludeSeverityList, java.lang.String startTime, java.lang.String endTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getHistoryAlarmDataByPull", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,nameList);
				_os.write_string(taskName);
				_os.write_string(compressType);
				_os.write_string(packingType);
				org.omg.hw.notifications.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.omg.hw.notifications.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getHistoryAlarmDataByPull", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getHistoryAlarmDataByPull(nameList,taskName,compressType,packingType,excludeProbCauseList,excludeSeverityList,startTime,endTime);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getObjectClockSourceStatus(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, org.omg.hw.emsMgr.ClockSourceStatusList_THolder clockSourceStatusList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getObjectClockSourceStatus", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,managedElementName);
				_is = _invoke(_os);
				clockSourceStatusList.value = org.omg.hw.emsMgr.ClockSourceStatusList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getObjectClockSourceStatus", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getObjectClockSourceStatus(managedElementName,clockSourceStatusList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAlarmAffectedServiceNames(java.lang.String serialNumber, org.omg.hw.emsMgr.ServiceNameList_THolder serviceNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAlarmAffectedServiceNames", true);
				_os.write_string(serialNumber);
				_is = _invoke(_os);
				serviceNameList.value = org.omg.hw.emsMgr.ServiceNameList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAlarmAffectedServiceNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAlarmAffectedServiceNames(serialNumber,serviceNameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void unacknowledgeAlarms(java.lang.String[] alarmList, org.omg.hw.emsMgr.AlarmSerialNoList_THolder failedAlarmList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "unacknowledgeAlarms", true);
				org.omg.hw.emsMgr.AlarmSerialNoList_THelper.write(_os,alarmList);
				_is = _invoke(_os);
				failedAlarmList.value = org.omg.hw.emsMgr.AlarmSerialNoList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "unacknowledgeAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.unacknowledgeAlarms(alarmList,failedAlarmList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setNativeEMSName", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(nativeEMSName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setNativeEMSName(objectName,nativeEMSName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getEMSTime(org.omg.hw.globaldefs.NVSList_THolder emsName, org.omg.CORBA.StringHolder emsTime) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEMSTime", true);
				_is = _invoke(_os);
				emsName.value = org.omg.hw.globaldefs.NVSList_THelper.read(_is);
				emsTime.value = _is.read_string();
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEMSTime", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getEMSTime(emsName,emsTime);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllRedefineAlarmDatas(org.omg.hw.emsMgr.QueryRedefineAlarmData_T[] queryConditionList, org.omg.hw.emsMgr.RedefineAlarmDataList_THolder redefineAlarmDataList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllRedefineAlarmDatas", true);
				org.omg.hw.emsMgr.QueryRedefineAlarmDataList_THelper.write(_os,queryConditionList);
				_is = _invoke(_os);
				redefineAlarmDataList.value = org.omg.hw.emsMgr.RedefineAlarmDataList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllRedefineAlarmDatas", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllRedefineAlarmDatas(queryConditionList,redefineAlarmDataList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSecondlyAlarms(java.lang.String[] alarmList, org.omg.hw.notifications.EventList_THolder eventList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSecondlyAlarms", true);
				org.omg.hw.emsMgr.AlarmSerialNoList_THelper.write(_os,alarmList);
				_is = _invoke(_os);
				eventList.value = org.omg.hw.notifications.EventList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSecondlyAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSecondlyAlarms(alarmList,eventList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAlarmReportingOff(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAlarmReportingOff", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,resourceName);
				_is = _invoke(_os);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAlarmReportingOff", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.setAlarmReportingOff(resourceName);
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
