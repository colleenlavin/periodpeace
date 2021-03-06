package localhost.periodpeace;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class PadsOrTampons extends Activity {
    Button needTampons;
    Button needPads;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pads_or_tampons);
        needTampons = (Button) findViewById(R.id.needTamponsButton);
        needTampons.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                goGiveTampons(v);
            }
        });
        needPads = (Button) findViewById(R.id.needPadsButton);
        needPads.setOnClickListener(new View.OnClickListener() {
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
        Intent Intent = new Intent(this, WhereToGoTampons.class);
        startActivity(Intent);
    }
    //Go to next screen for giving stuff.
    public void goGivePads (View view) {
        Intent Intent = new Intent(this, WhereToGoPads.class);
        startActivity(Intent);
    }
}
