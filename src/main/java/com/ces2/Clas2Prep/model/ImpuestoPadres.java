package com.ces2.Clas2Prep.model;

public class ImpuestoPadres extends Impuesto{
	
	private int numeroPadres;
	
	public ImpuestoPadres() {
		super();
	}
	
	public ImpuestoPadres(double ingresoBruto, int codigoActividad, 
			String nombreActividad, int numeroEmpleados, int numeroPadres) {
		
		super(ingresoBruto,codigoActividad,nombreActividad,numeroEmpleados);
		
		this.numeroPadres = numeroPadres;
	}
	
	public double calcularImpuestoPadres(double impuesto) {
		
		return super.calcularImpuesto() - (numeroPadres*50000);
	}

	public int getNumeroPadres() {
		return numeroPadres;
	}

	public void setNumeroPadres(int numeroPadres) {
		this.numeroPadres = numeroPadres;
	}
	
}