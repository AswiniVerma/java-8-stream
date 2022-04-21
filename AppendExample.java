package com.Strings;
import java.util.*;
public class AppendExample {

	public static void main(String[] args) {
		String oops = "is programming language ";
		StringBuffer sb = new StringBuffer("java ");
		sb.append(oops);
		System.out.println(sb);
		
		String obj = "apple";
		String obj1 = "banana";
		String o3 = obj+obj1;
		System.out.println(o3);
		
		StringBuffer s = new StringBuffer("heyyyy");
		int len = s.length();
		System.out.println("length "+len);
	}

}
