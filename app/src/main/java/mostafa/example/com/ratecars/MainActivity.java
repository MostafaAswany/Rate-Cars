package mostafa.example.com.ratecars;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    ViewFlipper viewFlipper2;
    int bmw = 0;
    int jaguar = 0;
    String bmw_Winner = "You've chosen a BMW cars more than once, You will soon win a new car :)";
    String jaguar_Winner = "You've chosen a Jaguar cars more than once, You will soon win a new car :)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = findViewById(R.id.viewFlipper);
        viewFlipper2 = findViewById(R.id.viewFlipper2);
    }

    // Increase the value of the bmw variable by 1 by pressing the image each time.
    public void increse_BMW_value() {
        bmw++;
    }

    // Increase the value of the Jaguar variable by 1 by pressing the image each time.
    public void increse_Jaguar_value() {
        jaguar++;
    }

    public void setLayout_Weight() {
        //set layout_weight=1 of the(TextView) if bmw or jaguar win.
        View v = findViewById(R.id.winCar);
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) v.getLayoutParams();
        params.height = 0;
        params.weight = 1;

        //set layout_weight=0 of the(viewFlipper) if bmw or jaguar win.
        View flipper = findViewById(R.id.viewFlipper);
        LinearLayout.LayoutParams f_params = (LinearLayout.LayoutParams) flipper.getLayoutParams();
        f_params.height = 0;
        f_params.weight = 0;

        //set layout_weight=0 of the(viewFlipper2) if bmw or jaguar win.
        View flipper2 = findViewById(R.id.viewFlipper2);
        LinearLayout.LayoutParams f2_params = (LinearLayout.LayoutParams) flipper2.getLayoutParams();
        f2_params.height = 0;
        f2_params.weight = 0;

    }

    //When clicking on the image, this method shows the next image
    public void proccessMethod() {
        //When clicking on the image, this method shows the next image
        viewFlipper.showNext();
        viewFlipper2.showNext();

        //If the bmw image is pressed 5 times
        // and the bmw value is > jaguar value so bmw is the winner.
        if (bmw >= 5 && bmw > jaguar) {
            TextView quantityTextView = (TextView) findViewById(R.id.winCar);
            quantityTextView.setText(bmw_Winner);

            //set layout_weight=100 if bmw or jaguar win.
            setLayout_Weight();

            //If the Jaguar image is pressed 5 times
            // and the Jaguar value is > BmW value so Jaguar is the winner.
        } else if (jaguar >= 5 && jaguar > bmw) {
            TextView quantityTextView = (TextView) findViewById(R.id.winCar);
            quantityTextView.setText(jaguar_Winner);

            //set layout_weight=100 if bmw or jaguar win.
            setLayout_Weight();
        }
    }

    /**
     * (BMW Cars)
     * When clicking on the image bmw apply the following operations
     */
    public void bmw1(View view) {
        increse_BMW_value();
        proccessMethod();
    }

    public void bmw2(View view) {
        increse_BMW_value();
        proccessMethod();
    }

    public void bmw3(View view) {
        increse_BMW_value();
        proccessMethod();
    }

    public void bmw4(View view) {
        increse_BMW_value();
        proccessMethod();
    }

    public void bmw5(View view) {
        increse_BMW_value();
        proccessMethod();
    }

    public void bmw6(View view) {
        increse_BMW_value();
        proccessMethod();
    }

    public void bmwf(View view) {
        increse_BMW_value();
        proccessMethod();
    }
////////////////////////////////////////////////////////////////////

    /**
     * (Jaguar Cars)
     * if jaguar onClick>> showNext Pic.
     * jaguar = jaguar + 1;
     */
    public void jaguar1(View view) {
        increse_Jaguar_value();
        proccessMethod();
    }

    public void jaguar2(View view) {
        increse_Jaguar_value();
        proccessMethod();
    }

    public void jaguar3(View view) {
        increse_Jaguar_value();
        proccessMethod();
    }

    public void jaguar4(View view) {
        increse_Jaguar_value();
        proccessMethod();
    }

    public void jaguar5(View view) {
        increse_Jaguar_value();
        proccessMethod();
    }

    public void jaguar6(View view) {
        increse_Jaguar_value();
        proccessMethod();
    }

    public void jaguarf(View view) {
        increse_Jaguar_value();
        proccessMethod();
    }
    //The End! :)
    //That's it
}
