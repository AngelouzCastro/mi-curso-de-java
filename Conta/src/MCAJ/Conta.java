/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MCAJ;

/**
 *
 * @author darka
 */
public class Conta {
    
    public static float SumaIVA(float a)
    {
        return a * 1.16f;
    }
    public static float Resta(float a){
        return a / 1.16f;
    }
    public static float SacarIva(float a){
        return a * 0.16f;
    }
    
}
