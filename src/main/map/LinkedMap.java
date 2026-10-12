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
      return key;
    }

    @Override
    public V value() {
      return value;
    }
  }

  public LinkedMap() {
    head = null;  // the map starts empty
    size = 0;
  }

  @Override
  public V get(K key) {
    if (key == null) {
      throw new IllegalArgumentException();
    }
    Node<K, V> curr = head;
    while (curr != null) {
      if (key.equals(curr.key)) {
        return curr.value;
      }
      curr = curr.next;
    }
    return null;
  }

  @Override
  public boolean containsKey(K key) {
    if (key == null) {
      throw new IllegalArgumentException();
    }
    Node<K, V> curr = head;
    while (curr != null) {
      if (key.equals(curr.key)) {
        return true;
      }
      curr = curr.next;
    }
    return false;
  }

  @Override
  public boolean put(K key, V value) {
    if (key == null || value == null) {
      throw new IllegalArgumentException();
    }
    Node<K, V> curr = head;
    while (curr != null) {
      if (key.equals(curr.key)) {
        curr.value = value;  // key present; replace its value
        return false;
      }
      curr = curr.next;
    }
    Node<K, V> newNode = new Node<>(key, value);
    newNode.next = head;  // insert at the head
    head = newNode;
    size++;
    return true;
  }

  @Override
  public boolean remove(K key) {
    if (key == null) {
      throw new IllegalArgumentException();
    }
    Node<K, V> prev = null;
    Node<K, V> curr = head;
    while (curr != null) {
      if (key.equals(curr.key)) {
        if (prev != null) {
          prev.next = curr.next;
        } else {
          head = head.next;
        }
        size--;
        return true;
      }
      prev = curr;
      curr = curr.next;
    }
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public Iterator<K> iterator() {
    return new KeyIterator();
  }

  @Override
  public Iterable<Map.Entry<K, V>> entries() {
    return new Entries();
  }

  // Walks the node chain from head, returning each node's key.
  private class KeyIterator implements Iterator<K> {
    private Node<K, V> current = head;  // node whose key comes next

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public K next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      K key = current.key;
      current = current.next;
      return key;
    }
  }

  // The Iterable that entries() returns. Each call to iterator() starts a new traversal.
  private class Entries implements Iterable<Map.Entry<K, V>> {
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
      return new EntryIterator();
    }
  }

  // Walks the node chain from head, returning each node as a read-only entry.
  private class EntryIterator implements Iterator<Map.Entry<K, V>> {
    private Node<K, V> current = head;  // node that comes next

    @Override
    public boolean hasNext() {
      return current != null;
    }

    @Override
    public Map.Entry<K, V> next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      Node<K, V> node = current;
      current = current.next;
      return node;
    }
  }
}
