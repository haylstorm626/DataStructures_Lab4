
package setsmapsmain;

import java.io.IOException;

public class SetsMapsMain
{
    public static void main( String[] args ) throws IOException
    {
        functions function = new functions();
        function.read();
        System.out.println(function.display());
    }
}
