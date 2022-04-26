/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.factory;

/**
 *
 * @author amaur
 */
public class Factech {
    static Factory create (int precio){
        switch (precio) {
            case Factory.ComputadoraCara:
                return new Computadora("Cara", false, true, false);
            case Factory.ComputadoraBarata:
                return new Computadora("Barata", true, false, false);
            case Factory.ComputadoraRegalada:
                return new Computadora("Regalada", false, false, true);
            case Factory.SmartphoneAmateur:
                return new Smartphone("Amateur", true, false, false);
            case Factory.SmartphoneProfesional:
                return new Smartphone("Profesionañ", false, true, false);
            case Factory.SmartphoneMuyprofesional:
                return new Smartphone("Muyprofesional", false, false, true);
            case Factory.TabletChica:
                return new Tablet("Chica", true, false, false);
            case Factory.TabletMediana:
                return new Tablet("Meidana", false, true, false);
            case Factory.TabletGrande:
                return new Tablet("Grande", false, false, true);
            
            
            
            
            
            default:
                throw new AssertionError();
        }
    }
    
}
