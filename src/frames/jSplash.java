/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import modulos.Validaciones;

/**
 *
 * @author User
 */
public class jSplash extends java.awt.Frame {
/*
Action Listener: responder a las acciones que realiza el usuario
tiene un sólo método: void actionPerformed(ActionEvent e)
Timer: es un servicio disponible en el lenguaje de programación 
Java que permite a los usuarios programar un evento futuro. 
Estos eventos futuros pueden ser únicos o repetidos a intervalos 
de tiempo regulares. Puede haber disparadores que usamos para 
iniciar eventos futuros
    */
    /**
     * Creates new form jSplash
     */
    //En el timr vamos a poner el tiempo en milisegundos y de alli el evento 
    //El Override es para sobreescrbir el evento principal del actionPerformed
Timer t=new Timer(2500,new ActionListener(){
@Override
public void actionPerformed(ActionEvent ev){
    dispose();
    pLogin formulario=new  pLogin();
    formulario.setVisible(true);
    t.stop();
}
});
Validaciones _validaciones=new Validaciones();

public jSplash() {
        initComponents();
        //carga el icono de la aplicacion 
        this.setIconImage(_validaciones.getImagenIconoProyecto());
        this.setSize(310,310);
        this.setLocationRelativeTo(null);
        this.setBackground(new Color(0,0,0,0));
        t.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlogo = new javax.swing.JLabel();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        jlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Logo.png"))); // NOI18N
        add(jlogo);
        jlogo.setBounds(10, 10, 290, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jSplash().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlogo;
    // End of variables declaration//GEN-END:variables
}
