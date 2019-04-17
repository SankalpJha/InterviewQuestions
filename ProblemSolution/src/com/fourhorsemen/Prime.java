package com.fourhorsemen;

public class Prime {

	public void checkPrime(Integer...integers ) {
		for(Integer x : integers) {
			int i =0;
			int num =0;
			String  primeNumbers = "";
			if(x==1)
				primeNumbers = primeNumbers + "2";
			for (i = 1; i <= x; i++)  	   
			{ 		 		  
				int counter=0; 		  
				for(num =i; num>=1; num--)
				{
					if(i%num==0)
					{
						counter = counter + 1;
					}
				}
				if (counter ==2)
				{
					primeNumbers = primeNumbers + i + " ";
				}	
			}	
			System.out.println(primeNumbers);

		}
	}


}
