/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190560_queue;

import java.util.Scanner;

/**
 *
 * @author Nahdya
 */
public class main {
    
    public static void main(String[] args) {
        System.out.println("pilihan operasi queue");
        System.out.println("1. Enqueue");
        System.out.println("2. dequeue");
        Scanner input=new Scanner(System.in);
        int pil = 0;
        System.out.print("masukkan nilai maksimal queue: ");
        int n= input.nextInt();
        E31190560_Queue qq=new E31190560_Queue(n); //memanggil class E31190560_Queue
        do{ //perulangan
            System.out.print("Pilih data: ");
            pil=input.nextInt();
            switch(pil){
                case 1: //memilih pilihan pertama
                    System.out.print("Masukkan data: ");
                    int dataIn=input.nextInt();
                    qq.enqueue(dataIn);
                    System.out.print("Data:");
                    qq.print(); //menampilkan data
                    break;
                case 2: //memilih pilihan kedua
                    int dataOut= qq.dequeue();
                    if (dataOut!=0){
                        System.out.println("Data yang terambil: "+dataOut);
                        System.out.print("Data: ");
                        qq.print(); //menampilkan data
                    }
                    break;     
            }
        }while (pil!=3);
    }
}
