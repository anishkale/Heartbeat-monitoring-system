package project.monitoring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class Chestpain extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fever);
        //initialize text view object
        TextView tv=(TextView)findViewById(R.id.textView1);
        //set text color
        //print 1 to 100 numbers using for loop
        //use append method to print all numbers
        tv.append("1)Patient  must sit and relax . Don't lie down if you have breathing  problems. Half sitting  position is better.\n" +
                "\n" +
                "2)Loosen clothing around neck, chest  and waist.  Open the window so that fresh air can come around.\n" +
                "\n" +
                "3)Chew an adult aspirin tablet (300mg) if one is easily available, unless you’re allergic to aspirin or you’ve been told not to take it. It has anti-coagulant properties and help dissolve blood clots. \n" +
                "\n" +
                "4)Give Cardiopulmonary Resuscitation by placing palm on chest to pump(CPR) : ( Performed by other person if available )\n" +
                "If no pulse is detected\n" +
                "\n" +
                "\n" +
                "5)If problems still persist, Call the doctor\n" +
                "\n");


    }
    public void onClickBack(View v) {
        Intent i=new Intent(Chestpain.this,Solution.class);
        startActivity(i);

    }
    public void onClickRate(View v) {
        Intent i=new Intent(Chestpain.this,MonitorActivity.class);
        startActivity(i);

    }
}
