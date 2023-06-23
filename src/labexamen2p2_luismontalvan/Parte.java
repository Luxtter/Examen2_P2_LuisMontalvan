/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen2p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Parte {
    protected int tiempoEsamblaje;

    public Parte() {
    }

    public Parte(int tiempoEsamblaje) {
        this.tiempoEsamblaje = tiempoEsamblaje;
    }
    
    public int getTiempoEsamblaje() {
        return tiempoEsamblaje;
    }

    public void setTiempoEsamblaje(int tiempoEsamblaje) {
        this.tiempoEsamblaje = tiempoEsamblaje;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempoEsamblaje=" + tiempoEsamblaje + '}';
    }
    
}
