package stringBufferNBuilder;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class DataTypeConversion {
	public double stringToDouble(String input){
		System.out.println("----------------------String to double--------------------------");
		double d=Double.parseDouble(input);
		System.out.println("The string is converted into double as "+d);
		return d;
	}
	
	public String intToString(Integer input){
		System.out.println("------------------Integer to string------------------------------");
		String sInput=Integer.toString(input);
		System.out.println("The integer is converted into string as "+sInput);
		return sInput;
	}
	
	public String dateToString(){
		  Date date = Calendar.getInstance().getTime(); 
		  System.out.println("------------------Date to String------------------------------");
		  System.out.println("Before conversion, the date is "+date);
		  //DateFormat is an abstract class with its child Simple Format
          DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
          String strDate = dateFormat.format(date);  
          System.out.println("Converted String: " + strDate+" having the data type as "+strDate.getClass());  
		return strDate;
	}
	
	public Date stringToDate() throws ParseException{
		String dateString="12 31, 1998";
		SimpleDateFormat sdf=new SimpleDateFormat("MM dd, yyyy");
		System.out.println("------------------String to date------------------------------");
		System.out.println("The string is converted into date as "+sdf.parse(dateString));
		return sdf.parse(dateString);
	}
	
	public static void main(String[] args) throws ParseException {
		double d = 123.454d;
		//Converting as 2 places next to decimal using DecimalFormat
		DecimalFormat df=new DecimalFormat("#.##");
		double d1=Double.valueOf(df.format(d));
		String way1= Double.toString(d1);
		System.out.println("The new value of the given input now is "+way1+" and its data type is "+way1.getClass());
		String way2=String.valueOf(d1);
		System.out.println("The new value of the given input now is "+way2+" and its data type is "+way2.getClass());
		String way3=d1+"";
		System.out.println("The new value of the given input now is "+way3+" and its data type is "+way3.getClass());
		
		DataTypeConversion dtObj=new DataTypeConversion();
		dtObj.stringToDouble("123");
		dtObj.intToString(2345);
		dtObj.dateToString();
		dtObj.stringToDate();
	}
		
}
