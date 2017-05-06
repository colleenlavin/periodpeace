package localhost.periodpeace;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class PadsOrTamponsHave extends Activity {
    Button haveTampons;
    Button havePads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pads_or_tampons_have);
        haveTampons = (Button) findViewById(R.id.haveTamponsButton);
        haveTampons.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                goGiveTampons(v);
            }
        });
        havePads = (Button) findViewById(R.id.havePadsButton);
        havePads.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    goGivePads(v);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        });
    }
    //Go to next screen for getting stuff.
    public void goGiveTampons (View view) {
        Intent Intent = new Intent(this, MapsToShelter.class);
        startActivity(Intent);
    }
    //Go to next screen for giving stuff.
    public void goGivePads (View view) {
        Intent Intent = new Intent(this, MapsToClinics.class);
        startActivity(Intent);
    }
}
