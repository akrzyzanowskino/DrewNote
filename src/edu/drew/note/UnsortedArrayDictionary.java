package edu.drew.note;

import java.util.Arrays;

//Alexandra
//dictionary implemented with an unsorted array
public class UnsortedArrayDictionary implements NoteCollection {
	private int numEntries = 0;
	private Note [] arrayDictionary;
	private final static int DEFAULT_CAPACITY = 100;
	private static final int MAX_CAPACITY = 100;
	
	
	public UnsortedArrayDictionary() {
		arrayDictionary = (Note[]) new Note[DEFAULT_CAPACITY];
	}
	
	private boolean isArrayFull() {
		return numEntries >= arrayDictionary.length;
	}
	
	@Override
	public boolean add(Note newNote) {
		if (!isArrayFull()) {
		arrayDictionary[numEntries] = newNote;
	      numEntries++;
	      return true;
		}
		return false;
	}
	

	@Override
	public Note lookup(long ID) {
		for (Note n: arrayDictionary)
			if (n.getID() == ID)
				return n;		
		
		return null;
	}
	
	public  void getID(long ID){
		return;
	}

	@Override
	public boolean remove(long ID) {
		for (int i = 0; i < numEntries; i++) {
	
			if (arrayDictionary[i].equals(ID)) {
				arrayDictionary[i] = arrayDictionary[numEntries-1];
				numEntries--;
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remove(Note note) {
		for (int i = 0; i < numEntries; i++) {
			
			if (arrayDictionary[i].equals(note)) {
				arrayDictionary[i] = arrayDictionary[numEntries-1];
				numEntries--;
				return true;
			}
		}
		return false;
	}
	
	

	@Override
	public boolean isEmpty() {
		if (numEntries == 0)
			return true;
		else
			return false;
	}

	@Override
	public int getSize() {
		return numEntries;
	}
	
	public int clear(){
		numEntries=0;
		return numEntries;
	}

	@Override
	public boolean contains(Note note) {
		return Arrays.asList(arrayDictionary).contains(note);
//		for( Note n : arrayDictionary){
//			if(n.equals(note))
//				return true;
//			else if(n.equals(null)){
//				return true;
//			}
//		}
//		return false;
	}

	@Override
	public boolean contains(long ID) {
		return lookup(ID) != null;		
		//return Arrays.asList(arrayDictionary).contains(ID);
	}

	@Override
	public Note[] toArray() {
		Note[] result = (Note[])new Note[numEntries];
		for (int i = 0; i < numEntries; i++)
		result[i] = arrayDictionary[i];
		return result;
	}

	

}
