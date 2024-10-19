package com.java;

public class String_Concepts {
	
	
	
public static void main(String[] args) {
	
	
	
String x= "Hi sathish to offer Something to someone";	
	
String[] split = x.split(" ");

for(String i : split) {

if(i.toUpperCase().startsWith("S")) {
	
System.out.println(i);	

}

}
	
	
	
}

}