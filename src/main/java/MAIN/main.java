package MAIN;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Programa que calcula el MCM y MCD de maximo 3 numeros ingresados");
        System.out.println("Cuantos Numeros va a ingresar");
        int cantidadnumeros= scan.nextInt();
        if ((cantidadnumeros<=0)||(cantidadnumeros>3)){
            while ((cantidadnumeros<=0)||(cantidadnumeros>3)){
                System.out.println("solo puede elejir ingresar 2 numeros maximo 3");
                cantidadnumeros= scan.nextInt();
            }
        }
        int [][] mcm= new int[cantidadnumeros][];
        int [] numeros= new int[cantidadnumeros];
        int numerointeraccion = 0;
        int i;
        int contador=1;
        int columnas=0;
        int divisor=2;
        int nummax=0;
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
            System.out.print("el numero: "+numeros[x]+" en Factores Primos es: ");
            for (int j=0;j<mcm[x].length;j++){
                System.out.print(mcm[x][j]+" ");
            }
            System.out.println();
        }
        nummax=numeros[0];
        for (int x=0;x<numeros.length;x++){
            if (numeros[x]>nummax){
                nummax=numeros[x];
            }
        }
        int mcmf=nummax;
        if (cantidadnumeros==2){
            while ((mcmf%numeros[0]!=0)||(mcmf%numeros[1]!=0)){
                mcmf++;

            }
            System.out.println("el Minimo Comun Multiplo es: "+mcmf);
        } else if (cantidadnumeros==3) {
            while ((mcmf%numeros[0]!=0)||(mcmf%numeros[1]!=0)||(mcmf%numeros[2]!=0)){
                mcmf++;

            }
            System.out.println("el Minimo Comun Multiplo es: "+mcmf);
        }
        int mcd=1;
        if (cantidadnumeros==2){
            while ((divisor<numeros[0])&&(divisor<numeros[1])){
                while ((numeros[0]%divisor==0)&&(numeros[1]%divisor==0)){
                    mcd=mcd*divisor;
                    numeros[0]=numeros[0]/divisor;
                    numeros[1]=numeros[1]/divisor;
                }
                divisor=divisor+1;
            }
            System.out.println("el Maximo Comun Divisor es: "+mcd);
        } else if (cantidadnumeros==3) {
            while ((divisor<numeros[0])&&(divisor<numeros[1])&&(divisor<numeros[2])){
                while ((numeros[0]%divisor==0)&&(numeros[1]%divisor==0)&&(numeros[2]%divisor==0)){
                    mcd=mcd*divisor;
                    numeros[0]=numeros[0]/divisor;
                    numeros[1]=numeros[1]/divisor;
                    numeros[2]=numeros[2]/divisor;
                }
                divisor=divisor+1;
            }
            System.out.println("el Maximo Comun Divisor es: "+mcd);
        }


    }
}