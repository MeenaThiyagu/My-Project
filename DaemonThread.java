package multiThreading;

public class DaemonThread extends Thread {
	//Minimum priority thread; any thread can be set as Daemon thread before its start() method
	//Wether thread is Daemon or not
	public synchronized void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of the class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread dmObj=new DaemonThread();
		dmObj.setDaemon(true);
		dmObj.start();		
		if(dmObj.isDaemon())
			System.out.println("The thread is a Daemon thread");
		else
			System.out.println("The thread is not a Daemon thread");
		System.out.println("The thread ID is "+dmObj.getId());
		System.out.println("The thread groups are "+dmObj.getThreadGroup());
	}

}
