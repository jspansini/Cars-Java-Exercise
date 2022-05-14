package dev.dojo.treino.carros.Carros;

import dev.dojo.treino.carros.CarrosModelo;

public class testeMain {
    public static void main(String[] args) {
        CarrosModelo car1 = new CarrosModelo();
        CarrosModelo car2 = new CarrosModelo();

        car1.nome = "fiat";
        car1.modelo = "branco";
        car1.ano = 2015;

        car2.nome = "celta";
        car2.modelo = "azul";
        car2.ano = 2012;

        car1.imprime();
        car2.imprime();
    }
}
