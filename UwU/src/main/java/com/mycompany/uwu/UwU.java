
package com.mycompany.uwu;

import java.util.*;

public class UwU {
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        List<Lente> Lentes = new ArrayList<>();
        Lente l1 = new Lente();
        l1.setModelo("alta");
        Lente l2 = new Lente();
        l2.setModelo("baixa");
        Lentes.add(l1);
        Lentes.add(l2);
        
        System.out.println("lentes e seu estoque.");
            
        for (Lente i: Lentes) {
            System.out.print(i.getModelo() + " ");
            System.out.println(i.getEstoque());
        }
        
        Cliente c1 = new Cliente();
        
        System.out.println(l1.getEstoque());
        
        c1.diminuirEstoque(l1,1);
        
        System.out.println(l1.getEstoque());
        /*System.out.println("digite 1 se for querer interagir com uma lente.");
        int y = scn.nextInt();
        scn.nextLine();
        
        
        
        System.out.println();
        
        if (y == 1) {  
            
            System.out.println("digite o nome da lente a ser consumida.");
            
            String z = scn.nextLine();
            
            System.out.println("digite a quantidade a ser retirada no estoque.");
            
            int h = scn.nextInt();
                    
            scn.nextLine();
            
            int j = 0;
            
            for (Lente i: Lentes) {
                if (i.getNomeLente().equals(z)){
                    i.diminuirEstoque(h);
                    System.out.println(i.getEstoque());
                    break;
                }
                j++;
            }
        }*/
    }
}
