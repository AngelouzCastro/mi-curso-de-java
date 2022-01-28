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
public class Producto {
    
    public String Nombre;
    public float Cantidad;
    public float Precio;
    public float Subtotal;
    
    public Producto(){
        Nombre ="";
        Cantidad =0;
        Precio=0;
        Subtotal=0;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public void setCantidad(float Cantidad){
        this.Cantidad = Cantidad;
    }
    public void SetPrecio(float Precio){
        this.Precio = Precio;
    }
    
    public void CalcularSubtotal(){
        Subtotal = Precio * Cantidad;
    }
    
    public String GetNombre()
    {
        return Nombre;
    }
    public float GetCantidad(){
        return Cantidad;
    }
    public float GetPrecio(){
        return Precio;
    }
    public float GetSubtotal(){
        return Subtotal;
    }
}
