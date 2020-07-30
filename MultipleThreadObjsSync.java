package multiThreading;

public class MultipleThreadObjsSync extends Thread{
	
public synchronized void run(){
	for(int i=0;i<5;i++){
		System.out.println("this is the"+i+" thread of first class");
	}
}
	public static void main(String[] args) {
		MultipleThreadObjsSync fnf=new MultipleThreadObjsSync();
		MultipleThreadObjsSync fnf2=new MultipleThreadObjsSync();
		//fnf2.setPriority(MAX_PRIORITY);
		fnf2.start();
		fnf.start();
		//fnf.join(fnf2);
		
	
	}
}
