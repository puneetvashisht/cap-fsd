package com.capgemini.day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo3 {
	
	public static Map<Bank, List<Branch>> bankBranchMap = new HashMap<>();

	public static void main(String[] args) {
		
		//nested collection
//		Map<String, List<Branch>> bankBranchMap = new HashMap<>();
		
		
		
		// create a list of branches
		Branch branch1 = new Branch(234, "gk", true);
		Branch branch2 = new Branch(234, "marthalli", false);
		Branch branch3 = new Branch(4, "tnagar", true);
		List<Branch> branches = new ArrayList<>();
		branches.add(branch1); branches.add(branch2); branches.add(branch3);
		
		// put branches in the map with key
		Bank bank = new Bank(23, "ICICI", 5);
		bankBranchMap.put(bank, branches);
		
		System.out.println(bankBranchMap);

	}

}
