package com.itteam.demo.service;

import android.content.Context;
import android.os.Handler;

import com.itteam.demo.base.LoginDisPatcher;
import com.itteam.demo.contants.Contants;

public class LoginActivityModel extends LoginDisPatcher{
	private Context mContext;
	public LoginActivityModel(Context context) {
		this.mContext =context;
	}
	//登陆操作
	public void Login(String accout,String password){
		//http的请求操作
		
		
		
		//处理成功
		//tips:msg是服务器返回的消息
		handleButtonSucceed(Contants.LOGINSUCCEED,msg);
		//处理失败
		handleButtonSucceed(Contants.LOGINFAIL,msg);
	}
	
}
