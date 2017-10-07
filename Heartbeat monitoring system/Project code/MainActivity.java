package project.monitoring;

import java.util.List;
import android.app.Application;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Handler;

public class MainActivity extends Activity {


    EditText user, pass;
    Button login, not_reg;
    DatabaseHandler db;
    Cursor cursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user =(EditText)findViewById(R.id.eduser);
        pass = (EditText)findViewById(R.id.edpass);
        login =(Button)findViewById(R.id.login);
        not_reg =(Button)findViewById(R.id.not_reg);

        login.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                db=new DatabaseHandler(MainActivity.this, null, null, 2);
                String username=user.getText().toString();
                String password= pass.getText().toString();

                String StoredPassword =db.getregister(username);
                if(password.equals(StoredPassword)){

                    Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_LONG).show();
                    Intent i=new Intent(MainActivity.this,MonitorActivity.class);
                    i.putExtra("user", username);
                    startActivity(i);



                }
                else{
                    Toast.makeText(getApplicationContext(), "Username/Password incorrect", Toast.LENGTH_LONG).show();
                    user.setText("");
                    pass.setText("");
                }


            }
        });

        not_reg.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub

                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
            }
        });





    }

    /* @Override
        public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_settings, menu);
            return super.onCreateOptionsMenu(menu);
           //
     }
     */
    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case R.id.action_settings:
                // search action
                Intent i=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i);
                return true;
        }
        return false;

    }
	/*	  @Override
		protected void onResume() {
			// TODO Auto-generated method stub
			 list = db.getAllRegister();
		//	list=((alertv) alert).showAlert();
				Customlist adapter = new Customlist(MainActivity.this, list);
			//	mylistview.setAdapter(adapter);

				if(adapter.getCount()!=0){
				      mylistview.setAdapter(adapter);


				}else{
				     Toast.makeText(MainActivity.this, "No Items Available",Toast.LENGTH_SHORT).show();
				}
			super.onResume();
		  }
  */

}