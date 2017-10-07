package project.monitoring;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class Fever extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fever);
        //initialize text view object
        TextView tv=(TextView)findViewById(R.id.textView1);
        //set text color
        //print 1 to 100 numbers using for loop
        //use append method to print all numbers
            tv.append("1. Cool Water\n" +
                    "\n" +
                    "Soak a wash cloth in cool tap water, wring out the excess water and then sponge areas like your armpits, feet, hands and groin to reduce the temperature.\n" +
                    "\n" +
                    "Also, you can place cold, damp washcloths on your forehead and the back of your neck. The cloth pieces should be changed regularly after a few minutes. This remedy is beneficial when dealing with a high fever as it helps keep temperature under control.\n" +
                    "\n" +
                    "You can also take a bath in lukewarm water to relax your body. Taking a shower, however, may not be a good idea. Plus, needless to say, take as much rest as possible as it helps the body fight the illness.\n");

        tv.append("\n2. Basil\n" +
                "\n" +
                "Basil is an effective herb for bringing down a fever. This herb is just as effective as many types of antibiotics in the market. Its healing properties will help reduce fever very quickly.\n" +
                "\n" +
                "    Boil together 20 basil leaves and one teaspoon of crushed ginger in one cup water, until the solution gets reduced to half. Add a little honey and drink this tea two or three times a day for three days.\n" +
                "    Make a tea by mixing one teaspoon of basil with one-fourth teaspoon of pepper in one cup of boiling water. Steep for five minutes, and then strain and drink the tea. Drink it two or three times daily until you recover completely.\n" +
                "\n" +
                "3. Apple Cider Vinegar\n" +
                "\n" +
                "Apple cider vinegar is another very inexpensive and highly effective remedy for a fever. It helps reduce a fever quickly because the acid present in it helps draw heat out of the skin. Plus, it is rich in minerals and helps replenish minerals that get eliminated from the body due to fever.\n" +
                "\n" +
                "    Add one-half cup of vinegar to lukewarm bath water. Soak in this water for five to 10 minutes. In about 20 minutes you will notice improvement. Repeat again when the body temperature is high.\n" +
                "    Soak a washcloth in a mixture of one part apple cider vinegar and two parts cool water. Wring out the excess solution and place it on your forehead and tummy. You can even wrap one around the soles of your feet. Once the washcloth becomes warm, change it with a new one soaked in the cool mixture. Repeat as often as required until the fever has reduced.\n" +
                "    Mix two teaspoons of apple cider vinegar and one tablespoon of honey in a glass of water. Drink it two or three times a day.\n" +
                "\n" +
                "4. Garlic\n" +
                "\n" +
                "The warm nature of garlic can also lower a high fever by promoting sweating. This also helps eliminate harmful toxins from the body and speed up recovery. Plus, garlic is an antifungal and antibacterial agent that helps the body fight infections as well as ward off disease.\n" +
                "\n" +
                "    Finely mince one garlic clove and add it to one cup of hot water. Steep for 10 minutes, strain and sip it slowly. Drink this twice a day and you will feel much better the next day.\n" +
                "    Warm a mixture of two crushed garlic cloves and two tablespoons of olive oil. Apply this mixture over the sole of each foot, leaving a few spots uncovered. Wrap your feet with gauze to keep the garlic in place and leave it on overnight. For some people, this can eliminate a fever in just one night.\n" +
                "\n" +
                "Note: Garlic remedies are not recommended for pregnant ladies and small children.\n" +
                "5. Raisins\n" +
                "\n" +
                "Raisins help the body fight infections and reduce fevers. They are loaded with phenolic phytonutrients, which are known to have antibacterial and antioxidant properties. Also, raisins act as tonic for your body when you have a fever.\n" +
                "\n" +
                "    Soak 25 raisins in one-half cup of water for one hour, or until the raisins become soft.\n" +
                "    Crush the soaked raisins in the water and strain the liquid.\n" +
                "    Add the juice of half a lime to this solution.\n" +
                "    Have this twice a day until your fever is gone.\n" +
                "\n" +
                "6. Ginger\n" +
                "\n" +
                "Ginger helps the body expel heat, which in turn helps reduce fever. Plus, ginger is a natural antiviral and antibacterial agent and helps the immune system fight any kind of infection.\n" +
                "\n" +
                "    Put two tablespoons of ginger powder in a bathtub filled with warm water and mix well. Soak in this water for 10 minutes. Pat dry your body and go to bed. Cover yourself completely with a blanket. Soon you will start sweating and your fever will come down.\n" +
                "    Note: Perform a patch test on your forearm before taking this detoxifying ginger bath to check if it suits you.\n" +
                "    Make ginger tea by adding one-half teaspoon of freshly grated ginger to one cup of boiling water and letting it steep for a few minutes. Add some honey and enjoy this tea three or four times a day.\n" +
                "    Another option is to mix together one-half teaspoon of ginger juice, one teaspoon of lemon juice and one tablespoon of honey. Consume this mixture three or four times daily until your fever is gone.");
    }
        public void onClickBack(View v) {
                Intent i=new Intent(Fever.this,Solution.class);
                startActivity(i);

        }
        public void onClickRate(View v) {
                Intent i=new Intent(Fever.this,MonitorActivity.class);
                startActivity(i);

        }
}
