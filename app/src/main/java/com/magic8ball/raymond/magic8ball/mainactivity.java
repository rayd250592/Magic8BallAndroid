package com.magic8ball.raymond.magic8ball;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;





public class mainactivity extends Activity {


    String[] respones = { "Yes", "Signs point to yes", "Reply hazy, try again", "No", "Check Again",
            "I'm not sure", "Ask again",
            "Better luck next time", "OK", "Sure thing", "Sureeee", "Maybe", "OK", "Totally", "Nahh",
    "I agree", "I'm a magic ball", "Not available now", "Ask the Internet", "It's a boy",
            "It's a girl", "Without a doubt", "My sources say no", "As I see it, yes",
            "Outlook good"};

    int length = respones.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
       final EditText q = (EditText)findViewById(R.id.question);
        final TextView answer = (TextView)findViewById(R.id.ans);

        Button button = (Button)findViewById(R.id.buttonask);

        button.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {




                        String quest = q.getText().toString();

                        if (quest == "")
                        {
answer.setText("You must ask me a question first");

                        }

                        else if (quest == "Please ask a question here")

                        {

                            answer.setText("You must ask me a question first");

                        }

                        else

                        {

                            int idx = new Random().nextInt(respones.length);
                            String random = (respones[idx]);


                            answer.setText(random);


                        }

                    }
                }
        );
     

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

