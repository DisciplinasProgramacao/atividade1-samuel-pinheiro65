import java.util.Comparator;

public interface IOrdenador<T extends Comparable<T>>{

    public T[] ordenar(T[] dados, Comparator);
    public long getComparacoes();
	public long getMovimentacoes();
    public double getTempoOrdenacao();
}
