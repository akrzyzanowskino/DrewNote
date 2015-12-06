package edu.drew.note.test;
import static org.junit.Assert.*;

import org.junit.Test;

import edu.drew.note.ArrayListCollection;
import edu.drew.note.Note;
import edu.drew.note.UnsortedArrayDictionary;


public class UnsortedArrayDictionaryTest{
	private UnsortedArrayDictionary note = new UnsortedArrayDictionary();
	
	
	@Test
	public void  addTest(){
		note = new UnsortedArrayDictionary();
		Note n = new Note();
		note.add(n);
	}
	
	@Test
	public void lookupTest(){
		note = new UnsortedArrayDictionary();
		Note n = new Note();
		assertEquals(n, note.equals(n.getID()));
		assertTrue(note.contains(n));
	}
	
	@Test
	public void removeNoteTest(){
		note = new UnsortedArrayDictionary();
		Note n = new Note();
		note.remove(n);
		assertFalse(note.equals(n));
	}
	
	@Test
	public void removeIDTest(){
		note = new UnsortedArrayDictionary();
		Note n = new Note();
		note.remove(n.getID());
		assertFalse(note.equals(n.getID()));
	}
	
	@Test
	public void toArrayTest(){
		note = new UnsortedArrayDictionary();
		Note[] n = note.toArray();
		assertEquals(0, n.length);
	}
	
	@Test
	public void isEmptyTest(){
		note = new UnsortedArrayDictionary();
		assertTrue(note.isEmpty());
	}
	
	
	@Test
	public void getSizeTest(){
		note = new UnsortedArrayDictionary();
		note.add(new Note());
		assertEquals(1, note.getSize());
	}
	
	
	
	
}
