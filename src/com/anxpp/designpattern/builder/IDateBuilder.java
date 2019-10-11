package com.anxpp.designpattern.builder;
/**
 * @Author
 * 抽象生成器
 */
public interface IDateBuilder {
	IDateBuilder buildDate(int y,int m,int d);

    /**
     * 相当于指挥者中的getDate() 方法
     * @return
     */
	String date();
}
