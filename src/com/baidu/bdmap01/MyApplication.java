package com.baidu.bdmap01;

import com.baidu.mapapi.SDKInitializer;

import android.app.Application;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		//��ʹ��SDK�����֮ǰ��ʼ��context��Ϣ������ApplicationContext  
        //ע��÷���Ҫ��setContentView����֮ǰʵ��  
		SDKInitializer.initialize(getApplicationContext());  

		super.onCreate();
	}
}
