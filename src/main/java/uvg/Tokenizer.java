package uvg;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {
    
    
    /** 
     * @param str
     * @return ArrayList<Association<String, String>>
     */
    public ArrayList<Patient> getAssociations(String str){

        String regex = " *([^,]*), *([^,]*), *([^,]*)\\|";
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(str);
        ArrayList<Patient> resultArr = new ArrayList<Patient>();

        while(matcher.find()){
            resultArr.add(new Patient(matcher.group(1), matcher.group(2), matcher.group(3)));
        }

        return resultArr;
        
    }
}
