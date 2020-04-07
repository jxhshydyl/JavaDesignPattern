package com.anxpp.designpattern.visitor;
//具体访问者
public class APPOwner implements Visitor{
	@Override
	public void visit(UserVIP user) {
		String estimation = user.getEstimation();
//		if(estimation.length()>5)
			System.out.println("UserVIP记录一条有效反馈：" + estimation);
	}
	@Override
	public void visit(UserOrdinary user) {
		String estimation = user.getEstimation();
//		if(estimation.length()>10)
			System.out.println("UserOrdinary记录一条有效反馈：" + estimation);
	}
}