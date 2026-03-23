
package com.mycompany.beecrowd1005;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        
        double MEDIA = (A * 3.5 + B * 7.5)/11.0;
        
        System.out.printf("MEDIA %.5f\n" , MEDIA);
    }
}
