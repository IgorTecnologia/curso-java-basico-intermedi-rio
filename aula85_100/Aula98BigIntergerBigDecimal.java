package com.igor.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigIntergerBigDecimal {

	public static void main(String[] args) {
		
		double a = 0.03;
		double b = 0.04;
		double c = b- a;
		System.out.println(c);
		
		BigDecimal _a = new BigDecimal("0.03");
		BigDecimal _b = new BigDecimal("0.04");
		BigDecimal _c = _b.subtract(_a); // -
		System.out.println(_c);
		
		BigDecimal bd1 = new BigDecimal("1234567890.00987654321");
		BigDecimal bd2 = new BigDecimal("987654321.98765432100");
		System.out.println(bd1.add(bd2)); // +
		
		System.out.println(bd1.multiply(bd2)); // *
		
		System.out.println(bd1.divide(new BigDecimal(2)));
		
		BigInteger bi = new BigInteger("10000000000000000");
		BigInteger bi2 = new BigInteger("10000000000000000");
		BigInteger bi3 = bi.add(bi2);
		System.out.println(bi3);
		
		
		

	}

}
