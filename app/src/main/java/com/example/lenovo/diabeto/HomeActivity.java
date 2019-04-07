package com.example.lenovo.diabeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HomeActivity extends AppCompatActivity {

    private TextView day;
    private TextView date;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        logout = (Button)findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
//        Date d = Calendar.getInstance().getTime();
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
//        String formatDate = sdf.format(d);
//        Calendar calendar = Calendar.getInstance();
//        int var_day = calendar.get(Calendar.DAY_OF_WEEK);
//        day = (TextView)findViewById(R.id.day);
//        date = (TextView)findViewById(R.id.date);
//        switch (var_day){
//            case Calendar.SUNDAY:
//                day.setText("SUNDAY");
//                date.setText(formatDate);
//                break;
//            case Calendar.MONDAY:
//                day.setText("MONDAY");
//                date.setText(formatDate);
//                break;
//            case Calendar.TUESDAY:
//                day.setText("TUESDAY");
//                date.setText(formatDate);
//                break;
//            case Calendar.WEDNESDAY:
//                day.setText("WEDNESDAY");
//                date.setText(formatDate);
//                break;
//            case Calendar.THURSDAY:
//                day.setText("THURSDAY");
//                date.setText(formatDate);
//                break;
//            case Calendar.FRIDAY:
//                day.setText("FRIDAY");
//                date.setText(formatDate);
//                break;
//            case Calendar.SATURDAY:
//                day.setText("SATURDAY");
//                date.setText(formatDate);
//                break;
//        }



    }
}
