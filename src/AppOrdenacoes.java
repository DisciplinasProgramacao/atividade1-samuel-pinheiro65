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
    IOrdenador Bubblesort<Integer> ordenador = new Bubblesort<Integer>();
    IOrdenador Insercao<Integer> ordenador = new Insercao<Integer>();
    IOrdenador Insercao<Integer> ordenador = new Mergesort<Integer>();
    Integer[] vetorOrdenado = ordenador.ordenar(vetor);

    

    System.out.println("Bolha");
    System.out.println(vetor.length);
    ordenador = new Bubblesort<Integer>();
    System.out.println(ordenador.getComparacoes());
    System.out.println(ordenador.getMovimentacoes());
    System.out.println(ordenador.getTempoOrdenacao());

    System.out.println("Insercao");
    ordenador = new Insercao<Integer>();
    System.out.println(vetor.length);
    System.out.println(ordenador.getComparacoes());
    System.out.println(ordenador.getMovimentacoes());
    System.out.println(ordenador.getTempoOrdenacao());

    System.out.println("Mergesort");
    ordenador = new Mergesort<Integer>();
    System.out.println(vetor.length);
    System.out.println(ordenador.getComparacoes());
    System.out.println(ordenador.getMovimentacoes());
    System.out.println(ordenador.getTempoOrdenacao());
}
}
