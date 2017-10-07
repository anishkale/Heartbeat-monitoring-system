package project.monitoring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class Stomach extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fever);
        //initialize text view object
        TextView tv=(TextView)findViewById(R.id.textView1);
        //set text color
        //print 1 to 100 numbers using for loop
        //use append method to print all numbers
        tv.append("1)Take 2-3 spoons of Triphala with warm water at night as it works as a great laxative and leads up to an easy next morning.\n" +
                "\n" +
                "2)Add more olive oil, seasom oil or ghee to your diet\n" +
                "\n" +
                "3)Add some cumin seeds or jeera to boiling water, drain and drink. It'll cleanse your system and bring relief.\n" +
                "\n" +
                "4)Boil the powder of 8-10 Laung / Lavang (Cloves) with water on slow fire. Furthermore  use this warm water solution in stomach ache or abdominal pain treatment.\n" +
                "\n" +
                "5)Take equal amount of 8-10 gram of each Neem seeds, Tulsi (Holy basil, Ocimum sanctum) leaves, Sonth (Dried ginger) and 10 Kali Mirch (Peppercorns). Prepare the fine powder of all these 4 herbs and lick this powder in stomach ache treatment.\n" +
                "\n" +
                "6)Chew some roasted Saunf/Sanchal (Fennel seed) in stomach ache or abdominal pain\n" +
                "\n" +
                "7)Mix Jaiphal (Nutmeg) oil with sugar to use as Ayurvedic home remedies for stomach ache. It is also good for gastric problems\n" +
                "\n" +
                "8)Mix roasted 1/4 spoon celery (Ajwain) with a pinch of salt and take with lukewarm water and sip it slowly\n" +
                "\n" +
                "9)Mix equal amount of 2 spoons of lemon extract and Adrak (Ginger) extract. Also add some loaf sugar in it.\n");


    }
    public void onClickBack(View v) {
        Intent i=new Intent(Stomach.this,Solution.class);
        startActivity(i);

    }
    public void onClickRate(View v) {
        Intent i=new Intent(Stomach.this,MonitorActivity.class);
        startActivity(i);

    }
}
