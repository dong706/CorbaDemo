package org.omg.hw.HW_securityMgr;

/**
 *	Generated from IDL interface "HW_securityMgr_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface HW_securityMgr_IOperations
	extends org.omg.hw.common.Common_IOperations
{
	/* constants */
	/* operations  */
	void modifyPassword(java.lang.String userName, java.lang.String oldPassword, java.lang.String newPassword) throws org.omg.hw.globaldefs.ProcessingFailureException;
}
