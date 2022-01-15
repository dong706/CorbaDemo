package org.omg.zx.multiLayerSubnetwork;


/**
 *	Generated from IDL interface "MultiLayerSubnetworkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _MultiLayerSubnetworkMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/multiLayerSubnetwork/MultiLayerSubnetworkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetworkMgr_IOperations.class;
	public void removeConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.globaldefs.NameAndStringValue_T[][] connectionNamesList, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sNCsNotDeleted, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "removeConnections", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,callName);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_os,connectionNamesList);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.zx.subnetworkConnection.TPDataList_THelper.read(_is);
				sNCsNotDeleted.value = org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.removeConnections(callName,connectionNamesList,tpsToModify,sNCsNotDeleted,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMultiLayerSubnetwork(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_THolder subnetwork) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMultiLayerSubnetwork", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_is = _invoke(_os);
				subnetwork.value = org.omg.zx.multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read(_is);
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

	public void getAllTPPools(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetworkName, int how_many, org.omg.zx.terminationPoint.TerminationPointList_THolder tpList, org.omg.zx.terminationPoint.TerminationPointIterator_IHolder tpIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTPPools", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetworkName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tpList.value = org.omg.zx.terminationPoint.TerminationPointList_THelper.read(_is);
				tpIt.value = org.omg.zx.terminationPoint.TerminationPointIterator_IHelper.read(_is);
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

	public void setIntendedRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setIntendedRoute", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setIntendedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setIntendedRoute(sncName,routeId,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCallAndTopLevelConnectionsAndSNCs(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCs_THolder callAndTopLevelConnectionsAndSNCs) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCallAndTopLevelConnectionsAndSNCs", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,callName);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCs.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCs_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCallAndTopLevelConnectionsAndSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCallAndTopLevelConnectionsAndSNCs(callName,callAndTopLevelConnectionsAndSNCs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getIntendedRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.omg.zx.globaldefs.NVSList_THolder additionalInfo, org.omg.zx.subnetworkConnection.Route_THolder route) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getIntendedRoute", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_boolean(includeHigherOrderCCs);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.omg.zx.globaldefs.NVSList_THelper.read(_is);
				route.value = org.omg.zx.subnetworkConnection.Route_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getIntendedRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getIntendedRoute(sncName,includeHigherOrderCCs,additionalInfo,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void releaseCall(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder remainingSNCs, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "releaseCall", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,callName);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.zx.subnetworkConnection.TPDataList_THelper.read(_is);
				remainingSNCs.value = org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "releaseCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.releaseCall(callName,tpsToModify,remainingSNCs,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateSNC", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateSNC(sncName,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void addConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.subnetworkConnection.SNCCreateData_T[] connectionsToAdd, boolean connectionRouteReArrangementAllowed, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder connectionList, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "addConnections", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,callName);
				org.omg.zx.subnetworkConnection.SNCCreateDataList_THelper.write(_os,connectionsToAdd);
				_os.write_boolean(connectionRouteReArrangementAllowed);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.zx.subnetworkConnection.TPDataList_THelper.read(_is);
				connectionList.value = org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				partialSNCs.value = org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.addConnections(callName,connectionsToAdd,connectionRouteReArrangementAllowed,tpsToModify,connectionList,partialSNCs,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyCall(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.callSNC.CallModifyData_T callModifyData, org.omg.zx.callSNC.Call_THolder modifiedCall) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyCall", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,callName);
				org.omg.zx.callSNC.CallModifyData_THelper.write(_os,callModifyData);
				_is = _invoke(_os);
				modifiedCall.value = org.omg.zx.callSNC.Call_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyCall(callName,callModifyData,modifiedCall);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMLSNPPLink(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, boolean sNPListRequested, org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THolder theMLSNPPLink) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMLSNPPLink", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,mLSNPPLinkName);
				_os.write_boolean(sNPListRequested);
				_is = _invoke(_os);
				theMLSNPPLink.value = org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMLSNPPLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMLSNPPLink(mLSNPPLinkName,sNPListRequested,theMLSNPPLink);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createAndActivateSNC(org.omg.zx.subnetworkConnection.SNCCreateData_T createData, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createAndActivateSNC", true);
				org.omg.zx.subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createAndActivateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createAndActivateSNC(createData,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubnetworkConnectionsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tpName, short[] connectionRateList, int how_many, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.zx.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnectionsWithTP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,tpName);
				org.omg.zx.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.omg.zx.subnetworkConnection.SNCIterator_IHelper.read(_is);
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

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,tPName);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnectionsAndSNCsWithTP(subnetName,tPName,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setRoutesAdminState(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.RouteNameAndAdminStateList_THolder routeNameAndAdminStateList, org.omg.zx.subnetworkConnection.SNCState_THolder sncState) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setRoutesAdminState", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.zx.subnetworkConnection.RouteNameAndAdminStateList_THelper.write(_os,routeNameAndAdminStateList.value);
				_is = _invoke(_os);
				routeNameAndAdminStateList.value = org.omg.zx.subnetworkConnection.RouteNameAndAdminStateList_THelper.read(_is);
				sncState.value = org.omg.zx.subnetworkConnection.SNCState_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setRoutesAdminState", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setRoutesAdminState(sncName,routeNameAndAdminStateList,sncState);
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

	public void getAllSubnetworkConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, short[] connectionRateList, int how_many, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.zx.subnetworkConnection.SNCIterator_IHolder sncIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubnetworkConnections", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.zx.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				sncList.value = org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				sncIt.value = org.omg.zx.subnetworkConnection.SNCIterator_IHelper.read(_is);
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

	public void deleteSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteSNC", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteSNC(sncName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllInternalMLSNPPLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllInternalMLSNPPLinks", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_boolean(sNPListRequested);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLSNPPLinkList.value = org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.read(_is);
				mLSNPPLinkIt.value = org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllInternalMLSNPPLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllInternalMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPLinks", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_boolean(sNPListRequested);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLSNPPLinkList.value = org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.read(_is);
				mLSNPPLinkIt.value = org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, boolean includeHigherOrderCCs, org.omg.zx.subnetworkConnection.Route_THolder route) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRoute", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_boolean(includeHigherOrderCCs);
				_is = _invoke(_os);
				route.value = org.omg.zx.subnetworkConnection.Route_THelper.read(_is);
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

	public void switchRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.globaldefs.NVSList_THolder additionalInfo, org.omg.zx.subnetworkConnection.SNCState_THolder sncState, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "switchRoute", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.zx.subnetworkConnection.TPDataList_THelper.read(_is);
				additionalInfo.value = org.omg.zx.globaldefs.NVSList_THelper.read(_is);
				sncState.value = org.omg.zx.subnetworkConnection.SNCState_THelper.read(_is);
				errorReason.value = _is.read_string();
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

	public void getAllSubordinateMLSNs(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder subordinateMLSNsList, org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder subnetIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubordinateMLSNs", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				subordinateMLSNsList.value = org.omg.zx.multiLayerSubnetwork.SubnetworkList_THelper.read(_is);
				subnetIt.value = org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubordinateMLSNs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubordinateMLSNs(subnetName,how_many,subordinateMLSNsList,subnetIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinksByIterator(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalLinksByIterator", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				topoList.value = org.omg.zx.topologicalLink.TopologicalLinkList_THelper.read(_is);
				topoIt.value = org.omg.zx.topologicalLink.TopologicalLinkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinksByIterator", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalLinksByIterator(subnetName,how_many,topoList,topoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEdgeMLSNPPLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEdgeMLSNPPLinks", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_boolean(sNPListRequested);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLSNPPLinkList.value = org.omg.zx.mLSNPPLink.MLSNPPLinkList_THelper.read(_is);
				mLSNPPLinkIt.value = org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEdgeMLSNPPLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEdgeMLSNPPLinks(subnetName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRouteAndTopologicalLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.Route_THolder route, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topologicalLinkList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRouteAndTopologicalLinks", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_is = _invoke(_os);
				route.value = org.omg.zx.subnetworkConnection.Route_THelper.read(_is);
				topologicalLinkList.value = org.omg.zx.topologicalLink.TopologicalLinkList_THelper.read(_is);
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

	public void getAllCallsAndTopLevelConnectionsAndSNCsWithME(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCsWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnectionsAndSNCsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallIdsWithSNPPOrTNAName(org.omg.zx.globaldefs.NameAndStringValue_T SNPPOrTNAName, org.omg.zx.callSNC.CallIdList_THolder callIdList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallIdsWithSNPPOrTNAName", true);
				org.omg.zx.globaldefs.NameAndStringValue_THelper.write(_os,SNPPOrTNAName);
				_is = _invoke(_os);
				callIdList.value = org.omg.zx.callSNC.CallIdList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallIdsWithSNPPOrTNAName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallIdsWithSNPPOrTNAName(SNPPOrTNAName,callIdList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void addRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.RouteCreateData_T createRoute, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.zx.subnetworkConnection.RouteDescriptor_THolder theRoute, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "addRoute", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.zx.subnetworkConnection.RouteCreateData_THelper.write(_os,createRoute);
				org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
				_is = _invoke(_os);
				theRoute.value = org.omg.zx.subnetworkConnection.RouteDescriptor_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.addRoute(sncName,createRoute,tolerableImpact,emsFreedomLevel,theRoute,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder snc) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSNC", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_is = _invoke(_os);
				snc.value = org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
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

	public void getAllCallsAndTopLevelConnectionsWithME(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnectionsWithME", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsList.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THelper.read(_is);
				callAndTopLevelConnectionsIt.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnectionsWithME(subnetName,meName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateSNC", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateSNC(sncName,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallIdsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, org.omg.zx.callSNC.CallIdList_THolder callIdList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallIdsWithTP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,tPName);
				_is = _invoke(_os);
				callIdList.value = org.omg.zx.callSNC.CallIdList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallIdsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallIdsWithTP(tPName,callIdList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setSRG(java.lang.String srgId, int setOrRelase, org.omg.zx.globaldefs.NameAndStringValue_T[][] objectNames) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setSRG", true);
				_os.write_string(srgId);
				_os.write_long(setOrRelase);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_os,objectNames);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setSRG", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setSRG(srgId,setOrRelase,objectNames);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createSNC(org.omg.zx.subnetworkConnection.SNCCreateData_T createData, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createSNC", true);
				org.omg.zx.subnetworkConnection.SNCCreateData_THelper.write(_os,createData);
				org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createSNC(createData,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyDiversityAndCorouting(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.callSNC.Diversity_T callDiversity, org.omg.zx.callSNC.RouteGroupInfo_T[] routeGroupInfoList, boolean connectionRouteReArrangementAllowed, java.lang.String routeGroupsNumber, org.omg.zx.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyDiversityAndCorouting", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,callName);
				org.omg.zx.callSNC.Diversity_THelper.write(_os,callDiversity);
				org.omg.zx.callSNC.RouteGroupInfoList_THelper.write(_os,routeGroupInfoList);
				_os.write_boolean(connectionRouteReArrangementAllowed);
				_os.write_string(routeGroupsNumber);
				_is = _invoke(_os);
				callAndTopLevelConnections.value = org.omg.zx.callSNC.CallAndTopLevelConnections_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyDiversityAndCorouting", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyDiversityAndCorouting(callName,callDiversity,routeGroupInfoList,connectionRouteReArrangementAllowed,routeGroupsNumber,callAndTopLevelConnections);
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

	public void modifySNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.zx.subnetworkConnection.SNCModifyData_T SNCModifyData, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.ProtectionEffort_T tolerableImpactEffort, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder newSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifySNC", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.omg.zx.subnetworkConnection.SNCModifyData_THelper.write(_os,SNCModifyData);
				org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				org.omg.zx.subnetworkConnection.ProtectionEffort_THelper.write(_os,tolerableImpactEffort);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.zx.subnetworkConnection.TPDataList_THelper.read(_is);
				newSNC.value = org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifySNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifySNC(sncName,routeId,SNCModifyData,tolerableImpact,tolerableImpactEffort,tpsToModify,newSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinks(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalLinks", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_is = _invoke(_os);
				topoList.value = org.omg.zx.topologicalLink.TopologicalLinkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalLinks(subnetName,topoList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void establishCall(org.omg.zx.callSNC.CallCreateData_T callCreateData, org.omg.zx.subnetworkConnection.SNCCreateData_T[] connectionCreateDataList, java.lang.String routeGroupsNumber, org.omg.zx.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.zx.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections, org.omg.zx.subnetworkConnection.SNCCreateDataList_THolder connectionsNotCreated, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder partialSNCs, org.omg.CORBA.StringHolder callErrorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "establishCall", true);
				org.omg.zx.callSNC.CallCreateData_THelper.write(_os,callCreateData);
				org.omg.zx.subnetworkConnection.SNCCreateDataList_THelper.write(_os,connectionCreateDataList);
				_os.write_string(routeGroupsNumber);
				org.omg.zx.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.zx.subnetworkConnection.TPDataList_THelper.read(_is);
				callAndTopLevelConnections.value = org.omg.zx.callSNC.CallAndTopLevelConnections_THelper.read(_is);
				connectionsNotCreated.value = org.omg.zx.subnetworkConnection.SNCCreateDataList_THelper.read(_is);
				partialSNCs.value = org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				callErrorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "establishCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.establishCall(callCreateData,connectionCreateDataList,routeGroupsNumber,tpsToModify,callAndTopLevelConnections,connectionsNotCreated,partialSNCs,callErrorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THolder callAndTopLevelConnectionsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHolder callAndTopLevelConnectionsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnections", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsList.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsList_THelper.read(_is);
				callAndTopLevelConnectionsIt.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnections(subnetName,how_many,callAndTopLevelConnectionsList,callAndTopLevelConnectionsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateAndDeleteSNC(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, org.omg.zx.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.zx.subnetworkConnection.SubnetworkConnection_THolder theSNC, org.omg.CORBA.StringHolder errorReason) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateAndDeleteSNC", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				org.omg.zx.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				theSNC.value = org.omg.zx.subnetworkConnection.SubnetworkConnection_THelper.read(_is);
				errorReason.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateAndDeleteSNC", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateAndDeleteSNC(sncName,tolerableImpact,theSNC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCallAndTopLevelConnections(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, java.lang.String callId, org.omg.zx.callSNC.CallAndTopLevelConnections_THolder callAndTopLevelConnections) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCallAndTopLevelConnections", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,callName);
				_os.write_string(callId);
				_is = _invoke(_os);
				callAndTopLevelConnections.value = org.omg.zx.callSNC.CallAndTopLevelConnections_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCallAndTopLevelConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCallAndTopLevelConnections(callName,callId,callAndTopLevelConnections);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSubordinateRAidsWithConnection(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.globaldefs.NameAndStringValue_T[] connection, java.lang.String routeType, org.omg.zx.multiLayerSubnetwork.RoutePerRouteType_THolder routePerRouteType) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSubordinateRAidsWithConnection", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,connection);
				_os.write_string(routeType);
				_is = _invoke(_os);
				routePerRouteType.value = org.omg.zx.multiLayerSubnetwork.RoutePerRouteType_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSubordinateRAidsWithConnection", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSubordinateRAidsWithConnection(subnetName,connection,routeType,routePerRouteType);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getConnectionsAndRouteDetails(java.lang.String callID, org.omg.zx.globaldefs.NameAndStringValue_T[] mLRAName, java.lang.String sNPOrSNPPID, boolean mLSNPPLinkRequested, java.lang.String routeType, org.omg.zx.callSNC.SNCAndRouteList_THolder connectionAndRouteList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getConnectionsAndRouteDetails", true);
				_os.write_string(callID);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,mLRAName);
				_os.write_string(sNPOrSNPPID);
				_os.write_boolean(mLSNPPLinkRequested);
				_os.write_string(routeType);
				_is = _invoke(_os);
				connectionAndRouteList.value = org.omg.zx.callSNC.SNCAndRouteList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getConnectionsAndRouteDetails", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getConnectionsAndRouteDetails(callID,mLRAName,sNPOrSNPPID,mLSNPPLinkRequested,routeType,connectionAndRouteList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getCall(org.omg.zx.globaldefs.NameAndStringValue_T[] callName, org.omg.zx.callSNC.Call_THolder theCall) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getCall", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,callName);
				_is = _invoke(_os);
				theCall.value = org.omg.zx.callSNC.Call_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getCall", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getCall(callName,theCall);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSNCsByUserLabel(java.lang.String userLabel, org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws org.omg.zx.globaldefs.ProcessingFailureException
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
				sncList.value = org.omg.zx.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
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

	public void getBackupRoutes(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, boolean includeHigherOrderCCs, org.omg.zx.globaldefs.NVSList_THolder additionalInfo, org.omg.zx.subnetworkConnection.RouteList_THolder routeList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getBackupRoutes", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				_os.write_boolean(includeHigherOrderCCs);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,additionalInfo.value);
				_is = _invoke(_os);
				additionalInfo.value = org.omg.zx.globaldefs.NVSList_THelper.read(_is);
				routeList.value = org.omg.zx.subnetworkConnection.RouteList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getBackupRoutes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getBackupRoutes(sncName,routeId,includeHigherOrderCCs,additionalInfo,routeList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPs(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPs", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_boolean(sNPListRequested);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLSNPPList.value = org.omg.zx.mLSNPP.MLSNPPList_THelper.read(_is);
				mLSNPPIt.value = org.omg.zx.mLSNPP.MLSNPPIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPs(subnetName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCallsAndTopLevelConnectionsAndSNCs(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, int how_many, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THolder callAndTopLevelConnectionsAndSNCsList, org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHolder callAndTopLevelConnectionsAndSNCsIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCallsAndTopLevelConnectionsAndSNCs", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				callAndTopLevelConnectionsAndSNCsList.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsList_THelper.read(_is);
				callAndTopLevelConnectionsAndSNCsIt.value = org.omg.zx.callSNC.CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCallsAndTopLevelConnectionsAndSNCs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllCallsAndTopLevelConnectionsAndSNCs(subnetName,how_many,callAndTopLevelConnectionsAndSNCsList,callAndTopLevelConnectionsAndSNCsIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void removeRoute(org.omg.zx.globaldefs.NameAndStringValue_T[] sncName, java.lang.String routeId, org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_T emsFreedomLevel, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "removeRoute", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,sncName);
				_os.write_string(routeId);
				org.omg.zx.multiLayerSubnetwork.EMSFreedomLevel_THelper.write(_os,emsFreedomLevel);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "removeRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
			try
			{
			_localServant.removeRoute(sncName,routeId,emsFreedomLevel,additionalInfo);
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
			MultiLayerSubnetworkMgr_IOperations _localServant = (MultiLayerSubnetworkMgr_IOperations)_so.servant;
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
