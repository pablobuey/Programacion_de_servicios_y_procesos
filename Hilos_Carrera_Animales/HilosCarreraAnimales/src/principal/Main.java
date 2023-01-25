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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kilometros km = new Kilometros("", new String[] { "km1", "km2", "km3", "km4", "km5", "km6", "km7", "km8", "km9", "km10"});
        // Cliente cliente2 = new Cliente("Cliente 2", new String[] { "km1", "km2", "km3", "km4", "km5", "km6", "km7", "km8", "km9", "km10"});
        // Cliente cliente3 = new Cliente("Cliente 3", new String[] { "km1", "km2", "km3", "km4", "km5", "km6", "km7", "km8", "km9", "km10"});
        
        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        Animal liebre = new Animal("liebre", km, initialTime);
        Animal tortuga = new Animal("tortuga", km, initialTime);
        Animal guepardo = new Animal("guepardo", km, initialTime);

        liebre.start();
        tortuga.start();
        guepardo.start();
    }
    
}