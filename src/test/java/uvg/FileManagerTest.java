package uvg;


import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;


public class FileManagerTest {
    
    @Test
    public void readTXTFileTest() throws FileNotFoundException, IOException{
        FileManager fileManager = new FileManager();
        String expected = "Juan Perez, fractura de pierna, C| Maria Ramirez, apendicitis, A| Lorenzo Toledo, chikunguya, E| Carmen Sarmientos, dolores de parto, B| ";
        String result = fileManager.readTXTFile("patientsTest.txt");
        System.out.println(result);
        assertTrue(result.equals(expected));
    }
}
