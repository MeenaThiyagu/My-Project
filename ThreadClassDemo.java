package multiThreading;

import java.util.Set;

public class ThreadClassDemo extends Thread {
	int number;
	int i=1;
	int fact=1;
	
	ThreadClassDemo(int number){
		this.number=number;
	}
	
	public void run(){
		while(i<=number){
			fact=fact*i;
			i++;
			System.out.println("---------");
			System.out.println("This thread is dedicated for extending thread class");
		}
		System.out.println("factorial of given number is "+fact);
	}
	
	public static void main(String[] args) {
		ThreadClass thObj=new ThreadClass(5);//One way is passing value through constructor
		thObj.number=6;//Other way is passing value just to the Thread class variable
		ThreadClass thObj2=new ThreadClass(5);
		thObj.start();//this takes value of the input as 6
		thObj2.start();
		ThreadClass thObj3=new ThreadClass(4);
		thObj3.start();
		ThreadDemoTwo ruObj=new ThreadDemoTwo(4);
		ruObj.start();
		
		ruObj.setPriority(MAX_PRIORITY);
		thObj.setPriority(MIN_PRIORITY);
		
		//Finding all the active threads
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		
		for (Thread t : threadSet) {
		    String name = t.getName();
		    Thread.State state = t.getState();
		    int priority = t.getPriority();
		    String type = t.isDaemon() ? "Daemon" : "Normal";
		    System.out.printf("%-20s \t %s \t %d \t %s\n", name, state, priority, type);
		}
	}
}

class ThreadDemoTwo extends Thread {
	int number;
	int i=1;
	int fact=1;
	ThreadDemoTwo(int number){
		this.number=number;
	}
	public void run(){
		for(int i=0;i<number;i++){
		System.out.println("The given number is "+fact);
		}
	}
}
