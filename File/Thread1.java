class Task1 extends Thread{
    public void run(){
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print("Thread 1: ");
            System.out.println(ch);
            try{
                Thread.sleep(200);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        for(char ch = 'a'; ch <= 'z'; ch++){
            System.out.print("Thread 1: ");
            System.out.println(ch);
            try{
                Thread.sleep(200);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread 1 end");
    }
}

class Task2 extends Thread{
    public void run(){
        for(int i = 0;i<100;i++){
            System.out.print("Thread 2: ");
            System.out.println("@");
            try{
                Thread.sleep(200);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread 2 end");
    }
}

class Task3 extends Thread{
    public void run(){
        for(int i = 1;i<= 100;i++){
            System.out.print("Thread 3: ");
            System.out.println(i);
            try{
                Thread.sleep(200);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread 3 end");
    }
}

public class Thread1{
    
    public static void main(String[] args){
        Thread thread1 = new Task1();
        Thread thread2 = new Task2();
        Thread thread3 = new Task3();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}