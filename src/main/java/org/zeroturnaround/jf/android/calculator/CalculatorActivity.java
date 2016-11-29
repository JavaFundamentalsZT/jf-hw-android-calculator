package org.zeroturnaround.jf.android.calculator;

import android.app.Activity;
import android.os.Bundle;

public class CalculatorActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set our calculator layout
        setContentView(R.layout.main);
    }
}
