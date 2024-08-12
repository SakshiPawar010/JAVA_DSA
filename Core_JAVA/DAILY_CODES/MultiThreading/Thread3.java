
//WRONG CODE
//Don't override start method ever

class MyThread extends Thread{

	public void run(){
		System.out.println("In Run");
		System.out.println(Thread.currentThread().getName());
	}
	
	public void start(){
		System.out.println("In MyThread Start");
		run();
	}
}

class Thread3Demo{
	public static void main(String [] args ){
		MyThread obj = new MyThread();
		obj.start();
		System.out.println(Thread.currentThread().getName());

	}
}
