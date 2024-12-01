/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author nadhif
 */
public class MatematikaCanggih extends Matematika{
    private int modulus;
    
    void setModulus (int a,int b){
        modulus = a % b;
    }
    
    int getModulus(){
        return modulus;
    }
    
}
