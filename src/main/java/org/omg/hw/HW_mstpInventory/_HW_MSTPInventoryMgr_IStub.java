package org.omg.hw.HW_mstpInventory;


/**
 *	Generated from IDL interface "HW_MSTPInventoryMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _HW_MSTPInventoryMgr_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.HW_mstpInventory.HW_MSTPInventoryMgr_I
{
	private String[] ids = {"IDL:mtnm.huawei.com/HW_mstpInventory/HW_MSTPInventoryMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.HW_mstpInventory.HW_MSTPInventoryMgr_IOperations.class;
	public void getAllLinkAggregationGroups(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupList_THolder lagList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupIterator_IHolder lagIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllLinkAggregationGroups", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				lagList.value = org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupList_THelper.read(_is);
				lagIt.value = org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroupIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllLinkAggregationGroups", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllLinkAggregationGroups(meName,how_many,lagList,lagIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllVBs(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_VirtualBridgeList_THolder vbList, org.omg.hw.HW_mstpInventory.HW_VirtualBridgeIterator_IHolder vbIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllVBs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				vbList.value = org.omg.hw.HW_mstpInventory.HW_VirtualBridgeList_THelper.read(_is);
				vbIt.value = org.omg.hw.HW_mstpInventory.HW_VirtualBridgeIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllVBs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllVBs(meName,how_many,vbList,vbIt);
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
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
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

	public void getSpanningTree(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.HW_mstpInventory.HW_SpanningTree_THolder spanningTree) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getSpanningTree", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,spanningTreeName);
				_is = _invoke(_os);
				spanningTree.value = org.omg.hw.HW_mstpInventory.HW_SpanningTree_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getSpanningTree", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getSpanningTree(spanningTreeName,spanningTree);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setSTBridgeParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setSTBridgeParam", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,spanningTreeName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setSTBridgeParam", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setSTBridgeParam(spanningTreeName,paraList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setMstpEndPointShapingQueue(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setMstpEndPointShapingQueue", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				org.omg.hw.HW_mstpInventory.ShapingQueueList_THelper.write(_os,shapingQueueList.value);
				_is = _invoke(_os);
				shapingQueueList.value = org.omg.hw.HW_mstpInventory.ShapingQueueList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setMstpEndPointShapingQueue", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setMstpEndPointShapingQueue(endPointName,shapingQueueList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, short vbId, java.lang.String vbName, org.omg.hw.HW_mstpInventory.HW_VirtualBridge_THolder vb) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createVirtualBridge", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,equipmentName);
				_os.write_ushort(vbId);
				_os.write_string(vbName);
				_is = _invoke(_os);
				vb.value = org.omg.hw.HW_mstpInventory.HW_VirtualBridge_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createVirtualBridge", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.createVirtualBridge(equipmentName,vbId,vbName,vb);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, short vlanId, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createVLAN", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vbName);
				_os.write_ushort(vlanId);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,forwardTPList);
				_is = _invoke(_os);
				vlan.value = org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createVLAN", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.createVLAN(vbName,vlanId,forwardTPList,vlan);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllVLANNames(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllVLANNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vbName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllVLANNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllVLANNames(vbName,how_many,nameList,nameIt);
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
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
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

	public void getVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, org.omg.hw.HW_mstpInventory.HW_VirtualBridge_THolder vb) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getVirtualBridge", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vbName);
				_is = _invoke(_os);
				vb.value = org.omg.hw.HW_mstpInventory.HW_VirtualBridge_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getVirtualBridge", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getVirtualBridge(vbName,vb);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName, org.omg.hw.globaldefs.NameAndStringValue_T[][] qosRuleNames, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setFlow", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,flowName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,qosRuleNames);
				_is = _invoke(_os);
				flow.value = org.omg.hw.HW_mstpInventory.HW_Flow_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setFlow", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setFlow(flowName,qosRuleNames,flow);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllQosRules(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_QosRuleList_THolder qosRuleList, org.omg.hw.HW_mstpInventory.HW_QosRuleIterator_IHolder qosRuleIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllQosRules", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				qosRuleList.value = org.omg.hw.HW_mstpInventory.HW_QosRuleList_THelper.read(_is);
				qosRuleIt.value = org.omg.hw.HW_mstpInventory.HW_QosRuleIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllQosRules", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllQosRules(meName,how_many,qosRuleList,qosRuleIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFlowNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFlowNames", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFlowNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFlowNames(meName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllContainedInUseTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllContainedInUseTPNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllContainedInUseTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllContainedInUseTPNames(endPointName,layerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllLinkAggregationGroupNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllLinkAggregationGroupNames", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllLinkAggregationGroupNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllLinkAggregationGroupNames(meName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllQosRuleNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllQosRuleNames", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllQosRuleNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllQosRuleNames(meName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[][] addedBranchPortNameList, org.omg.hw.globaldefs.NameAndStringValue_T[][] deletedBranchPortNameList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyLinkAggregationGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,lagName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,addedBranchPortNameList);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,deletedBranchPortNameList);
				_is = _invoke(_os);
				lag.value = org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyLinkAggregationGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.modifyLinkAggregationGroup(lagName,paraList,addedBranchPortNameList,deletedBranchPortNameList,lag);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void addVLANForwardPort(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "addVLANForwardPort", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vlanName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,forwardTPList);
				_is = _invoke(_os);
				vlan.value = org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addVLANForwardPort", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.addVLANForwardPort(vlanName,forwardTPList,vlan);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMstpEndPoints(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointList_THolder endPointList, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointIterator_IHolder endPointIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMstpEndPoints", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				org.omg.hw.HW_mstpInventory.HW_MSTPEndPointTypeList_THelper.write(_os,typeList);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				endPointList.value = org.omg.hw.HW_mstpInventory.HW_MSTPEndPointList_THelper.read(_is);
				endPointIt.value = org.omg.hw.HW_mstpInventory.HW_MSTPEndPointIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMstpEndPoints", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMstpEndPoints(meName,typeList,how_many,endPointList,endPointIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteLinkAggregationGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,lagName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteLinkAggregationGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteLinkAggregationGroup(lagName);
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
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
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

	public void getLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.CORBA.BooleanHolder enableState) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getLCASState", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				_is = _invoke(_os);
				enableState.value = _is.read_boolean();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getLCASState", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getLCASState(endPointName,enableState);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteVLAN", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vlanName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteVLAN", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
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

	public void setVLANData(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setVLANData", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vlanName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
				_is = _invoke(_os);
				vlan.value = org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setVLANData", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setVLANData(vlanName,paraList,vlan);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getQosRule", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,qosRuleName);
				_is = _invoke(_os);
				qosRule.value = org.omg.hw.HW_mstpInventory.HW_QosRule_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getQosRule", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getQosRule(qosRuleName,qosRule);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setSTPortParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] portName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setSTPortParam", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,spanningTreeName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,portName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setSTPortParam", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setSTPortParam(spanningTreeName,portName,paraList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setQosRule", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,qosRuleName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
				_is = _invoke(_os);
				qosRule.value = org.omg.hw.HW_mstpInventory.HW_QosRule_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setQosRule", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setQosRule(qosRuleName,paraList,qosRule);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteVirtualBridge(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteVirtualBridge", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vbName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteVirtualBridge", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteVirtualBridge(vbName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFlows(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.HW_mstpInventory.HW_FlowList_THolder flowList, org.omg.hw.HW_mstpInventory.HW_FlowIterator_IHolder flowIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFlows", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				flowList.value = org.omg.hw.HW_mstpInventory.HW_FlowList_THelper.read(_is);
				flowIt.value = org.omg.hw.HW_mstpInventory.HW_FlowIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFlows", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllFlows(meName,how_many,flowList,flowIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, org.omg.hw.HW_mstpInventory.HW_QosType_T qosType, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_QosRule_THolder qosRule) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createQosRule", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,equipmentName);
				org.omg.hw.HW_mstpInventory.HW_QosType_THelper.write(_os,qosType);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
				_is = _invoke(_os);
				qosRule.value = org.omg.hw.HW_mstpInventory.HW_QosRule_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createQosRule", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.createQosRule(equipmentName,qosType,paraList,qosRule);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMstpEndPoint(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMstpEndPoint", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				_is = _invoke(_os);
				endPoint.value = org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMstpEndPoint", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMstpEndPoint(endPointName,endPoint);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllMstpEndPointNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.HW_mstpInventory.HW_MSTPEndPointType_T[] typeList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllMstpEndPointNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				org.omg.hw.HW_mstpInventory.HW_MSTPEndPointTypeList_THelper.write(_os,typeList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllMstpEndPointNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllMstpEndPointNames(meName,typeList,how_many,nameList,nameIt);
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
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
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

	public void getFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFlow", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,flowName);
				_is = _invoke(_os);
				flow.value = org.omg.hw.HW_mstpInventory.HW_Flow_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFlow", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getFlow(flowName,flow);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.HW_mstpInventory.HW_Flow_THolder flow) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createFlow", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,equipmentName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
				_is = _invoke(_os);
				flow.value = org.omg.hw.HW_mstpInventory.HW_Flow_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFlow", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.createFlow(equipmentName,paraList,flow);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] lagName, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getLinkAggregationGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,lagName);
				_is = _invoke(_os);
				lag.value = org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getLinkAggregationGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getLinkAggregationGroup(lagName,lag);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setSTProtocolParam(org.omg.hw.globaldefs.NameAndStringValue_T[] spanningTreeName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setSTProtocolParam", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,spanningTreeName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setSTProtocolParam", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setSTProtocolParam(spanningTreeName,paraList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void delVLANForwardPort(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.globaldefs.NameAndStringValue_T[][] forwardTPList, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "delVLANForwardPort", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vlanName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,forwardTPList);
				_is = _invoke(_os);
				vlan.value = org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "delVLANForwardPort", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.delVLANForwardPort(vlanName,forwardTPList,vlan);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllVBNames(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllVBNames", true);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllVBNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllVBNames(meName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getVLAN(org.omg.hw.globaldefs.NameAndStringValue_T[] vlanName, org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THolder vlan) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getVLAN", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vlanName);
				_is = _invoke(_os);
				vlan.value = org.omg.hw.HW_mstpInventory.HW_VirtualLAN_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getVLAN", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getVLAN(vlanName,vlan);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSpanningTrees(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.HW_mstpInventory.HW_SpanningTreeList_THolder spanningTreeList, org.omg.hw.HW_mstpInventory.HW_SpanningTreeIterator_IHolder spanningTreeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSpanningTrees", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,equipmentName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				spanningTreeList.value = org.omg.hw.HW_mstpInventory.HW_SpanningTreeList_THelper.read(_is);
				spanningTreeIt.value = org.omg.hw.HW_mstpInventory.HW_SpanningTreeIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSpanningTrees", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSpanningTrees(equipmentName,how_many,spanningTreeList,spanningTreeIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getMstpEndPointShapingQueue(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.ShapingQueueList_THolder shapingQueueList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMstpEndPointShapingQueue", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				_is = _invoke(_os);
				shapingQueueList.value = org.omg.hw.HW_mstpInventory.ShapingQueueList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMstpEndPointShapingQueue", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getMstpEndPointShapingQueue(endPointName,shapingQueueList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteFlow(org.omg.hw.globaldefs.NameAndStringValue_T[] flowName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteFlow", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,flowName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFlow", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteFlow(flowName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAvailablePortNames(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAvailablePortNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,equipmentName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAvailablePortNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAvailablePortNames(equipmentName,how_many,nameList,nameIt);
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
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
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

	public void getAllVLANs(org.omg.hw.globaldefs.NameAndStringValue_T[] vbName, int how_many, org.omg.hw.HW_mstpInventory.HW_VirtualLANList_THolder vlanList, org.omg.hw.HW_mstpInventory.HW_VirtualLANIterator_IHolder vlanIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllVLANs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,vbName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				vlanList.value = org.omg.hw.HW_mstpInventory.HW_VirtualLANList_THelper.read(_is);
				vlanIt.value = org.omg.hw.HW_mstpInventory.HW_VirtualLANIterator_IHelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllVLANs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllVLANs(vbName,how_many,vlanList,vlanIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllContainedCurrentTPNames(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, short[] layerRateList, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllContainedCurrentTPNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,layerRateList);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllContainedCurrentTPNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllContainedCurrentTPNames(endPointName,layerRateList,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createLinkAggregationGroup(org.omg.hw.globaldefs.NameAndStringValue_T[] meName, org.omg.hw.globaldefs.NameAndStringValue_T[] paraList, org.omg.hw.globaldefs.NameAndStringValue_T[] mainPortName, org.omg.hw.globaldefs.NameAndStringValue_T[][] branchPortNameList, org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THolder lag) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createLinkAggregationGroup", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,meName);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,paraList);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mainPortName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,branchPortNameList);
				_is = _invoke(_os);
				lag.value = org.omg.hw.HW_mstpInventory.HW_LinkAggregationGroup_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createLinkAggregationGroup", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.createLinkAggregationGroup(meName,paraList,mainPortName,branchPortNameList,lag);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteQosRule(org.omg.hw.globaldefs.NameAndStringValue_T[] qosRuleName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteQosRule", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,qosRuleName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteQosRule", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.deleteQosRule(qosRuleName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setMstpEndPoint(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.transmissionParameters.LayeredParameters_T[] paraList, org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THolder endPoint) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setMstpEndPoint", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				org.omg.hw.transmissionParameters.LayeredParameterList_THelper.write(_os,paraList);
				_is = _invoke(_os);
				endPoint.value = org.omg.hw.HW_mstpInventory.HW_MSTPEndPoint_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setMstpEndPoint", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setMstpEndPoint(endPointName,paraList,endPoint);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void delBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.terminationPoint.Directionality_T bindingDirect, org.omg.hw.globaldefs.NameAndStringValue_T[][] pathList, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "delBindingPath", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				org.omg.hw.terminationPoint.Directionality_THelper.write(_os,bindingDirect);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,pathList);
				_is = _invoke(_os);
				bindingPathList.value = org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "delBindingPath", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.delBindingPath(endPointName,bindingDirect,pathList,bindingPathList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getBindingPath", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				_is = _invoke(_os);
				bindingPathList.value = org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getBindingPath", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getBindingPath(endPointName,bindingPathList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void addBindingPath(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, org.omg.hw.terminationPoint.Directionality_T bindingDirect, org.omg.hw.globaldefs.NameAndStringValue_T[][] pathList, org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THolder bindingPathList) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "addBindingPath", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
				org.omg.hw.terminationPoint.Directionality_THelper.write(_os,bindingDirect);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,pathList);
				_is = _invoke(_os);
				bindingPathList.value = org.omg.hw.HW_mstpInventory.HW_MSTPBindingPathList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "addBindingPath", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.addBindingPath(endPointName,bindingDirect,pathList,bindingPathList);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSpanningTreeNames(org.omg.hw.globaldefs.NameAndStringValue_T[] equipmentName, int how_many, org.omg.hw.globaldefs.NamingAttributesList_THolder nameList, org.omg.hw.globaldefs.NamingAttributesIterator_IHolder nameIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSpanningTreeNames", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,equipmentName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSpanningTreeNames", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.getAllSpanningTreeNames(equipmentName,how_many,nameList,nameIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void setLCASState(org.omg.hw.globaldefs.NameAndStringValue_T[] endPointName, boolean enableState) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "setLCASState", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,endPointName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "setLCASState", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			HW_MSTPInventoryMgr_IOperations _localServant = (HW_MSTPInventoryMgr_IOperations)_so.servant;
			try
			{
			_localServant.setLCASState(endPointName,enableState);
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
