public class MultiThreading extends Thread{
public void run(){
    System.out.println("i am main thread");
   
}

public static void main(String h[]){
MultiThreading m=new MultiThreading();
m.start();
}
}