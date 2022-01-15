package org.omg.hw.maintenanceOps;


/**
 *	Generated from IDL interface "MaintenanceMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _MaintenanceMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.maintenanceOps.MaintenanceMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/maintenanceOps/MaintenanceMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.maintenanceOps.MaintenanceMgr_IOperations.class;
	public void deleteMaintenanceAssociation(org.omg.hw.globaldefs.NameAndStringValue_T[] maName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteMaintenanceAssociation", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,maName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteMaintenanceAssociation", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteMaintenanceAssociation(maName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void performMaintenanceOperation(org.omg.hw.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, org.omg.hw.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "performMaintenanceOperation", true);
				org.omg.hw.maintenanceOps.CurrentMaintenanceOperation_THelper.write(_os,maintenanceOperation);
				org.omg.hw.maintenanceOps.MaintenanceOperationMode_THelper.write(_os,maintenanceOperationMode);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performMaintenanceOperation", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.performMaintenanceOperation(maintenanceOperation,maintenanceOperationMode);
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
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
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
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
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

	public void getAllMaintenanceDomains(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenanceDomainList_THolder mdList, org.omg.hw.maintenanceOps.HW_MaintenanceDomainIterator_IHolder mdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMaintenanceDomains", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mdList.value = org.omg.hw.maintenanceOps.HW_MaintenanceDomainList_THelper.read(_is);
				mdIt.value = org.omg.hw.maintenanceOps.HW_MaintenanceDomainIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMaintenanceDomains", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMaintenanceDomains(meName,how_many,mdList,mdIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteMaintenanceDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] mdName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteMaintenanceDomain", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mdName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteMaintenanceDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteMaintenanceDomain(mdName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getOAMParameters(org.omg.hw.globaldefs.NameAndStringValue_T[] name, org.omg.hw.transmissionParameters.LayeredParameterList_THolder ParamList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getOAMParameters", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,name);
				_is = _invoke(_os);
				ParamList.value = org.omg.hw.transmissionParameters.LayeredParameterList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getOAMParameters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.getOAMParameters(name,ParamList);
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
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
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

	public void setServiceAlarmReportingOn(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setServiceAlarmReportingOn", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,serviceName);
				org.omg.hw.maintenanceOps.AlarmEventList_THelper.write(_os,alarmEventList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setServiceAlarmReportingOn", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.setServiceAlarmReportingOn(serviceName,alarmEventList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getPRBSTestResult(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.maintenanceOps.PRBSTestResultList_THolder resultList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getPRBSTestResult", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,tpNameList);
				_is = _invoke(_os);
				resultList.value = org.omg.hw.maintenanceOps.PRBSTestResultList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getPRBSTestResult", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.getPRBSTestResult(tpNameList,resultList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMaintenanceAssociations(org.omg.hw.globaldefs.NameAndStringValue_T[] mdName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenanceAssociationList_THolder maList, org.omg.hw.maintenanceOps.HW_MaintenanceAssociationIterator_IHolder maIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMaintenanceAssociations", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mdName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				maList.value = org.omg.hw.maintenanceOps.HW_MaintenanceAssociationList_THelper.read(_is);
				maIt.value = org.omg.hw.maintenanceOps.HW_MaintenanceAssociationIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMaintenanceAssociations", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMaintenanceAssociations(mdName,how_many,maList,maIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteMaintenancePoint(org.omg.hw.globaldefs.NameAndStringValue_T[] mpName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteMaintenancePoint", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mpName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteMaintenancePoint", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteMaintenancePoint(mpName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void performMaintenanceOperationEx(org.omg.hw.maintenanceOps.CurrentMaintenanceOperation_T maintenanceOperation, org.omg.hw.maintenanceOps.MaintenanceOperationMode_T maintenanceOperationMode, org.omg.hw.globaldefs.NamingAttributesList_THolder resultOfMaintenanceData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "performMaintenanceOperationEx", true);
				org.omg.hw.maintenanceOps.CurrentMaintenanceOperation_THelper.write(_os,maintenanceOperation);
				org.omg.hw.maintenanceOps.MaintenanceOperationMode_THelper.write(_os,maintenanceOperationMode);
				_is = _invoke(_os);
				resultOfMaintenanceData.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performMaintenanceOperationEx", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.performMaintenanceOperationEx(maintenanceOperation,maintenanceOperationMode,resultOfMaintenanceData);
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
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
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

	public void disablePRBSTest(org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disablePRBSTest", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,tpNameList);
				_is = _invoke(_os);
				failedTPList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disablePRBSTest", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.disablePRBSTest(tpNameList,failedTPList);
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
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
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

	public void createATMMaintenanceEntity(org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_T maintenanceEntityAttr, org.omg.hw.globaldefs.NVSList_THolder maintenanceEntityName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createATMMaintenanceEntity", true);
				org.omg.hw.maintenanceOps.HW_ATMMaintenanceEntityAttr_THelper.write(_os,maintenanceEntityAttr);
				_is = _invoke(_os);
				maintenanceEntityName.value = org.omg.hw.globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createATMMaintenanceEntity", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.createATMMaintenanceEntity(maintenanceEntityAttr,maintenanceEntityName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMaintenancePoints(org.omg.hw.globaldefs.NameAndStringValue_T[] mdOrMaName, int how_many, org.omg.hw.maintenanceOps.HW_MaintenancePointList_THolder mpList, org.omg.hw.maintenanceOps.HW_MaintenancePointIterator_IHolder mpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMaintenancePoints", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mdOrMaName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mpList.value = org.omg.hw.maintenanceOps.HW_MaintenancePointList_THelper.read(_is);
				mpIt.value = org.omg.hw.maintenanceOps.HW_MaintenancePointIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMaintenancePoints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMaintenancePoints(mdOrMaName,how_many,mpList,mpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createMaintenanceAssociation(org.omg.hw.maintenanceOps.HW_MaintenanceAssociation_T ma, org.omg.hw.maintenanceOps.HW_MaintenanceAssociation_THolder theMA, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createMaintenanceAssociation", true);
				org.omg.hw.maintenanceOps.HW_MaintenanceAssociation_THelper.write(_os,ma);
				_is = _invoke(_os);
				theMA.value = org.omg.hw.maintenanceOps.HW_MaintenanceAssociation_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createMaintenanceAssociation", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.createMaintenanceAssociation(ma,theMA,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getActiveMaintenanceOperations(org.omg.hw.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.omg.hw.maintenanceOps.CurrentMaintenanceOperationList_THolder currentMaintenanceOpeationList, org.omg.hw.maintenanceOps.CurrentMaintenanceOperationIterator_IHolder cmoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getActiveMaintenanceOperations", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpOrMeName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				currentMaintenanceOpeationList.value = org.omg.hw.maintenanceOps.CurrentMaintenanceOperationList_THelper.read(_is);
				cmoIt.value = org.omg.hw.maintenanceOps.CurrentMaintenanceOperationIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getActiveMaintenanceOperations", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.getActiveMaintenanceOperations(tpOrMeName,how_many,currentMaintenanceOpeationList,cmoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createMaintenanceDomain(org.omg.hw.maintenanceOps.HW_MaintenanceDomain_T md, org.omg.hw.maintenanceOps.HW_MaintenanceDomain_THolder theMD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createMaintenanceDomain", true);
				org.omg.hw.maintenanceOps.HW_MaintenanceDomain_THelper.write(_os,md);
				_is = _invoke(_os);
				theMD.value = org.omg.hw.maintenanceOps.HW_MaintenanceDomain_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createMaintenanceDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.createMaintenanceDomain(md,theMD,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setOAMParameters(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String oamParamType, org.omg.hw.transmissionParameters.LayeredParameters_T[] ParamList, org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THolder oamParameters) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setOAMParameters", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,name);
				_os.write_string(oamParamType);
				org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(_os,ParamList);
				_is = _invoke(_os);
				oamParameters.value = org.omg.hw.maintenanceOps.MaintenanceMgr_IPackage.OAMParametersData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setOAMParameters", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.setOAMParameters(name,oamParamType,ParamList,oamParameters);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setServiceAlarmReportingOff(org.omg.hw.globaldefs.NameAndStringValue_T[] serviceName, java.lang.String[] alarmEventList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setServiceAlarmReportingOff", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,serviceName);
				org.omg.hw.maintenanceOps.AlarmEventList_THelper.write(_os,alarmEventList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setServiceAlarmReportingOff", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.setServiceAlarmReportingOff(serviceName,alarmEventList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createMaintenancePoints(org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_T mpCreateData, org.omg.hw.maintenanceOps.HW_MaintenancePoint_THolder theMP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createMaintenancePoints", true);
				org.omg.hw.maintenanceOps.HW_MaintenancePointCreateData_THelper.write(_os,mpCreateData);
				_is = _invoke(_os);
				theMP.value = org.omg.hw.maintenanceOps.HW_MaintenancePoint_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createMaintenancePoints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.createMaintenancePoints(mpCreateData,theMP,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void enablePRBSTest(org.omg.hw.maintenanceOps.PRBSTestParameter_T[] testParaList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "enablePRBSTest", true);
				org.omg.hw.maintenanceOps.PRBSTestParameterList_THelper.write(_os,testParaList);
				_is = _invoke(_os);
				failedTPList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "enablePRBSTest", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MaintenanceMgr_IOperations _localServant = (MaintenanceMgr_IOperations)_so.servant;
			try
			{
			_localServant.enablePRBSTest(testParaList,failedTPList);
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
