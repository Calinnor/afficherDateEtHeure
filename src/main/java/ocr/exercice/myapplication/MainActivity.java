package ocr.exercice.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.SHORT).format(calendar.getTime());
        TextView newsDate = findViewById(R.id.date);
        newsDate.setText(currentDate);

        Calendar curenttimeHour = Calendar.getInstance();
        String currentTime = DateFormat.getTimeInstance().format(curenttimeHour.getTime());
        TextView timeHour = findViewById(R.id.hour);
        timeHour.setText(currentTime);
    }
}
