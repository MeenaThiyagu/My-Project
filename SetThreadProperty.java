package multiThreading;

import java.util.Set;

public class SetThreadProperty extends Thread {
	
	public synchronized void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of the class");
		}
	}

	public static void main(String[] args) {
		SetThreadProperty setProp=new SetThreadProperty();
		setProp.setName("Meena");
		setProp.setPriority(MIN_PRIORITY);//should be set before start()
		setProp.start();
		
		Set<Thread> threads = SetThreadProperty.getAllStackTraces().keySet();
		 
		for (Thread t : threads) {
		    String name = t.getName();
		    Thread.State state = t.getState();
		    int priority = t.getPriority();
		    String type = t.isDaemon() ? "Daemon" : "Normal";
		    System.out.printf("%-20s \t %s \t %d \t %s\n", name, state, priority, type);
		}
	}

}
