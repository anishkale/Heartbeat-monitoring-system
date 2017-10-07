package project.monitoring;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;


public class Solution extends Activity {


    TextView textView;
    TextView tv;
    EditText editText;
    Button buttonBack,buttonCold,buttonStomach,buttonNausea,buttonHeadache,buttonChest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.solution_main);
        textView = (TextView) findViewById(R.id.textView);
        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonCold = (Button) findViewById(R.id.ButtonCold);
        buttonStomach=(Button) findViewById(R.id.ButtonStomach);
        buttonNausea=(Button) findViewById(R.id.ButtonNausea);
        buttonHeadache=(Button) findViewById(R.id.ButtonHeadache);
        buttonChest=(Button) findViewById(R.id.buttonChest);
    }


    public void onClickFever(View v) {
        Intent i=new Intent(Solution.this,Fever.class);
        startActivity(i);

    }
    public void onClickCold(View v) {
        Intent i=new Intent(Solution.this,Cold.class);
        startActivity(i);

    }
    public void onClickStomach(View v) {
        Intent i=new Intent(Solution.this,Stomach.class);
        startActivity(i);

    }
    public void onClickBack(View v) {
        Intent i=new Intent(Solution.this,MonitorActivity.class);
        startActivity(i);

    }
    public void onClickNausea(View v) {
        Intent i=new Intent(Solution.this,Nausea.class);
        startActivity(i);

    }
    public void onClickHeadache(View v) {
        Intent i=new Intent(Solution.this,Headache.class);
        startActivity(i);

    }
    public void onClickChest(View v) {
        Intent i=new Intent(Solution.this,Chestpain.class);
        startActivity(i);

    }
}
