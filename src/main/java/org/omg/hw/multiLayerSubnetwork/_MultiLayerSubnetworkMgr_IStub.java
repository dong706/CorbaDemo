package org.omg.hw.multiLayerSubnetwork;


/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _MultiLayerSubnetworkMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations.class;
	public void deleteSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteSNC(sncName,emsFreedomLevel);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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

	public void getAllManagedElements(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.hw.managedElement.ManagedElementList_THolder meList, org.omg.hw.managedElement.ManagedElementIterator_IHolder meIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllManagedElements", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				meList.value = org.omg.hw.managedElement.ManagedElementList_THelper.read(_is);
				meIt.value = org.omg.hw.managedElement.ManagedElementIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllManagedElements", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllManagedElements(subnetName,how_many,meList,meIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder snc) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_is = _invoke(_os);
				snc.value = org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNC(sncName,snc);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void switchRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.globaldefs.NVSList_THolder additionalInfo, org.omg.hw.subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "switchRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				additionalInfo.value = org.omg.hw.globaldefs.NVSList_THelper.read(_is);
				sncState.value = org.omg.hw.subnetworkConnection.SNCState_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "switchRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.switchRoute(sncName,routeId,tolerableImpact,emsFreedomLevel,tpsToModify,additionalInfo,sncState,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnectionNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnectionNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnectionNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubnetworkConnectionNames(subnetName,connectionRateList,how_many,nameList,nameIt);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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

	public void getAllMicrowaveLinksReport(java.lang.String destination, java.lang.String userName, java.lang.String password, org.omg.hw.notifications.NameAndAnyValue_T[] filter) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMicrowaveLinksReport", true);
				_os.write_string(destination);
				_os.write_string(userName);
				_os.write_string(password);
				org.omg.hw.notifications.NVList_THelper.write(_os,filter);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMicrowaveLinksReport", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMicrowaveLinksReport(destination,userName,password,filter);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateAndDeleteSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateAndDeleteSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theSNC.value = org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateAndDeleteSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateAndDeleteSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNCsByNativeEmsName(java.lang.String nativeEmsName, int how_many, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNCsByNativeEmsName", true);
				_os.write_string(nativeEmsName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.omg.hw.subnetworkConnection.SNCIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNCsByNativeEmsName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNCsByNativeEmsName(nativeEmsName,how_many,sncList,sncIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deletePresetRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deletePresetRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_ulong(presetRouteID);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deletePresetRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deletePresetRoute(sncName,presetRouteID);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNCsByEndObjectName(org.omg.hw.globaldefs.NameAndStringValue_T[] aEndObjectName, org.omg.hw.globaldefs.NameAndStringValue_T[] zEndObjectName, short[] connectionRateList, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNCsByEndObjectName", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,aEndObjectName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,zEndObjectName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_is = _invoke(_os);
				sncList.value = org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNCsByEndObjectName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNCsByEndObjectName(aEndObjectName,zEndObjectName,connectionRateList,sncList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEdgePointNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, short[] layerRateList, short[] connectionLayerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEdgePointNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionLayerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEdgePointNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEdgePointNames(subnetName,layerRateList,connectionLayerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEdgePoints(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, short[] tpLayerRateList, short[] connectionLayerRateList, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEdgePoints", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,tpLayerRateList);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionLayerRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpList.value = org.omg.hw.terminationPoint.TerminationPointList_THelper.read(_is);
				tpIt.value = org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEdgePoints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEdgePoints(subnetName,tpLayerRateList,connectionLayerRateList,how_many,tpList,tpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSharedRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int sharedRouteID, org.omg.hw.subnetworkConnection.SharedRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSharedRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_ulong(sharedRouteID);
				_is = _invoke(_os);
				route.value = org.omg.hw.subnetworkConnection.SharedRoute_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSharedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSharedRoute(sncName,sharedRouteID,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setConjunctionSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName1, org.omg.hw.globaldefs.NameAndStringValue_T[] sncName2, boolean operate) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setConjunctionSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName1);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName2);
				_os.write_boolean(operate);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setConjunctionSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setConjunctionSNC(sncName1,sncName2,operate);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getWaveLengthStatusByEndObject(org.omg.hw.globaldefs.NameAndStringValue_T[] aEndName, org.omg.hw.globaldefs.NameAndStringValue_T[][] inclusionNameList, org.omg.hw.globaldefs.NameAndStringValue_T[][] exclusionNameList, org.omg.hw.globaldefs.NameAndStringValue_T[] zEndName, org.omg.hw.globaldefs.ConnectionDirection_T direction, org.omg.hw.subnetworkConnection.WaveLengthStatusList_THolder waveLengthStatusList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getWaveLengthStatusByEndObject", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,aEndName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,inclusionNameList);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,exclusionNameList);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,zEndName);
				org.omg.hw.globaldefs.ConnectionDirection_THelper.write(_os,direction);
				_is = _invoke(_os);
				waveLengthStatusList.value = org.omg.hw.subnetworkConnection.WaveLengthStatusList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getWaveLengthStatusByEndObject", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getWaveLengthStatusByEndObject(aEndName,inclusionNameList,exclusionNameList,zEndName,direction,waveLengthStatusList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createAndActivateSNC(org.omg.hw.subnetworkConnection.SNCCreateData_T createData, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createAndActivateSNC", true);
				org.omg.hw.subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theSNC.value = org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createAndActivateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createAndActivateSNC(createData,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRouteAndTopologicalLinksBySNCs(org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNameList, int how_many, org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkList_THolder routeAndTlList, org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHolder routeAndTlIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRouteAndTopologicalLinksBySNCs", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,sncNameList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				routeAndTlList.value = org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkList_THelper.read(_is);
				routeAndTlIt.value = org.omg.hw.multiLayerSubnetwork.RouteAndTopologicalLinkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRouteAndTopologicalLinksBySNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRouteAndTopologicalLinksBySNCs(sncNameList,how_many,routeAndTlList,routeAndTlIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getOrginalRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.omg.hw.subnetworkConnection.Route_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getOrginalRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_boolean(includeHigherOrderCCs);
				_is = _invoke(_os);
				route.value = org.omg.hw.subnetworkConnection.Route_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getOrginalRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getOrginalRoute(sncName,includeHigherOrderCCs,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getOrginalPresetRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, org.omg.hw.subnetworkConnection.PresetRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getOrginalPresetRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_ulong(presetRouteID);
				_is = _invoke(_os);
				route.value = org.omg.hw.subnetworkConnection.PresetRoute_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getOrginalPresetRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getOrginalPresetRoute(sncName,presetRouteID,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAssociatedTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAssociatedTP", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpName);
				_is = _invoke(_os);
				tpList.value = org.omg.hw.terminationPoint.TerminationPointList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAssociatedTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAssociatedTP(tpName,tpList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theSNC.value = org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllConjunctionSNCs(int how_many, org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCList_THolder conjunctionSNCList, org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHolder conjunctionSNCIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllConjunctionSNCs", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				conjunctionSNCList.value = org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCList_THelper.read(_is);
				conjunctionSNCIt.value = org.omg.hw.multiLayerSubnetwork.HW_ConjunctionSNCIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllConjunctionSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllConjunctionSNCs(how_many,conjunctionSNCList,conjunctionSNCIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void checkValidSNC(org.omg.hw.subnetworkConnection.SNCCreateData_T createData, org.omg.hw.subnetworkConnection.TPData_T[] tpsToModify, boolean considerResources, org.omg.CORBA.BooleanHolder valid) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "checkValidSNC", true);
				org.omg.hw.subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify);
				_os.write_boolean(considerResources);
				_is = _invoke(_os);
				valid.value = _is.read_boolean();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "checkValidSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.checkValidSNC(createData,tpsToModify,considerResources,valid);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createPresetRoute(org.omg.hw.subnetworkConnection.CreatePresetRouteData_T createData, org.omg.hw.subnetworkConnection.PresetRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createPresetRoute", true);
				org.omg.hw.subnetworkConnection.CreatePresetRouteData_THelper.write(_os,createData);
				_is = _invoke(_os);
				route.value = org.omg.hw.subnetworkConnection.PresetRoute_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createPresetRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createPresetRoute(createData,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createSNC(org.omg.hw.subnetworkConnection.SNCCreateData_T createData, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createSNC", true);
				org.omg.hw.subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				_is = _invoke(_os);
				theSNC.value = org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createSNC(createData,tolerableImpact,emsFreedomLevel,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTPPools(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder tpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTPPools", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetworkName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpList.value = org.omg.hw.terminationPoint.TerminationPointList_THelper.read(_is);
				tpIt.value = org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTPPools", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTPPools(subnetworkName,how_many,tpList,tpIt);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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

	public void getRoutes(org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNameList, boolean includeHigherOrderCCs, org.omg.hw.subnetworkConnection.RouteInfoList_THolder routeInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRoutes", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,sncNameList);
				_os.write_boolean(includeHigherOrderCCs);
				_is = _invoke(_os);
				routeInfoList.value = org.omg.hw.subnetworkConnection.RouteInfoList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRoutes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRoutes(sncNameList,includeHigherOrderCCs,routeInfoList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getConjunctionSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName1, org.omg.hw.globaldefs.NVSList_THolder sncName2, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getConjunctionSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName1);
				_is = _invoke(_os);
				sncName2.value = org.omg.hw.globaldefs.NVSList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getConjunctionSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getConjunctionSNC(sncName1,sncName2,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNCNamesByRouteModificationTime(java.lang.String utcBeginTime, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNCNamesByRouteModificationTime", true);
				_os.write_string(utcBeginTime);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNCNamesByRouteModificationTime", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNCNamesByRouteModificationTime(utcBeginTime,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnectionsWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnectionsWithTP", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.omg.hw.subnetworkConnection.SNCIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnectionsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubnetworkConnectionsWithTP(tpName,connectionRateList,how_many,sncList,sncIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createSharedRoute(org.omg.hw.subnetworkConnection.CreateSharedRouteData_T createData, org.omg.hw.subnetworkConnection.SharedRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createSharedRoute", true);
				org.omg.hw.subnetworkConnection.CreateSharedRouteData_THelper.write(_os,createData);
				_is = _invoke(_os);
				route.value = org.omg.hw.subnetworkConnection.SharedRoute_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createSharedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createSharedRoute(createData,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnections(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnections", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.omg.hw.subnetworkConnection.SNCIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubnetworkConnections(subnetName,connectionRateList,how_many,sncList,sncIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMultiLayerSubnetwork(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMultiLayerSubnetwork", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
				_is = _invoke(_os);
				subnetwork.value = org.omg.hw.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMultiLayerSubnetwork", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMultiLayerSubnetwork(subnetName,subnetwork);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setConjunctionSNCEx(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName1, org.omg.hw.globaldefs.NameAndStringValue_T[] sncName2, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalInfo, boolean operate) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setConjunctionSNCEx", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName1);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName2);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,additionalInfo);
				_os.write_boolean(operate);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setConjunctionSNCEx", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setConjunctionSNCEx(sncName1,sncName2,additionalInfo,operate);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getServerConnections(org.omg.hw.globaldefs.NameAndStringValue_T[] clientName, org.omg.hw.subnetworkConnection.ServerTrailList_THolder serverInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getServerConnections", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,clientName);
				_is = _invoke(_os);
				serverInfoList.value = org.omg.hw.subnetworkConnection.ServerTrailList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getServerConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getServerConnections(clientName,serverInfoList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTopologicalLink(org.omg.hw.globaldefs.NameAndStringValue_T[] topoLinkName, org.omg.hw.topologicalLink.TopologicalLink_THolder topoLink) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTopologicalLink", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTopologicalLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTopologicalLink(topoLinkName,topoLink);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinks(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalLinks", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalLinks(subnetName,how_many,topoList,topoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNCsByUserLabel(java.lang.String userLabel, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNCsByUserLabel", true);
				_os.write_string(userLabel);
				_is = _invoke(_os);
				sncList.value = org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNCsByUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNCsByUserLabel(userLabel,sncList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinkNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalLinkNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalLinkNames(subnetName,how_many,nameList,nameIt);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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

	public void deleteSharedRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int sharedRouteID) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteSharedRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_ulong(sharedRouteID);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteSharedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteSharedRoute(sncName,sharedRouteID);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllInternalTopologicalLinks(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllInternalTopologicalLinks", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllInternalTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllInternalTopologicalLinks(meName,how_many,topoList,topoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theSNC.value = org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateSNC(sncName,tolerableImpact,emsFreedomLevel,tpsToModify,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.omg.hw.subnetworkConnection.Route_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_boolean(includeHigherOrderCCs);
				_is = _invoke(_os);
				route.value = org.omg.hw.subnetworkConnection.Route_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRoute(sncName,includeHigherOrderCCs,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRouteAndTopologicalLinks(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, org.omg.hw.subnetworkConnection.Route_THolder route, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRouteAndTopologicalLinks", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_is = _invoke(_os);
				route.value = org.omg.hw.subnetworkConnection.Route_THelper.read(_is);
				topologicalLinkList.value = org.omg.hw.topologicalLink.TopologicalLinkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRouteAndTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRouteAndTopologicalLinks(sncName,route,topologicalLinkList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnectionNamesWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnectionNamesWithTP", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubnetworkConnectionNamesWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubnetworkConnectionNamesWithTP(tpName,connectionRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllInternalTopologicalLinkNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllInternalTopologicalLinkNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllInternalTopologicalLinkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllInternalTopologicalLinkNames(meName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getPresetRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, int presetRouteID, org.omg.hw.subnetworkConnection.PresetRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getPresetRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_ulong(presetRouteID);
				_is = _invoke(_os);
				route.value = org.omg.hw.subnetworkConnection.PresetRoute_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getPresetRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getPresetRoute(sncName,presetRouteID,route);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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

	public void getAllSNCNamesWithHigherOrderSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] name, short[] connectivityRateList, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSNCNamesWithHigherOrderSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,name);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectivityRateList);
				_is = _invoke(_os);
				nameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSNCNamesWithHigherOrderSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSNCNamesWithHigherOrderSNC(name,connectivityRateList,nameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifySNC(org.omg.hw.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.hw.subnetworkConnection.SNCModifyData_T SNCModifyData, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifySNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.omg.hw.subnetworkConnection.SNCModifyData_THelper.write(_os,SNCModifyData);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.hw.subnetworkConnection.ProtectionEffort_THelper.write(_os,tolerableImpactEffort);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				newSNC.value = org.omg.hw.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifySNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,emsFreedomLevel,tpsToModify,newSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTPGroupingRelationships(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTPGroupingRelationships", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTPGroupingRelationships", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTPGroupingRelationships(tpName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void swapSNC(org.omg.hw.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeDeactivated, org.omg.hw.globaldefs.NameAndStringValue_T[] nameOfSNCtoBeActivated, org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.SNCState_THolder stateOfActivatedSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "swapSNC", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,nameOfSNCtoBeDeactivated);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,nameOfSNCtoBeActivated);
				org.omg.hw.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				stateOfActivatedSNC.value = org.omg.hw.subnetworkConnection.SNCState_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "swapSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.swapSNC(nameOfSNCtoBeDeactivated,nameOfSNCtoBeActivated,emsFreedomLevel,tolerableImpact,tpsToModify,stateOfActivatedSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNCs(org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNameList, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNCs", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,sncNameList);
				_is = _invoke(_os);
				sncList.value = org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSNCs(sncNameList,sncList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllManagedElementNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllManagedElementNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllManagedElementNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllManagedElementNames(subnetName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTPPoolNames(org.omg.hw.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTPPoolNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,subnetworkName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTPPoolNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTPPoolNames(subnetworkName,how_many,nameList,nameIt);
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
