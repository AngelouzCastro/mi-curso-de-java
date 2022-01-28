/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductorConsumidor.NoSincronizados.Sincronizados;

/**
 *
 * @author darka
 */
public class NoSinchonizedBuffer implements Buffer {

    private int localBuffer = 1;

    @Override
    public void set(int value) {
        System.out.println(Thread.currentThread().getName() + " writing" + value);
        this.localBuffer = value;
    }

    @Override
    public int get() {
        System.out.println(Thread.currentThread().getName() + " read" + this.localBuffer);
        return this.localBuffer;
    }

}
