
package com.mycompany.uwu;

public abstract class Lente {

    public int estoque = 0;

    /**
     * Get the value of estoque
     *
     * @return the value of estoque
     */
    public int getEstoque() {
        return estoque;
    }
    
    public void diminuirEstoque(int x){
        this.estoque = this.estoque - x;
    }
    
    public void aumentarEstoque(int x) {
        this.estoque = this.estoque + x;
    }
}
