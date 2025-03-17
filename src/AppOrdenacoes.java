import java.util.Random;

public class AppOrdenacoes {

    


static Random aleatorio = new Random(42);

static int[] gerarVetor(int tamanho){
    int[] vetor = new int[tamanho];
    for (int i = 0; i < tamanho; i++) {
        vetor[i] = aleatorio.nextInt(1, tamanho/2);
    }
    return vetor;
    
}

public static void main(String[] args){
    int[] vetor = gerarVetor(50);
    Bubblesort<Integer> ordenador = new Bubblesort<Integer>();
    Integer[] vetorOrdenado = ordenador.ordenar(vetor);

    

    System.out.println(vetor.length);
    System.out.println(ordenador.getComparacoes());
    System.out.println(ordenador.getMovimentacoes());
}
}
