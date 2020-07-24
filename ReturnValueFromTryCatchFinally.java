package exceptions;

import java.util.ArrayList;
import java.util.LinkedList;

public class ReturnValueFromTryCatchFinally
{
    public static void main(String[] args)
    {
        System.out.println(methodReturningValue());
        ArrayList al=new ArrayList<String>();
        LinkedList al2=new LinkedList<String>();
        al.add("hi");
        
    }
 
    static int methodReturningValue()
    {
        int i = 0;
 
        try
        {
            i = 1;
            return i;
        }
        catch (Exception e)
        {
           i = 2;
           System.out.println(i);
           return i;
        }
        finally
        {
         return i = 3;
        }
//System.out.println("Hello");
//       return i;
    }
}
