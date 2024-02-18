package com.ces2.Clas2Prep.model;

public class Impuesto {
	
	private double ingresoBruto;
	private int codigoActividad;
	private String nombreActividad;
	private int numeroEmpleados;

	public Impuesto() {
		super();
	}
	
	

	public Impuesto(double ingresoBruto, int codigoActividad, String nombreActividad, int numeroEmpleados) {
		super();
		this.ingresoBruto = ingresoBruto;
		this.codigoActividad = codigoActividad;
		this.nombreActividad = nombreActividad;
		this.numeroEmpleados = numeroEmpleados;
	}



	public double calcularImpuesto() {
		if(ingresoBruto < 20000000 
		&& numeroEmpleados < 50) {
			return ingresoBruto * 0.03;
		}
		else if(ingresoBruto > 20000000 
		&& ingresoBruto < 100000000 
	    && numeroEmpleados > 50) {
			return ingresoBruto * 0.05;
		}
		else if(ingresoBruto > 100000000 
		&& ingresoBruto < 500000000 
		&& numeroEmpleados > 50) {
			return ingresoBruto * 0.07;
		}
		return ingresoBruto*0.1;
	}
	
	public void imprimirPagoAnual() {
		// Aquí iría el código
	}

	public double getIngresoBruto() {
		return ingresoBruto;
	}

	public void setIngresoBruto(double ingresoBruto) {
		this.ingresoBruto = ingresoBruto;
	}

	public int getCodigoActividad() {
		return codigoActividad;
	}

	public void setCodigoActividad(int codigoActividad) {
		this.codigoActividad = codigoActividad;
	}

	public String getNombreActividad() {
		return nombreActividad;
	}

	public void setNombreActividad(String nombreActividad) {
		this.nombreActividad = nombreActividad;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}
	
	
	
}
