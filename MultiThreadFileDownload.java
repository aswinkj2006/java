class DownloadThread extends Thread {
 private int chunkNo;
 private static int completed = 0;
 public DownloadThread(int chunkNo) {
 this.chunkNo = chunkNo;
 }
 public void run() {
 try {
 System.out.println("Downloading chunk " + chunkNo + "...");
 Thread.sleep(1000); // Simulate download time
 System.out.println("Chunk " + chunkNo + " downloaded.");
 synchronized (DownloadThread.class) {
 completed++;
 DownloadThread.class.notifyAll(); // Notify when one chunk finishes
 }
 } catch (InterruptedException e) {
 System.out.println("Error in chunk " + chunkNo);
 }
 }
 public static synchronized int getCompletedChunks() {
 return completed;
 }
}
public class MultiThreadFileDownload {
 public static void main(String[] args) throws InterruptedException {
 DownloadThread t1 = new DownloadThread(1);
 DownloadThread t2 = new DownloadThread(2);
 DownloadThread t3 = new DownloadThread(3);
 t1.start();
 t2.start();
 t3.start();
 synchronized (DownloadThread.class) {
 while (DownloadThread.getCompletedChunks() < 3) {
 DownloadThread.class.wait();
 }
 }
 System.out.println("All chunks downloaded. Merging into final file...");
 System.out.println("File merged successfully!");
 }
}