/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOExcept
 public class trifiv2 {
public static void main(String[] args) throws IOException{
        // Declaración de variables
        int numero;
        int mult3;
        int mult5;
        BufferedReader buffentrada = new BufferedReader(new InputStreamReader(System.in));
        //Entrada de datos 
        System.out.println("Ingresa un número");
        numero = Integer.parseInt(buffentrada.readLine());
        //Procesamiento de datos 
        mult3 = numero % 3;
        mult5 = numero % 5;
        //salida de datos
      
        if (mult3 == 0 && mult5 == 0){System.out.println("TRIFIV");
        }else if (mult3 == 0){
            System.out.println("TRI");
        }else if (mult5 == 0){
            System.out.println("FIV");
        }
    
}
