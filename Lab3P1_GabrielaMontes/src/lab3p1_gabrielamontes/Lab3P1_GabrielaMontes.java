/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_gabrielamontes;

import java.util.Scanner;
public class Lab3P1_GabrielaMontes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Opcion 1: Cadena repetida ");
        System.out.println("Opcion 2:Sumatoria");
        System.out.println("Opcion 3: Reloj ");
        System.out.println("Opcion 4: salida ");
        System.out.println("Ingrese su respuesta: ");
        int op = entrada.nextInt();
        do{
        switch (op){
            case 1:
                //cadena repetida
            Scanner sc= new Scanner(System.in);
            System.out.print("Ingrese frase o palabra: ");
            String phrase=sc.next();
            int cont=0;
            
            for (int inicio=0;inicio<phrase.length();inicio++){
                if (phrase.charAt(inicio)=='.'){
                    cont++;
                    System.out.print(+cont);
                for (int i=0;i<phrase.charAt(cont-1);i++){
                    //int start=phrase.length()-cont;
                    System.out.print(phrase.charAt(i));
                    //System.out.print(phrase.substring(start, cont));
                }
                }else {
                        }
                for (int i=0;i<cont;i++){
                    //int start=phrase.length()-cont;
                   // System.out.print(+acum);
                    //System.out.print(phrase.substring(start, cont));
            }
            }

            case 2:
                System.out.print("----Sumatoria----");
                //sumatoria
        System.out.println("Ingrese un numero: ");
        int k = entrada.nextInt();
        double acum=0;
        int sum;
        int pot = 1;
        double acum2=0;
        int resp;  
        double acum3=0.00;
        
        for (int n=1;n<=k;n++){
            sum=2*n+1;
            acum = acum+sum;
        };
         
        for (int i=1;i<k;i++){
         for (int g=1;g<k;g++){
            pot= pot*g ;
         }
            acum2=acum2+pot;
        }
        
        for (int j=1;j<=k;j++){
            resp=j*j+3;
            double fact=1.00;
            for (int y=1;y<=resp;y++){
            fact=(fact*y);
            }
            acum3=acum3+fact;}
                        

        double resul = (acum/acum3)*acum2;
        System.out.println("El resultado es: "+resul); 



            case 3:
                System.out.print("----Reloj----");
                //reloj
                System.out.println("Ingrese un numero entero, positivo, e impar: ");
                int N = entrada.nextInt();
                int d=0;
                 if(N%2==0){
                     System.out.print("Error");
                 }else{
                   while (d<=2){
                     for (int eq=0;eq<=N;eq++){ 
                 for (int espacios=N; espacios>=eq; espacios--){
                 System.out.print(" ");
                 }
                 for (int fig=0;fig<=eq;fig++){
                         
                 System.out.print(" *");   
                 }
                 System.out.println();
                }
                     d++;
                }
                     
                   }
                        
            case 4:
               System.out.println("---Salida---"); 
                break;
        }
        // TODO code application logic here
        System.out.println("Opcion 1: Cadena repetida ");
        System.out.println("Opcion 2:Sumatoria");
        System.out.println("Opcion 3: Reloj ");
        System.out.println("Opcion 4: salida ");
        System.out.println("Ingrese su respuesta: ");
        op = entrada.nextInt();
        }while(op!=4);
    
}
}
