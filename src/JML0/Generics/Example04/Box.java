package JML0.Generics.Example04;

//1.-> Bounding the generic keyword with the super class "Number" thus if -> 2
public class Box<T extends Number> {
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
