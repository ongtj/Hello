package my.edu.tarc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewMessage; //TextView = Class
                              // textViewMessage = instance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main function
        super.onCreate(savedInstanceState);
        //Show me the UI
        //R = resource
        //layout = folder
        setContentView(R.layout.activity_main);
        textViewMessage = findViewById(R.id.textViewMessage);
    }

    public void showMessage(View view){
        textViewMessage.setText("Hello, <your name here>");
    }
}
