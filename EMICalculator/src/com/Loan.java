package com;

public class Loan {

	private double Principle;
	private double Interest;
	private int Tenure;
	private String name;
	
	public Loan(double principle, double interest, int tenure) {
		super();
		Principle = principle;
		Interest = interest;
		Tenure = tenure;
	}

	public Loan(double principle, double interest, int tenure, String name) {
		super();
		Principle = principle;
		Interest = interest;
		Tenure = tenure;
		this.name = name;
	}

	public double getPrinciple() {
		return Principle;
	}

	public void setPrinciple(double principle) {
		Principle = principle;
	}

	public double getInterest() {
		return Interest;
	}

	public void setInterest(double interest) {
		Interest = interest;
	}

	public int getTenure() {
		return Tenure;
	}

	public void setTenure(int tenure) {
		Tenure = tenure;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String calculateEmi() {
		double L_EMI= Principle/Tenure;
		double H_EMI= 3*L_EMI/2;
		double emi=(L_EMI+H_EMI)/2;
		double temp=Principle;
		while(!(temp>0 && temp<0.01)) {
			
			temp=Principle;
			
			for(int i=0;i<Tenure;i++) {
				
				temp=temp+(temp*Interest/1200);
				temp=temp-emi;
			}
			
			if(temp>0.01) {
				L_EMI=emi;
				emi= (emi+H_EMI)/2;
			}else if(temp<0) {
				H_EMI=emi;
				emi= (emi+L_EMI)/2;
			}
			
		}
		
		return String.format("%.2f", emi);
	}
	
}
