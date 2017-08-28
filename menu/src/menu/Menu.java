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
public class Menu {
    private int valor;
    private int opcion;
    private int opcion_2;
    private int opcion_3;
    private int opcion_4;
    private static int b=0;
    private int c;
    
        public Menu(int valor, int opcion, int opcion_2, int opcion_3, int opcion_4, int c) {
        this.valor = valor;
        this.opcion = opcion;
        this.opcion_2 = opcion_2;
        this.opcion_3 = opcion_3;
        this.opcion_4 = opcion_4;
        this.c = c;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public int getOpcion_2() {
        return opcion_2;
    }

    public void setOpcion_2(int opcion_2) {
        this.opcion_2 = opcion_2;
    }

    public int getOpcion_3() {
        return opcion_3;
    }

    public void setOpcion_3(int opcion_3) {
        this.opcion_3 = opcion_3;
    }

    public int getOpcion_4() {
        return opcion_4;
    }

    public void setOpcion_4(int opcion_4) {
        this.opcion_4 = opcion_4;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Menu.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector obje_1 = new Vector();
        Matriz obje_2 = new Matriz();
     
        
        do{
        System.out.println("1-- vector");
        System.out.println("2-- matriz");
        
        Scanner s=new Scanner(System.in);
            
            System.out.println("que desea hacer");
            int valor =s.nextInt();
            if(valor==1){
            System.out.println("El tamaño es");
            int opcion =s.nextInt();
            obje_1.vectorInicio(opcion);
            }else{if(valor==2){
                System.out.println("El tamaño es");
                 int opcion_4 =s.nextInt();
                obje_2.matrizInicio(opcion_4);
            }
            }
            
          switch(valor){
              case 1:
              
                  System.out.println("generando vector");
                  obje_1.ver_vector();
                  System.out.println(" ");
                  System.out.println("-------------------------------");
                  System.out.println("-------------------------------");
                  System.out.println("-------------------------------");
                  System.out.println("1-- asendente");
                  System.out.println("2-- desendente");
                  System.out.println("como lo desea ordenar");
                  int opcion_2 =s.nextInt();
                  switch(opcion_2){
                      case 1:
                          System.out.println(" ");
                          obje_1.asendente();
                          obje_1.ver_vector();
                      break;
                      case 2:
                          System.out.println(" ");
                          obje_1.desendente();
                          obje_1.ver_vector();
                      break;
                  }
               break;
              
              case 2:
              
                  System.out.println("generando matriz");
                  obje_2.ver_Matriz();
                  System.out.println(" ");
                  System.out.println("-------------------------------");
                  System.out.println("-------------------------------");
                  System.out.println("-------------------------------");
                  System.out.println("1-- asendente");
                  System.out.println("2-- desendente");
                  System.out.println("como lo desea ordenar");
                  int opcion_3 =s.nextInt();
                  switch(opcion_3){
                      case 1:
                          System.out.println(" ");
                          obje_2.asendente();
                          obje_2.ver_Matriz();
                      break;
                      case 2:
                          System.out.println(" ");
                          obje_2.desendente();
                          obje_2.ver_Matriz();
                      break;
                  }
              break;
              
              default:
                  System.out.println("opcion incorrecta");
              
              }
          System.out.println("-------------------------------");
          System.out.println("-------------------------------");
          System.out.println("-------------------------------");
          System.out.println("desea hacer otra matriz o vector");
          System.out.println("oprima 0 y enter");
          System.out.println("-------------------------------");
          System.out.println("desea salir");
          System.out.println("oprima 1 y enter");
          int  b=s.nextInt();
          if(b==0){
          
          }else{if(b==1){
          break;
          }
          }
        }while(b == 0);
       }          
    }
    

