package com.pyreddy;

import java.util.HashMap;
import java.util.Map;

public class exp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "abc");
		h.put(2, "xyz");
		h.put(3, "pqr");
		for(Map.Entry x:h.entrySet())
		{
			System.out.println(x.getKey()+""+x.getValue());
		}

	}

}
