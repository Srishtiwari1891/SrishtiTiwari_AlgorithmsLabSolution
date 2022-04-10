package com.greatlearning.denomination.main;
import com.greatlearning.denomination.sort.*;

public class Denomination {
	int denomination[], AmtValue,count[];
	public Denomination(int n){
		this.denomination=new int[n];
	}
	public void setDenomination(int x) {
		for (int i=0;i<denomination.length;i++)
			this.denomination[i] = x;
	}
	
	public void setTargetAmount(int amt) {
		this.AmtValue=amt;
	}
	
	public void checkDenominations() {
		MergeSort objMerge= new MergeSort();
		objMerge.mergeSort(denomination, 0, denomination.length-1);
		calculateDenominations();
	}
	
	public void calculateDenominations() {
		int n=denomination.length,m;
		this.count=new int [n];
		for (int i = 0; i < n; i++) {
			if (AmtValue!= 0) {
				m = AmtValue/ denomination[i];
				this.count[i] = m;
				this.AmtValue -= (denomination[i] * m);
			} else
				break;
		}
		
	}
	
	public void displayDenonimations() {
		if (AmtValue > 0)
			System.out.println("Not possible to pay amount");
		else {
			System.out.println("Your payment approach in order to give min no of notes will be: ");
			for (int i = 0; i < denomination.length; i++) {
				if (this.denomination[i] != 0 && count[i]!=0)
					System.out.println(this.denomination[i] + ":" + this.count[i]);
			}
		}
	}
}