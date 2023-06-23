/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexamen2p2_luismontalvan;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Computadora {
   private int serie,ano;
   private Color color;
   private String material;
   ArrayList<Parte> partes = new ArrayList();

    public Computadora() {
    }

    public Computadora(int serie, int ano, Color color, String material) {
        this.serie = serie;
        this.ano = ano;
        this.color = color;
        this.material = material;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }

    @Override
    public String toString() {
        return "Computadora{" + "serie=" + serie + ", ano=" + ano + ", color=" + color + ", material=" + material + ", partes=" + partes + '}';
    }
    
}
