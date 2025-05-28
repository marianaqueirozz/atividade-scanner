/*Exercício Taduada
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciotabuada;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExercicioTabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número para ver a tabuada: ");
        numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
