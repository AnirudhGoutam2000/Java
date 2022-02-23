class MyThread extends Thread{
	public void run(){
		try{V.u.join();}catch(InterruptedException e){e.printStackTrace();}
		
		Thread t = Thread.currentThread();

		for(int i=0;i<10;i++){
			System.out.println(i+" # "+t.getName());
		}
	}
}

class V{
	static Thread u;

	public static void main(String[] args) throws InterruptedException{
		u = Thread.currentThread();
		
		MyThread x = new MyThread();
		x.setName("A");
		x.start();		

		for(int i=0;i<10;i++){
			System.out.println(i+" # "+u.getName());
		}
	}
}