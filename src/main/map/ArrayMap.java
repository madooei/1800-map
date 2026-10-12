package map;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An array-backed implementation of the Map ADT.
 *
 * @param <K> the type of keys in this map.
 * @param <V> the type of values in this map.
 */
public class ArrayMap<K, V> implements Map<K, V> {

  private Entry<K, V>[] arr;  // the backing array
  private int size;           // how many pairs the map holds

  private static class Entry<K, V> implements Map.Entry<K, V> {
    K key;
    V value;

    Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public K key() {
      // TODO: Implement me
      throw new UnsupportedOperationException("TODO: Implement me");
    }

    @Override
    public V value() {
      // TODO: Implement me
      throw new UnsupportedOperationException("TODO: Implement me");
    }
  }

  // arr only ever holds Entry<K, V>, so the cast is safe.
  @SuppressWarnings("unchecked")
  public ArrayMap() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public V get(K key) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public boolean containsKey(K key) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public boolean put(K key, V value) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public boolean remove(K key) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public int size() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public Iterator<K> iterator() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  @Override
  public Iterable<Map.Entry<K, V>> entries() {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Returns the index of the entry holding key, or -1 if key is not found.
  private int indexOf(K key) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Doubles the capacity. Same cast rationale as the constructor.
  @SuppressWarnings("unchecked")
  private void grow() {
    Entry<K, V>[] bigger = (Entry<K, V>[]) new Entry[arr.length * 2];
    for (int i = 0; i < size; i++) {
      bigger[i] = arr[i];
    }
    arr = bigger;
  }

  // Walks the filled prefix of the backing array, returning each entry's key.
  private class KeyIterator implements Iterator<K> {
    private int cursor = 0;  // index of the entry whose key comes next

    @Override
    public boolean hasNext() {
      // TODO: Implement me
      throw new UnsupportedOperationException("TODO: Implement me");
    }

    @Override
    public K next() {
      // TODO: Implement me
      throw new UnsupportedOperationException("TODO: Implement me");
    }
  }

  // The Iterable that entries() returns. Each call to iterator() starts a new traversal.
  private class Entries implements Iterable<Map.Entry<K, V>> {
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
      // TODO: Implement me
      throw new UnsupportedOperationException("TODO: Implement me");
    }
  }

  // Walks the filled prefix of the backing array, returning each entry itself.
  private class EntryIterator implements Iterator<Map.Entry<K, V>> {
    private int cursor = 0;  // index of the entry that comes next

    @Override
    public boolean hasNext() {
      // TODO: Implement me
      throw new UnsupportedOperationException("TODO: Implement me");
    }

    @Override
    public Map.Entry<K, V> next() {
      // TODO: Implement me
      throw new UnsupportedOperationException("TODO: Implement me");
    }
  }
}
