/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.Scanner;    
/**
 *
 * @author Luis Fernando Lopez
 */
public class Vector implements Ordenar{
    int vect[];
    int limite;
    
    public void vectorInicio(int tama) {
      
        vect = new int[tama];
        limite = tama;
            for(int i=0;i<vect.length;i++){
                        Scanner s=new Scanner(System.in);
                        System.out.println("ingrese numero");
                        vect[i] =s.nextInt();
                       
            }
    
    }
    
    public int[] getVect() {
        return vect;
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }
    public void ver_vector(){
        for(int i=0;i<vect.length ;i++){
        System.out.print(vect[i]+" ");
        
        }
    }
    @Override
   public void asendente(){
      
    for (int i = 0 ; i < vect.length -1; i++) {
            int min = i;
 
            
            for (int j = i + 1 ; j < vect.length ; j++) {
                if (vect[j] < vect[min]) {
                    min = j;    
                }
            }
 
            if (i != min) {
                
                int aux = vect[i];
                vect[i] = vect[min];
                vect[min] = aux;
            }
    }

   }

    @Override
    public void desendente(){
        
           for (int i = 0 ; i < vect.length - 1 ; i++) {
            int max = i;
 
            
            for (int j = i + 1 ; j < vect.length ; j++) {
                if (vect[j] > vect[max]) {
                    max = j;    
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = vect[i];
                vect[i] = vect[max];
                vect[max] = aux;
            }
 
 
       }
   }
}


   
 
    
        
    
    
    

