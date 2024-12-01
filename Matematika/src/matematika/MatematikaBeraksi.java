/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author nadhif
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika hasil  = new Matematika ();
    
        hasil.pertambahan(8, 5);
        System.out.println("Hasil pertambahan dari 8 + 5 : " + hasil.getPertambahan());
        
        hasil.perkurangan(20, 6);
        System.out.println("Hasil pengurangan dari 20 - 6 : " + hasil.getPengurangan());
        
        hasil.perkalian(15, 5);
        System.out.println("Hasil perkalian dari 15 * 5 : " + hasil.getPerkalian());
        
        hasil.pembagian(90, 3);
        System.out.println("Hasil pembagian dari 90 / 3 : " + hasil.getPembagian());
    }
}
    

