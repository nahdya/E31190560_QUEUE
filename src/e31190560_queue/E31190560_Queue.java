/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190560_queue;

import static java.lang.ref.Cleaner.create;

/**
 *
 * @author Nahdya
 */
public class E31190560_Queue {
    int max, size, front, rear;
    int q[];
    
    E31190560_Queue(int m){
        max=m;
        create();
    }
    void create(){
        q=new int[max];
        size=0;
        front=rear=-1;
    }
    boolean isEmpty(){ //boolean kosong
        if (size==0){ //jika kosong maka benar
            return true;
        }else{
            return false;
        }
    }
    boolean isFull(){ //boolean penuh
        if (size==max){ //jika size mencapai maksimal maka benar
            return true;
        }else{
            return false;
        }
    }
    void enqueue(int data){ //metode untuk enqueue
        if (isFull()){ //jika full akan muncul output "Antrian penuh"
            System.out.println("Antrian penuh!");
        }else{
            if (isEmpty()){ //jika kosong
                front=rear=0;
            }else{ //jika tidak kosong
                if (rear==max-1){ //jika rear merupkaan max-1
                    rear=0;
                }else{ //jika bukan
                    rear++;
                }
            }
            q[rear]=data;
            size++;
        }
    }
    int dequeue(){ //metode untuk dequeue
       int data=0;
       if (isEmpty()){ //jika kosong maka outputnya "antrian kosong!"
           System.out.println("Antrian kosong!");
       }else{
           data=q[front];
           size--;
           if (isEmpty()){
               front=rear=-1;
           }else{
               if(front==max-1){
                   front=0;
               }else{
                   front++;
               }
           }
       }
       return data;
    }
    void print(){ //metode untuk menampilkan data
        if (isEmpty()){
            System.out.println("Antrian Kosong!");
        }else{
            int i=front;
            while (i!=rear){
                System.out.print(q[i]+",");
                i=(i+1)%max;
            }
            System.out.println(+q[i]+",");
            System.out.println("Jumlah antrian: "+size);
        }
    }
}