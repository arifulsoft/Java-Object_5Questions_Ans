
package last_practice5;


public class Thread1 {
    public static void main(String[] args) {
        Thread s1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
                
            }
        });
        Thread s2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
                
            }
        });
        Thread s3=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
                
            }
        });
        s1.start();
        s2.start();
        s3.start();
        
    }
}
