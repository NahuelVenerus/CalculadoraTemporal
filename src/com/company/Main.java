package com.company;
import java.util.Scanner;
    /* Leer un período en segundos e imprimirlo expresado en días, horas, minutos y segundos.
    Por ejemplo, 200000 segundos equivalen a 2 días, 7 horas, 33 minutos y 20 segundos. */

public class Main {
        static int minutos = 0;
        static int horas = 0;
        static int dias = 0;
    public static int calcularSegundos(int segundos){
        while (segundos >= 60){
            segundos = segundos - 60;
            minutos++;
        }
        return segundos;
    }
    public static int calcularMinutos(){
        while (minutos >= 60){
            minutos = minutos - 60;
            horas++;
        }
        return minutos;
    }
    public static int calcularHoras(){
        while (horas >= 24){
            horas = horas - 24;
            dias++;
        }
        return horas;
    }

    public static void main(String[] args) {

        System.out.println("Escribe una cantidad de segundos y te dire cuanto es en segundos, minutos, horas y dias!");

        int segundos;
        Scanner reader = new Scanner(System.in);
        segundos = reader.nextInt();
        calcularHoras();

        System.out.println("Segundos: " + calcularSegundos(segundos));
        System.out.println("Minutos: " + calcularMinutos());
        System.out.println("Horas: " + calcularHoras());
        System.out.println("Días: " + dias);
    }
}
