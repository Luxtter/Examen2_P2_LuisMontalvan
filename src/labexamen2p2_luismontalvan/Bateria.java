/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen2p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Bateria extends Parte{
   private int capacidad;
   private String material;

    public Bateria() {
    }

    public Bateria(int capacidad, String material) {
        this.capacidad = capacidad;
        this.material = material;
    }

    public Bateria(int capacidad, String material, int tiempoEsamblaje) {
        super(tiempoEsamblaje);
        this.capacidad = capacidad;
        this.material = material;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Bateria";
    }
   
}
