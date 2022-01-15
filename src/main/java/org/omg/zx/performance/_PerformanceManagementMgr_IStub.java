package org.omg.zx.performance;


/**
 *	Generated from IDL interface "PerformanceManagementMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _PerformanceManagementMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.zx.performance.PerformanceManagementMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.zx.performance.PerformanceManagementMgr_IOperations.class;
	public void clearPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "clearPMData", true);
				org.omg.zx.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_is = _invoke(_os);
				failedTPSelectList.value = org.omg.zx.performance.PMTPSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "clearPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.clearPMData(pmTPSelectList,failedTPSelectList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void disablePMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "disablePMData", true);
				org.omg.zx.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_is = _invoke(_os);
				failedTPSelectList.value = org.omg.zx.performance.PMTPSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "disablePMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.disablePMData(pmTPSelectList,failedTPSelectList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCurrentPMDataByCond(org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, int how_many, org.omg.zx.performance.PMData_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCurrentPMDataByCond", true);
				org.omg.zx.performance.PMTPParamSelectList_THelper.write(_os,pmTPParamSelectList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pmDataList.value = org.omg.zx.performance.PMData_THelper.read(_is);
				pmIt.value = org.omg.zx.performance.PMDataIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCurrentPMDataByCond", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCurrentPMDataByCond(pmTPParamSelectList,how_many,pmDataList,pmIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void queryPMCollectionPlan(int pmCollectionPlanID, org.omg.zx.performance.PMCollectionPlanList_THolder pmCollectionPlan) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "queryPMCollectionPlan", true);
				_os.write_long(pmCollectionPlanID);
				_is = _invoke(_os);
				pmCollectionPlan.value = org.omg.zx.performance.PMCollectionPlanList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "queryPMCollectionPlan", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.queryPMCollectionPlan(pmCollectionPlanID,pmCollectionPlan);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setTCATPParameter(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, org.omg.zx.performance.TCAParameters_THolder tcaParameters) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setTCATPParameter", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,tpName);
				org.omg.zx.performance.TCAParameters_THelper.write(_os,tcaParameters.value);
				_is = _invoke(_os);
				tcaParameters.value = org.omg.zx.performance.TCAParameters_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setTCATPParameter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setTCATPParameter(tpName,tcaParameters);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void changePMCollectionPlan(int pmCollectionPlanID, org.omg.zx.performance.PMCollectionPlan_T[] pmCollectionPlan) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "changePMCollectionPlan", true);
				_os.write_long(pmCollectionPlanID);
				org.omg.zx.performance.PMCollectionPlanList_THelper.write(_os,pmCollectionPlan);
				_is = _invoke(_os);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "changePMCollectionPlan", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.changePMCollectionPlan(pmCollectionPlanID,pmCollectionPlan);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllPMPs(org.omg.zx.globaldefs.NameAndStringValue_T[] tpOrMeName, int how_many, org.omg.zx.performance.PMPList_THolder pmpList, org.omg.zx.performance.PMPIterator_IHolder pmpIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPMPs", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,tpOrMeName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pmpList.value = org.omg.zx.performance.PMPList_THelper.read(_is);
				pmpIt.value = org.omg.zx.performance.PMPIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPMPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPMPs(tpOrMeName,how_many,pmpList,pmpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTCATPParameter(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short layerRate, java.lang.String granularity, org.omg.zx.performance.TCAParameters_THolder tcaParameter) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTCATPParameter", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,tpName);
				_os.write_short(layerRate);
				_os.write_string(granularity);
				_is = _invoke(_os);
				tcaParameter.value = org.omg.zx.performance.TCAParameters_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTCATPParameter", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTCATPParameter(tpName,layerRate,granularity,tcaParameter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getHistoryPMData(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, java.lang.String startTime, java.lang.String endTime, boolean forceUpload) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getHistoryPMData", true);
				_os.write_string(destination);
				_os.write_string(userName);
				_os.write_string(password);
				org.omg.zx.performance.PMTPParamSelectList_THelper.write(_os,pmTPParamSelectList);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_os.write_boolean(forceUpload);
				_is = _invoke(_os);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getHistoryPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getHistoryPMData(destination,userName,password,pmTPParamSelectList,startTime,endTime,forceUpload);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTPHistoryPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, java.lang.String startTime, java.lang.String endTime, int how_many, org.omg.zx.performance.PMDataList_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTPHistoryPMData", true);
				org.omg.zx.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				org.omg.zx.performance.PMParameterNameList_THelper.write(_os,pmParameters);
				_os.write_string(startTime);
				_os.write_string(endTime);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pmDataList.value = org.omg.zx.performance.PMDataList_THelper.read(_is);
				pmIt.value = org.omg.zx.performance.PMDataIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTPHistoryPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTPHistoryPMData(pmTPSelectList,pmParameters,startTime,endTime,how_many,pmDataList,pmIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setAdditionalInfo", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,objectName);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.omg.zx.globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setAdditionalInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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

	public void clearPMCollectionPlan(int pmCollectionPlanID) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "clearPMCollectionPlan", true);
				_os.write_long(pmCollectionPlanID);
				_is = _invoke(_os);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "clearPMCollectionPlan", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.clearPMCollectionPlan(pmCollectionPlanID);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCurrentPMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, java.lang.String[] pmParameters, int how_many, org.omg.zx.performance.PMDataList_THolder pmDataList, org.omg.zx.performance.PMDataIterator_IHolder pmIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCurrentPMData", true);
				org.omg.zx.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				org.omg.zx.performance.PMParameterNameList_THelper.write(_os,pmParameters);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pmDataList.value = org.omg.zx.performance.PMDataList_THelper.read(_is);
				pmIt.value = org.omg.zx.performance.PMDataIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCurrentPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCurrentPMData(pmTPSelectList,pmParameters,how_many,pmDataList,pmIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
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
				capabilities.value = org.omg.zx.common.CapabilityList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCapabilities", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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

	public void enablePMData(org.omg.zx.performance.PMTPSelect_T[] pmTPSelectList, org.omg.zx.performance.PMTPSelectList_THolder failedTPSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "enablePMData", true);
				org.omg.zx.performance.PMTPSelectList_THelper.write(_os,pmTPSelectList);
				_is = _invoke(_os);
				failedTPSelectList.value = org.omg.zx.performance.PMTPSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "enablePMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.enablePMData(pmTPSelectList,failedTPSelectList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setUserLabel", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,objectName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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

	public void getAllPMCollectionPlan(org.omg.zx.performance.PMTaskList_THolder pmTaskList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPMCollectionPlan", true);
				_is = _invoke(_os);
				pmTaskList.value = org.omg.zx.performance.PMTaskList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPMCollectionPlan", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPMCollectionPlan(pmTaskList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setPMCollectionPlan(org.omg.zx.performance.PMCollectionPlan_T[] pmCollectionPlan, org.omg.CORBA.IntHolder pmCollectionPlanID) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setPMCollectionPlan", true);
				org.omg.zx.performance.PMCollectionPlanList_THelper.write(_os,pmCollectionPlan);
				_is = _invoke(_os);
				pmCollectionPlanID.value = _is.read_long();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setPMCollectionPlan", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setPMCollectionPlan(pmCollectionPlan,pmCollectionPlanID);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setNativeEMSName", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,objectName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setNativeEMSName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
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

	public void clearSpecificPMData(org.omg.zx.performance.PMTPParamSelect_T[] pmTPParamSelectList, org.omg.zx.performance.PMTPParamSelectList_THolder failedTPParamSelectList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "clearSpecificPMData", true);
				org.omg.zx.performance.PMTPParamSelectList_THelper.write(_os,pmTPParamSelectList);
				_is = _invoke(_os);
				failedTPParamSelectList.value = org.omg.zx.performance.PMTPParamSelectList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "clearSpecificPMData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.clearSpecificPMData(pmTPParamSelectList,failedTPParamSelectList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setLocation", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,objectName);
				_os.write_string(location);
				_is = _invoke(_os);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setLocation", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			PerformanceManagementMgr_IOperations _localServant = (PerformanceManagementMgr_IOperations)_so.servant;
			try
			{
			_localServant.setLocation(objectName,location);
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
