package JML0.Generics.Example02;

public class Box<K, V> {
    private K key;
    private V value;

    public Box(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}


