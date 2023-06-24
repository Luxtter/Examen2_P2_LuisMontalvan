/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen2p2_luismontalvan;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

/**
 *
 * @author luism
 */
public class HiloBarras extends Thread{
    private JProgressBar barra1, barra2;
    private boolean avanzar;
    ArrayList<Integer> segundos = new ArrayList();

    public HiloBarras() {
    }

    public ArrayList<Integer> getSegundos() {
        return segundos;
    }

    public void setSegundos(ArrayList<Integer> segundos) {
        this.segundos = segundos;
    }

    public HiloBarras(JProgressBar barra1, JProgressBar barra2, boolean avanzar) {
        this.barra1 = barra1;
        this.barra2 = barra2;
        this.avanzar = avanzar;
    }

    public JProgressBar getBarra1() {
        return barra1;
    }

    public void setBarra1(JProgressBar barra1) {
        this.barra1 = barra1;
    }

    public JProgressBar getBarra2() {
        return barra2;
    }

    public void setBarra2(JProgressBar barra2) {
        this.barra2 = barra2;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    @Override
    public void run() {
        if (avanzar) {
            if (barra1.getValue()<= 5) {
                if (barra2.getValue()==100) {
                    barra1.setValue(barra1.getValue()+1);
                }else{
                    barra2.setValue(barra2.getValue()+1);
                    try {
                        Thread.sleep(barra1.getValue()*10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HiloBarras.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }else{
                avanzar=false;
            }
        }
    }
    
    
}
