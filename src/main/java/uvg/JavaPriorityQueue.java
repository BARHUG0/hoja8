package uvg;

import java.util.PriorityQueue;

public class JavaPriorityQueue<E extends Comparable<E>> extends PriorityQueue<E> implements UVGPriorityQueue<E> {

    public JavaPriorityQueue(){
        super();
    }

    public E getFirst(){
        return super.peek();
    }

    public E remove(){
        return super.remove();
    }

    public void addValue(E value){
        super.add(value);
    }

    public boolean isEmpty(){
        return super.isEmpty();
    } 

    public int size(){
        return super.size();
    }

    public void clear(){
        super.clear();
    }
}
