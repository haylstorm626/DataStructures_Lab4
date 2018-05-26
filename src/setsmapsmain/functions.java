
package setsmapsmain;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class functions
{
    private TreeMap<String, Integer> letters;
    private String word;
    private Scanner scan;

    public functions() throws IOException
    {
        letters = new TreeMap<>();
        scan = new Scanner(new File(
          "words.txt"));
    }
    
    public void read()
    {
        while(scan.hasNext())
        {
            word = scan.nextLine().toLowerCase();
            String[] splitified = word.split("\\s+");
            for(String part:splitified)
            {
                store(part);
            }
        }
        scan.close();
    }

    public void store( String aword )
    {
        if ( ( aword.charAt(0) == 'a' ) || ( aword.charAt(0) == 'e' ) || ( aword.charAt(0) == 'i' ) || ( aword.charAt(0) == 'o' ) || ( aword.charAt(0) == 'u' ) )
        {
            if ( letters.containsKey(aword) )
            {
                int val = letters.get(aword);
                val++;
                letters.put(aword, val);
            }
            else
            {
                letters.put(aword, 1);
            }
        }
    }

    public TreeMap<String,Integer> display()
    {
        return letters;
    }
}
