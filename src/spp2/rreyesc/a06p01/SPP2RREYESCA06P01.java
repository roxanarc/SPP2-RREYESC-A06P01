/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rreyesc.a06p01;
import java.util.Scanner;
/**
 *
 * @author roxana
 */
public class SPP2RREYESCA06P01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int num, mult=1;
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Introduce un número entero entre 0 y 10");
        num = kb.nextInt();
        
        if (num>0 && num<=10){
        for (int i=1; i<=num ; i++){
            
             mult = mult * i;
        }
        
        System.out.println("Su factorial es " +mult);
        }else System.out.println("El número no esta en el rango");
    }  
}
    
    

