/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen2p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Tecnico {
    private String nombre,genero;
    private int edad, compEsambladas;

    public Tecnico() {
    }

    public Tecnico(String nombre, String genero, int edad, int compEsambladas) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.compEsambladas = compEsambladas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCompEsambladas() {
        return compEsambladas;
    }

    public void setCompEsambladas(int compEsambladas) {
        this.compEsambladas = compEsambladas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
