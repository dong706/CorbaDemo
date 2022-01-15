package org.omg.zx.session;

/**
 *	Generated from IDL interface "Session_I"
 *	@author JacORB IDL compiler V 2.2.3, 10-Dec-2005
 */


public interface Session_IOperations
{
	/* constants */
	/* operations  */
	org.omg.zx.session.Session_I associatedSession();
	void ping();
	void endSession(int sessionID);
}
