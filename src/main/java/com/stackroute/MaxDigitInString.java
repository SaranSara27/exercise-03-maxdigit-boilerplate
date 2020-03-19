package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxDigitInString {

	public static int getMaxDigit(String alphanumeric) {
		if(alphanumeric==null || alphanumeric.isEmpty() || alphanumeric.isBlank())
			return -1;
		String[] input=alphanumeric.split("");
		List<Integer> intList= new ArrayList<>();
		for(String i : input) {
			if(i.matches("[0-9]"))
				intList.add(Integer.parseInt(i));
		}
		Collections.sort(intList);
		if(intList.size()==0)
			return -1;
		else
			return intList.get(intList.size()-1);
	}

   	//Do not print anything other than what's expected/asked in problem
    public static void main(String[] args) {
    	//Use Scanner to get input from console
    	Scanner scanner = new Scanner(System.in);
    	String alphanumeric = scanner.nextLine();
    	int output = getMaxDigit(alphanumeric);
    	if(output==-1)
    		System.out.println("No digits in string");
    	else
    		System.out.println("Max digit : "+output);
 
    
    }
}
