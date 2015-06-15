/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dosnumeros;
import java.util.Scanner;

/**
 *
 * @author Claudio
 */
public class DOSNUMEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Ingrese dos numeros : ");
       Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    numero(num1,num2);
   
    
    }
    public static void numero(int num1,int num2){
         
               double v=0.1;
               double porcentaje= 0.1*num2+num2;
        if (num1>num2 ){
            
            System.out.println("El mayor es : " + num1);
           
            
        }else
           System.out.println("El mayor es : " + num2);
 
          System.out.println("% adherido es = " + porcentaje);
 
    
  
}
}


