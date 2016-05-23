import com.sun.tools.javac.util.Convert;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.Arrays;

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

    public String sortStringByASCCIICode(String s)
    {
        char[] split = s.toCharArray();

        int[] charToInt = new int[s.length()];

        char[] intToChar = new char[s.length()];

        int pos = 0;

        String z = "";

        for (char x: split) {
            int temp = (int)x;
            charToInt[pos]= temp;
            pos++;
            z += "{" + temp + "}";
        }

        System.out.println("Z: " + z);
        Arrays.sort(split);

        String str = "";
        pos = 0;

        for (int a: split) {
            char c = (char)a;
            str += Character.toString(c);
            pos++;
        }
        System.out.println("str: " + str);
        return str;
    }
}
