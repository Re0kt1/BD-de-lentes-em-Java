
package com.mycompany.uwu;

class Lente {
    
    private int estoque = 1;
    private String Modelo;
    
    protected void setModelo(String x){
        this.Modelo = x;
    }
    
    protected String getModelo() {
        return Modelo;
    }
    
    protected int getEstoque() {
        return estoque;
    }
    
    protected void diminuirEstoque(int x){
        this.estoque = this.estoque - x;
        
        if (this.estoque == 1) {
            System.out.println("estoque minimo alcançado");
            this.estoque = this.estoque + 1;
        }
    }
    
    protected void aumentarEstoque(int x) {
        this.estoque = this.estoque + x;
    }
}
