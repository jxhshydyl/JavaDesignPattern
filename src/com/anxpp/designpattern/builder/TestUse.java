package com.anxpp.designpattern.builder;

public class TestUse {
	public static void main(String[] args){
		//不使用指挥者
		MyDate date = new MyDate();
		IDateBuilder builder;
		builder = new DateBuilder1(date).buildDate(2066, 3, 5);
		System.out.println(builder.date());
		builder = new DateBuilder2(date).buildDate(2066, 3, 5);
		System.out.println(builder.date());
		//使用指挥者
		IDateBuilder iDateBuilder1=new DateBuilder1(date);
		Derector derector1=new Derector(iDateBuilder1);
		String date1 = derector1.getDate(2066, 3, 5);
		System.out.println(date1);

		IDateBuilder iDateBuilder2=new DateBuilder2(date);
		Derector derector2=new Derector(iDateBuilder2);
		String date2 = derector2.getDate(2066, 3, 5);
		System.out.println(date2);

	}
}