package org.omg.zx.mLSNPP;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "MLSNPPMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class MLSNPPMgr_IPOATie
	extends MLSNPPMgr_IPOA
{
	private MLSNPPMgr_IOperations _delegate;

	private POA _poa;
	public MLSNPPMgr_IPOATie(MLSNPPMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public MLSNPPMgr_IPOATie(MLSNPPMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.mLSNPP.MLSNPPMgr_I _this()
	{
		return org.omg.zx.mLSNPP.MLSNPPMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.mLSNPP.MLSNPPMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.mLSNPP.MLSNPPMgr_IHelper.narrow(_this_object(orb));
	}
	public MLSNPPMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(MLSNPPMgr_IOperations delegate)
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
	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setTNANameForMLSNPP(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPName, org.omg.zx.mLSNPP.SNPTNAData_T[] sNPTNADataList, org.omg.zx.mLSNPP.SNPPTNAPair_T[] sNPPTNAPairList, java.lang.String tNAName, java.lang.String tNAGroupName, org.omg.zx.mLSNPP.MultiLayerSNPP_THolder multiLayerSNPP) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setTNANameForMLSNPP(mLSNPPName,sNPTNADataList,sNPPTNAPairList,tNAName,tNAGroupName,multiLayerSNPP);
	}

	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getMLSNPP(org.omg.zx.globaldefs.NameAndStringValue_T[] mLSNPPName, org.omg.zx.mLSNPP.MultiLayerSNPP_THolder theMLSNPP) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getMLSNPP(mLSNPPName,theMLSNPP);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

}
