package localhost.periodpeace;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class WhereToGoPads extends Activity {
    Button nearbyPads;
    Button requestPads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to_go_pads);
        nearbyPads = (Button) findViewById(R.id.goToPadsButton);
        nearbyPads.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                goFindNearbyPads(v);
            }
        });
        requestPads = (Button) findViewById(R.id.requestPadsButton);
        requestPads.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    goRequestPads(v);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        });
    }
    //Go to next screen for getting stuff.
    public void goFindNearbyPads (View view) {
        Intent Intent = new Intent(this, navigateToTampons.class);
        startActivity(Intent);
    }
    //Go to next screen for giving stuff.
    public void goRequestPads (View view) {
        Intent Intent = new Intent(this, Thanks.class);
        startActivity(Intent);
    }
}
