package localhost.periodpeace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class UserType extends AppCompatActivity {
    Button getButton;
    Button giveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type);
        getButton = (Button) findViewById(R.id.needHelpButton);
        getButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goGetProducts(v);
            }
        });
        giveButton = (Button) findViewById(R.id.willHelpButton);
        giveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goGiveProducts(v);
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
