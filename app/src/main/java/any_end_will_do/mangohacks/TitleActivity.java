package any_end_will_do.mangohacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void testingClick(View view) {
        Intent intent = new Intent(this, MainPageActivity.class);
        startActivity(intent);
    }

}
