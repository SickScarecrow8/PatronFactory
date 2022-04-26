/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.factory;
import java.util.Scanner;
/**
 *
 * @author amaur
 */
public class MainFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;

        System.out.println("Elija el producto, por favor");
        System.out.println(Factory.ComputadoraCara + ")Cara");
        System.out.println(Factory.ComputadoraBarata + ")Barata");
        System.out.println(Factory.ComputadoraRegalada + ")Regalada");
        System.out.println(Factory.SmartphoneAmateur+ ")Amateur");
        System.out.println(Factory.SmartphoneProfesional + ")Profesional");
        System.out.println(Factory.SmartphoneMuyprofesional + ")Muyprofesional");
        System.out.println(Factory.TabletChica + ")Chica");
        System.out.println(Factory.TabletMediana + ")Mediana");
        System.out.println(Factory.TabletGrande + ")Grande");
        
        try {
            System.out.print("Elige un número:");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un número");
        } 
        
        Factory device = Factech.create(eleccion);
        System.out.println(device.toString());
    }
    
}
