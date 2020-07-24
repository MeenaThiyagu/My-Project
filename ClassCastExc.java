package exceptions;

public class ClassCastExc {
	int i=10;
	 
    public static void main(String[] args)
    {
    	ClassCastExc a = new C1();   //B type is auto up casted to A type
    	C1 b = (C1) a;     //A type is explicitly down casted to B type.
       C11 c = (C11) b;    //Here, you will get class cast exception
       System.out.println(b.j);
    }
}
//ArrayAsList -- //ClassNotFound
class C1 extends ClassCastExc{
	int j=20;
}

class C11 extends C1{
	int k=20;
}

	
	/*trying to cast string object to integer
		Object imObject = new String();
		Integer i = (Integer) imObject;		
	}
	*/


