
class Demo extends Thread{
	public void run(){
		System.out.println("Demo : " + Thread.currentThread().getName());             // 3. Demo : Thread-1
	}
}

class MyThread extends Thread{
	public void run(){
		System.out.println("MyThread : " + Thread.currentThread().getName());         // 2. MyThread : Thread-0
		Demo obj = new Demo();
		obj.start();
	}
}

class Thread4Demo{
	public static void main(String [] args){
		System.out.println("Thread4Demo : " + Thread.currentThread().getName());      // 1. Thread4Demo : main
		MyThread obj = new MyThread();
		obj.start();
	}
}
