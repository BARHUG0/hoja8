package uvg;

public interface UVGPriorityQueue<E extends Comparable<E>> {

    public E getFirst();

    public E remove();

    public void addValue(E value);

    public boolean isEmpty();

    public int size();

    public void clear();
}
