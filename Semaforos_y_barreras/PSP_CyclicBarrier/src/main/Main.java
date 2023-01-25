package main;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {

	public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
		// TODO Auto-generated method stub
		CyclicBarrier barreraInicio = new CyclicBarrier(5);
		CyclicBarrier barreraFin = new CyclicBarrier(5);
	
		Persona persona1 = new Persona("Persona1");
		Persona persona2 = new Persona("Persona2");
		Persona persona3 = new Persona("Persona3");
		Persona persona4 = new Persona("Persona4");
		System.out.println("primer hilo");
		
		
		persona1.start(); 
		persona2.start();
		persona3.start();
		persona4.start();
		
		  System.out.println("inicio");
			
		barreraInicio.await();
		barreraInicio.await();
		
		System.out.println("...");
		
	  
	   barreraFin.await();
	   barreraFin.await();
	   
	   System.out.println("final");
	  
	  
	
	
	
		
		
	}//main
	
	

}
