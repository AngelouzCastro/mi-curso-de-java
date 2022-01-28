/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author darka
 */
public class Animal {

    public void habla() {
        System.out.println("Intento hablar, pero no se hacerlo. soy generico..");
    }
    
    public static void main(String[] args){
        Animal bestia = new Gato();
        bestia.habla();
        bestia = new perro();
        bestia.habla();
        bestia = new Animal();
        bestia.habla();
    }

}
