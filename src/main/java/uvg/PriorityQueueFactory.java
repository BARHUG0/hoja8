package uvg;

public class PriorityQueueFactory<E extends Comparable<E>> {
    
    public UVGPriorityQueue<E> create(String type){
        switch (type) {
            case "mine":
                return new VectorHeap<E>();
            
            case "java":
                return new JavaPriorityQueue<E>();
        
            default:
                return null;
        }
    }
}
