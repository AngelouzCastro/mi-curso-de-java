/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcaj_alumno_java;

/**
 *
 * @author darka
 */
public class Alumno {
    private String NC;
        private String Nombre;

        public Alumno()
        {
            NC = "";
            Nombre = "";
        }

        public void SetNC(String NC)
        {
            this.NC = NC;
        }

        public void SetNombre(String Nombre)
        {
            this.Nombre = Nombre;
        }

        public String GetNC()
        {
            return NC;
        }

        public String GetNombre()
        {
            return Nombre;
        }
    
}
