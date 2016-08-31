package com.suhit.wingify;
import java.util.*;
import java.util.stream.DoubleStream;

public class RandomNumberGenerator {

	public String GenerateNumber(String name)
	{
		Random r = new Random();
		int Low = 6;
		int High = 15;
		int Result = r.nextInt(High-Low) + Low;
		
		return name+ " "+Result;
		
	}
	public static void main(String[] args) {
		RandomNumberGenerator rg = new RandomNumberGenerator();
		System.out.println(rg.GenerateNumber("suhit"));
		

	}

}
