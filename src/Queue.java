public class Queue implements DataStructure{
    Object[] objects = new Object[100];
    int nextGet = 0;
    int nextPut = 0;
    int count = 0;
    @Override
    public boolean put(Object obj) {
        if(count < 100) {
            objects[nextPut] = obj;
            nextPut = nextPut + 1;
            count = count + 1;
            return true;
        }
        else{
            System.out.println("put Over 100!!");
            return false;
        }
    }

    @Override
    public Object get() {
        if (count > 0) {

            Object obj = objects[nextGet];
            objects[nextGet] = "empty";
            nextGet++;
            count = count - 1;
            return obj;
        } else {
            System.out.println("get Over 100!!");
            return false;
        }
    }

    public String toString() {
        String out = "[";
        for (int i = 0; i < 100; i = i + 1) {
            out = out + " " + objects[i];
        }
        out = out + "]\n";
        out = out + "count " + count + " nextGet " + nextGet + " nextPut " + nextPut;
        return out;
    }


}