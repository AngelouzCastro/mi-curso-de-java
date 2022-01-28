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
public interface Buffer {
    
    public void set(int value);
    public int get();
}
