package singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private String value;
    private ThreadSafeSingleton(String value){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException es){
            es.printStackTrace();
        }
       this.value=value;
    }
    public static ThreadSafeSingleton getInstance(String value){
        if(instance == null){
            instance = new ThreadSafeSingleton(value);
        }
        return instance;
    }
}
