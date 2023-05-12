import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        Queue myQ = new Queue();
        myQ.put("Owen");
        myQ.put("Lin");
        myQ.put("Hernandez");

        for(int i = 0;i< 100;i =i+1) {
            myQ.put(i);
        }

        for(int i = 0;i< 100;i =i+1) {
            Object obj1 = myQ.get();
            System.out.println(obj1);
        }
        
    }
}