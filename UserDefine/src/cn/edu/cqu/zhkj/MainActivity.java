package cn.edu.cqu.zhkj;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity{
	
	private ItemView iv_google;
	private ItemView iv_gps;
	private ItemView iv_es_gps;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		iv_google = (ItemView) findViewById(R.id.iv_google);
		iv_gps = (ItemView) findViewById(R.id.iv_gps);
		iv_es_gps = (ItemView) findViewById(R.id.iv_es_gps);
		
		iv_gps.setTitle("GPS����");
		iv_gps.setDesc("����Ӧ�ó���ʹ��GPS�������ж�λ");
		iv_es_gps.setTitle("ʹ����ǿ��GPS");
		iv_es_gps.setDesc("����ʹ�÷���������GPS��ȡ��ѡ�п��Խ�������ʹ���ʣ�");
	
		iv_google.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// �ж��Ƿ�ѡ��
				if (iv_google.isChecked()) {
					iv_google.setChecked(false);
				}else {
					iv_google.setChecked(true);
				}
			}
		});
		iv_gps.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// �ж��Ƿ�ѡ��
				if (iv_gps.isChecked()) {
					iv_gps.setChecked(false);
				}else {
					iv_gps.setChecked(true);
				}
			}
		});
		iv_es_gps.setOnClickListener(new OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// �ж��Ƿ�ѡ��
				if (iv_es_gps.isChecked()) {
					iv_es_gps.setChecked(false);
				}else {
					iv_es_gps.setChecked(true);
				}
	}
});
	}


}
