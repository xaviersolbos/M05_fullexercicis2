
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class Conversio1 {
      public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
          System.out.println("Prem 1 per passar d'EURO a LLIURA");
          
          System.out.println("Prem 2 per passar de LLIURA a EURO");
        
          int opcio = sc.nextInt();
          
          if ( opcio == 1) {
              System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi_eur = 0.87d;
        System.out.println(valor_euros + " euros (€) actualment equivalen a " + (valor_euros * tipus_de_canvi_eur) + " lliures esterlines (£)");
              
          }
          
          if ( opcio == 2) {
              System.out.println("Introdueix en £");
        int valor_lliures = sc.nextInt();
                
        double tipus_de_canvi_lliu = 1.14d;
        System.out.println(valor_lliures + " lliures (£) actualment equivalen a " + (valor_lliures * tipus_de_canvi_lliu) + " euros (€)");
              
          }
              
          
          
          
          
        
    }
}
