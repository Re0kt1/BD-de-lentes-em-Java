/* inclusao de lente*/
package com.mycompany.uwu;

class Fornecedor extends Lente{
    
    private String Nome;

    protected String getNome() {
        return Nome;
    }

    protected void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    protected void aumentarEstoque(Lente x, int y) {
        x.aumentarEstoque(y);
    }
}
