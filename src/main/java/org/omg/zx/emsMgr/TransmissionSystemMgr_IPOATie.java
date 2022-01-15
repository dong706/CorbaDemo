package org.omg.zx.emsMgr;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "TransmissionSystemMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class TransmissionSystemMgr_IPOATie
	extends TransmissionSystemMgr_IPOA
{
	private TransmissionSystemMgr_IOperations _delegate;

	private POA _poa;
	public TransmissionSystemMgr_IPOATie(TransmissionSystemMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public TransmissionSystemMgr_IPOATie(TransmissionSystemMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.emsMgr.TransmissionSystemMgr_I _this()
	{
		return org.omg.zx.emsMgr.TransmissionSystemMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.emsMgr.TransmissionSystemMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.emsMgr.TransmissionSystemMgr_IHelper.narrow(_this_object(orb));
	}
	public TransmissionSystemMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(TransmissionSystemMgr_IOperations delegate)
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

	public void getTransmissionSytems(org.omg.zx.globaldefs.NameAndStringValue_T[][] nameList, org.omg.zx.emsMgr.TransmissionSystemList_THolder transmissionSystemList) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getTransmissionSytems(nameList,transmissionSystemList);
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

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

}
