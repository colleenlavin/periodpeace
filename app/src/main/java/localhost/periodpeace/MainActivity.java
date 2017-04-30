package localhost.periodpeace;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button getButton;
    Button giveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getButton = (Button) findViewById(R.id.needHelpButton);
        getButton = (Button) findViewById(R.id.needHelpButton);
        getButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                goGetProducts(v);
            }
        });
        giveButton = (Button) findViewById(R.id.willHelpButton);
        giveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try{
                goGiveProducts(v);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                }
            });
        }

    //Go to next screen for getting stuff.
    public void goGetProducts (View view) {
        Intent Intent = new Intent(this, whereToGo.class);
        startActivity(Intent);
    }
    //Go to next screen for giving stuff.
    public void goGiveProducts (View view) {
        Intent Intent = new Intent(this, Thanks.class);
        startActivity(Intent);
    }
}
