package org.omg.hw.HW_mstpProtection;


/**
 *	Generated from IDL interface "HW_MSTPProtectionMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _HW_MSTPProtectionMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.HW_mstpProtection.HW_MSTPProtectionMgr_I
{
	private String[] ids = {"IDL:mtnm.huawei.com/HW_mstpProtection/HW_MSTPProtectionMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.HW_mstpProtection.HW_MSTPProtectionMgr_IOperations.class;
	public void performAtmPGProtectionCommand(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchAction_T switchAction, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchDirect_T switchDirect, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "performAtmPGProtectionCommand", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,atmpgName);
				org.omg.hw.protection.ProtectionCommand_THelper.write(_os,protectionCommand);
				org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchAction_THelper.write(_os,switchAction);
				org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchDirect_THelper.write(_os,switchDirect);
				_is = _invoke(_os);
				switchData.value = org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performAtmPGProtectionCommand", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.performAtmPGProtectionCommand(atmpgName,protectionCommand,switchAction,switchDirect,switchData);
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
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
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
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
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
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
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

	public void getAllRPRNode(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_RPRNodeList_THolder nodeList, org.omg.hw.HW_mstpProtection.HW_RPRNodeIterator_IHolder nodeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllRPRNode", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nodeList.value = org.omg.hw.HW_mstpProtection.HW_RPRNodeList_THelper.read(_is);
				nodeIt.value = org.omg.hw.HW_mstpProtection.HW_RPRNodeIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllRPRNode", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllRPRNode(meName,how_many,nodeList,nodeIt);
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
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
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

	public void modifyAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] atmPgName, org.omg.hw.globaldefs.NameAndStringValue_T[] atmPGParameters, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyAtmProtectGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,atmPgName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,atmPGParameters);
				_is = _invoke(_os);
				atmPG.value = org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyAtmProtectGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyAtmProtectGroup(atmPgName,atmPGParameters,atmPG);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRPRTopoPara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_THolder topoInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRPRTopoPara", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,nodeName);
				_is = _invoke(_os);
				topoInfo.value = org.omg.hw.HW_mstpProtection.HW_RPRTopoInfo_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRPRTopoPara", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRPRTopoPara(nodeName,topoInfo);
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
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
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

	public void retrieveRPRSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveRPRSwitchData", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,nodeName);
				_is = _invoke(_os);
				switchData.value = org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveRPRSwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveRPRSwitchData(nodeName,switchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THolder atmPG) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAtmProtectGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,atmpgName);
				_is = _invoke(_os);
				atmPG.value = org.omg.hw.HW_mstpProtection.HW_AtmProtectGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAtmProtectGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAtmProtectGroup(atmpgName,atmPG);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRPRNode(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.HW_mstpProtection.HW_RPRNode_THolder node) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRPRNode", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,nodeName);
				_is = _invoke(_os);
				node.value = org.omg.hw.HW_mstpProtection.HW_RPRNode_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRPRNode", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRPRNode(nodeName,node);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void performRPRProtectionCommand(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.HW_mstpProtection.HW_SwitchPosition_T switchPosition, org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "performRPRProtectionCommand", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,nodeName);
				org.omg.hw.protection.ProtectionCommand_THelper.write(_os,protectionCommand);
				org.omg.hw.HW_mstpProtection.HW_SwitchPosition_THelper.write(_os,switchPosition);
				_is = _invoke(_os);
				switchData.value = org.omg.hw.HW_mstpProtection.HW_RPRSwitchData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "performRPRProtectionCommand", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.performRPRProtectionCommand(nodeName,protectionCommand,switchPosition,switchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllRPRLinkInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_RPRLinkInfoList_THolder linkList, org.omg.hw.HW_mstpProtection.HW_RPRLinkIterator_IHolder rprLinkIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllRPRLinkInfo", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				linkList.value = org.omg.hw.HW_mstpProtection.HW_RPRLinkInfoList_THelper.read(_is);
				rprLinkIt.value = org.omg.hw.HW_mstpProtection.HW_RPRLinkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllRPRLinkInfo", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllRPRLinkInfo(meName,how_many,linkList,rprLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void retrieveAtmPGSwitchData(org.omg.hw.globaldefs.NameAndStringValue_T[] atmpgName, org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THolder switchData) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "retrieveAtmPGSwitchData", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,atmpgName);
				_is = _invoke(_os);
				switchData.value = org.omg.hw.HW_mstpProtection.HW_AtmPGSwitchData_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "retrieveAtmPGSwitchData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.retrieveAtmPGSwitchData(atmpgName,switchData);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyRPRLinkPara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.globaldefs.NameAndStringValue_T[] rprLinkParameters, org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_THolder linkInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyRPRLinkPara", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,nodeName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,rprLinkParameters);
				_is = _invoke(_os);
				linkInfo.value = org.omg.hw.HW_mstpProtection.HW_RPRLinkInfo_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyRPRLinkPara", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyRPRLinkPara(nodeName,rprLinkParameters,linkInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyRPRNodePara(org.omg.hw.globaldefs.NameAndStringValue_T[] nodeName, org.omg.hw.globaldefs.NameAndStringValue_T[] rprNodeParameters, org.omg.hw.HW_mstpProtection.HW_RPRNode_THolder node) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyRPRNodePara", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,nodeName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,rprNodeParameters);
				_is = _invoke(_os);
				node.value = org.omg.hw.HW_mstpProtection.HW_RPRNode_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyRPRNodePara", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyRPRNodePara(nodeName,rprNodeParameters,node);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllAtmProtectGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupList_THolder atmPGList, org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupIterator_IHolder pgIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAtmProtectGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				atmPGList.value = org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupList_THelper.read(_is);
				pgIt.value = org.omg.hw.HW_mstpProtection.HW_AtmProtectGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAtmProtectGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPProtectionMgr_IOperations _localServant = (HW_MSTPProtectionMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllAtmProtectGroup(meName,how_many,atmPGList,pgIt);
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
