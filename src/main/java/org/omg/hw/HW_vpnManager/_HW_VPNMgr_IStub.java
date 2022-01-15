package org.omg.hw.HW_vpnManager;


/**
 *	Generated from IDL interface "HW_VPNMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _HW_VPNMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.HW_vpnManager.HW_VPNMgr_I
{
	private String[] ids = {"IDL:mtnm.huawei.com/HW_vpnManager/HW_VPNMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.HW_vpnManager.HW_VPNMgr_IOperations.class;
	public void getIPCrossConnection(org.omg.hw.globaldefs.NameAndStringValue_T[] ipCCName, org.omg.hw.HW_vpnManager.IPCrossConnection_THolder ipCC) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getIPCrossConnection", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ipCCName);
				_is = _invoke(_os);
				ipCC.value = org.omg.hw.HW_vpnManager.IPCrossConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getIPCrossConnection", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getIPCrossConnection(ipCCName,ipCC);
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
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
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

	public void activateTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateTrafficTrunk", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,trafficTrunkName);
				_is = _invoke(_os);
				theTrafficTrunk.value = org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateTrafficTrunk", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateTrafficTrunk(trafficTrunkName,theTrafficTrunk,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateMFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdfrName);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theMFDFr.value = org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateMFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateMFDFr(mfdfrName,tpsToModify,theMFDFr,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteTrafficTrunk", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,trafficTrunkName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteTrafficTrunk", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteTrafficTrunk(trafficTrunkName);
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
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
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

	public void getAllTrafficTrunkNames(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTrafficTrunkNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTrafficTrunkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTrafficTrunkNames(fdName,connectionRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName, org.omg.hw.HW_vpnManager.MFDFrModifyData_T modifyData, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.hw.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, org.omg.hw.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyMFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdfrName);
				org.omg.hw.HW_vpnManager.MFDFrModifyData_THelper.write(_os,modifyData);
				_is = _invoke(_os);
				theMFDFr.value = org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.read(_is);
				notConnectableCPTPList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				parameterProblemsTPList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyMFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyMFDFr(mfdfrName,modifyData,theMFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTrafficTrunksWithME(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTrafficTrunksWithME", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				trafficTrunkList.value = org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.read(_is);
				trafficTrunkIt.value = org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTrafficTrunksWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTrafficTrunksWithME(managedElementName,connectionRateList,how_many,trafficTrunkList,trafficTrunkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTrafficTrunks(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTrafficTrunks", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				trafficTrunkList.value = org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.read(_is);
				trafficTrunkIt.value = org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTrafficTrunks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTrafficTrunks(fdName,connectionRateList,how_many,trafficTrunkList,trafficTrunkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateTrafficTrunk", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,trafficTrunkName);
				_is = _invoke(_os);
				theTrafficTrunk.value = org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateTrafficTrunk", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateTrafficTrunk(trafficTrunkName,theTrafficTrunk,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateMFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdfrName);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theMFDFr.value = org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateMFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateMFDFr(mfdfrName,tpsToModify,theMFDFr,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdfrName);
				_is = _invoke(_os);
				theMFDFr.value = org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMFDFr(mfdfrName,theMFDFr);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getIPRoutesByTrafficTrunks(org.omg.hw.globaldefs.NameAndStringValue_T[][] trafficTrunkNameList, org.omg.hw.HW_vpnManager.IPRouteInfoList_THolder routeInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getIPRoutesByTrafficTrunks", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,trafficTrunkNameList);
				_is = _invoke(_os);
				routeInfoList.value = org.omg.hw.HW_vpnManager.IPRouteInfoList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getIPRoutesByTrafficTrunks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getIPRoutesByTrafficTrunks(trafficTrunkNameList,routeInfoList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getSelfLearningMACAddressTable(org.omg.hw.globaldefs.NameAndStringValue_T[][] nameList, int how_many, org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableList_THolder tableList, org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableIterator_IHolder tableIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSelfLearningMACAddressTable", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,nameList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				tableList.value = org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableList_THelper.read(_is);
				tableIt.value = org.omg.hw.HW_vpnManager.SelfLearningMACAddressTableIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSelfLearningMACAddressTable", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSelfLearningMACAddressTable(nameList,how_many,tableList,tableIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_T modifyData, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder newTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyTrafficTrunk", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,trafficTrunkName);
				org.omg.hw.HW_vpnManager.TrafficTrunkModifyData_THelper.write(_os,modifyData);
				_is = _invoke(_os);
				newTrafficTrunk.value = org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyTrafficTrunk", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyTrafficTrunk(trafficTrunkName,modifyData,newTrafficTrunk,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createTrafficTrunk(org.omg.hw.HW_vpnManager.TrafficTrunkCreateData_T createData, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder theTrafficTrunk, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createTrafficTrunk", true);
				org.omg.hw.HW_vpnManager.TrafficTrunkCreateData_THelper.write(_os,createData);
				_is = _invoke(_os);
				theTrafficTrunk.value = org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createTrafficTrunk", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.createTrafficTrunk(createData,theTrafficTrunk,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFDFrNames(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFDFrNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				_os.write_ulong(how_many);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFDFrNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFDFrNames(fdName,how_many,connectionRateList,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrsByUserLabel", true);
				_os.write_string(userLabel);
				_is = _invoke(_os);
				fdfrList.value = org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrsByUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrsByUserLabel(userLabel,fdfrList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.FDFrModifyData_T fdfrModifyData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.subnetworkConnection.GradesOfImpact_T tolerableImpact, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdfrName);
				org.omg.hw.HW_vpnManager.FDFrModifyData_THelper.write(_os,fdfrModifyData);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				org.omg.hw.subnetworkConnection.GradesOfImpact_THelper.write(_os,tolerableImpact);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				newFDFr.value = org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyFDFr(fdfrName,fdfrModifyData,tpsToModify,tolerableImpact,newFDFr,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, boolean includeHigherOrderCCs, org.omg.hw.HW_vpnManager.FDFrRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdfrName);
				_os.write_boolean(includeHigherOrderCCs);
				_is = _invoke(_os);
				route.value = org.omg.hw.HW_vpnManager.FDFrRoute_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrRoute(fdfrName,includeHigherOrderCCs,route);
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
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
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

	public void getFDFrRoutes(org.omg.hw.globaldefs.NameAndStringValue_T[][] fdfrNameList, org.omg.hw.HW_vpnManager.FDFrRouteInfoList_THolder routeInfoList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrRoutes", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,fdfrNameList);
				_is = _invoke(_os);
				routeInfoList.value = org.omg.hw.HW_vpnManager.FDFrRouteInfoList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrRoutes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrRoutes(fdfrNameList,routeInfoList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTrafficTrunksWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, int how_many, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList, org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHolder trafficTrunkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTrafficTrunksWithTP", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				trafficTrunkList.value = org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.read(_is);
				trafficTrunkIt.value = org.omg.hw.HW_vpnManager.TrafficTrunkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTrafficTrunksWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTrafficTrunksWithTP(tpName,how_many,trafficTrunkList,trafficTrunkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFDFrs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectionRateList, org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, org.omg.hw.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFDFrs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				_os.write_ulong(how_many);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_is = _invoke(_os);
				fdfrList.value = org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THelper.read(_is);
				fdfrIt.value = org.omg.hw.HW_vpnManager.FDFrIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFDFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFDFrs(fdName,how_many,connectionRateList,fdfrList,fdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createFDFr(org.omg.hw.HW_vpnManager.FDFrCreateData_T createData, org.omg.hw.flowDomain.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.subnetworkConnection.TPDataList_THolder endTPs, org.omg.hw.subnetworkConnection.TPDataList_THolder internalTPs, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createFDFr", true);
				org.omg.hw.HW_vpnManager.FDFrCreateData_THelper.write(_os,createData);
				org.omg.hw.flowDomain.ConnectivityRequirement_THelper.write(_os,connectivityRequirement);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,endTPs.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,internalTPs.value);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THelper.write(_os,mfdfrs.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				endTPs.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				internalTPs.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				mfdfrs.value = org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THelper.read(_is);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theFDFr.value = org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.createFDFr(createData,connectivityRequirement,endTPs,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdfrName);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteFDFr(fdfrName,tpsToModify);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteIPCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[][] ipCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder successedIPCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedIPCCNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteIPCrossConnections", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,ipCCNameList);
				_is = _invoke(_os);
				successedIPCCNameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				failedIPCCNameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteIPCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrsWithME(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, org.omg.hw.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrsWithME", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				fdfrList.value = org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THelper.read(_is);
				fdfrIt.value = org.omg.hw.HW_vpnManager.FDFrIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrsWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrsWithME(managedElementName,connectionRateList,how_many,fdfrList,fdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTrafficTrunkNamesWithME(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTrafficTrunkNamesWithME", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,managedElementName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTrafficTrunkNamesWithME", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTrafficTrunkNamesWithME(managedElementName,connectionRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdfrName);
				_is = _invoke(_os);
				fdfr.value = org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateFDFr(fdfrName,fdfr);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrsWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] cptpName, int how_many, org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THolder fdfrList, org.omg.hw.HW_vpnManager.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrsWithTP", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,cptpName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				fdfrList.value = org.omg.hw.HW_vpnManager.FlowDomainFragmentList_THelper.read(_is);
				fdfrIt.value = org.omg.hw.HW_vpnManager.FDFrIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrsWithTP(cptpName,how_many,fdfrList,fdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllIPCrossConnectionNames(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllIPCrossConnectionNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,managedElementName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllIPCrossConnectionNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllIPCrossConnectionNames(managedElementName,connectionRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdfrName);
				_is = _invoke(_os);
				fdfr.value = org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateFDFr(fdfrName,fdfr);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTrafficTrunksByUserLabel(java.lang.String userLabel, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTrafficTrunksByUserLabel", true);
				_os.write_string(userLabel);
				_is = _invoke(_os);
				trafficTrunkList.value = org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTrafficTrunksByUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTrafficTrunksByUserLabel(userLabel,trafficTrunkList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createMFDFr(org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_T createData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THolder theMFDFr, org.omg.hw.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, org.omg.hw.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createMFDFr", true);
				org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.write(_os,createData);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theMFDFr.value = org.omg.hw.HW_vpnManager.MatrixFlowDomainFragment_THelper.read(_is);
				notConnectableCPTPList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				parameterProblemsTPList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createMFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.createMFDFr(createData,tpsToModify,theMFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteMFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdfrName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteMFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdfrName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteMFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteMFDFr(mfdfrName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTrafficTrunkRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTrafficTrunkRoute", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,trafficTrunkName);
				_is = _invoke(_os);
				route.value = org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTrafficTrunkRoute", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTrafficTrunkRoute(trafficTrunkName,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createIPCrossConnections(org.omg.hw.HW_vpnManager.IPCrossConnection_T[] ipCCList, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder successedIPCCList, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder failedIPCCList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createIPCrossConnections", true);
				org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.write(_os,ipCCList);
				_is = _invoke(_os);
				successedIPCCList.value = org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(_is);
				failedIPCCList.value = org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createIPCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.createIPCrossConnections(ipCCList,successedIPCCList,failedIPCCList);
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
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
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

	public void getAllMFDFrs(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THolder mfdfrList, org.omg.hw.HW_vpnManager.MFDFrIterator_IHolder mfdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMFDFrs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mfdfrList.value = org.omg.hw.HW_vpnManager.MatrixFlowDomainFragmentList_THelper.read(_is);
				mfdfrIt.value = org.omg.hw.HW_vpnManager.MFDFrIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMFDFrs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMFDFrs(meName,connectionRateList,how_many,mfdfrList,mfdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyIPCrossConnection(org.omg.hw.globaldefs.NameAndStringValue_T[] ipCCName, org.omg.hw.transmissionParameters.LayeredParameters_T transmissionParams, org.omg.hw.HW_vpnManager.IPCrossConnection_THolder newIPCC, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyIPCrossConnection", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ipCCName);
				org.omg.hw.transmissionParameters.LayeredParameters_THelper.write(_os,transmissionParams);
				_is = _invoke(_os);
				newIPCC.value = org.omg.hw.HW_vpnManager.IPCrossConnection_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyIPCrossConnection", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyIPCrossConnection(ipCCName,transmissionParams,newIPCC,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTrafficTrunksByNativeEmsName(java.lang.String nativeEmsName, org.omg.hw.HW_vpnManager.TrafficTrunkList_THolder trafficTrunkList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTrafficTrunksByNativeEmsName", true);
				_os.write_string(nativeEmsName);
				_is = _invoke(_os);
				trafficTrunkList.value = org.omg.hw.HW_vpnManager.TrafficTrunkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTrafficTrunksByNativeEmsName", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTrafficTrunksByNativeEmsName(nativeEmsName,trafficTrunkList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateIPCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[][] ipCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder successedIPCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateIPCrossConnections", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,ipCCNameList);
				_is = _invoke(_os);
				successedIPCCNameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				failedIPCCNameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateIPCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.HW_vpnManager.FlowDomainFragment_THolder theFDFr) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdfrName);
				_is = _invoke(_os);
				theFDFr.value = org.omg.hw.HW_vpnManager.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFr(fdfrName,theFDFr);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getIPRoutes(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder routes) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getIPRoutes", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,trafficTrunkName);
				_is = _invoke(_os);
				routes.value = org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getIPRoutes", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getIPRoutes(trafficTrunkName,routes);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTrafficTrunk(org.omg.hw.globaldefs.NameAndStringValue_T[] trafficTrunkName, org.omg.hw.HW_vpnManager.TrafficTrunk_THolder trafficTrunk) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTrafficTrunk", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,trafficTrunkName);
				_is = _invoke(_os);
				trafficTrunk.value = org.omg.hw.HW_vpnManager.TrafficTrunk_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTrafficTrunk", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTrafficTrunk(trafficTrunkName,trafficTrunk);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrServerTrail(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.globaldefs.NamingAttributesList_THolder serverNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFDFrServerTrail", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdfrName);
				_is = _invoke(_os);
				serverNameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFDFrServerTrail", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrServerTrail(fdfrName,serverNameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMFDFrNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, short[] connectionRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMFDFrNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMFDFrNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMFDFrNames(meName,connectionRateList,how_many,nameList,nameIt);
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
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
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

	public void deactivateIPCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[][] ipCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder successedIPCCNameList, org.omg.hw.globaldefs.NamingAttributesList_THolder failedIPCCNameList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateIPCrossConnections", true);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,ipCCNameList);
				_is = _invoke(_os);
				successedIPCCNameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				failedIPCCNameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateIPCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateIPCrossConnections(ipCCNameList,successedIPCCNameList,failedIPCCNameList,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllIPCrossConnections(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, short[] connectionRateList, int how_many, org.omg.hw.HW_vpnManager.IPCrossConnectionList_THolder ipCCList, org.omg.hw.HW_vpnManager.IPCrossConnectionIterator_IHolder ipCCIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllIPCrossConnections", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,managedElementName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectionRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				ipCCList.value = org.omg.hw.HW_vpnManager.IPCrossConnectionList_THelper.read(_is);
				ipCCIt.value = org.omg.hw.HW_vpnManager.IPCrossConnectionIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllIPCrossConnections", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_VPNMgr_IOperations _localServant = (HW_VPNMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllIPCrossConnections(managedElementName,connectionRateList,how_many,ipCCList,ipCCIt);
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
