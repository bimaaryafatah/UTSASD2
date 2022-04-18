package UTSASD2;
import java.util.Scanner;

import UTSASD2.Model;

public class Facebook {
    private static void PrintTitle() {
        System.out.println("Facebook");
        }
        
        public static void main(String[] args) {
            String username;
            String komen;
            int likes;
            
    
            user = "bimaarya";
            ttl = "23 agustus";
            Scanner inputUser = new Scanner(System.in);
            PrintTitle();
            System.out.println("Masukkan username");
            System.out.println("Masukkan password");
            pin=inputUser.nextLine();
            if (pin.equals("2345")){
                Facebook bima = new Facebook(user, ttl);
                char pilihan = 0;
                do{
                    PrintTitle();
                    System.out.println();
                    System.out.println("Pilihan");
                    System.out.println("[1].Like");
                    System.out.println("[2].Komen");
                    System.out.println("[0].Keluar");
                    System.out.println("Pilihan Anda :");
                    pilihan = inputUser.next().charAt(0);
                    System.out.println();
                    switch (pilihan){
                            case '1' : 
                                int like;
                                like = 1;
                                int akhirlike = bima.like(like);
                                System.out.println("Total like : " +akhirlike);
                                break;
                            
    
                            case '2' : 
                                int comen = 0;
                                Scanner inputkomentar = new Scanner(System.in);
                                komen =inputkomentar.nextLine();
                                int coment = bima.komen(comen);
                                System.out.println("jumlah komen : " + coment);
                                break;
                            default : {
                            }
                        }
                    
                }while (pilihan!='0');
         
        }
    }    
}
    
