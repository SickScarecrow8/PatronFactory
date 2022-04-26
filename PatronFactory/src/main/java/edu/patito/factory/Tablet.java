/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.factory;

/**
 *
 * @author amaur
 */
public class Tablet implements Factory {
    private String tamañoPantalla;
    private boolean in13;
    private boolean in12;
    private boolean in10;

    public Tablet() {
    }

    public Tablet(String tamañoPantalla, boolean in13, boolean in12, boolean in10) {
        this.tamañoPantalla = tamañoPantalla;
        this.in13 = in13;
        this.in12 = in12;
        this.in10 = in10;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public boolean isIn13() {
        return in13;
    }

    public void setIn13(boolean in13) {
        this.in13 = in13;
    }

    public boolean isIn12() {
        return in12;
    }

    public void setIn12(boolean in12) {
        this.in12 = in12;
    }

    public boolean isIn10() {
        return in10;
    }

    public void setIn10(boolean in10) {
        this.in10 = in10;
    }
@Override
    public String toString() {
        return "Tablet{" + "tamañoPantalla=" + tamañoPantalla + ", in13=" + in13 + ", in12=" + in12 + ", in10=" + in10 + '}';
    } 
}
