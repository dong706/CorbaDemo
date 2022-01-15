package org.omg.hw.encapsulationLayerLink;


/**
 *	Generated from IDL interface "EncapsulationLayerLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _EncapsulationLayerLinkMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.encapsulationLayerLink.EncapsulationLayerLinkMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/encapsulationLayerLink/EncapsulationLayerLinkMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLinkMgr_IOperations.class;
	public void increaseBandwidthOfELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, boolean automatic, org.omg.hw.subnetworkConnection.SNCCreateData_T[] additionalSNCs, short numberOfSNCs, org.omg.hw.transmissionParameters.LayeredParameters_T[] transmissionParams, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalModificationInfo, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "increaseBandwidthOfELLink", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
				_os.write_boolean(automatic);
				org.omg.hw.subnetworkConnection.SNCCreateDataList_THelper.write(_os,additionalSNCs);
				_os.write_short(numberOfSNCs);
				org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(_os,transmissionParams);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,additionalModificationInfo);
				_is = _invoke(_os);
				newELL.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "increaseBandwidthOfELLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.increaseBandwidthOfELLink(ellName,automatic,additionalSNCs,numberOfSNCs,transmissionParams,additionalModificationInfo,newELL);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setELLinkLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, boolean enableState) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setELLinkLCASState", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
				_os.write_boolean(enableState);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setELLinkLCASState", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.setELLinkLCASState(ellName,enableState);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateELLink", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
				_is = _invoke(_os);
				theELL.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateELLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deactivateELLink(ellName,theELL,errorReason);
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
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
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
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
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

	public void getConnectingELL(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getConnectingELL", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpName);
				_is = _invoke(_os);
				ell.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getConnectingELL", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getConnectingELL(tpName,ell);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.ELLinkModifyData_T ellModifyData, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyELLink", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
				org.omg.hw.encapsulationLayerLink.ELLinkModifyData_THelper.write(_os,ellModifyData);
				_is = _invoke(_os);
				newELL.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyELLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyELLink(ellName,ellModifyData,newELL,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTransmissionParams(org.omg.hw.globaldefs.NameAndStringValue_T[] name, java.lang.String[] filter, org.omg.hw.transmissionParameters.LayeredParameterList_THolder transmissionParams) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTransmissionParams", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,name);
				org.omg.hw.flowDomain.ParameterGroupsList_THelper.write(_os,filter);
				_is = _invoke(_os);
				transmissionParams.value = org.omg.hw.transmissionParameters.LayeredParameterList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTransmissionParams", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTransmissionParams(name,filter,transmissionParams);
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
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
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

	public void getELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getELLink", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
				_is = _invoke(_os);
				ell.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getELLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getELLink(ellName,ell);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteELLink", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteELLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteELLink(ellName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "activateELLink", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
				_is = _invoke(_os);
				theELL.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "activateELLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.activateELLink(ellName,theELL,errorReason);
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
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
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

	public void getELLinkWithSncOrTl(org.omg.hw.globaldefs.NameAndStringValue_T[] sncOrTlName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getELLinkWithSncOrTl", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,sncOrTlName);
				_is = _invoke(_os);
				ell.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getELLinkWithSncOrTl", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getELLinkWithSncOrTl(sncOrTlName,ell);
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
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
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

	public void getServerSNCsAndTLs(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THolder sncList, org.omg.hw.topologicalLink.TopologicalLinkList_THolder tlList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getServerSNCsAndTLs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
				_is = _invoke(_os);
				sncList.value = org.omg.hw.subnetworkConnection.SubnetworkConnectionList_THelper.read(_is);
				tlList.value = org.omg.hw.topologicalLink.TopologicalLinkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getServerSNCsAndTLs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getServerSNCsAndTLs(ellName,sncList,tlList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllELLinksWithMeOrFd(org.omg.hw.globaldefs.NameAndStringValue_T[] meOrFdName, int how_many, org.omg.hw.encapsulationLayerLink.ELLinkList_THolder ells, org.omg.hw.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllELLinksWithMeOrFd", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meOrFdName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				ells.value = org.omg.hw.encapsulationLayerLink.ELLinkList_THelper.read(_is);
				ellIt.value = org.omg.hw.encapsulationLayerLink.ELLinkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllELLinksWithMeOrFd", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllELLinksWithMeOrFd(meOrFdName,how_many,ells,ellIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllELLinks(int how_many, org.omg.hw.encapsulationLayerLink.ELLinkList_THolder ells, org.omg.hw.encapsulationLayerLink.ELLinkIterator_IHolder ellIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllELLinks", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				ells.value = org.omg.hw.encapsulationLayerLink.ELLinkList_THelper.read(_is);
				ellIt.value = org.omg.hw.encapsulationLayerLink.ELLinkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllELLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllELLinks(how_many,ells,ellIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createELLink(org.omg.hw.encapsulationLayerLink.ELLinkCreateData_T createData, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder theELL, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createELLink", true);
				org.omg.hw.encapsulationLayerLink.ELLinkCreateData_THelper.write(_os,createData);
				_is = _invoke(_os);
				theELL.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createELLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.createELLink(createData,theELL,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllELLinkNames(int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllELLinkNames", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllELLinkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllELLinkNames(how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getELLinkWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder ell) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getELLinkWithTP", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpName);
				_is = _invoke(_os);
				ell.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getELLinkWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.getELLinkWithTP(tpName,ell);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void decreaseBandwidthOfELLink(org.omg.hw.globaldefs.NameAndStringValue_T[] ellName, org.omg.hw.globaldefs.NameAndStringValue_T[][] sncNames, short numberOfSNCs, org.omg.hw.globaldefs.NameAndStringValue_T[] additionalModificationInfo, org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THolder newELL) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "decreaseBandwidthOfELLink", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ellName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,sncNames);
				_os.write_short(numberOfSNCs);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,additionalModificationInfo);
				_is = _invoke(_os);
				newELL.value = org.omg.hw.encapsulationLayerLink.EncapsulationLayerLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "decreaseBandwidthOfELLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EncapsulationLayerLinkMgr_IOperations _localServant = (EncapsulationLayerLinkMgr_IOperations)_so.servant;
			try
			{
			_localServant.decreaseBandwidthOfELLink(ellName,sncNames,numberOfSNCs,additionalModificationInfo,newELL);
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
