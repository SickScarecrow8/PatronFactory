/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.factory;

/**
 *
 * @author amaur
 */
public class Smartphone implements Factory {
    private String resolucionCamara;
    private boolean megapixeles16;
    private boolean megapixeles24;
    private boolean megapixeles32;

    public Smartphone() {
    }

    public Smartphone(String resolucionCamara, boolean megapixeles16, boolean megapixeles24, boolean megapixeles32) {
        this.resolucionCamara = resolucionCamara;
        this.megapixeles16 = megapixeles16;
        this.megapixeles24 = megapixeles24;
        this.megapixeles32 = megapixeles32;
    }

    public String getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(String resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    public boolean isMegapixeles16() {
        return megapixeles16;
    }

    public void setMegapixeles16(boolean megapixeles16) {
        this.megapixeles16 = megapixeles16;
    }

    public boolean isMegapixeles24() {
        return megapixeles24;
    }

    public void setMegapixeles24(boolean megapixeles24) {
        this.megapixeles24 = megapixeles24;
    }

    public boolean isMegapixeles32() {
        return megapixeles32;
    }

    public void setMegapixeles32(boolean megapixeles32) {
        this.megapixeles32 = megapixeles32;
    }

   @Override
    public String toString() {
        return "Smartphone{" + "resolucionCamara" + resolucionCamara + ", megapixeles16=" + megapixeles16 + ", megapixeles24=" + megapixeles24 + ", megapixeles32=" + megapixeles32 + '}';
    }
}
