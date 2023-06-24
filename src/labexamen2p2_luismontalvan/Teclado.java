/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen2p2_luismontalvan;

import java.awt.Color;

/**
 *
 * @author luism
 */
public class Teclado extends Parte{
   private String material;
   private Color color;

    public Teclado() {
    }

    public Teclado(String material, Color color) {
        this.material = material;
        this.color = color;
    }

    public int getTiempoEsamblaje() {
        return tiempoEsamblaje;
    }

    public void setTiempoEsamblaje(int tiempoEsamblaje) {
        this.tiempoEsamblaje = tiempoEsamblaje;
    }

    public Teclado(String material, Color color, int tiempoEsamblaje) {
        super(tiempoEsamblaje);
        this.material = material;
        this.color = color;
    }
    
    
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado";
    }
   
}
