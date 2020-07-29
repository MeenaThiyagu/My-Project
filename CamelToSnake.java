package stringBufferNBuilder;

public class CamelToSnake {
	String inputVal;
	String result="";

	public String CamelToSnakeMethod(String input){
		char ch=input.charAt(0);//first character taken
		result=result+Character.toLowerCase(ch);//first character lower cased

		for(int i=0; i<input.length();i++){
			ch=input.charAt(i);
			 if (Character.isUpperCase(ch)) { 
	                result =  result+'_' ; 
	                result = result	 + Character.toLowerCase(ch); 
	            } 
			 else
				 result=result+ch;
		}
		return result;
	}
	
	public static void main(String[] args) {
		CamelToSnake cToS=new CamelToSnake();
		cToS.inputVal="IAmWhatIAm";
		String resulted=cToS.CamelToSnakeMethod(cToS.inputVal);
		System.out.println("The value is "+resulted);

	}

}
