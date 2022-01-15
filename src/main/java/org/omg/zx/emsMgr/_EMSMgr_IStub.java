package org.omg.zx.emsMgr;


/**
 *	Generated from IDL interface "EMSMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _EMSMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.zx.emsMgr.EMSMgr_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.zx.emsMgr.EMSMgr_IOperations.class;
	public void getTopologicalSubnetworksByLayer(int nLayer, org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder topoSubnetworkList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTopologicalSubnetworksByLayer", true);
				_os.write_long(nLayer);
				_is = _invoke(_os);
				topoSubnetworkList.value = org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTopologicalSubnetworksByLayer", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTopologicalSubnetworksByLayer(nLayer,topoSubnetworkList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPLinksWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPLinksWithTP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,tPName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPLinksWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPLinksWithTP(tPName,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllASAPs(int how_many, org.omg.zx.aSAP.ASAPList_THolder aSAPList, org.omg.zx.aSAP.ASAPIterator_IHolder asapIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllASAPs", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				aSAPList.value = org.omg.zx.aSAP.ASAPList_THelper.read(_is);
				asapIt.value = org.omg.zx.aSAP.ASAPIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllASAPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllASAPs(how_many,aSAPList,asapIt);
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

	public void deassignASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deassignASAP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,resourceName);
				_os.write_short(layerRate);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deassignASAP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.deassignASAP(resourceName,layerRate,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTopLevelTopologicalLink(org.omg.zx.globaldefs.NameAndStringValue_T[] name, org.omg.zx.topologicalLink.TopologicalLink_THolder topoLink) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTopLevelTopologicalLink", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,name);
				_is = _invoke(_os);
				topoLink.value = org.omg.zx.topologicalLink.TopologicalLink_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTopLevelTopologicalLink", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTopLevelTopologicalLink(name,topoLink);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getVBs(org.omg.zx.globaldefs.NameAndStringValue_T[][] vbNameList, org.omg.zx.emsMgr.VBList_THolder vbList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getVBs", true);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_os,vbNameList);
				_is = _invoke(_os);
				vbList.value = org.omg.zx.emsMgr.VBList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getVBs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getVBs(vbNameList,vbList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getASAPAssociatedResourceNames(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getASAPAssociatedResourceNames", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,aSAPName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.omg.zx.globaldefs.NamingAttributesIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getASAPAssociatedResourceNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getASAPAssociatedResourceNames(aSAPName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getEthernetServices(org.omg.zx.globaldefs.NameAndStringValue_T[][] serviceNameList, org.omg.zx.emsMgr.EthernetServiceList_THolder serviceList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getEthernetServices", true);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_os,serviceNameList);
				_is = _invoke(_os);
				serviceList.value = org.omg.zx.emsMgr.EthernetServiceList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getEthernetServices", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getEthernetServices(serviceNameList,serviceList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createVLAN(java.lang.String vlanID, java.lang.String userLabel, org.omg.zx.emsMgr.LogicalPort_T[] logicalPortList, org.omg.zx.emsMgr.VLAN_THolder vlan) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createVLAN", true);
				_os.write_string(vlanID);
				_os.write_string(userLabel);
				org.omg.zx.emsMgr.LogicalPortList_THelper.write(_os,logicalPortList);
				_is = _invoke(_os);
				vlan.value = org.omg.zx.emsMgr.VLAN_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createVLAN", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.createVLAN(vlanID,userLabel,logicalPortList,vlan);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllEMSAndMEUnacknowledgedActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllEMSAndMEUnacknowledgedActiveAlarms", true);
				org.omg.zx.alarmMgr.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.omg.zx.notifications.EventList_THelper.read(_is);
				eventIt.value = org.omg.zx.notifications.EventIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllEMSAndMEUnacknowledgedActiveAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllEMSAndMEUnacknowledgedActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.aSAP.ASAPCreateModifyData_T aSAPModifyData, org.omg.zx.aSAP.ASAP_THolder newASAP, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyASAP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,aSAPName);
				org.omg.zx.aSAP.ASAPCreateModifyData_THelper.write(_os,aSAPModifyData);
				_is = _invoke(_os);
				newASAP.value = org.omg.zx.aSAP.ASAP_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyASAP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyASAP(aSAPName,aSAPModifyData,newASAP,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPsWithTNA(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPsWithTNA", true);
				org.omg.zx.mLSNPP.TNAList_THelper.write(_os,tNAList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPsWithTNA", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPsWithTNA(tNAList,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
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

	public void getAllASAPNames(int how_many, org.omg.zx.globaldefs.NamingAttributesList_THolder nameList, org.omg.zx.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllASAPNames", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				nameList.value = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_is);
				nameIt.value = org.omg.zx.globaldefs.NamingAttributesIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllASAPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllASAPNames(how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopLevelSubnetworkNames(org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelSubnetworkNames", true);
				_is = _invoke(_os);
				nameList.value = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelSubnetworkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelSubnetworkNames(nameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getVLANs(org.omg.zx.globaldefs.NameAndStringValue_T[][] vlanNameList, org.omg.zx.emsMgr.VLANList_THolder vlanList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getVLANs", true);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_os,vlanNameList);
				_is = _invoke(_os);
				vlanList.value = org.omg.zx.emsMgr.VLANList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getVLANs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getVLANs(vlanNameList,vlanList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getEMS(org.omg.zx.emsMgr.EMS_THolder emsInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
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
				emsInfo.value = org.omg.zx.emsMgr.EMS_THelper.read(_is);
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

	public void getAllMLSNPPs(boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPs", true);
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
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPs(sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createASAP(org.omg.zx.aSAP.ASAPCreateModifyData_T newASAPCreateData, org.omg.zx.aSAP.ASAP_THolder newASAP, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createASAP", true);
				org.omg.zx.aSAP.ASAPCreateModifyData_THelper.write(_os,newASAPCreateData);
				_is = _invoke(_os);
				newASAP.value = org.omg.zx.aSAP.ASAP_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createASAP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.createASAP(newASAPCreateData,newASAP,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void acknowledgeAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "acknowledgeAlarms", true);
				org.omg.zx.notifications.AlarmAndTCAIDList_THelper.write(_os,acknowledgeIDList);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,additionalInfo);
				_is = _invoke(_os);
				failedAcknowledgeIDList.value = org.omg.zx.notifications.AlarmAndTCAIDList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "acknowledgeAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.acknowledgeAlarms(acknowledgeIDList,additionalInfo,failedAcknowledgeIDList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopLevelTopologicalLinkNames(org.omg.zx.globaldefs.NamingAttributesList_THolder nameList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelTopologicalLinkNames", true);
				_is = _invoke(_os);
				nameList.value = org.omg.zx.globaldefs.NamingAttributesList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelTopologicalLinkNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelTopologicalLinkNames(nameList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopLevelSubnetworks(org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder sList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelSubnetworks", true);
				_is = _invoke(_os);
				sList.value = org.omg.zx.multiLayerSubnetwork.SubnetworkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelSubnetworks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelSubnetworks(sList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createEthernetService(org.omg.zx.emsMgr.EthernetServiceCreateData_T createData, org.omg.zx.emsMgr.EthernetService_THolder ethernetService) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createEthernetService", true);
				org.omg.zx.emsMgr.EthernetServiceCreateData_THelper.write(_os,createData);
				_is = _invoke(_os);
				ethernetService.value = org.omg.zx.emsMgr.EthernetService_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createEthernetService", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.createEthernetService(createData,ethernetService);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopLevelTopologicalLinksByIterator(int how_many, org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.zx.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelTopologicalLinksByIterator", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelTopologicalLinksByIterator", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelTopologicalLinksByIterator(how_many,topoList,topoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteVLAN(org.omg.zx.globaldefs.NameAndStringValue_T[] vlanName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteVLAN", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,vlanName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteVLAN", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteVLAN(vlanName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteVB(org.omg.zx.globaldefs.NameAndStringValue_T[] vbName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteVB", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,vbName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteVB", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteVB(vbName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getTopologicalSubnetwork(org.omg.zx.globaldefs.NameAndStringValue_T[] subnetName, org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THolder topoSubnetwork) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getTopologicalSubnetwork", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,subnetName);
				_is = _invoke(_os);
				topoSubnetwork.value = org.omg.zx.multiLayerSubnetwork.TopologicalSubnetwork_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getTopologicalSubnetwork", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getTopologicalSubnetwork(subnetName,topoSubnetwork);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void assignASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short layerRate, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "assignASAP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,aSAPName);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,resourceName);
				_os.write_short(layerRate);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "assignASAP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.assignASAP(aSAPName,resourceName,layerRate,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPLinks(boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPLinks", true);
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
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPLinks(sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getASAPbyResource(org.omg.zx.globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, org.omg.zx.aSAP.ASAPList_THolder aSAPList, org.omg.zx.aSAP.ASAPIterator_IHolder asapIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getASAPbyResource", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,resourceName);
				org.omg.zx.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				aSAPList.value = org.omg.zx.aSAP.ASAPList_THelper.read(_is);
				asapIt.value = org.omg.zx.aSAP.ASAPIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getASAPbyResource", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getASAPbyResource(resourceName,layerRateList,how_many,aSAPList,asapIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createVB(java.lang.String userLabel, java.lang.String vbID, java.lang.String cID, org.omg.zx.emsMgr.LogicalPort_T[] logicalPortList, org.omg.zx.emsMgr.VB_THolder vb) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createVB", true);
				_os.write_string(userLabel);
				_os.write_string(vbID);
				_os.write_string(cID);
				org.omg.zx.emsMgr.LogicalPortList_THelper.write(_os,logicalPortList);
				_is = _invoke(_os);
				vb.value = org.omg.zx.emsMgr.VB_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createVB", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.createVB(userLabel,vbID,cID,logicalPortList,vb);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLRAs(int how_many, org.omg.zx.multiLayerSubnetwork.SubnetworkList_THolder mLRAList, org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHolder sIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLRAs", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mLRAList.value = org.omg.zx.multiLayerSubnetwork.SubnetworkList_THelper.read(_is);
				sIt.value = org.omg.zx.multiLayerSubnetwork.SubnetworkIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLRAs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLRAs(how_many,mLRAList,sIt);
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

	public void getAllTopLevelTopologicalLinks(org.omg.zx.topologicalLink.TopologicalLinkList_THolder topoList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopLevelTopologicalLinks", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopLevelTopologicalLinks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopLevelTopologicalLinks(topoList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPsWithTP(org.omg.zx.globaldefs.NameAndStringValue_T[] tPName, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPP.MLSNPPList_THolder mLSNPPList, org.omg.zx.mLSNPP.MLSNPPIterator_IHolder mLSNPPIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPsWithTP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,tPName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPsWithTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPsWithTP(tPName,sNPListRequested,how_many,mLSNPPList,mLSNPPIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteASAP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,aSAPName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteASAP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteASAP(aSAPName,additionalInfo);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteEthernetService(org.omg.zx.globaldefs.NameAndStringValue_T[] ethernetServiceName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteEthernetService", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,ethernetServiceName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteEthernetService", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteEthernetService(ethernetServiceName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPLinksWithMLSNs(org.omg.zx.globaldefs.NameAndStringValue_T[][] mLRANames, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPLinksWithMLSNs", true);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_os,mLRANames);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPLinksWithMLSNs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPLinksWithMLSNs(mLRANames,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMLSNPPLinksWithTNAs(java.lang.String[] tNAList, boolean sNPListRequested, int how_many, org.omg.zx.mLSNPPLink.MLSNPPLinkList_THolder mLSNPPLinkList, org.omg.zx.mLSNPPLink.MLSNPPLinkIterator_IHolder mLSNPPLinkIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMLSNPPLinksWithTNAs", true);
				org.omg.zx.mLSNPP.TNAList_THelper.write(_os,tNAList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMLSNPPLinksWithTNAs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMLSNPPLinksWithTNAs(tNAList,sNPListRequested,how_many,mLSNPPLinkList,mLSNPPLinkIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllActiveAlarmsByCond(org.omg.zx.globaldefs.Duration_T raiseTimeDuration, org.omg.zx.globaldefs.NameAndStringValue_T[][] objectNameList, java.lang.String[] inludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] includeSeverityList, org.omg.zx.alarmMgr.AlarmType_T[] includeAlarmTypeList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllActiveAlarmsByCond", true);
				org.omg.zx.globaldefs.Duration_THelper.write(_os,raiseTimeDuration);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_os,objectNameList);
				org.omg.zx.alarmMgr.ProbableCauseList_THelper.write(_os,inludeProbCauseList);
				org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.write(_os,includeSeverityList);
				org.omg.zx.alarmMgr.AlarmTypeList_THelper.write(_os,includeAlarmTypeList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.omg.zx.notifications.EventList_THelper.read(_is);
				eventIt.value = org.omg.zx.notifications.EventIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllActiveAlarmsByCond", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllActiveAlarmsByCond(raiseTimeDuration,objectNameList,inludeProbCauseList,includeSeverityList,includeAlarmTypeList,how_many,eventList,eventIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getASAP(org.omg.zx.globaldefs.NameAndStringValue_T[] aSAPName, org.omg.zx.aSAP.ASAP_THolder anASAP) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getASAP", true);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,aSAPName);
				_is = _invoke(_os);
				anASAP.value = org.omg.zx.aSAP.ASAP_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getASAP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getASAP(aSAPName,anASAP);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void clearAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] clearedAlarmIDList, java.lang.String clearState, java.lang.String clearUser, java.lang.String clearTime, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedClearAlarmIDList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "clearAlarms", true);
				org.omg.zx.notifications.AlarmAndTCAIDList_THelper.write(_os,clearedAlarmIDList);
				_os.write_string(clearState);
				_os.write_string(clearUser);
				_os.write_string(clearTime);
				_is = _invoke(_os);
				failedClearAlarmIDList.value = org.omg.zx.notifications.AlarmAndTCAIDList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "clearAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.clearAlarms(clearedAlarmIDList,clearState,clearUser,clearTime,failedClearAlarmIDList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getRPRNodesStatus(org.omg.zx.globaldefs.NameAndStringValue_T[][] nodeNameList, org.omg.zx.emsMgr.RPRNodeStatusList_THolder rprnodeStatusList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getRPRNodesStatus", true);
				org.omg.zx.globaldefs.NamingAttributesList_THelper.write(_os,nodeNameList);
				_is = _invoke(_os);
				rprnodeStatusList.value = org.omg.zx.emsMgr.RPRNodeStatusList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getRPRNodesStatus", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getRPRNodesStatus(nodeNameList,rprnodeStatusList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllActiveAlarms(java.lang.String[] excludeProbCauseList, org.omg.zx.alarmMgr.PerceivedSeverity_T[] excludeSeverityList, int how_many, org.omg.zx.notifications.EventList_THolder eventList, org.omg.zx.notifications.EventIterator_IHolder eventIt) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllActiveAlarms", true);
				org.omg.zx.alarmMgr.ProbableCauseList_THelper.write(_os,excludeProbCauseList);
				org.omg.zx.alarmMgr.PerceivedSeverityList_THelper.write(_os,excludeSeverityList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				eventList.value = org.omg.zx.notifications.EventList_THelper.read(_is);
				eventIt.value = org.omg.zx.notifications.EventIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllActiveAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllActiveAlarms(excludeProbCauseList,excludeSeverityList,how_many,eventList,eventIt);
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
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
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

	public void getAllTopologicalSubnetworks(org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THolder topoSubnetworkList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalSubnetworks", true);
				_is = _invoke(_os);
				topoSubnetworkList.value = org.omg.zx.multiLayerSubnetwork.TopologicalSubnetworkList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalSubnetworks", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalSubnetworks(topoSubnetworkList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void unacknowledgeAlarms(org.omg.zx.notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, org.omg.zx.globaldefs.NameAndStringValue_T[] additionalInfo, org.omg.zx.notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "unacknowledgeAlarms", true);
				org.omg.zx.notifications.AlarmAndTCAIDList_THelper.write(_os,unacknowledgeIDList);
				org.omg.zx.globaldefs.NVSList_THelper.write(_os,additionalInfo);
				_is = _invoke(_os);
				failedunAcknowledgeIDList.value = org.omg.zx.notifications.AlarmAndTCAIDList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "unacknowledgeAlarms", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			EMSMgr_IOperations _localServant = (EMSMgr_IOperations)_so.servant;
			try
			{
			_localServant.unacknowledgeAlarms(unacknowledgeIDList,additionalInfo,failedunAcknowledgeIDList);
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
