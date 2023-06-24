/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen2p2_luismontalvan;

/**
 *
 * @author luism
 */
public class DiscoDuro extends Parte{
    private int tamano;
    private String marca;
    
    public DiscoDuro() {
    }

    public DiscoDuro(int tamano, String marca, int tiempoEsamblaje) {
        super(tiempoEsamblaje);
        this.tamano = tamano;
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTiempoEsamblaje() {
        return tiempoEsamblaje;
    }

    public void setTiempoEsamblaje(int tiempoEsamblaje) {
        this.tiempoEsamblaje = tiempoEsamblaje;
    }

    @Override
    public String toString() {
        return "DiscoDuro";
    }
    
}
