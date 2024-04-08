package uvg;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class VectorHeapTest {
    
    @Test
    public void behaviorTest(){
        VectorHeap<Integer> vectorHeap = new VectorHeap<Integer>();

        vectorHeap.addValue(-1);
        vectorHeap.addValue(0);
        vectorHeap.addValue(1);
        
        long removed = vectorHeap.remove();
        assertEquals(-1, removed);

        removed = vectorHeap.remove();
        assertEquals(0, removed);

        removed = vectorHeap.remove();
        assertEquals(1, removed);


        vectorHeap.addValue(1);
        vectorHeap.addValue(0);
        vectorHeap.addValue(-1);
       
        removed = vectorHeap.remove();
        assertEquals(-1, removed);

        removed = vectorHeap.remove();
        assertEquals(0, removed);

        removed = vectorHeap.remove();
        assertEquals(1, removed);



        vectorHeap.addValue(1);
        vectorHeap.addValue(43);
        vectorHeap.addValue(3);
        vectorHeap.addValue(-1);
        vectorHeap.addValue(3);
        vectorHeap.addValue(0);
        vectorHeap.addValue(2);
        
       
        removed = vectorHeap.remove();
        assertEquals(-1, removed);

        removed = vectorHeap.remove();
        assertEquals(0, removed);

        removed = vectorHeap.remove();
        assertEquals(1, removed);

        removed = vectorHeap.remove();
        assertEquals(2, removed);

        removed = vectorHeap.remove();
        assertEquals(3, removed);

        removed = vectorHeap.remove();
        assertEquals(3, removed);

        removed = vectorHeap.remove();
        assertEquals(43, removed);
    }

    @Test 
    public void isEmptyTest(){
        VectorHeap<Integer> vectorHeap = new VectorHeap<Integer>();

        assertTrue(vectorHeap.isEmpty());

        vectorHeap.addValue(0);

        assertTrue(!vectorHeap.isEmpty());

        vectorHeap.getFirst();
        assertTrue(!vectorHeap.isEmpty());

        vectorHeap.remove();
        assertTrue(vectorHeap.isEmpty());
    }

    @Test
    public void getFirstTest(){
        VectorHeap<Integer> vectorHeap = new VectorHeap<Integer>();

        vectorHeap.addValue(0);
        long first = vectorHeap.getFirst();
        assertEquals(0, first);

        vectorHeap.addValue(-1);
        first = vectorHeap.getFirst();
        assertEquals(-1, first);

        vectorHeap.addValue(1);
        first = vectorHeap.getFirst();
        assertEquals(-1, first);
    
        long removed = vectorHeap.remove();
        first = vectorHeap.getFirst();
        assertEquals(0, first);

        removed = vectorHeap.remove();
        first = vectorHeap.getFirst();
        assertEquals(1, first);

    }

    @Test 
    public void sizeTest(){
        VectorHeap<Integer> vectorHeap = new VectorHeap<Integer>();

        assertEquals(0, vectorHeap.size());

        vectorHeap.addValue(1);
        vectorHeap.addValue(43);
        vectorHeap.addValue(3);
        vectorHeap.addValue(-1);
        vectorHeap.addValue(3);
        vectorHeap.addValue(0);
        vectorHeap.addValue(2);     
        assertEquals(7, vectorHeap.size());

        vectorHeap.remove();
        assertEquals(6, vectorHeap.size());

        vectorHeap.remove();
        vectorHeap.remove();
        assertEquals(4, vectorHeap.size());

        vectorHeap.remove();
        vectorHeap.remove();
        vectorHeap.remove();
        vectorHeap.remove();
        assertEquals(0, vectorHeap.size());

    }

}
