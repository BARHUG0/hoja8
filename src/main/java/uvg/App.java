package uvg;


import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Tokenizer tokenizer = new Tokenizer();
        ArrayList<Patient> associations = new ArrayList<Patient>();
        associations.add(new Patient("Juan Perez", "fractura de pierna", "C"));
        associations.add(new Patient("Maria Ramirez", "apendicitis", "A"));
        associations.add(new Patient("Lorenzo Toledo", "chikunguya", "E"));
        associations.add(new Patient("Carmen Sarmientos", "dolores de parto", "B"));

        

        ArrayList<Patient> test = tokenizer.getAssociations("Juan Perez, fractura de pierna, C| Maria Ramirez, apendicitis, A| Lorenzo Toledo, chikunguya, E| Carmen Sarmientos, dolores de parto, B| ");

        for(int i = 0; i < associations.size(); i++){
            //assertTrue(associations.get(i).equals(test.get(i)));
        }
    }
}
