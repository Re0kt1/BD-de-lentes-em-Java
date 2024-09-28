package com.mycompany.uwu; 

class Cliente extends Lente{

    private String nomeCliente;
        
    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    private String getNome() {
        return nomeCliente;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    protected void setNome(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    protected void diminuirEstoque(Lente x, int y) {
        x.diminuirEstoque(y);
    }
}
