
package com.mycompany.uwu;

class Fornecedor extends Lente{
    
    private String Nome;

    protected String getNome() {
        return Nome;
    }

    protected void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    protected void diminuirEstoque(Lente x, int y) {
        x.diminuirEstoque(y);
    }
}
