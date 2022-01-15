package org.omg.zx.emsSessionFactory;

/**
 *	Generated from IDL interface "EmsSessionFactory_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface EmsSessionFactory_IOperations
{
	/* constants */
	/* operations  */
	void getEmsSession(java.lang.String user, java.lang.String password, org.omg.zx.nmsSession.NmsSession_I client, org.omg.zx.emsSession.EmsSession_IHolder emsSessionInterface) throws org.omg.zx.globaldefs.ProcessingFailureException;
}
