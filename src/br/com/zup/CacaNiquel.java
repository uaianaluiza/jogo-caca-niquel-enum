package br.com.zup;

import java.util.Random;

public class CacaNiquel {
    public static void main(String[] args) {

        Integer resultado = 0;
        Random random = new Random();
        for(int i = 0; i<=2; i++) {
            int sorteio = random.nextInt(3);

            if(sorteio == Categoria.BANANA.getId()) {
                resultado = resultado+Categoria.BANANA.getValor();
                System.out.println(Categoria.BANANA.getDescricao());
            }
            else if(sorteio == Categoria.MORANGO.getId()) {
                resultado = resultado+Categoria.MORANGO.getValor();
                System.out.println(Categoria.MORANGO.getDescricao());
            }
            else if(sorteio == Categoria.ESTRELA.getId()) {
                resultado = resultado+Categoria.ESTRELA.getValor();
                System.out.println(Categoria.ESTRELA.getDescricao());
            }
        }
        System.out.println("Seus pontos - " + resultado);
    }
}
