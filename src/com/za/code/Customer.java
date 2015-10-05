package com.za.code;

public class Customer
{
	
	String fname=null;
	String lname=null;
	
	public String getcname()
	{
		String returnValue=null;
		if((this.fname!= null)&&(this.lname!=null))
		returnValue= this.fname + " " +this.lname;
		else if (this.fname!= null)
			returnValue= this.fname + "N/A";
		else if (this.lname!= null)
			returnValue=  "N/A" + this.lname ;
		else 
			returnValue= "N/A" + "N/A";
		return returnValue;
	}
	public void setfname( String fname)
	{ 
		this.fname=fname;
			
	}

	public void setlname( String lname)
	{ 
		this.lname=lname;
			
	}
}