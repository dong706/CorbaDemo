package org.omg.hw.flowDomain_cmcc;


/**
 *	Generated from IDL interface "FlowDomainMgr_cmcc_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class _FlowDomainMgr_cmcc_IStub
	extends org.omg.CORBA.portable.ObjectImpl
	implements org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_I
{
	private String[] ids = {"IDL:mtnm.tmforum.org/flowDomain_cmcc/FlowDomainMgr_cmcc_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public String[] _ids()
	{
		return ids;
	}

	public final static java.lang.Class _opsClass = org.omg.hw.flowDomain_cmcc.FlowDomainMgr_cmcc_IOperations.class;
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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

	public void createAndActivateFDFr(org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T createData, org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.globaldefs.NameAndStringValue_T[][] aEnd, org.omg.hw.globaldefs.NameAndStringValue_T[][] zEnd, org.omg.hw.globaldefs.NamingAttributesList_THolder internalTPs, org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder mfdfrs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, org.omg.hw.globaldefs.NamingAttributesList_THolder notConnectableCPTPList, org.omg.hw.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createAndActivateFDFr", true);
				org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_THelper.write(_os,createData);
				org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_THelper.write(_os,connectivityRequirement);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,aEnd);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,zEnd);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,internalTPs.value);
				org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THelper.write(_os,mfdfrs.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				internalTPs.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				mfdfrs.value = org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THelper.read(_is);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theFDFr.value = org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createAndActivateFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.createAndActivateFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,notConnectableCPTPList,parameterProblemsTPList,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FDFrModifyData_T fdfrModifyData, org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.globaldefs.NamingAttributesList_THolder failedTPList, org.omg.hw.globaldefs.NamingAttributesList_THolder parameterProblemsTPList, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder newFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
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
				org.omg.hw.flowDomainFragment_cmcc.FDFrModifyData_THelper.write(_os,fdfrModifyData);
				org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_THelper.write(_os,connectivityRequirement);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				failedTPList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				parameterProblemsTPList.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				newFDFr.value = org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.read(_is);
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.modifyFDFr(fdfrName,fdfrModifyData,connectivityRequirement,tpsToModify,failedTPList,parameterProblemsTPList,newFDFr,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrRoute(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FDFrRoute_THolder route) throws org.omg.hw.globaldefs.ProcessingFailureException
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
				_is = _invoke(_os);
				route.value = org.omg.hw.flowDomainFragment_cmcc.FDFrRoute_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrRoute(fdfrName,route);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllAssociatedMFDs(org.omg.hw.globaldefs.NameAndStringValue_T[] tmdOrFdName, int how_many, org.omg.hw.flowDomain_cmcc.MFDList_THolder mfds, org.omg.hw.flowDomain_cmcc.MFDIterator_IHolder mfdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAssociatedMFDs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,tmdOrFdName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mfds.value = org.omg.hw.flowDomain_cmcc.MFDList_THelper.read(_is);
				mfdIt.value = org.omg.hw.flowDomain_cmcc.MFDIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAssociatedMFDs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAllAssociatedMFDs(tmdOrFdName,how_many,mfds,mfdIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createFlowDomain(org.omg.hw.flowDomain_cmcc.FDCreateData_T createData, org.omg.hw.globaldefs.NamingAttributesList_THolder assignedCPTPs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomain_cmcc.FlowDomain_THolder theFD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createFlowDomain", true);
				org.omg.hw.flowDomain_cmcc.FDCreateData_THelper.write(_os,createData);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,assignedCPTPs.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				assignedCPTPs.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theFD.value = org.omg.hw.flowDomain_cmcc.FlowDomain_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.createFlowDomain(createData,assignedCPTPs,tpsToModify,theFD,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
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
				fdfr.value = org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getFDFr(fdfrName,fdfr);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain_cmcc.CPTP_Role_T cptpRole, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder cptpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllCPTPs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				org.omg.hw.flowDomain_cmcc.CPTP_Role_THelper.write(_os,cptpRole);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				cptpList.value = org.omg.hw.terminationPoint.TerminationPointList_THelper.read(_is);
				cptpIt.value = org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllCPTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAllCPTPs(fdName,cptpRole,how_many,cptpList,cptpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
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
				fdfr.value = org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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

	public void unassignCPTPsFromMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "unassignCPTPsFromMFD", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "unassignCPTPsFromMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.unassignCPTPsFromMFD(mfdName,tpNames,tpsToModify,errorReason);
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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

	public void getMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder mfd) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getMFD", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdName);
				_is = _invoke(_os);
				mfd.value = org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getMFD(mfdName,mfd);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain_cmcc.FDModifyData_T fdModifyData, org.omg.hw.flowDomain_cmcc.FlowDomain_THolder modifiedFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyFlowDomain", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				org.omg.hw.flowDomain_cmcc.FDModifyData_THelper.write(_os,fdModifyData);
				_is = _invoke(_os);
				modifiedFD.value = org.omg.hw.flowDomain_cmcc.FlowDomain_THelper.read(_is);
				failedAttributes.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.modifyFlowDomain(fdName,fdModifyData,modifiedFD,failedAttributes,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAssociatingFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain_cmcc.FlowDomain_THolder flowDomain) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAssociatingFD", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdName);
				_is = _invoke(_os);
				flowDomain.value = org.omg.hw.flowDomain_cmcc.FlowDomain_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAssociatingFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAssociatingFD(mfdName,flowDomain);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.flowDomain_cmcc.FlowDomain_THolder flowDomain) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFlowDomain", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				_is = _invoke(_os);
				flowDomain.value = org.omg.hw.flowDomain_cmcc.FlowDomain_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getFlowDomain(fdName,flowDomain);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllFDFrs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, int how_many, short[] connectivityRateList, org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder fdfrList, org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
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
				org.omg.hw.transmissionParameters.LayerRateList_THelper.write(_os,connectivityRateList);
				_is = _invoke(_os);
				fdfrList.value = org.omg.hw.flowDomainFragment_cmcc.FDFrList_THelper.read(_is);
				fdfrIt.value = org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAllFDFrs(fdName,how_many,connectivityRateList,fdfrList,fdfrIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void activateFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder fdfr) throws org.omg.hw.globaldefs.ProcessingFailureException
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
				fdfr.value = org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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

	public void getAllAssignableCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder cptpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAssignableCPTPs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				cptpList.value = org.omg.hw.terminationPoint.TerminationPointList_THelper.read(_is);
				cptpIt.value = org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAssignableCPTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAllAssignableCPTPs(mfdName,how_many,cptpList,cptpIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createFTP(org.omg.hw.flowDomain_cmcc.FTPCreateData_T createData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.terminationPoint.TerminationPoint_THolder theFTP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createFTP", true);
				org.omg.hw.flowDomain_cmcc.FTPCreateData_THelper.write(_os,createData);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theFTP.value = org.omg.hw.terminationPoint.TerminationPoint_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createFTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.createFTP(createData,tpsToModify,theFTP,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllSupportedMFDs(org.omg.hw.globaldefs.NameAndStringValue_T[] holderName, int how_many, org.omg.hw.flowDomain_cmcc.MFDList_THolder mfds, org.omg.hw.flowDomain_cmcc.MFDIterator_IHolder mfdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllSupportedMFDs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,holderName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				mfds.value = org.omg.hw.flowDomain_cmcc.MFDList_THelper.read(_is);
				mfdIt.value = org.omg.hw.flowDomain_cmcc.MFDIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllSupportedMFDs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAllSupportedMFDs(holderName,how_many,mfds,mfdIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createFDFr(org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_T createData, org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_T connectivityRequirement, org.omg.hw.subnetworkConnection.TPData_T[] aEnd, org.omg.hw.subnetworkConnection.TPData_T[] zEnd, org.omg.hw.globaldefs.NamingAttributesList_THolder internalTPs, org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THolder mfdfrs, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createFDFr", true);
				org.omg.hw.flowDomainFragment_cmcc.FDFrCreateData_THelper.write(_os,createData);
				org.omg.hw.flowDomain_cmcc.ConnectivityRequirement_THelper.write(_os,connectivityRequirement);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,aEnd);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,zEnd);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,internalTPs.value);
				org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THelper.write(_os,mfdfrs.value);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				internalTPs.value = org.omg.hw.globaldefs.NamingAttributesList_THelper.read(_is);
				mfdfrs.value = org.omg.hw.flowDomainFragment_cmcc.MatrixFlowDomainFragmentList_THelper.read(_is);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theFDFr.value = org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.read(_is);
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.createFDFr(createData,connectivityRequirement,aEnd,zEnd,internalTPs,mfdfrs,tpsToModify,theFDFr,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFlowDomainsByUserLabel(java.lang.String userLabel, org.omg.hw.flowDomain_cmcc.FDList_THolder flowDomains) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getFlowDomainsByUserLabel", true);
				_os.write_string(userLabel);
				_is = _invoke(_os);
				flowDomains.value = org.omg.hw.flowDomain_cmcc.FDList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getFlowDomainsByUserLabel", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getFlowDomainsByUserLabel(userLabel,flowDomains);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllAssignedCPTPs(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, int how_many, org.omg.hw.terminationPoint.TerminationPointList_THolder cptpList, org.omg.hw.terminationPoint.TerminationPointIterator_IHolder cptpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllAssignedCPTPs", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdName);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				cptpList.value = org.omg.hw.terminationPoint.TerminationPointList_THelper.read(_is);
				cptpIt.value = org.omg.hw.terminationPoint.TerminationPointIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllAssignedCPTPs", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAllAssignedCPTPs(mfdName,how_many,cptpList,cptpIt);
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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

	public void deleteFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName) throws org.omg.hw.globaldefs.ProcessingFailureException
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.deleteFDFr(fdfrName);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteMFD", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdName);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.deleteMFD(mfdName,tpsToModify,errorReason);
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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

	public void associateCPTPsWithFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] cptpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "associateCPTPsWithFlowDomain", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,cptpNames);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "associateCPTPsWithFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.associateCPTPsWithFlowDomain(fdName,cptpNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void modifyMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.flowDomain_cmcc.MFDModifyData_T mfdModifyData, org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder newMFD, org.omg.CORBA.StringHolder failedAttributes, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "modifyMFD", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdName);
				org.omg.hw.flowDomain_cmcc.MFDModifyData_THelper.write(_os,mfdModifyData);
				_is = _invoke(_os);
				newMFD.value = org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THelper.read(_is);
				failedAttributes.value = _is.read_string();
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "modifyMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.modifyMFD(mfdName,mfdModifyData,newMFD,failedAttributes,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrsByUserLabel(java.lang.String userLabel, org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder fdfrs) throws org.omg.hw.globaldefs.ProcessingFailureException
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
				fdfrs.value = org.omg.hw.flowDomainFragment_cmcc.FDFrList_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getFDFrsByUserLabel(userLabel,fdfrs);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAssigningMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] cptpName, org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder mfd) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAssigningMFD", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,cptpName);
				_is = _invoke(_os);
				mfd.value = org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAssigningMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAssigningMFD(cptpName,mfd);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deleteFTP(org.omg.hw.globaldefs.NameAndStringValue_T[] ftpName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteFTP", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,ftpName);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFTP", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.deleteFTP(ftpName,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getAllTopologicalLinksOfFD(org.omg.hw.globaldefs.NameAndStringValue_T[] flowDomainName, int how_many, org.omg.hw.topologicalLink.TopologicalLinkList_THolder topoList, org.omg.hw.topologicalLink.TopologicalLinkIterator_IHolder topoIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllTopologicalLinksOfFD", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,flowDomainName);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllTopologicalLinksOfFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAllTopologicalLinksOfFD(flowDomainName,how_many,topoList,topoIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deactivateAndDeleteFDFr(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THolder theFDFr, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deactivateAndDeleteFDFr", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdfrName);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theFDFr.value = org.omg.hw.flowDomainFragment_cmcc.FlowDomainFragment_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deactivateAndDeleteFDFr", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.deactivateAndDeleteFDFr(fdfrName,tpsToModify,theFDFr,errorReason);
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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

	public void getAllFlowDomains(int how_many, org.omg.hw.flowDomain_cmcc.FDList_THolder flowDomains, org.omg.hw.flowDomain_cmcc.FDIterator_IHolder fdIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "getAllFlowDomains", true);
				_os.write_ulong(how_many);
				_is = _invoke(_os);
				flowDomains.value = org.omg.hw.flowDomain_cmcc.FDList_THelper.read(_is);
				fdIt.value = org.omg.hw.flowDomain_cmcc.FDIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
					throw new RuntimeException("Unexpected exception " + _id );
			}
			finally
			{
				this._releaseReply(_is);
			}
		}
		else
		{
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "getAllFlowDomains", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.getAllFlowDomains(how_many,flowDomains,fdIt);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void createMFD(org.omg.hw.flowDomain_cmcc.MFDCreateData_T createData, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THolder theMFD, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "createMFD", true);
				org.omg.hw.flowDomain_cmcc.MFDCreateData_THelper.write(_os,createData);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
				theMFD.value = org.omg.hw.flowDomain_cmcc.MatrixFlowDomain_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "createMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.createMFD(createData,tpsToModify,theMFD,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void associateMFDsWithFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfdNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "associateMFDsWithFlowDomain", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,mfdNames);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "associateMFDsWithFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.associateMFDsWithFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deAssociateMFDsFromFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] mfdNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deAssociateMFDsFromFlowDomain", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,mfdNames);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deAssociateMFDsFromFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.deAssociateMFDsFromFlowDomain(fdName,mfdNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void deAssociateCPTPsFromFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deAssociateCPTPsFromFlowDomain", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deAssociateCPTPsFromFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.deAssociateCPTPsFromFlowDomain(fdName,tpNames,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void getFDFrsWithTP(org.omg.hw.globaldefs.NameAndStringValue_T[] cptpName, int how_many, org.omg.hw.flowDomainFragment_cmcc.FDFrList_THolder fdfrList, org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHolder fdfrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
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
				fdfrList.value = org.omg.hw.flowDomainFragment_cmcc.FDFrList_THelper.read(_is);
				fdfrIt.value = org.omg.hw.flowDomainFragment_cmcc.FDFrIterator_IHelper.read(_is);
				return;
			}
			catch( org.omg.CORBA.portable.RemarshalException _rx ){}
			catch( org.omg.CORBA.portable.ApplicationException _ax )
			{
				String _id = _ax.getId();
				if( _id.equals("IDL:mtnm.tmforum.org/globaldefs/ProcessingFailureException:1.0"))
				{
					throw org.omg.hw.globaldefs.ProcessingFailureExceptionHelper.read(_ax.getInputStream());
				}
				else 
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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
				org.omg.hw.flowDomain_cmcc.ParameterGroupsList_THelper.write(_os,filter);
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
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
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

	public void deleteFlowDomain(org.omg.hw.globaldefs.NameAndStringValue_T[] fdName, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "deleteFlowDomain", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,fdName);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "deleteFlowDomain", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.deleteFlowDomain(fdName,tpsToModify,errorReason);
			}
			finally
			{
				_servant_postinvoke(_so);
			}
			return;
		}

		}

	}

	public void assignCPTPsToMFD(org.omg.hw.globaldefs.NameAndStringValue_T[] mfdName, org.omg.hw.globaldefs.NameAndStringValue_T[][] tpNames, org.omg.hw.subnetworkConnection.TPDataList_THolder tpsToModify, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
		while(true)
		{
		if(! this._is_local())
		{
			org.omg.CORBA.portable.InputStream _is = null;
			try
			{
				org.omg.CORBA.portable.OutputStream _os = _request( "assignCPTPsToMFD", true);
				org.omg.hw.globaldefs.NVSList_THelper.write(_os,mfdName);
				org.omg.hw.globaldefs.NamingAttributesList_THelper.write(_os,tpNames);
				org.omg.hw.subnetworkConnection.TPDataList_THelper.write(_os,tpsToModify.value);
				_is = _invoke(_os);
				tpsToModify.value = org.omg.hw.subnetworkConnection.TPDataList_THelper.read(_is);
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
			org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke( "assignCPTPsToMFD", _opsClass );
			if( _so == null )
				throw new org.omg.CORBA.UNKNOWN("local invocations not supported!");
			FlowDomainMgr_cmcc_IOperations _localServant = (FlowDomainMgr_cmcc_IOperations)_so.servant;
			try
			{
			_localServant.assignCPTPsToMFD(mfdName,tpNames,tpsToModify,errorReason);
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
