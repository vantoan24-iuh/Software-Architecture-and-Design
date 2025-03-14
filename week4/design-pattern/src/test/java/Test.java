import singleton.ThreadSafeSingleton;

public class Test {
    public static void main(String[] args) {
//        System.out.println("-.-");
        Thread thread1=new Thread(new Thread1());
        Thread thread2=new Thread(new Thread2());
        Thread thread3=new Thread(new Thread3());
        Thread thread4=new Thread(new Thread4());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    static class Thread1 implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance("1");
            System.out.println("hashcode1 = "+threadSafeSingleton.hashCode() );
        }
    }

    static class Thread2 implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance("2");
            System.out.println("hashcode2 = "+threadSafeSingleton.hashCode());
        }
    }

    static class Thread3 implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance("3");
            System.out.println("hashcode3 = "+threadSafeSingleton.hashCode());
        }
    }

    static class Thread4 implements Runnable{

        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance("4");
            System.out.println("hashcode4 = "+threadSafeSingleton.hashCode());
        }
    }
}

