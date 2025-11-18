class boo{
 public void printm(String m,int t){
try{
  while(true){
   System.out.println(m);
   Thread.sleep(t);
   }
}catch(InterruptedException e){
 System.out.println(e);
}

}
}

class testboo{
public static void main(String[] args){
 boo b = new boo();
 Thread t1 = new Thread(()->b.printm("Good Morning",1000));
 Thread t2 = new Thread(()->b.printm("Hello",2000));
 Thread t3 = new Thread(()->b.printm("Welcome",3000));
 t1.start();
 t2.start();
 t3.start();
}
}