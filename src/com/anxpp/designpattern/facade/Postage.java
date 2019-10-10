package com.anxpp.designpattern.facade;
//计算邮费
public class Postage {
	int getPostage(String addr){
		//模拟邮费计算
		return Math.abs(addr.hashCode())%20+6;
	}
}
