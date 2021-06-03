/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author User
 */
public class Antrian {
     private int ukuran;
        private long[] antrian;
        private int belakang;
        private int jumlahItem;
        private int depan;
    
        public Antrian (int p){
                ukuran = p;
                antrian = new long [ukuran];
                depan = 0;
                belakang = -1;
                jumlahItem = 0;
        }
    
        public void enqueue (long q){
                if (!isFull()){
                        antrian[++belakang] = q;
                        jumlahItem++;
                }
        }
    
        public long dequeue (){
        long temp = antrian[0];
        if (!isEmpty()) {
                for (int i=0; i<jumlahItem; i++)
                        antrian [i] = antrian[i+1];
                        jumlahItem--;
                        belakang--;
                }
                return temp;
        }
    
        public long peek(){
                return antrian [depan];
        }
    
        public boolean isEmpty(){
                return(jumlahItem==0);
        }
    
        public boolean isFull(){
                return (belakang==ukuran-1);
        }

        public int ukuran(){
                return jumlahItem;
        }

        public void display(){
                for (int i=0; i<jumlahItem; i++)
                System.out.print(antrian[i]+" ");
                System.out.println("");
        }
    }

