package com.hrishikesh.hashtable;
/*************************************************************************
 * Purpose : Implement Hash Map
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 14-06-202
 *
 ************************************************************************/

public class Node<K,V> {
	K key;
	V value;
    Node<K,V> next;
    
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public Node(K key, V value) {
		this.key = key;
		this.value = value;
	}
    
}
