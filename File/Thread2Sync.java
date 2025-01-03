class Counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

class NewThread extends Thread{
    private Counter counter;
    private int thread_num;

    NewThread(Counter counter, int thread_num){
        this.counter = counter;
        this.thread_num = thread_num;
    }

    public void run(){
        for(int i=0;i<200;i++){
            System.out.print("Thread " + thread_num + ": ");
            System.out.println(counter.getCount());
            counter.increment();
            try{
                Thread.sleep(100);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class Thread2Sync {
    public static void main(String[] args){
        Counter counter = new Counter();
        Thread thread1 = new NewThread(counter, 1);
        Thread thread2 = new NewThread(counter, 2);

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(counter.getCount());
    }
}




// class Counter {
//     private int count = 0;

//     public synchronized void increment() {
//         count++;
//     }

//     public int getCount() {
//         return count;
//     }
// }

// class CounterThread extends Thread {
//     private Counter counter;

//     public CounterThread(Counter counter) {
//         this.counter = counter;
//     }

//     public void run() {
//         for (int i = 0; i < 1000; i++) {
//             counter.increment();
//         }
//     }
// }

// public class Thread2Sync {
//     public static void main(String[] args) {
//         Counter counter = new Counter();
//         CounterThread thread1 = new CounterThread(counter);
//         CounterThread thread2 = new CounterThread(counter);

//         thread1.start();
//         thread2.start();

//         try {
//             thread1.join();
//             thread2.join();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

//         System.out.println("Final count: " + counter.getCount());
//     }
// }
