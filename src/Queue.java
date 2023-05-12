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
        count = 2;
        if (count < 100) {
            nextGet = count;
            count = count + 1;
            Object obj = objects[nextGet];
        } else {
            System.out.println("get Over 100!!");
            return false;
        }
        return null;
    }
}