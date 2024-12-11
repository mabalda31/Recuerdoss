/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recuerdoss;

import java.util.Scanner;

/**
 *
 * @author alejo
 */
public class Recuerdoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglos para almacenar los recuerdos de Alejo y Andrea
        String[] recuerdosAlejo = new String[2];
        String[] recuerdosAndrea = new String[2];

        // Solicitar los recuerdos de Alejo
        System.out.println("Alejo, ingresa tus dos recuerdos:");
        for (int i = 0; i < recuerdosAlejo.length; i++) {
            System.out.print("Recuerdo " + (i + 1) + ": ");
            recuerdosAlejo[i] = scanner.nextLine();
        }

        // Solicitar los recuerdos de Andrea
        System.out.println("Andrea, ingresa tus dos recuerdos:");
        for (int i = 0; i < recuerdosAndrea.length; i++) {
            System.out.print("Recuerdo " + (i + 1) + ": ");
            recuerdosAndrea[i] = scanner.nextLine();
        }

        // Mostrar los recuerdos ingresados
        System.out.println("\nRecuerdos de Alejo:");
        for (int i = 0; i < recuerdosAlejo.length; i++) {
            System.out.println((i + 1) + ". " + recuerdosAlejo[i]);
        }

        System.out.println("\nRecuerdos de Andrea:");
        for (int i = 0; i < recuerdosAndrea.length; i++) {
            System.out.println((i + 1) + ". " + recuerdosAndrea[i]);
        }

        // Seleccionar un recuerdo de cada persona
        System.out.println("\nSelecciona un recuerdo de Alejo (1 o 2): ");
        int opcionAlejo = scanner.nextInt() - 1;

        System.out.println("Selecciona un recuerdo de Andrea (1 o 2): ");
        int opcionAndrea = scanner.nextInt() - 1;

        // Combinar los recuerdos seleccionados
        String recuerdoCombinado = recuerdosAlejo[opcionAlejo] + " + " + recuerdosAndrea[opcionAndrea];

        // Mostrar el recuerdo combinado
        System.out.println("\nEl recuerdo combinado es: " + recuerdoCombinado);

        scanner.close();
    }
}
