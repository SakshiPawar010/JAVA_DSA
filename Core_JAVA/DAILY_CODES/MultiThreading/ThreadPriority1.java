
class MyThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}

class Priority1Demo{
	public static void main(String [] args){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());

		MyThread obj1 = new MyThread();
		obj1.start();

		//obj1.start();               //ERROR: EXCEPTION IllegalThreadStateException >> because thread once started we cannot restart to that state it it will throw exception

		t.setPriority(7);

		MyThread obj2 = new MyThread();
                obj2.start();
	}
}
