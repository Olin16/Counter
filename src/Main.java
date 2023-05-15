import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        Queue myQ = new Queue();
        myQ.put("Owen");
        myQ.put("Lin");
        myQ.put("Hernandez");

        Object name1 = myQ.get();
        System.out.println(name1);
        Object name2 = myQ.get();
        System.out.println(name2);
        Object name3 = myQ.get();
        System.out.println(name3);

        for(int i = 0;i < 100;i = i + 1) {
            myQ.put(i);
            System.out.println(myQ);
        }

        for(int i = 0;i < 100;i = i + 1) {
            Object obj1 = myQ.get();
            System.out.println(obj1);
        }
        
    }
}