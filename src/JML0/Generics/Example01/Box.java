package JML0.Generics.Example01;

public class Box<T> {
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}

//public class Box {
//    private Object value;
//
//    public Object getValue(){
//        return value;
//    }
//
//    public void setValue(Object value){
//        this.value = value;
//    }
//}

