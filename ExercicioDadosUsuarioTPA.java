/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciodadosusuario;
import java.util.Scanner;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExercicioDadosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua data de nascimento: ");
        String nascimento = sc.nextLine();

        System.out.print("Digite seu curso: ");
        String curso = sc.nextLine();

        System.out.print("Digite sua série: ");
        String serie = sc.nextLine();

        System.out.print("Digite sua altura (ex: 1.65): ");
        double altura = sc.nextDouble();

        System.out.print("Digite seu peso (ex: 60.5): ");
        double peso = sc.nextDouble();

        System.out.println("\n--- Dados do Usuário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + nascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    
    }
}
