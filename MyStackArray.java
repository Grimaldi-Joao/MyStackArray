public class MyStackArray<t> {

    private t[] values;
    private int top;
    private int size;

    public MyStackArray(int size){
        this.values = (t[])new Object[size];
        this.top = 0;
    }
    
    public boolean isEmpty(){
        return top == 0;
    }

    public void push(t value){

    }


}