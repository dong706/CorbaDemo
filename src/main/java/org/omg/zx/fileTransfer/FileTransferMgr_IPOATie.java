package org.omg.zx.fileTransfer;

import org.omg.PortableServer.POA;

/**
 *	Generated from IDL interface "FileTransferMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */

public class FileTransferMgr_IPOATie
	extends FileTransferMgr_IPOA
{
	private FileTransferMgr_IOperations _delegate;

	private POA _poa;
	public FileTransferMgr_IPOATie(FileTransferMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public FileTransferMgr_IPOATie(FileTransferMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public org.omg.zx.fileTransfer.FileTransferMgr_I _this()
	{
		return org.omg.zx.fileTransfer.FileTransferMgr_IHelper.narrow(_this_object());
	}
	public org.omg.zx.fileTransfer.FileTransferMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return org.omg.zx.fileTransfer.FileTransferMgr_IHelper.narrow(_this_object(orb));
	}
	public FileTransferMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(FileTransferMgr_IOperations delegate)
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
	public void setLocation(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void setNativeEMSName(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void requireFileTransfer(org.omg.zx.fileTransfer.FTPFileType_T fileType, java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.CORBA.Any queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.requireFileTransfer(fileType,destination,userName,passWord,queryCondition);
	}

	public void requireHistoryAlarmFileTransfer(java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.zx.alarmMgr.QueryAlarmFilter_T queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.requireHistoryAlarmFileTransfer(destination,userName,passWord,queryCondition);
	}

	public void requireXMLFileTransferExt(java.lang.String fileType, java.lang.String destination, java.lang.String userName, java.lang.String passWord) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.requireXMLFileTransferExt(fileType,destination,userName,passWord);
	}

	public void requireXMLFileTransfer(java.lang.String fileType, java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.CORBA.Any queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.requireXMLFileTransfer(fileType,destination,userName,passWord,queryCondition);
	}

	public void setUserLabel(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void requireHistoryPMFileTransfer(java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.zx.performance.QueryPMFilter_T queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.requireHistoryPMFileTransfer(destination,userName,passWord,queryCondition);
	}

	public void setAdditionalInfo(org.omg.zx.globaldefs.NameAndStringValue_T[] objectName, org.omg.zx.globaldefs.NVSList_THolder additionalInfo) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void getCapabilities(org.omg.zx.common.CapabilityList_THolder capabilities) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void requireFileTransferExt(org.omg.zx.fileTransfer.FTPFileType_T fileType, java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.CORBA.Any queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException
	{
_delegate.requireFileTransferExt(fileType,destination,userName,passWord,queryCondition);
	}

}
