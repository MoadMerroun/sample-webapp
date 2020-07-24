package com.everis.sample;

public class Contact {
	private String first_name;
	private String last_name;
	private String phone_number;
	private String ID;
	
	public Contact(String first_name, String last_name, String phone_number, String ID) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.ID=ID;
	}

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return ("ID : "+this.ID+" first name:" + this.first_name + " last name:" + this.last_name + " Phone number:" + this.phone_number+"\n");
	}
	public Contact removeContact(int ID) {
		return Add.list.remove(ID);
	}
}
