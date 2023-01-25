package main;



public class Persona extends Thread {

	String nombre;
	
	


	public Persona() {

	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
		
	public void run() {
	
		System.out.println("Hilo " + this.nombre + " empezado");
	}
		
	
	}


