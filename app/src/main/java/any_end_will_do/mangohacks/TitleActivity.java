package any_end_will_do.mangohacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import any_end_will_do.mangohacks.dataBase.dashCards;
import any_end_will_do.mangohacks.dataObjects.BusinessPost;

public class TitleActivity extends AppCompatActivity {
        static BusinessPost businessPosts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dashCards dash = new dashCards("paper", 1);

    }

    public void testingClick(View view) {
        Intent intent = new Intent(this, MainPageActivity.class);
        startActivity(intent);
    }

    public void signUpButton(View v){
        Button button = (Button) v;

        if (v == findViewById(R.id.sign_up)){
            try{
                Intent CU = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(CU);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        if (v == findViewById(R.id.login)){
            try{
                Intent CU = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(CU);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }
}
