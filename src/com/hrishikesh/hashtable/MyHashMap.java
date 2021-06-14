package com.hrishikesh.hashtable;
/*************************************************************************
 * Purpose : Implement Hash Map
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 14-06-202
 *
 ************************************************************************/
public class MyHashMap<K,V> {
	public int arraySize=10;
	Node<K,V> table[];
	
	public MyHashMap() {
		table=new Node[arraySize];
	}
	
	public void put(K key, V value) {
		int hashIndex = key.hashCode() % arraySize;
		Node<K,V> newNode= table[hashIndex];
		
		if(newNode==null) {
			table[hashIndex]=new Node<K,V>(key,value);
		}
		else {
			while(newNode.next !=null) {
				if(newNode.getKey().equals(key)) {
					newNode.setValue(value);
					return;
				}
				newNode=newNode.next;
			}
			if(newNode.getKey().equals(key)) {
				newNode.setValue(value);
				return;
			}
			newNode.next=new Node<K,V>(key,value);
		}
		
	}
}
