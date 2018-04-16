package com.example.myapplication;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.hardware.Sensor;
        import android.hardware.SensorEvent;
        import android.hardware.SensorEventListener;
        import android.hardware.SensorManager;
        import android.widget.TextView;


public class AccelerometerActivity extends AppCompatActivity implements SensorEventListener {

    private TextView xText;
    private TextView yText;
    private TextView zText;
    private Sensor sensorAccelerometer;
    private SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer);

        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensorAccelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        xText = (TextView)findViewById(R.id.textView);
        yText = (TextView)findViewById(R.id.textView2);
        zText = (TextView)findViewById(R.id.textView3);
    }


    @Override
    public void onSensorChanged(SensorEvent event) {
        xText.setText("X: " + Math.round(event.values[0]));
        yText.setText("Y: " + Math.round(event.values[1]));
        zText.setText("Z: " + Math.round(event.values[2]));

    }

    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this, sensorAccelerometer);
    }

    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(this, sensorAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

}
