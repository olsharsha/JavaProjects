package com;

public class EMICalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Loan loan= new Loan(1400000, 12, 60, "Andhara Loan");
		System.out.println(loan.calculateEmi());
	}

}
