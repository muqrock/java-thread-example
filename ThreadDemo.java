class FirstThread extends Thread {
   public void run()
   {
    int a = 8, b = 4, sum;
    sum = a + b;
    System.out.println("FirstThread running");
    System.out.println("Sum is "+sum);
   }  
}

class SecondThread extends Thread {
   public void run()
   {
    int c = 13, d = 5, differ;
    differ = c - d;
    System.out.println("SecondThread running");
    System.out.println("Difference is "+differ);
   }
}

class ThreadDemo {
public static void main(String args[]) {
    FirstThread obj1 = new FirstThread();
    obj1.start();
    System.out.println("FirstThread is runnable");

    SecondThread obj2 = new SecondThread();
    obj2.start();
    System.out.println("SecondThread is runnable");
   }
}
