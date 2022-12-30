package org.example;
import java.util.Scanner;
import java.util.Random;

public  class matrix {
    public static void main (String[] args){

        int a;
        int b;
        int ch = 0;
        double sum=0.0;
        double kount=0.0;
        double mid;

        Scanner in = new Scanner(System.in);

        System.out.print("Kількість рядків: ");
        a = in.nextInt();

        System.out.print("Kількість стовпчиків: ");
        b = in.nextInt();

        System.out.print("1 - заповнити масив з клавіатури, 2 - заповнити рандомнo" + ch + "\n");
        ch = in.nextInt();

        int[][] mat = new int[a][b];

        if (ch==2)
        {
            Random rand = new Random();
            for (int i = 0; i< mat.length; i++)
            {
                for(int j = 0; j< mat[i].length; j++)
                {
                    mat[i][j]=rand.nextInt(9)+1;
                }
            }
        }

        if(ch ==1)
        {
            for (int i = 0; i< mat.length; i++)
            {
                for(int j = 0; j< mat[i].length; j++)
                {
                    System.out.print("Введіть елементи масиву[" + i + "][" + j + "]:");
                    mat[i][j] = in.nextInt();
                }
            }

        }

        for (int i = 0; i< mat.length; i++)
        {
            for(int j = 0; j< mat[i].length; j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }


        for (int i = 0; i< mat.length; i++)
        {
            for(int j = 0; j< mat[i].length; j++)
            {
                sum += mat[i][j];
                kount++;
            }
        }

        mid=sum/kount;
        System.out.println("Середнє арифметичне = " + mid);

    }

}
