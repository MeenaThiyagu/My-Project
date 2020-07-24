package exceptions;

public class NestedTryCatch {

	public static void main(String[] args) {
		String[] s={"123","Hello:",null};
		
		for (int i=0;i<s.length;i++){
			try{
				int a= s[i+1].length();
				System.out.println("Value of a is "+a);
				try{
					System.out.println(s[i+2]);
					try{
						a=Integer.parseInt(s[i+1]);
						System.out.println(a);
					}
					catch (NumberFormatException ex)
					{
						System.out.println("NumberFormatException will be caught here");
						//System.out.println("ArrayIndexOutOfBoundsException will be caught here");
		            }
					/*catch (ArrayIndexOutOfBoundsException e)
                    {
						System.out.println("ArrayIndexOutOfBoundsException will be caught here");
                       // System.out.println("NumberFormatException will be caught here");
                    }*/
				}	
				catch (ArrayIndexOutOfBoundsException e)
                {
					System.out.println("ArrayIndexOutOfBoundsException will be caught here");
                   // System.out.println("NumberFormatException will be caught here");
                }
				/*catch (NumberFormatException ex)
				{
					System.out.println("NumberFormatException will be caught here");
					//System.out.println("ArrayIndexOutOfBoundsException will be caught here");
	            }*/
			}
			catch(NullPointerException ex)
			{
				System.out.println("NullPointerException will be caught here");
		    }
		}
			
	}
}

//Try catch with return values
//https://javaconceptoftheday.com/return-value-from-try-catch-finally-blocks/


