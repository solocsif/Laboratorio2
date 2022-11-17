package MAIN;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantos Numeros va a ingresar");
        int cantidadnumeros= scan.nextInt();
        int [][] mcm= new int[cantidadnumeros][];
        int [] numeros= new int[cantidadnumeros];
        int numerointeraccion = 0;
        int i;
        int contador=1;
        int columnas=0;
        int divisor=2;
        for (i=0;i<cantidadnumeros;i++){
            System.out.println("Ingrese su numero "+contador);
            int numeroingresado= scan.nextInt();
            numeros[i]=numeroingresado;
            contador=contador+1;
        }
        for (i=0;i<cantidadnumeros;i++){
            numerointeraccion=numeros[i];
            while (numerointeraccion!=1){
                if (numerointeraccion%divisor==0){
                    numerointeraccion = numerointeraccion/divisor;
                    columnas=columnas+1;
                }else{
                    divisor=divisor+1;
                }
            }
            numerointeraccion=0;
            mcm[i]=new int[columnas];
            divisor=2;
            columnas=0;
        }
        for (int x=0;x<mcm.length;x++){
            numerointeraccion=numeros[x];
            for (int j=0;j<mcm[x].length;j++){
                while (numerointeraccion!=1){
                    if (numerointeraccion%divisor==0){
                        mcm[x][columnas]=divisor;
                        numerointeraccion = numerointeraccion/divisor;
                        columnas=columnas+1;
                    }else{
                        divisor=divisor+1;
                    }
                }
            }
            divisor=2;
            columnas=0;
        }
        for (int x=0;x<mcm.length;x++){
            for (int j=0;j<mcm[x].length;j++){
                System.out.print(mcm[x][j]+" ");
            }
            System.out.println();
        }

    }
}