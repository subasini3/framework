package org.edu;

public class Arts extends Education {
	@Override
	
	public void ug()
	{
		System.out.println("ug:BA TAmil");
		
	}
	@Override
	
	
	public void pg()
	{
		System.out.println("pg:MA tamil");
		
	}
	public void bsc()
	{
		System.out.println("B.Sc");
		
	}
	public void bEd()
	{
		System.out.println("B.Ed");
		
	}
	public void ba()
	{
		System.out.println("BA");
		
	}
	public void bBa()
	{
		System.out.println("BBA");
		
	}
public static void main(String[] args)
	
	{
	Arts at=new Arts();
	at.ba();
	at.bBa();
	at.bsc();
	at.bEd();
	at.ug();
	at.pg();
	}

	
}
