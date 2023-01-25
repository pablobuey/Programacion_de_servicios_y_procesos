/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Rey
 */
public class Animal extends Thread {
    
    String nombre;
    Kilometros cliente;
    long inicio;

    public Animal() {
    }

    public Animal(String nombre, Kilometros cliente, long inicio) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.inicio = inicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Kilometros getCliente() {
        return cliente;
    }

    public void setCliente(Kilometros cliente) {
        this.cliente = cliente;
    }

    public long getInicio() {
        return inicio;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }

    @Override
    public void run() {

        System.out.println("El corredor " + this.nombre + " comienza la carrera " 
                                + this.cliente.getNombre() + " EN EL TIEMPO: " 
                                + (System.currentTimeMillis() - this.inicio) / 1000 
                                + "seg");

        for (int i = 0; i < this.cliente.productos.length; i++) {
                // Se procesa el pedido en X segundos
                this.esperarXsegundos();
                System.out.println("Pasando por " + this.cliente.productos[i] 
                                        + ":" + this.nombre + "->Tiempo: " 
                                        + (System.currentTimeMillis() - this.inicio) / 1000 
                                        + "seg");
        }

        System.out.println("El corredor " + this.nombre + " HA TERMINADO DE PROCESAR " 
                                        + this.cliente.getNombre() + " EN EL TIEMPO: " 
                                        + (float)(System.currentTimeMillis() - this.inicio) / 1000 
                                        + "seg");
    }

    private void esperarXsegundos() {
        try {
                Thread.sleep(2000);
        } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
        }
    }
}