package com.anxpp.designpattern.adapter;
//被适配者 适配者类
class Adaptee{
	void playMp3(Object src){
		System.out.println("播放MP3：" + src);
	}
}