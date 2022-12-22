package org.tnsindia.application;

import org.tnsindia.framework.PrimeAcc;

public class GSPrimeACC extends PrimeAcc {

	public GSPrimeACC(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		
	}
	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}

}
