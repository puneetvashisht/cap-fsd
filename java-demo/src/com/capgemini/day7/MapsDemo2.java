package com.capgemini.day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsDemo2 {
	
	public static int findInterestRate(Map<String, Bank> bankMap, String bankName) {
		Bank bank = bankMap.get(bankName);
		return bank.interestRate;
		
	}

	public static void main(String[] args) {
	
		Map<String, Bank> bankMap = new HashMap<>();
		
		// Create bunch branches and create list
		Branch branch1 = new Branch(234, "gk", true);
		Branch branch2 = new Branch(234, "marthalli", false);
		Branch branch3 = new Branch(4, "tnagar", true);
		List<Branch> branches = new ArrayList<>();
		branches.add(branch1); branches.add(branch2); branches.add(branch3);
		
		// create a bank object and set branches
		Bank iciciBank = new Bank(23, "ICICI", 6);
		iciciBank.setBranches(branches);
		
		Bank hdfcBank = new Bank(33, "HDCF", 5);
		Bank kotakBank = new Bank(13, "KOTAK", 7);
		
		// put bank object in a map
		bankMap.put("icici", iciciBank);
		bankMap.put("hdfc", hdfcBank);
		bankMap.put("kotak", kotakBank);
		
		
		System.out.println(bankMap.get("icici"));
//		System.out.println(findInterestRate(bankMap, "kotak"));

	}

}
