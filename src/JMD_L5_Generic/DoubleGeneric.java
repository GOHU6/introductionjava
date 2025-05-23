package JMD_L5_Generic;

//Classe générique avec deux types : K et V
public class DoubleGeneric<K, V> {
	
	private K key;
    private V value;

    public DoubleGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
    
}
