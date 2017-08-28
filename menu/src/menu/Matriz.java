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
public class Matriz implements Ordenar{
    private int matriz [][];
    private int ormatriz[];
    private int cont=0;
    private int limite;
    
    public void matrizInicio(int tama){
        cont=0;
        tama++;
        matriz = new int[tama][tama];
        ormatriz=new int[tama*tama];
        limite=tama;
        
            for(int i=0;i<matriz.length;i++){
                for (int j=0;j<matriz.length;j++){
                        Scanner s=new Scanner(System.in);
                        System.out.println("ingrese numero");
                        matriz[i][j] =s.nextInt();
                 ormatriz[cont]=matriz[i][j];
                 cont++;
                        
            }
            }     
    }
    public void ver_Matriz(){
    for(int i=0;i<matriz.length;i++){
      for(int j=0;j<matriz.length;j++){
       
          System.out.print(matriz[i][j]+" ");
                    
       }
      System.out.println(" ");
       
    
    }
    }
    
    @Override
    public void asendente(){
    for (int i = 0 ; i < ormatriz.length -1; i++) {
            int min = i;
 
            
            for (int j = i + 1 ; j < ormatriz.length ; j++) {
                if (ormatriz[j] < ormatriz[min]) {
                    min = j;    
                }
            }
 
            if (i != min) {
                
                int aux = ormatriz[i];
                ormatriz[i] = ormatriz[min];
                ormatriz[min] = aux;
            }
    }
    int a=0;
    for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz.length;j++){
        
        matriz[i][j]=ormatriz[a];
        a++;
        }
    }
    }
    @Override
    public void desendente(){
    for (int i = 0 ; i < ormatriz.length - 1 ; i++) {
            int max = i;
 
            
            for (int j = i + 1 ; j < ormatriz.length ; j++) {
                if (ormatriz[j] > ormatriz[max]) {
                    max = j;    
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = ormatriz[i];
                ormatriz[i] = ormatriz[max];
                ormatriz[max] = aux;
            }
 
 
       }
    int a=0;
    for(int i=0;i<matriz.length;i++){
        for(int j=0;j<matriz.length;j++){
        
        matriz[i][j]=ormatriz[a];
        a++;
        }
    }
    
    }
   }
