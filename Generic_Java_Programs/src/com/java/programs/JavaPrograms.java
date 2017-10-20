package com.java.programs;

public class JavaPrograms {
	
	public void palindromeVerification(int n) {
		 	int r,sum=0,temp;    
		  //int n=454;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){
			  
		   r=n%10;  //getting remainder 
		   
		   sum=(sum*10)+r;
		   
		   n=n/10;  
		   
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaPrograms obj=new JavaPrograms();
		obj.palindromeVerification(998);
		
	}

}
