import com.sun.tools.javac.util.Convert;
import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * Created by bka14 on 20/05/2016.
 */
public class BladTing {

    String name;

    public BladTing(String name)  {

        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int factorial(int x) {

        int fact = 1;

        if(x < 1)
            return -1;

        for(int y = 1; y <= x; y++) {
            fact = fact * y;
        }

        return fact;
    }

    public int returnSpecificCharacterCount(String s, Character x) {

        int charCount = 0;
        char[] split = s.toCharArray();

        for (int i = 0; i < split.length; i++) {
            if(split[i] == x)
                charCount++;
        }
        return charCount;
    }

    public String convertStringToASCIICode(String s)
    {
        char[] split = s.toCharArray();
        String z = "";

        for (char x: split) {
            int temp = (int)x;
            z += "{" + temp + "}";
        }

        return z;
    }

    public char convertASCIICodeToString(int s)
    {
        char c = (char)s;
        System.out.print("c: " + c);
        return c;
    }

    public String convertASCIICodeToString2(int[] i)
    {
        int pos = 0;
        char[] x = new char[i.length];
        String str = "";
        for (int a: i) {
            char c = (char)a;
            str += Character.toString(c);
            pos++;
        }

        return str;
    }
}
