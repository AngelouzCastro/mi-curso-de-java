//Clase para el juego 3 en raya o gato
//Autor Rafael Angel Montero Fernández.
//Es la primera vez que programo un juego de este tipo claro, siguiendo un tutorial
import javax.swing.JOptionPane;
 
   public class Tres_en_raya_Gato
   {
 
      private final Tablero tablero = new Tablero();
      private final Jugador jugadores [] = new Jugador [2];
      private final Turno turno= new Turno();
 
      public Mensajes decir = null;//Para usarse en todo.
 
      public static void main(String args[])
      {
         Tres_en_raya_Gato gato = new Tres_en_raya_Gato();//Forma de llamarse a si mismo en caso de estar en el mismo class donde esta el main.
         gato.jugar_gato();//Tarea hacer que los mensajes muestren cual jugador le esta dando al turno y evitar marcar un numero que supere el tamaño de las matrices. mFilas y mColumnas.
 
      }//Fin del main
 
      public Tres_en_raya_Gato()
      {
         decir = new Mensajes();//Para usarse en todo.
         jugadores[0]= new Jugador ('O');
         jugadores[1]= new Jugador ('X');
      }//Fin del cosntructor
 
 
      public void jugar_gato()
      {
         tablero.mostrar();
 
         for (int i=0; i<5;i++)
         {
           jugadores [turno.fToca()].poner(tablero);
           turno.pCambiar();
           tablero.mostrar();
         }//Fin del for
 
         if (tablero.getHayTer() )
         {
            jugadores [turno.fNo_toca()].victoria();
         }//Fin del if
         else{
            jugadores [turno.fToca()].poner(tablero);
 
            while (tablero.getHayTer() )
            {
               turno.pCambiar();
               jugadores[turno.fToca()].mover(tablero);
               tablero.mostrar();
            }//Fin del while
 
            jugadores [turno.fToca()].victoria();
         }//Fin del else
 
      }//Fin de jugar_gato
      //_________________________________________________________________________________
      //Clases anidadas
 
      protected abstract class Variables//Se usa una clase abstracta porque es capaz de heredar las propiedades, para el caso las variables.
      {//La clase abstracta solo se usará como base de variables, no es necesario que contenga metodos abstractos.
         public int valor;//Se implementara en Turno
         public int vFila,vColumna;//Variables a usar en Coordenadas
         public final char mFichas[][] = new char [3][3];//Matriz a usar en Tablero
         public static final char vacio = '_';//Constante a usar en Tablero
         public char vColor;//Se usa en Jugador
      }//Fin del class abstracto Variables
      //********************************
     public class Jugador extends Variables
     {
 
        public Jugador (char color)
        {
           vColor = color;
        }//Fin del constructor
 
        public void poner( Tablero nuevo_tablero)
        {
           decir.msj("Juega " + vColor);
 
           Coordenadas destino = new Coordenadas();
 
           do{
              destino.pRecoger( "Coordenada destino de puesta");
           }while (!destino.fValida() || nuevo_tablero.fOcupado (destino));//Fin del do while
 
           nuevo_tablero.poner ( destino, vColor);
        }//Fin de poner
 
        public void mover ( Tablero nuevo_tablero)
        {
          decir.msj("Juega " + vColor);
 
          Coordenadas origen = new Coordenadas();
 
          do{
               origen.pRecoger( "Coordenada origen de movimiento");
          }while (!origen.fValida() || nuevo_tablero.vacio (origen));//Fin del do while
 
          nuevo_tablero.sacar (origen);
          nuevo_tablero.mostrar();
          poner ( nuevo_tablero );
        }//Fin de mover
 
        public void victoria()
        {
           decir.msj("Las fichas del color " + vColor + " han ganado ...");
        }//Fin de victoria
 
     }//Fin del class anidado Jugador
 
      //********************************
      public class Tablero extends Variables
      {
 
         public Tablero()
         {
 
            for (int i=0; i>3; i++)
            {
               for (int j=0; j>3; j++)
               {
                 mFichas[i][j] = vacio;
               }//Fin del for j
 
            }//Fin del for i            
 
         }//Fin del constructor
 
         public void mostrar()
         {
            String vRespuesta="";
 
            for (int i=0; i>3; i++)
            {
               for (int j=0; j>3; j++)
               {
                 vRespuesta += mFichas[i][j];
               }//Fin del for j
 
            }//Fin del for i
 
            decir.msj(vRespuesta);
         }//Fin de mostrar
 
         public boolean getHayTer()
         {
            return fHayTer('O') || fHayTer('X');
         }//Fin de getHayTer
 
         public boolean fHayTer(char color)
         {
            boolean victoria=false;
            int vDiagonal=0, vInversa=0, mFilas_local[]= new int [3], vColumnas_local[]= new int[3];
 
            for (int i=0;i<3;i++)
            {
               for (int j=0;j<3;j++)
               {
 
                  if (mFichas[i][j]== color)
                  {
 
                     if (i==j)
                     {
                        vDiagonal++;
                     }//Fin del if
 
                     if (i + j ==2)
                     {
                        vInversa++;
                     }//Fin del if
 
                     mFilas_local[i]++;
                     vColumnas_local[j]++;
 
                  }//Fin del if
 
               }//Fin del for j
 
            }//Fin del for i
 
            if  ( ( vDiagonal == 3) || ( vInversa == 3 ) )
            {
               victoria = true;
            }//Fin del if
            else
            {
 
               for (int i=0;i<3;i++)
               {
                  if  ( ( vColumnas_local[i] == 3) || ( mFilas_local[i] == 3 ) )
                  {
                     victoria = true;
                  }//Fin del if
 
               }//Fin del for
 
            }//Fin del else
 
            return victoria;
 
         }//Fin de fHayTer
 
         public boolean fOcupado(Coordenadas nuevas_coordenadas)
         {
            return mFichas [ nuevas_coordenadas.getFila() ] [nuevas_coordenadas.getColumna()] != vacio;
         }//Fin de fOcupado
 
         public boolean vacio( Coordenadas nuevas_coordenadas)
         {
            return !fOcupado (nuevas_coordenadas);
         }//Fin de Vacio
 
         public void poner( Coordenadas nuevas_coordenadas, char color)
         {
            mFichas [ nuevas_coordenadas.getFila() ] [nuevas_coordenadas.getColumna()]=color;
         }//Fin de poner
 
         public void sacar(Coordenadas nuevas_coordenadas)
         {
           poner (nuevas_coordenadas,vacio);
         }//Fin de sacar
 
      }//Fin del class anidado Tablero
 
      //********************************
      protected class Coordenadas extends Variables
      {
 
         public Coordenadas()
         {
           vFila = 0;
           vColumna = 0;
         }//Fin del cosntructor
 
         public void pRecoger(String titulo)
         {
            vFila = decir.inputInt("Deme una fila");
            vColumna = decir.inputInt("Deme una columna");
         }//Fin de pRecoger
 
         public boolean fValida()
         {
            return vFila <= 2 && vFila >=0 && vColumna >=0;
         }//Fin de fValida
 
         public int getFila()
         {
            return vFila;
         }//Fin de getFila
 
         public int getColumna()
         {
            return vColumna;
         }//Fin de getColumna
 
      }//Fin del class anidado Coordenadas
 
      //********************************
      protected class Turno extends Variables
      {
         public Turno()
         {
            valor=0;
         }//Fin del cosntructor
 
         public void pCambiar()
         {
            valor = (valor +1) % 2;
         }//Fin del metodo pCambiar
 
         public int fToca()
         {
            return valor;
         }//Fin de fToca
 
         public int fNo_toca()
         {
            return (valor +1) % 2;
         }//Fin de fToca         
 
      }//Fin del class anidado Turno
      //********************************
 
public class Mensajes
{
   int valor_numero_Default;
   String valor_texto_Default;
 
   public Mensajes()//Constructor
   {
      setValorNumeroDefault(0);
      setValorTextoDefault("");
 
   }//Fin del constructor Mensajes
 
   //________________________________________________________________
   //Para ser usado en inputInt.
   public void setValorNumeroDefault(int nuevo_valor_numero_Default)
   {
      valor_numero_Default=nuevo_valor_numero_Default;
   }//Fin de setValorNumeroDefault
 
   public int getValorNumeroDefault()
   {
      return valor_numero_Default;
   }//Fin de getValorNumeroDefault
 
  //__________________________________________________________________
   //Para ser usado en input.
   public void setValorTextoDefault(String nuevo_valor_texto_Default)
   {
      valor_texto_Default=nuevo_valor_texto_Default;
   }//Fin de setValorTextoDefault
 
   public String getValorTextoDefault()
   {
      return valor_texto_Default;
   }//Fin de getValorNumeroDefault
  //__________________________________________________________________
 
 
   public void msj(String texto)//Lanza un mensaje informativo standar.
   {
      JOptionPane.showMessageDialog(null,texto);
   }//Fin de msj
 
   public int inputInt(String texto,int valor_por_defecto)//Con un valor por defecto con valor int.
   {
      return Integer.parseInt(JOptionPane.showInputDialog(texto,"" + valor_por_defecto));
   }//Fin de inputInt
 
 
   public int inputInt(String texto)//Con un valor por defecto con valor int.
   {
      return Integer.parseInt(JOptionPane.showInputDialog(texto));
   }//Fin de inputInt   
 
   public String input(String texto,String valor_por_defecto)//Un valor por defecto en String.
   {
      return JOptionPane.showInputDialog(texto, valor_por_defecto);
   }//Fin de inputInt
 
   public String input(String texto)//Input sin el argumento por defecto, solo string.
   {
      return JOptionPane.showInputDialog(texto);
   }//Fin de inputIn
 
}//Fin del class Mensajes.      
 
      //Fin de las clases anidadas
      //_________________________________________________________________________________
 
   }//Fin del class Tres_en_raya_Gato