package edu.drew.note;

public class UnsortedDictionary implements NoteCollection {
	private int numEntries = 0;
	private Note[] Note;
	
	@Override
	public boolean add(Note newNote) {
		Note[numEntries] = newNote;
		numEntries++;
		return true;
	}

	@Override
	public Note lookup(long ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(long ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Note note) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(Note note) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(long ID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Note[] toArray() {
	      Note[] data = (Note[])new Object[numEntries];
	      for (int index = 0; index < numEntries; index++)
	      {
	         data[index] = Note[index];
	      } 
	      
	      return data;
	}

}
