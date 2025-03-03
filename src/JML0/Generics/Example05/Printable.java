package JML0.Generics.Example05;

// Multiple Bounds

//Interface
interface Printable {
    void print(int a);
}

//Implementing class
 class MyNumber extends Number implements Printable{
    private int value; // 21

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    //Constructor
    public MyNumber(int value){
        this.value = value;
    }


    public void print(int v){
        System.out.println("The value is :" + v);
    }


    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue(){
        return value;
    }

    @Override
    public float floatValue(){
        return value;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

}

//                    |
//                    |
//                    |
//                    V

class Box<T extends Number & Printable>{
    private T item;

    public Box(T item){
        this.item = item;
    }

    public void display(){
        item.print(7);
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
