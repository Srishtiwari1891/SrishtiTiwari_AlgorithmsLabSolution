package com.greatlearning.denomination.driver;

import java.util.Scanner;
import com.greatlearning.denomination.main.*;
import java.lang.IllegalArgumentException;

public class Driver extends IllegalArgumentException {
		int n;
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("Enter Size of Currnecy Denominations:");
		n=sc.nextInt();
		Denomination objDem = new Denomination(n);
		System.out.println("Enter Currency Denomination values:");
		for (int i = 0; i < n; i++) 
			objDem.setDenomination(sc.nextInt());
		System.out.println("Enter the amount you want to pay:");
		objDem.setTargetAmount(sc.nextInt());
		objDem.displayDenonimations();
	}
	catch(IllegalArgumentException e){
		System.out.println("Please input only positive numbers");
		sc.next();
	}
	finally{
		sc.close();
	}
}
