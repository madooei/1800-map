package map;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A node-backed implementation of the Map ADT.
 *
 * @param <K> the type of keys in this map.
 * @param <V> the type of values in this map.
 */
public class LinkedMap<K, V> implements Map<K, V> {

  private Node<K, V> head;  // the first node, or null when empty
  private int size;         // how many pairs the map holds

  private static class Node<K, V> implements Map.Entry<K, V> {
    K key;
    V value;
    Node<K, V> next;

    Node(K key, V value) {
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

  public LinkedMap() {
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

  // Walks the node chain from head, returning each node's key.
  private class KeyIterator implements Iterator<K> {
    private Node<K, V> current = head;  // node whose key comes next

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

  // Walks the node chain from head, returning each node as a read-only entry.
  private class EntryIterator implements Iterator<Map.Entry<K, V>> {
    private Node<K, V> current = head;  // node that comes next

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
