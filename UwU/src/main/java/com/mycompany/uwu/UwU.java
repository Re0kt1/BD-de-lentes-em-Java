
package com.mycompany.uwu;

public class UwU {
    
    public static void main(String[] args) {
        
        Cliente C1 = new Cliente();
        //Lente l1 = new Lente();
        
        C1.setNome("Pedro");
        
        System.out.println(C1.getNome());
        
        C1.aumentarEstoque(10);
        
        System.out.println(C1.getEstoque());
    }
}
