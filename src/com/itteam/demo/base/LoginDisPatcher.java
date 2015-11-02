package com.itteam.demo.base;

public class LoginDisPatcher {
	private ILoginListener mListener;

	public void addEventListener(ILoginListener listener) {
		mListener = listener;
	}

	public void handleButtonSucceed(int event,String msg) {
		mListener.handleButton(event,msg);
	}
}
