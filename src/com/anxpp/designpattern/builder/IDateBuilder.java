package com.anxpp.designpattern.builder;
/**
 * @Author
 * 抽象生成器
 */
public interface IDateBuilder {
	IDateBuilder buildDate(int y,int m,int d);
	String date();
}
