
import java.applet.AudioClip;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author darka
 */
public class sonido {
    public AudioClip getAudio(String direccion) {
        return java.applet.Applet.newAudioClip(getClass().getResource(direccion));
    }
}
