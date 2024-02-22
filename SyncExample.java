class SharedResource {
 private int counter = 0;
 private final Object lock = new Object(); // A lock object for synchronization
 // Synchronized method
 public synchronized void synchronizedMethod() {
 counter++;
 System.out.println("Sync Method - Thread " + Thread.currentThread().getId() + " incremented counter to: " + counter);
 }
 // Method using a synchronized block
 public void synchronizedBlockMethod() {
 synchronized (lock) {
 counter++;
 System.out.println("Sync Block - Thread " + Thread.currentThread().getId() + " incremented counter to: " + counter);
 }
 }
}
class MyThread extends Thread {
 private SharedResource sharedResource;
 public MyThread(SharedResource sharedResource) {
 this.sharedResource = sharedResource;
 }
 @Override
 public void run() {
 sharedResource.synchronizedMethod();
 sharedResource.synchronizedBlockMethod();
 }
}
public class SyncExample {
 public static void main(String[] args) {
 SharedResource sharedResource = new SharedResource();
 // Creating multiple threads
 Thread thread1 = new MyThread(sharedResource);
 Thread thread2 = new MyThread(sharedResource);
 Thread thread3 = new MyThread(sharedResource);
 // Starting the threads
 thread1.start();
 thread2.start();
 thread3.start();
 }
}