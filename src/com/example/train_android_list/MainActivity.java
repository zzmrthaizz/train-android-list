package com.example.train_android_list;

import java.util.ArrayList;
import com.example.train_android_list.EmployeeFull;
import com.example.train_android_list.EmployeePart;

import org.w3c.dom.ls.LSException;

import android.R.anim;
import android.R.integer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	Employee nv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText ma = (EditText) findViewById(R.id.editMa);
		final EditText ten = (EditText) findViewById(R.id.editTen);
		final RadioGroup rdGroup = (RadioGroup) findViewById(R.id.radiogroud1);
		Button nhap = (Button) findViewById(R.id.btnnhap);
		ListView ls = (ListView) findViewById(R.id.lvnhanvien);
		
		
		
		
		
		final ArrayList<Employee>employees = new ArrayList<Employee>();
		final ArrayAdapter<Employee>adapter = new ArrayAdapter<Employee>(this,android.R.layout.simple_expandable_list_item_1, employees);
		ls.setAdapter(adapter);
		
		nhap.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				String id = ma.getText()+"";
				String tennv = ten.getText()+"";
				
				if (rdGroup.getCheckedRadioButtonId() == R.id.radChinhthuc)
				{
					nv = new EmployeeFull();
					nv.setId(id);
					nv.setName(tennv);
				}
				else {
					nv = new EmployeePart();
					nv.setId(id);
					nv.setName(tennv);
				}
				employees.add(nv);
				adapter.notifyDataSetChanged();
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
