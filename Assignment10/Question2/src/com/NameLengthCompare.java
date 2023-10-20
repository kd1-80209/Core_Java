package com;

import java.util.Comparator;

public class NameLengthCompare implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		
		int dff=s1.length()-s2.length();
		return dff;
	}

}
