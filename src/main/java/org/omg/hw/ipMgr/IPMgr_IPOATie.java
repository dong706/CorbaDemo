package org.omg.hw.ipMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "IPMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class IPMgr_IPOATie
	extends IPMgr_IPOA
{
	private IPMgr_IOperations _delegate;

	private POA _poa;
	public IPMgr_IPOATie(IPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public IPMgr_IPOATie(IPMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.ipMgr.IPMgr_I _this()
	{
		return org.omg.hw.ipMgr.IPMgr_IHelper.narrow(_this_object());
	}
	public org.omg.hw.ipMgr.IPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.ipMgr.IPMgr_IHelper.narrow(_this_object(orb));
	}
	public IPMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(IPMgr_IOperations delegate)
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
	public void getAllStaticRoutings(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.StaticRoutingList_THolder srList, org.omg.hw.ipMgr.StaticRoutingIterator_IHolder srIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllStaticRoutings(managedElementName,how_many,srList,srIt);
	}

	public void getAllBridges(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.BridgeList_THolder bridgeList, org.omg.hw.ipMgr.BridgeIterator_IHolder bridgeIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllBridges(managedElementName,how_many,bridgeList,bridgeIt);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllVRRPs(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.VRRPList_THolder vrrpList, org.omg.hw.ipMgr.VRRPIterator_IHolder vrrpIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllVRRPs(managedElementName,how_many,vrrpList,vrrpIt);
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

	public void getAllVRFs(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.VRFList_THolder vrfList, org.omg.hw.ipMgr.VRFIterator_IHolder vrfIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllVRFs(managedElementName,how_many,vrfList,vrfIt);
	}

	public void getAllFRRs(org.omg.hw.globaldefs.NameAndStringValue_T[] managedElementName, int how_many, org.omg.hw.ipMgr.FRRList_THolder frrList, org.omg.hw.ipMgr.FRRIterator_IHolder frrIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getAllFRRs(managedElementName,how_many,frrList,frrIt);
	}

	public void getFDFrVRFs(org.omg.hw.globaldefs.NameAndStringValue_T[] fdfrName, int how_many, org.omg.hw.ipMgr.VRFList_THolder vrfList, org.omg.hw.ipMgr.VRFIterator_IHolder vrfIt) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getFDFrVRFs(fdfrName,how_many,vrfList,vrfIt);
	}

	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

}
