package org.omg.zx.fileTransfer;

/**
 *	Generated from IDL interface "FileTransferMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface FileTransferMgr_IOperations
	extends org.omg.zx.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void requireFileTransfer(org.omg.zx.fileTransfer.FTPFileType_T fileType, java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.CORBA.Any queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void requireXMLFileTransfer(java.lang.String fileType, java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.CORBA.Any queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void requireXMLFileTransferExt(java.lang.String fileType, java.lang.String destination, java.lang.String userName, java.lang.String passWord) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void requireFileTransferExt(org.omg.zx.fileTransfer.FTPFileType_T fileType, java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.CORBA.Any queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void requireHistoryPMFileTransfer(java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.zx.performance.QueryPMFilter_T queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException;
	void requireHistoryAlarmFileTransfer(java.lang.String destination, java.lang.String userName, java.lang.String passWord, org.omg.zx.alarmMgr.QueryAlarmFilter_T queryCondition) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
