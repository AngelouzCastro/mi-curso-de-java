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
public class MCAJ_Alumno_Java {
    private Alumno mAlumno;
    private Interfaz mInterfaz;
    
    public MCAJ_Alumno_Java()
    {
        mAlumno = new Alumno();
        mInterfaz = new Interfaz();
    }
    
    public void Correr()
        {
            String NC;
            String Nombre;
            int OPC;

            do {
                mInterfaz.ImprimirMenu();
                OPC = mInterfaz.GetOPC();
                switch (OPC)
                {
                    case 1:
                        mInterfaz.PedirNC();
                        NC = mInterfaz.GetNC();
                        mAlumno.SetNC(NC);
                        mInterfaz.PedirNombre();
                        Nombre = mInterfaz.GetNombre();
                        mAlumno.SetNombre(Nombre);
                        break;
                    case 2:
                        mInterfaz.ImprimirSaludo(mAlumno);
                        break;


                }
            } while (OPC != 3);

        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MCAJ_Alumno_Java mProgram = new MCAJ_Alumno_Java();
        mProgram.Correr();
    }
    
}
