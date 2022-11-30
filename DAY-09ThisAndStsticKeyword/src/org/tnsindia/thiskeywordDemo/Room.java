package org.tnsindia.thiskeywordDemo;

public class Room {

	public String name;
	public int room_no;
	 Room() {
		
		 this("RaiChennama",45);
	
	}
	public Room(String name, int room_no) {
		super();
		this.name = name;
		this.room_no = room_no;
		
		System.out.println("The Room number is:"+room_no+"   "+"The Room name is:"+name);
	}
	 
	
	
}
