package dev.dojo.treino.carros;

public class CarrosModelo {
    public String nome;
    public String modelo;
    public int ano;

    public void imprime(){
        System.out.println("================");
        System.out.println(this.nome);
        System.out.println(this.modelo);
        System.out.println(this.ano);
    }
}
