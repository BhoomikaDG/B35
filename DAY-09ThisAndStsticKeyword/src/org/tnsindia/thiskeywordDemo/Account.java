package org.tnsindia.thiskeywordDemo;
// keyword is used to refer the instance of the current class
public class Account {
	private long account_no;
	private String acc_type;
	
	
	public void accpect(int account_no,String acc_type)
	{
		this.account_no=account_no;
		this.acc_type=acc_type;
		
	}
	public void dispaly()
	{
		System.out.println("Account number is:"+account_no +"  "+"Account type is:"+acc_type);
	}

}
