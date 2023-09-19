package examen.u1.u2;

import java.util.Scanner;

public class ExamenU1U2 {

    public static void main(String[] args) 
    {
        Scanner scanner  = new Scanner (System.in);
        
        System.out.println("inserte el nombre de el primer producto: ");
        String nombre1 = scanner.nextLine();
        
        System.out.println("inserte el precio: ");
        Double precio1 = scanner.nextDouble();
        scanner.nextLine();
        
            System.out.println("inserte el nombre de el segundo producto: ");
        String nombre2 = scanner.nextLine();
        
        System.out.println("inserte el precio: ");
        double precio2 = scanner.nextDouble();
        scanner.nextLine();
        
            System.out.println("inserte el nombre de el tercer producto: ");
        String nombre3 = scanner.nextLine();
        
        System.out.println("inserte el precio: ");
        double precio3 = scanner.nextDouble();
        scanner.nextLine();
        
        double costo1 = (precio1*30)/100; 
        double costo2 = (precio2*65)/100;
        double costo3 = (precio3*15)/100;
        
        System.out.println("el precio de" + nombre1 +  " es: " + costo1);
        System.out.println("el precio de" + nombre2 +  " es: " + costo2);
        System.out.println("el precio de" + nombre3 +  " es: " + costo3);
        
        scanner.close();
        
    }
    
}
