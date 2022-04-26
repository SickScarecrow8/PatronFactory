/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.factory;

/**
 *
 * @author amaur
 */
public class Computadora implements Factory {
    private String Especificaciones;
    private boolean intelI7;
    private boolean intelI9;
    private boolean intelI5;

    public Computadora() {
    }

    public Computadora(String Especificaciones, boolean intelI7, boolean intelI9, boolean intelI5) {
        this.Especificaciones = Especificaciones;
        this.intelI7 = intelI7;
        this.intelI9 = intelI9;
        this.intelI5 = intelI5;
    }

    public String getEspecificaciones() {
        return Especificaciones;
    }

    public void setEspecificaciones(String Especificaciones) {
        this.Especificaciones = Especificaciones;
    }

    public boolean isIntelI7() {
        return intelI7;
    }

    public void setIntelI7(boolean intelI7) {
        this.intelI7 = intelI7;
    }

    public boolean isIntelI9() {
        return intelI9;
    }

    public void setIntelI9(boolean intelI9) {
        this.intelI9 = intelI9;
    }

    public boolean isIntelI5() {
        return intelI5;
    }

    public void setIntelI5(boolean intelI5) {
        this.intelI5 = intelI5;
    }

@Override
    public String toString() {
        return "Computadora{" + "Especificaciones=" + Especificaciones + ", intelI7=" + intelI7 + ", intelI9=" + intelI9 + ", intelI5=" + intelI5 + '}';
    }

}
