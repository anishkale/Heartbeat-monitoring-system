package project.monitoring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class Headache extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fever);
        //initialize text view object
        TextView tv=(TextView)findViewById(R.id.textView1);
        //set text color
        //print 1 to 100 numbers using for loop
        //use append method to print all numbers
        tv.append("1)Natural home remedy for headache using green tea and lemon\n" +
                "i)Take 1 cup warm water\n" +
                "ii)Add a green tea bag\n" +
                "iii)Squeeze ½ a lemon\n" +
                "iv)Mix well\n" +
                "v)Drink for instant relief\n" +
                "\n" +
                "2)Natural home remedy for headache using lemon rind\n" +
                "i)Separate the rind (outer covering) of 2-3 lemons\n" +
                "ii)Chop and crush the lemon rind to make a paste\n" +
                "iii)Apply on the forehead for quick relief\n" +
                "\n" +
                "3)Natural home remedy for headache using cinnamon powder\n" +
                "i)Take 2 tbsp of cinnamon powder\n" +
                "ii)Add water to make paste\n" +
                "iii)Mix well\n" +
                "iv)Apply on the temple and forehead for relief\n" +
                "\n" +
                "\n" +
                "4)Natural home remedy for headache using watermelon and sugar\n" +
                "i)Take 1 glass of watermelon juice\n" +
                "ii)Mix 1 tsp sugar in it\n" +
                "iii)This relieves headaches caused by heat\n" +
                "\n" +
                "5)For chronic headaches\n" +
                "i)Drink water mixed with honey every morning\n" +
                "ii)Drink this on an empty stomach\n" +
                "\n");


    }
    public void onClickBack(View v) {
        Intent i=new Intent(Headache.this,Solution.class);
        startActivity(i);

    }
    public void onClickRate(View v) {
        Intent i=new Intent(Headache.this,MonitorActivity.class);
        startActivity(i);

    }
}
