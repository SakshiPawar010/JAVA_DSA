
class MyThread extends Thread{
	public void run(){
		System.out.println("Child Thread = " + Thread.currentThread().getName());

		for(int i=0; i<10; i++){
			System.out.println("In run");

			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){
		
			}

		}
	}
}	

class Thread2Demo{
	public static void main(String [] args) throws InterruptedException{
		MyThread obj = new MyThread();
		obj.start();

		for (int i=0; i<10; i++){
			System.out.println("In Main");
			Thread.sleep(2000);               
	
		}
	}
}
