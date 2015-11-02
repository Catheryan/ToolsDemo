package com.itteam.demo.activity;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.itteam.demo.base.ILoginListener;
import com.itteam.demo.contants.Contants;
import com.itteam.demo.manager.LoginActivityModelManager;
import com.tools.toolsdemo.R;
import com.yzh.android.base.BaseActivity;
import com.yzh.android.tools.ToolAlert;

public class LoginActivity extends BaseActivity implements ILoginListener,OnClickListener{
	private LoginActivityModelManager mManager;
	private TextView tv_login;
	@Override
	public int bindLayout() {
		return R.layout.activity_login;
	}

	@Override
	public void initView(View view) {
		tv_login= (TextView) findViewById(R.id.login);
	}

	@Override
	public void doBusiness(Context mContext) {
		tv_login.setOnClickListener(this);
		
		mManager = new LoginActivityModelManager(this);
		mManager.addEventListener(this);
	}

	@Override
	public void resume() {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void handleButton(int event,String msg) {
		switch (event) {
		case Contants.LOGINSUCCEED:
			//跳转页面
			getOperation().forward(activity);
			break;
		case Contants.LOGINFAIL:
			//跳转页面
			ToolAlert.toastShort(msg);
			break;
		case Contants.REGISTERFAIL:

			break;
		case Contants.REGISTERSUCCEED:

			break;

		default:
			break;
		}
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.login:
			/*accout输入框的账号
			 * password输入的密码
			 */
			mManager.Login(accout, password);
			break;

		default:
			break;
		}
	}

}
