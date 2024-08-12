class MyThread extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("In run");
		}
		System.out.println(Thread.currentThread().getName());
	}
}

class ThreadDemo{
	public static void main(String [] args){
		MyThread obj = new MyThread();
		obj.start();
		for (int i=0; i<=10; i++){
			System.out.println("In main");
		}

		System.out.println(Thread.currentThread().getName());
	}
}
