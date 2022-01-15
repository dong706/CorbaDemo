package org.omg.zx.mLSNPPLink;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MLSNPPLinkMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MLSNPPLinkMgr_IPOATie
	extends MLSNPPLinkMgr_IPOA
{
	private MLSNPPLinkMgr_IOperations _delegate;

	private POA _poa;
	public MLSNPPLinkMgr_IPOATie(MLSNPPLinkMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPLinkMgr_IPOATie(MLSNPPLinkMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_I _this()
	{
		return org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.mLSNPPLink.MLSNPPLinkMgr_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPLinkMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPLinkMgr_IOperations delegate)
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
	public void getAvailableCapacity(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, short layerRate, org.omg.zx.mLSNPPLink.AvailableCapacity_THolder availableCapacity) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getAvailableCapacity(mLSNPPLinkName,layerRate,availableCapacity);
	}

	public void modifySignallingProtocolParameters(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.omg.zx.globaldefs.NVSList_THolder signallingParameters) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.modifySignallingProtocolParameters(mLSNPPLinkName,signallingParameters);
	}

	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void assignSignallingController(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingControllerIdentifier) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.assignSignallingController(mLSNPPLinkName,signallingControllerIdentifier);
	}

	public void setTNANameForMLSNPPLinkEnd(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, org.omg.zx.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.omg.zx.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String aTNAName, java.lang.String zTNAName, java.lang.String aTNAGroupName, java.lang.String zTNAGroupName, org.omg.zx.mLSNPPLink.MultiLayerSNPPLink_THolder multiLayerSNPPLink) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setTNANameForMLSNPPLinkEnd(mLSNPPLinkName,sNPTNADataList,sNPPTNAPairList,aTNAName,zTNAName,aTNAGroupName,zTNAGroupName,multiLayerSNPPLink);
	}

	public void enableSignalling(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.enableSignalling(mLSNPPLinkName);
	}

	public void setSignallingProtocolAndParameters(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName, java.lang.String signallingProtocol, org.omg.zx.globaldefs.NameAndStringValue_T[] signallingParameters) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setSignallingProtocolAndParameters(mLSNPPLinkName,signallingProtocol,signallingParameters);
	}

	public void deassignSignallingController(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.deassignSignallingController(mLSNPPLinkName);
	}

	public void disableSignalling(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPLinkName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.disableSignalling(mLSNPPLinkName);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
