package com.itteam.demo.manager;

import android.content.Context;

import com.itteam.demo.base.ILoginListener;
import com.itteam.demo.base.LoginDisPatcher;
import com.itteam.demo.service.LoginActivityModel;

public class LoginActivityModelManager extends LoginDisPatcher{
	private Context mContext;
	private LoginActivityModel loginActivityModel;
	public LoginActivityModelManager(Context context) {
		this.mContext = context;
		loginActivityModel =new LoginActivityModel(context);
	}
	public void Login(String accout,String password){
		loginActivityModel.Login(accout, password);
	}
	@Override
	public void addEventListener(ILoginListener listener) {
		loginActivityModel.addEventListener(listener);
		super.addEventListener(listener);
	}

}
