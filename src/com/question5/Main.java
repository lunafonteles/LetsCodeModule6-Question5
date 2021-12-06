package com.question5;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanPolegadas = new Scanner(System.in);
        System.out.println("Digite quantas polegadas: ");
        int polegadas = scanPolegadas.nextInt();
        float result = Convertor.convertorCentimetros(polegadas);

        System.out.printf("O resultado em centimetros é: %.2f", result);
    }
}