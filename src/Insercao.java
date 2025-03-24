import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Insercao <T extends Comparable<T>> implements IOrdenador<T>  {
    private long comparacoes;
    private long movimentacoes;


    @Override
    public T[] ordenar(int[] vetor) {
        T[] copiaDados = Arrays.copyOf(vetor, vetor.length);
        int tamanho = copiaDados.length;
        comparacoes = movimentacoes = 0;
        LocalDateTime inicio = LocalDateTime.now();
        for(int posReferencia = 1; posReferencia <= tamanho - 1; posReferencia++){
            T valor = copiaDados[posReferencia];
            int j = posReferencia-1;
            comparacoes++;
       while (j>=0 && valor.compareTo(copiaDados[j]) <0){
        j--;
        comparacoes++;
       }
       copiarDados(j+1, posReferencia, copiaDados);
       copiaDados[j+1] = valor;
    }
}

    private void copiarDados(int inicio, int fim, T[] vet){
        for (int i = fim; i > inicio; i--){
            movimentacoes++;
            vet[i] = vet[i-1];
        }
    }
    
}
