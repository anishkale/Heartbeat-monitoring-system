package project.monitoring;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.app.AlertDialog;
import android.widget.TextView;
import android.widget.Toast;

public class SendReport extends Activity implements OnClickListener {
    String user2,user3,read,StoredName,StoredName2;
    DatabaseHandler db,db3;
    SQLiteDatabase db2,db1,db4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_main);
        findViewById(R.id.button1).setOnClickListener(this);
        Intent i = getIntent();
        db=new DatabaseHandler(SendReport.this, null, null, 2);
        user2 = i.getStringExtra("reading");
        user3 = i.getStringExtra("user4");
    }

    @Override
    public void onClick(View v) {
        String phoneNumber = ((EditText)

                findViewById(R.id.editView1)).getText().toString();
        String message= "Measured heartbeat reading of the patient  is " +user2;
        try {
            SmsManager.getDefault().sendTextMessage(phoneNumber, null, message, null, null);
            Toast.makeText(getApplicationContext(), "Message sent successfully", Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            AlertDialog.Builder alertDialogBuilder = new

                    AlertDialog.Builder(this);
            AlertDialog dialog = alertDialogBuilder.create();
            dialog.setMessage(e.getMessage());
            dialog.show();
        }
    }
}