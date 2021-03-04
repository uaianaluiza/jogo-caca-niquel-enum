package br.com.zup;

public enum Categoria {
    BANANA("Banana", 10,0),
    ESTRELA("Estrela",40,1),
    MORANGO("Morango",20,2);

    private String descricao;
    private Integer valor;
    private Integer id;

    Categoria(String descricao, Integer valor,Integer id){
        this.descricao = descricao;
        this.valor = valor;
        this.id = id;

    }

    public Integer getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getId() {
        return id;
    }
}


