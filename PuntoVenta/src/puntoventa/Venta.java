/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntoventa;

/**
 *
 * @author darka
 */
public class Venta {
    public float Total;
    
    public void Venta()
    {
        Total = 0;
    }
    
    public void CalcularTotal(float Subtotal)
    {
        Total = Total + Subtotal;
    }
    
    public float getTotal()
    {
        return Total;
    }
}
