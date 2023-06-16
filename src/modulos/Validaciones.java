/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import static javax.management.Query.gt;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class Validaciones {

    /*Atributos*/
 /*Métodos*/
    public Image getImagenIconoProyecto() {
        Image imglogo = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("recursos/Logo.png"));
        return imglogo;
    }

    public Icon getobtieneimagen(String nom_imagen, int w, int h) {
        ImageIcon imagen = new ImageIcon("src/recursos/" + nom_imagen);//guardar imagen
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
        return icono;
    }

    public boolean GetSoloCaracter(KeyEvent tecla) { // esta funcion valida que solo ingresen letras mayusculas y minusculas
        boolean resp;
        resp = ((int) tecla.getKeyChar() < 65 || (int) tecla.getKeyChar() > 90) && ((int) tecla.getKeyChar() < 97 || (int) tecla.getKeyChar() > 122);
        return resp;
    }

    public boolean GetSoloCaracter(KeyEvent tecla, String opEspacio) { // esta funcion valida que solo ingresen letras mayusculas y minusculas y la barra espaciadora
        boolean resp;
        if (((int) tecla.getKeyChar() < 65 || (int) tecla.getKeyChar() > 90) && ((int) tecla.getKeyChar() < 97 || (int) tecla.getKeyChar() > 122)) {
            if (opEspacio.equals("esp")) {
                resp = (int) tecla.getKeyChar() != 32;
            } else {
                resp = true;
            }
        } else {
            resp = false;
        }
        return resp;
    }

    public boolean GetSoloNumero(KeyEvent tecla) { // esta funcion valida que solo ingresen numeros enteros
        boolean resp;
        if (((int) tecla.getKeyChar() < 48 || (int) tecla.getKeyChar() > 57)) {
            resp = true;
        } else {
            resp = false;
        }
        return resp;
    }

    public boolean esDecimal(String cad) {
        int i = 0, posicionDelPunto;
        boolean hayPunto = false;
        if (cad.charAt(i) == '.') {
            hayPunto = true;
        }
        if (hayPunto) {
            posicionDelPunto = cad.indexOf('.');
        } else {
            return false;
        }
        if (posicionDelPunto == cad.length() - 1 || posicionDelPunto == 0) {
            return false;
        } else {
            return false;
        }
    }

    //El método regresa true si todos los campos estan llenos 
//false si alguno esta vacio 
    public boolean validarCamposVacios(JPanel jPanel) {
        boolean flag = true;
        for (int i = 0; jPanel.getComponents().length > i; i++) {
            if (!flag) {
                break;
            }
            if (jPanel.getComponents()[i]instanceof JTextField) {
                flag = !((JTextField) jPanel.getComponents()[i]).getText().equals("");
            }
            if (!flag) {
                break;
            }
            if (jPanel.getComponents()[i] instanceof JPasswordField) {
                flag = !Arrays.toString(((JPasswordField) jPanel.getComponents()[i]).getPassword()).equals("") ? true : false;
            }
        }
        return flag;
    }

}
//public class CadenaDecimal 
//{

//    public boolean GetSoloNumero(KeyEvent tecla, String cadena){
//        boolean resp, hayunpunto;
//        int i, cp=0; //cp= contador de puntos
//        for(i=0;i<cadena.length();i++){//cadena.length toda la cantidad de caracteres que tiene la cadena
//            if((int)cadena.charAt(i)==46) cp+=1;//cadena.charAt verifica que este el punto
//                 }
//        if(cp==1)hayunpunto=true;
//        else hayunpunto=false;
//        //evita ingresar cosas incorrectas:
//        if ((((int)tecla.getKeyChar()<48 || (int)tecla.getKeyChar()>57)) && ((int)cadena.charAt(i)==46 || hayunpunto==false)) resp=true;
//        else resp=false;
//        return resp; 
//                    
//    }
//}
