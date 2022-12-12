package org.tnsindi.customexceptiondemo;

public class logincreditionals  extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String password;

	

	public logincreditionals(String id2, String password2) {
		// TODO Auto-generated constructor stub
	}



	public void LoginCredentials(String id, String password) {
		this.id = id;
		this.password = password;
	}



	@Override
	public String toString() {
		return "LoginCredentials [id=" + id + ", password=" + password + "]";
	}



	
	 {

}

	
}