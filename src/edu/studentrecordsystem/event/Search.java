package edu.studentrecordsystem.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Search implements KeyListener{
	
	private String search = "";
	
	Search(String search){
		this.search = search;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(search.equals("roger")) {
			System.out.println("nice");
		} 
		
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
