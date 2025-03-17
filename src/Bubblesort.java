import java.lang.reflect.Array;
import java.util.*;;

public class Bubblesort<T extends Comparable<T>> 
        implements IOrdenador<T> {

    private long comparacoes;
    private long movimentacoes;


    @Override
    public T[] ordenar(int[] vetor) {
        T[] copiaDados = Array.copyOf(vetor, vetor.length);
        int tamanho = copiaDados.length;
        comparacoes = movimentacoes = 0;
        for (int posReferencia = tamanho-1; posReferencia > 0; posReferencia--){
            for(int posicao = 0; posicao < posReferencia; posicao++){
                comparacoes++;
                if(copiaDados[posicao] > copiaDados[posicao+1]){
                    trocar(posicao, posicao+1, copiaDados);
                }
            }
        }
        return copiaDados;
    }

    private void trocar(int p1, int p2, T[] dados){
        movimentacoes+=1
        T temp = dados

    }

    @Override
    public long getComparacoes() {
        return comparacoes;
    }

    @Override
    public long getMovimentacoes() {
        return movimentacoes;
    }

    @Override
    public double getTempoOrdenacao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTempoOrdenacao'");
    }
    
}
