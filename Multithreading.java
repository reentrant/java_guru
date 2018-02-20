package java_guru99;

import java.util.Random;

public class Multithreading{
	public static void main(String[] args) {
		ConcurrentThreads thread1 = new ConcurrentThreads("thread1");
		thread1.start();
		ConcurrentThreads thread2 = new ConcurrentThreads("thread2");
		thread2.start();
	}
}

class ConcurrentThreads implements Runnable {
	int x; // thread own copy
	 Thread threadInstance;
	 private String threadName;

	 ConcurrentThreads(String name) {
	  threadName = name;
	 }
	 
	 @Override
	 public void run() {
	  System.out.println("Thread running " + threadName);
	  System.out.println(threadInstance.getClass());
	  for (int i = 0; i < 4; i++) {
		  x++;
		  System.out.print(threadName + '\t');
		  System.out.println(x);
	   
	   try {
	    Thread.sleep(new Random().nextInt(100));
	   } catch (InterruptedException e) {
	    System.out.println("Thread has been interrupted");
	   }
	  }
	 }
	 
	 public void start() {
	  
	  if (threadInstance == null) {
	   threadInstance = new Thread(this, threadName);
	   threadInstance.start();
	   System.out.println("Thread started " + threadName);
	  }

	 }
	}
