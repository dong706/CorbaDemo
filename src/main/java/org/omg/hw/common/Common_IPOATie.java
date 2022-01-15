package org.omg.hw.common;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "Common_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class Common_IPOATie
	extends Common_IPOA
{
	private Common_IOperations _delegate;

	private POA _poa;
	public Common_IPOATie(Common_IOperations delegate)
	{
		_delegate = delegate;
	}
	public Common_IPOATie(Common_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.hw.common.Common_I _this()
	{
		return org.omg.hw.common.Common_IHelper.narrow(_this_object());
	}
	public org.omg.hw.common.Common_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.hw.common.Common_IHelper.narrow(_this_object(orb));
	}
	public Common_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(Common_IOperations delegate)
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
	public void setNativeEMSName(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setAdditionalInfo(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, org.omg.hw.globaldefs.NVSList_THolder additionalInfo) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setUserLabel(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setOwner(org.omg.hw.globaldefs.NameAndStringValue_T[] objectName, java.lang.String owner) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.setOwner(objectName,owner);
	}

	public void getCapabilities(org.omg.hw.common.CapabilityList_THolder capabilities) throws org.omg.hw.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

}
