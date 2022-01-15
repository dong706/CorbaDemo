package org.omg.hw.trailNtwProtection;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TrailNtwProtMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TrailNtwProtMgr_IPOATie
	extends TrailNtwProtMgr_IPOA
{
	private TrailNtwProtMgr_IOperations _delegate;

	private POA _poa;
	public TrailNtwProtMgr_IPOATie(TrailNtwProtMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TrailNtwProtMgr_IPOATie(TrailNtwProtMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.trailNtwProtection.TrailNtwProtMgr_I _this()
	{
		return org.omg.hw.trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.trailNtwProtection.TrailNtwProtMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.trailNtwProtection.TrailNtwProtMgr_IHelper.narrow(_this_object(orb));
	}
	public TrailNtwProtMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TrailNtwProtMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		else
		{
			return super._default_POA();
		}
	}
	public void deleteTrailNtwProtection(org.omg.hw.globaldefs.NameAndStringValue_T[] tnpName, boolean keepPGs, org.omg.hw.globaldefs.NameAndStringValue_T[] swapTPname, org.omg.hw.globaldefs.NVSList_THolder additionalInfo, org.omg.hw.protection.ProtectionGroupList_THolder deletedPGList, org.omg.hw.trailNtwProtection.TrailNtwProtection_THolder deletedTNP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.deleteTrailNtwProtection(tnpName,keepPGs,swapTPname,additionalInfo,deletedPGList,deletedTNP,errorReason);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void createTrailNtwProtection(org.omg.hw.trailNtwProtection.TrailNtwProtCreateData_T tnpCreateData, org.omg.hw.trailNtwProtection.TrailNtwProtection_THolder theTNP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.createTrailNtwProtection(tnpCreateData,theTNP,errorReason);
	}

	public void getTrailNtwProtection(org.omg.hw.globaldefs.NameAndStringValue_T[] tnpName, org.omg.hw.trailNtwProtection.TrailNtwProtection_THolder trailNtwProtection) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getTrailNtwProtection(tnpName,trailNtwProtection);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllTrailNtwProtections(org.omg.hw.globaldefs.NameAndStringValue_T[] resourceName, int how_many, org.omg.hw.trailNtwProtection.TrailNtwProtectionList_THolder tnpList, org.omg.hw.trailNtwProtection.TrailNtwProtectionIterator_IHolder tnpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllTrailNtwProtections(resourceName,how_many,tnpList,tnpIt);
	}

	public void modifyTrailNtwProtection(org.omg.hw.globaldefs.NameAndStringValue_T[] tnpName, org.omg.hw.trailNtwProtection.TrailNtwProtModifyData_T tnpModifyData, org.omg.hw.trailNtwProtection.TrailNtwProtection_THolder modifiedTNP, org.omg.CORBA.StringHolder errorReason) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.modifyTrailNtwProtection(tnpName,tnpModifyData,modifiedTNP,errorReason);
	}

	public void performTrailNtwProtectionCommand(org.omg.hw.protection.ProtectionCommand_T protectionCommand, org.omg.hw.globaldefs.NameAndStringValue_T[] tnpName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupAName, org.omg.hw.globaldefs.NameAndStringValue_T[] protectionGroupZName, org.omg.hw.globaldefs.NameAndStringValue_T[][][] workerTrailList, org.omg.hw.globaldefs.NameAndStringValue_T[][] protectionTrail) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.performTrailNtwProtectionCommand(protectionCommand,tnpName,protectionGroupAName,protectionGroupZName,workerTrailList,protectionTrail);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}
