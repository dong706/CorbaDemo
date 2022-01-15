package org.omg.hw.protection;


/**
 *	Generated from IDL interface "ProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _ProtectionMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.protection.ProtectionMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/protection/ProtectionMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.protection.ProtectionMgr_IOperations.class;
	public void retrieveWDMSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.protection.WDMSwitchDataList_THolder wSwitchDataList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveWDMSwitchData", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,wpgpName);
				_is = _invoke(_os);
				wSwitchDataList.value = org.omg.hw.protection.WDMSwitchDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveWDMSwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveWDMSwitchData(wpgpName,wSwitchDataList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.ProtectionGroupList_THolder pgList, org.omg.hw.protection.ProtectionGroupIterator_IHolder pgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllProtectionGroups", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pgList.value = org.omg.hw.protection.ProtectionGroupList_THelper.read(_is);
				pgpIt.value = org.omg.hw.protection.ProtectionGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllProtectionGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllProtectionGroups(meName,how_many,pgList,pgpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void retrieveSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.protection.SwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveSwitchData", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,reliableSinkCtpOrGroupName);
				_is = _invoke(_os);
				switchData.value = org.omg.hw.protection.SwitchDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveSwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveSwitchData(reliableSinkCtpOrGroupName,switchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void HW_getAllERPSProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.protection.HW_ERPSProtectionGroupList_THolder pgList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "HW_getAllERPSProtectionGroups", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_is = _invoke(_os);
				pgList.value = org.omg.hw.protection.HW_ERPSProtectionGroupList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "HW_getAllERPSProtectionGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.HW_getAllERPSProtectionGroups(meName,pgList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getWDMProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.protection.WDMProtectionGroup_THolder wProtectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getWDMProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,wpgpName);
				_is = _invoke(_os);
				wProtectionGroup.value = org.omg.hw.protection.WDMProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getWDMProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getWDMProtectionGroup(wpgpName,wProtectionGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void HW_getIFProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.HW_IFProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "HW_getIFProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
				_is = _invoke(_os);
				protectionGroup.value = org.omg.hw.protection.HW_IFProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "HW_getIFProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.HW_getIFProtectionGroup(pgName,protectionGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void retrieveESwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] ePGPName, org.omg.hw.protection.ESwitchDataList_THolder eSwitchDataList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveESwitchData", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ePGPName);
				_is = _invoke(_os);
				eSwitchDataList.value = org.omg.hw.protection.ESwitchDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveESwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveESwitchData(ePGPName,eSwitchDataList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void retrieveIFSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.IFSwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveIFSwitchData", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
				_is = _invoke(_os);
				switchData.value = org.omg.hw.protection.IFSwitchDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveIFSwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveIFSwitchData(pgName,switchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getEProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] ePGPname, org.omg.hw.protection.EProtectionGroup_THolder eProtectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ePGPname);
				_is = _invoke(_os);
				eProtectionGroup.value = org.omg.hw.protection.EProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getEProtectionGroup(ePGPname,eProtectionGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllNUTTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllNUTTPNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllNUTTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllNUTTPNames(pgName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void performProtectionCommand(org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.globaldefs.NameAndStringValue_T[] fromTp, org.omg.hw.globaldefs.NameAndStringValue_T[] toTp, org.omg.hw.protection.SwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "performProtectionCommand", true);
				org.omg.hw.protection.ProtectionCommand_THelper.write(_os,protectionCommand);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,reliableSinkCtpOrGroupName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fromTp);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,toTp);
				_is = _invoke(_os);
				switchData.value = org.omg.hw.protection.SwitchData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performProtectionCommand", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.performProtectionCommand(protectionCommand,reliableSinkCtpOrGroupName,fromTp,toTp,switchData);
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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

	public void getIPProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.IPProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getIPProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
				_is = _invoke(_os);
				protectionGroup.value = org.omg.hw.protection.IPProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getIPProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getIPProtectionGroup(pgName,protectionGroup);
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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

	public void HW_getAllXPICGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.HW_XPICGroupList_THolder xpicList, org.omg.hw.protection.HW_XPICGroupIterator_IHolder xpicIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "HW_getAllXPICGroups", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				xpicList.value = org.omg.hw.protection.HW_XPICGroupList_THelper.read(_is);
				xpicIt.value = org.omg.hw.protection.HW_XPICGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "HW_getAllXPICGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.HW_getAllXPICGroups(meName,how_many,xpicList,xpicIt);
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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

	public void getAllPreemptibleTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllPreemptibleTPNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllPreemptibleTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllPreemptibleTPNames(pgName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgpName, org.omg.hw.protection.PGPModifyData_T pgpModifyData, org.omg.hw.protection.ProtectionGroup_THolder modifiedPGP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgpName);
				org.omg.hw.protection.PGPModifyData_THelper.write(_os,pgpModifyData);
				_is = _invoke(_os);
				modifiedPGP.value = org.omg.hw.protection.ProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyProtectionGroup(pgpName,pgpModifyData,modifiedPGP);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllProtectedTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllProtectedTPNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllProtectedTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllProtectedTPNames(pgName,how_many,nameList,nameIt);
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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

	public void getAllEProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.EProtectionGroupList_THolder epgpList, org.omg.hw.protection.EProtectionGroupIterator_IHolder epgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEProtectionGroups", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				epgpList.value = org.omg.hw.protection.EProtectionGroupList_THelper.read(_is);
				epgpIt.value = org.omg.hw.protection.EProtectionGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEProtectionGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEProtectionGroups(meName,how_many,epgpList,epgpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void HW_getERPSProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.HW_ERPSProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "HW_getERPSProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
				_is = _invoke(_os);
				protectionGroup.value = org.omg.hw.protection.HW_ERPSProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "HW_getERPSProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.HW_getERPSProtectionGroup(pgName,protectionGroup);
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
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
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

	public void setProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.protection.ProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
				_is = _invoke(_os);
				protectionGroup.value = org.omg.hw.protection.ProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.setProtectionGroup(pgName,paraList,protectionGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllWDMProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.WDMProtectionGroupList_THolder wpgpList, org.omg.hw.protection.WDMProtectionGroupIterator_IHolder wpgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllWDMProtectionGroups", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				wpgpList.value = org.omg.hw.protection.WDMProtectionGroupList_THelper.read(_is);
				wpgpIt.value = org.omg.hw.protection.WDMProtectionGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllWDMProtectionGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllWDMProtectionGroups(meName,how_many,wpgpList,wpgpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void performWDMProtectionCommand(org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.globaldefs.NameAndStringValue_T[] wpgpName, org.omg.hw.globaldefs.NameAndStringValue_T[] fromTp, org.omg.hw.globaldefs.NameAndStringValue_T[] toTp, org.omg.hw.protection.WDMSwitchData_THolder wSwitchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "performWDMProtectionCommand", true);
				org.omg.hw.protection.ProtectionCommand_THelper.write(_os,protectionCommand);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,wpgpName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fromTp);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,toTp);
				_is = _invoke(_os);
				wSwitchData.value = org.omg.hw.protection.WDMSwitchData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performWDMProtectionCommand", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.performWDMProtectionCommand(protectionCommand,wpgpName,fromTp,toTp,wSwitchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createProtectionGroup(org.omg.hw.protection.PGPCreateData_T pgpCreateData, org.omg.hw.protection.ProtectionGroup_THolder thePGP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createProtectionGroup", true);
				org.omg.hw.protection.PGPCreateData_THelper.write(_os,pgpCreateData);
				_is = _invoke(_os);
				thePGP.value = org.omg.hw.protection.ProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.createProtectionGroup(pgpCreateData,thePGP);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void HW_getXPICGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] xpicGroupName, org.omg.hw.protection.HW_XPICGroup_THolder xpicGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "HW_getXPICGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,xpicGroupName);
				_is = _invoke(_os);
				xpicGroup.value = org.omg.hw.protection.HW_XPICGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "HW_getXPICGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.HW_getXPICGroup(xpicGroupName,xpicGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgpName, org.omg.hw.globaldefs.NameAndStringValue_T[] swapTPName, org.omg.hw.protection.ProtectionGroup_THolder deletedPGP) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgpName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,swapTPName);
				_is = _invoke(_os);
				deletedPGP.value = org.omg.hw.protection.ProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteProtectionGroup(pgpName,swapTPName,deletedPGP);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void HW_getAllIFProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.protection.HW_IFProtectionGroupList_THolder pgList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "HW_getAllIFProtectionGroups", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_is = _invoke(_os);
				pgList.value = org.omg.hw.protection.HW_IFProtectionGroupList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "HW_getAllIFProtectionGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.HW_getAllIFProtectionGroups(meName,pgList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void retrieveIPSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] reliableSinkCtpOrGroupName, org.omg.hw.protection.IPSwitchDataList_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveIPSwitchData", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,reliableSinkCtpOrGroupName);
				_is = _invoke(_os);
				switchData.value = org.omg.hw.protection.IPSwitchDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveIPSwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveIPSwitchData(reliableSinkCtpOrGroupName,switchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAdjacentTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] tpName, org.omg.hw.globaldefs.NamingAttributesList_THolder tpNameList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAdjacentTPs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tpName);
				_is = _invoke(_os);
				tpNameList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAdjacentTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAdjacentTPs(tpName,tpNameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllProtectionSubnetworks(int how_many, org.omg.hw.protection.ProtectionSubnetworkList_THolder psnList, org.omg.hw.protection.ProtectionSubnetworkIterator_IHolder psnIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllProtectionSubnetworks", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				psnList.value = org.omg.hw.protection.ProtectionSubnetworkList_THelper.read(_is);
				psnIt.value = org.omg.hw.protection.ProtectionSubnetworkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllProtectionSubnetworks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllProtectionSubnetworks(how_many,psnList,psnIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getProtectionGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] pgName, org.omg.hw.protection.ProtectionGroup_THolder protectionGroup) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getProtectionGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,pgName);
				_is = _invoke(_os);
				protectionGroup.value = org.omg.hw.protection.ProtectionGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getProtectionGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getProtectionGroup(pgName,protectionGroup);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllIPProtectionGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.protection.IPProtectionGroupList_THolder pgList, org.omg.hw.protection.IPProtectionGroupIterator_IHolder pgpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllIPProtectionGroups", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				pgList.value = org.omg.hw.protection.IPProtectionGroupList_THelper.read(_is);
				pgpIt.value = org.omg.hw.protection.IPProtectionGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllIPProtectionGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			ProtectionMgr_IOperations _localServant = (ProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllIPProtectionGroups(meName,how_many,pgList,pgpIt);
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
