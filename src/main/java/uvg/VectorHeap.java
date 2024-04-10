package uvg;

import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements UVGPriorityQueue<E> {
    
    protected Vector<E> data;

    public  VectorHeap(){
        data = new Vector<E>();
    }

    
    /** 
     * @param v
     */
    public VectorHeap(Vector<E> v){
        int i;
        data = new Vector<E>(v.size());
        for(i = 0; i <v.size(); i++){
            addValue(v.get(i));
        }
    }

    
    /** 
     * @param i
     * @return int
     */
    protected static int parent(int i){
        return (i-1)/2;
    }

    
    /** 
     * @param i
     * @return int
     */
    protected static int left(int i){
        return (2*i)+1;
    }

    
    /** 
     * @param i
     * @return int
     */
    protected static int right(int i){
        return 2*(i+1);
    }

    
    /** 
     * @param leaf
     */
    public void percolateUp(int leaf){
        int parent = parent(leaf);
        E value = data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) < 0 )){
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf, value);
    }

    
    /** 
     * @param value
     */
    public void addValue(E value){
        data.add(value);
        percolateUp(data.size()-1);
    }

    
    /** 
     * @param root
     */
    protected void pushDownRoot(int root){
        int heapSize = data.size();
        E value = data.get(root);

        while(root < heapSize){
            int childPos = left(root);
            if(childPos < heapSize){
                if((right(root) < heapSize) && (data.get(childPos+1)).compareTo(data.get(childPos))<0){
                    childPos++;
                }

                if((data.get(childPos)).compareTo(value) < 0){
                    data.set(root, data.get(childPos));
                    root = childPos;
                }else{
                    data.set(root, value);
                    return;
                }
            }
            else{
                data.set(root, value);
                return;
            }
        }
    }


    
    /** 
     * @return E
     */
    public E getFirst(){
        return data.get(0);
    }

    
    /** 
     * @return E
     */
    public E remove(){
        E minVal = getFirst();
        data.set(0, data.get(data.size()-1));
        data.setSize(data.size()-1);
        if(data.size() > 1) pushDownRoot(0);
        return minVal;
    }

    
    /** 
     * @return boolean
     */
    public boolean isEmpty(){
        return data.isEmpty();
    }

    public void clear(){
        data = new Vector<E>();
    }

    
    /** 
     * @return int
     */
    public int size(){
        return data.size();
    }
}
