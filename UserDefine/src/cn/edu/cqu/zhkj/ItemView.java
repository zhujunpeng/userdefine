package cn.edu.cqu.zhkj;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;


/*
 * �Զ��Ե���Ͽؼ�
 * */
public class ItemView extends RelativeLayout {
	
	private CheckBox cb_status;
	private TextView tv_desc,tv_title;
	
	// ��һ�������ļ�----��һ��View�����Ҽ�����SettingItemView��
	private void initView(Context context) {
		View view = View.inflate(getContext(), R.layout.item_view, ItemView.this);
		cb_status = (CheckBox) view.findViewById(R.id.cb_status);
		tv_desc = (TextView) view.findViewById(R.id.tv_desc);
		tv_title = (TextView) view.findViewById(R.id.tv_title);
	}

	public ItemView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		initView(context);
	}

	public ItemView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView(context);
	}

	public ItemView(Context context) {
		super(context);
		initView(context);
	}

	/*
	 * ��Ͽؼ��Ƿ��н���
	 * */
	public boolean isChecked(){
		return cb_status.isChecked();
	}
	
	/*
	 * ������Ͽؼ���״̬
	 * */
	public void setChecked(boolean checked){
		cb_status.setChecked(checked);
	}
	
	/*
	 * ��Ͽؼ���������
	 * */
	public void setDesc(String text){
		tv_desc.setText(text);
	}
	
	/*
	 * ��Ͽؼ����ı���
	 * */
	public void setTitle(String text){
		tv_title.setText(text);
	}
}
