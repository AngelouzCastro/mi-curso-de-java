/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adalu;
import javax.swing.JOptionPane;
/**
 *
 * @author darka
 */
public class Interfaz {
    private String Nombre;
    private int Precio;
    private int Cantidad;
    private float Total;
    private float Cambio;
    private float Pago;
    private float Subtotal;
    private int Opcion;
    private Articulos mArticulos;
    private Lista mLista;
    
    public Interfaz() {
    Nombre = "";
    Precio = 0;
    Cantidad = 0;
    Total = 0;
    Cambio = 0;
    Pago = 0;
    Subtotal = 0;
    Opcion = 0;
    mArticulos = new Articulos();
    mLista = new Lista();
    }
    
    public void imprimirMenu() {
        boolean correcto = false;
        do
            {
                
                try
                {
                    Opcion = Integer.parseInt(
			JOptionPane.showInputDialog(" PALETERIA ALDALU\n " +
				"1. venta\n " +
				"2. Cobrar \n " +
                                "3. Conocer Tiket\n"+
                                "4. Modificar\n"+
                                "5. Eliminar\n"+
				"6. Salir\n " + 
				"Elige una opcion: "));
                    correcto = true;
                }
                catch (Exception e)
                {
                   
                   Imprimirerror(e.getMessage());
                    correcto = false;
                }
            } while (correcto == false);
		
    }
    
    public void PedirNombre() {
        Nombre = JOptionPane.showInputDialog("Nombre del Articulo: ");
    }
    
    public void PedirNombreM()
     {
        String NombreM = JOptionPane.showInputDialog("Dame Numero De Articulo:");
     }
    
    public void PedirPrecio() {
        boolean correcto = false;
        do
            {
                
                try
                {
                    Precio = Integer.parseInt(JOptionPane.showInputDialog("Precio: "));
                    correcto = true;
                }
                catch (Exception e)
                {
                   
                   Imprimirerror(e.getMessage());
                    correcto = false;
                }
            } while (correcto == false);
        
    }
     
    public void PedirCantidad() {
        boolean correcto = false;
        do
            {
                
                try
                {
                    Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad: "));
                    correcto = true;
                }
                catch (Exception e)
                {
                   
                   Imprimirerror(e.getMessage());
                    correcto = false;
                }
            } while (correcto == false);
        
    }
    
    public void PedirPago() {
          boolean correcto = false;
        do
            {
                
                try
                {
                    Pago = Integer.parseInt(JOptionPane.showInputDialog("Total: $ "+ mArticulos.getTotal()+"\nPago: "));
                    correcto = true;
                }
                catch (Exception e)
                {
                   
                   Imprimirerror(e.getMessage());
                    correcto = false;
                }
            } while (correcto == false);
        
    }
    
    
    public String getNombre() {
        return Nombre;
    }
    
    public int getPrecio() {
        return Precio;
    }
    
    public int getCantidad() {
        return Cantidad;
    }
    
    public float getPago() {
        return Pago;
    }
    
    public int getOpcion() {
        return Opcion;
    }
    
    public void Imprimir(Lista mLista) {
        Articulos mArticulos;
        String Cadena = "";
        float Total = 0;
        float SubTotal=0;
        Nodo mNodo = mLista.getInicio();
        while(mNodo != null) {
            Cadena = Cadena + mNodo.getDato().getNombre() + " -     $ " + mNodo.getDato().getPrecio() + " -     " + mNodo.getDato().getCantidad()+ "\n";
        SubTotal =mNodo.getDato().getPrecio() * mNodo.getDato().getCantidad();
        Total = Total + SubTotal;
        mNodo = mNodo.getSiguiente();
        }
        

        
        do
            {
                
                try
                {
                    Pago = Integer.parseInt(JOptionPane.showInputDialog("Nombre     Precio      Cantidad\n" + Cadena + "\nTotal: $ "+ Total+"\nPago:"));
                    if(Pago < Total) {
                        Integer.parseInt(JOptionPane.showInputDialog(null,Cadena + "Dinero Insuficiente \nTotal: $" + Total + "\nPreciona enter para Continuar:"));
                    }
                    
                }
                catch (Exception e)
                {
                    Imprimirerror(e.getMessage());
                }
            } while (Pago < Total);
        Cambio = Pago - Total;
        JOptionPane.showMessageDialog(null,"\nCambio: $ "+ Cambio);
        Total = 0;
        
        
    }
    
    public void conocerTiket(Lista xLista) {
       Articulos mArticulos;
        String Cadena = "";
        Nodo mNodo = xLista.getInicio();
        while(mNodo != null) {
            Cadena = Cadena + mNodo.getDato().getNombre() + " -     $ " + mNodo.getDato().getPrecio() + " -     " + mNodo.getDato().getCantidad()+ "\n";
        
        mNodo = mNodo.getSiguiente();
        }
        JOptionPane.showInputDialog("Nombre     Precio      Cantidad\n" + Cadena);
        
    }
    
     public void Imprimirerror(String Texto){
        JOptionPane.showInputDialog(null,"ERROR " + Texto);
    }
    
    

    
    
}
