/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author nadhif
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih hasil = new MatematikaCanggih();
        
        hasil.pertambahan(4, 5);
        System.out.println("Hasil pertambahan dari 4 + 5 : " + hasil.getPertambahan());
        
        hasil.perkurangan(10, 5);
        System.out.println("Hasil pengurangan dari 10 - 5 : " + hasil.getPengurangan());
        
        hasil.perkalian(10, 5);
        System.out.println("Hasil perkalian dari 10 * 5 : " + hasil.getPerkalian());
        
        hasil.pembagian(45, 5);
        System.out.println("Hasil pembagian dari 45 / 5 : " + hasil.getPembagian());

        hasil.setModulus(10, 3);
        System.out.println("Hasil modulus dari 10 % 3 : " + hasil.getModulus());
    }
    
}
