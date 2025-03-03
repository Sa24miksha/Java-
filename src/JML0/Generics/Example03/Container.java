package JML0.Generics.Example03;

public interface Container<T> {
    void show(T item);
    T get();
}

    class GenericsContainer<T> implements Container<T>{
    private T item;

    //Setter
    @Override
    public void show(T item){
        this.item = item;
    }


    @Override
    public T get(){
        return item;
    }

}
