package localhost.periodpeace;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class navigateToTampons extends Activity {
    Button nearbyShelters;
    Button nearbyClinics;
    Button nearbyStudentCenters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate_to_tampons);
        nearbyShelters = (Button) findViewById(R.id.navToCenterButton);
        nearbyShelters.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                goToShelter(v);
            }
        });
        nearbyClinics = (Button) findViewById(R.id.navToClinicButton);
        nearbyClinics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    goToClinic(v);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        });
        nearbyStudentCenters = (Button) findViewById(R.id.navToCenterButton);
        nearbyStudentCenters.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                goToStudentCenter(v);
            }
        });
    }
    //Go to next screen for getting stuff.
    public void goToShelter (View view) {
        Intent Intent = new Intent(this, MapsToShelter.class);
        startActivity(Intent);
    }
    //Go to next screen for giving stuff.
    public void goToClinic (View view) {
        Intent Intent = new Intent(this, Thanks.class);
        startActivity(Intent);
    }
    public void goToStudentCenter (View view) {
        Intent Intent = new Intent(this, Thanks.class);
        startActivity(Intent);
    }
}
