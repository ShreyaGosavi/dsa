public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 0;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int[size];
    }

    int ptr = -1;

    public boolean push(int item){
        if(isFull()){
            System.out.println("Array is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot delete from an empty Stack!");
        }
        int removed = data[ptr];
        ptr -= 1;
        return removed;


        //return data[ptr--];
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty Stack!");
        }
        return data[ptr];
    }
}
