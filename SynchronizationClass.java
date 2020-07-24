package collection;

public class SynchronizationClass {
	
	void methodNoSync(int n) throws InterruptedException{
		for(int i=0;i<5;i++){
			System.out.println(n*i);
			Thread.sleep(400);
	}
}
	
public class MyThread1 extends Thread{
	SynchronizationClass scType;
	MyThread1(SynchronizationClass sc){
		this.scType=sc;
	}
	
	public void run(){  
		try {
			scType.methodNoSync(5);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}  
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizationClass scObj=new SynchronizationClass();
		Thread th=new Thread(scObj);
	}

}
