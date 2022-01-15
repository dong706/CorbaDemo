package org.omg.hw.transmissionDescriptor;

/**
 *	Generated from IDL definition of union "TPorMFDorFDFr_T"
 *	@author JacORB IDL compiler 
 */

public final class TPorMFDorFDFr_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator;
	private org.omg.hw.terminationPoint.TerminationPoint_T tp;
	private org.omg.hw.flowDomain.MatrixFlowDomain_T mfd;
	private org.omg.hw.flowDomainFragment.FlowDomainFragment_T fdfr;

	public TPorMFDorFDFr_T ()
	{
	}

	public org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T discriminator ()
	{
		return discriminator;
	}

	public org.omg.hw.terminationPoint.TerminationPoint_T tp ()
	{
		if (discriminator != org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP)
			throw new org.omg.CORBA.BAD_OPERATION();
		return tp;
	}

	public void tp (org.omg.hw.terminationPoint.TerminationPoint_T _x)
	{
		discriminator = org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aTP;
		tp = _x;
	}

	public org.omg.hw.flowDomain.MatrixFlowDomain_T mfd ()
	{
		if (discriminator != org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD)
			throw new org.omg.CORBA.BAD_OPERATION();
		return mfd;
	}

	public void mfd (org.omg.hw.flowDomain.MatrixFlowDomain_T _x)
	{
		discriminator = org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aMFD;
		mfd = _x;
	}

	public org.omg.hw.flowDomainFragment.FlowDomainFragment_T fdfr ()
	{
		if (discriminator != org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr)
			throw new org.omg.CORBA.BAD_OPERATION();
		return fdfr;
	}

	public void fdfr (org.omg.hw.flowDomainFragment.FlowDomainFragment_T _x)
	{
		discriminator = org.omg.hw.transmissionDescriptor.TPorMFDorFDFrQualifier_T.aFDFr;
		fdfr = _x;
	}

}
