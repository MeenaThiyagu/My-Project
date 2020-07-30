package multiThreading;

class One extends Thread {
	public void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of first class");
		}
	}
}
class Two extends Thread {
	public void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of second class");
		}
	}
}

class Three implements Runnable {
	public synchronized void run(){
		for(int i=0;i<2;i++){
			System.out.println("this is the "+i+" thread of third class");
		}
	}
}

public class JoinThreads {

	public static void main(String[] args) throws InterruptedException {
		One obj1=new One();
		Two obj2=new Two();
		Runnable rObj3=new Three();
		Thread obj3=new Thread(rObj3);
		obj1.start();
		obj1.join();
		obj2.start();
		obj2.join();
		obj3.start();
	}

}
