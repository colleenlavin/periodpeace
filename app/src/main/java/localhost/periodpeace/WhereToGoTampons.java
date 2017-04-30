package localhost.periodpeace;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class WhereToGoTampons extends Activity {
    Button nearbyTampons;
    Button requestTampons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to_go_tampons);
        nearbyTampons = (Button) findViewById(R.id.goToTamponsButton);
        nearbyTampons.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                goFindNearbyTampons(v);
            }
        });
        requestTampons = (Button) findViewById(R.id.requestTamponsButton);
        requestTampons.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                    goRequestTampons(v);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        });
    }
    //Go to next screen for getting stuff.
    public void goFindNearbyTampons (View view) {
        Intent Intent = new Intent(this, navigateToTampons.class);
        startActivity(Intent);
    }
    //Go to next screen for giving stuff.
    public void goRequestTampons (View view) {
        Intent Intent = new Intent(this, Thanks.class);
        startActivity(Intent);
    }
}
