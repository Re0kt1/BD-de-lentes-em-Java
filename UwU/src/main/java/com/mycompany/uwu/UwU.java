
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
        l1.aumentarEstoque(1);
        Lentes.add(l1);
        Lentes.add(l2);
        
        System.out.println("lentes e seu estoque.");
            
        for (Lente i: Lentes) {
            System.out.print(i.getModelo() + " ");
            
            if (i.getEstoque() == 1){
                System.out.print(i.getEstoque() + " ");
                System.out.println("Estoque minimo.");
            }
            else {
                System.out.println(i.getEstoque());
            }
        }
        
        Cliente c1 = new Cliente();
        
        System.out.println(l2.getEstoque());
        
        c1.diminuirEstoque(l2,1);
        
        System.out.println(l2.getEstoque());
        
        Lente l3 = new Lente();
        
        System.out.println("digite o modelo da lente a ser adicionada.");
        l3.setModelo(scn.nextLine());
        Lentes.add(l3);
        
        for (Lente i: Lentes) {
            System.out.print(i.getModelo() + " ");
            
            if (i.getEstoque() == 1){
                System.out.print(i.getEstoque() + " ");
                System.out.println("Estoque minimo.");
            }
            else {
                System.out.println(i.getEstoque());
            }
        }
        
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
