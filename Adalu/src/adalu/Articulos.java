/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adalu;

/**
 *
 * @author darka
 */
public class Articulos {
    private String Nombre;
    private int Precio;
    private int Cantidad;
    private float Total;
    private float Cambio;
    private float Pago;
    float Subtotal;
    
    public Articulos(){
        Nombre = "";
        Precio = 0;
        Cantidad = 0;
        Total = 0;
        Cambio = 0;
        Pago = 0;
        Subtotal = 0;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public void setPago(float Pago) {
        this.Pago = Pago;
    }
    
    public void CalcularTotal() {
        Subtotal = Precio * Cantidad;
        Total =  Subtotal;
    }
    
    public void calcularCambio() {
        Cambio = Pago - getTotal();
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public float getPrecio() {
        return Precio;
    }
    
    public int getCantidad() {
        return Cantidad;
    }
    
    public float getTotal() {
        return Total;
    }
    
    public float getPago() {
        return Pago;
    }
    
    public float getCambio() {
        return Cambio;
    }
    
}
