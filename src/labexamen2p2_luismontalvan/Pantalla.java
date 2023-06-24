/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen2p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Pantalla extends Parte{
    private boolean tactil;
    private String tipo;

    public Pantalla() {
    }

    public Pantalla(boolean tactil, String tipo) {
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public Pantalla(boolean tactil, String tipo, int tiempoEsamblaje) {
        super(tiempoEsamblaje);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTiempoEsamblaje() {
        return tiempoEsamblaje;
    }

    public void setTiempoEsamblaje(int tiempoEsamblaje) {
        this.tiempoEsamblaje = tiempoEsamblaje;
    }

    @Override
    public String toString() {
        return "Pantalla";
    }
    
}
