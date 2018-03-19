package id.co.dev.rabbaanii.combobox;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class mainActivity extends AppCompatActivity {

    TextView texta, textb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texta = (TextView) findViewById(R.id.piliha);
        textb = (TextView) findViewById(R.id.pilihb);
    }

    @SuppressLint("SetTextI18n")
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {

            case R.id.checkbox_meat:
                if (checked) {
                    Toast.makeText(mainActivity.this, "This Meat!", Toast.LENGTH_SHORT).show();
                    texta.setText("Meat");
                }
                if (!checked) {
                    Toast.makeText(mainActivity.this, "Meat Unchecked!", Toast.LENGTH_SHORT).show();
                    texta.setText("");
                }
                break;

            case R.id.checkbox_cheese:
                if (checked) {
                    Toast.makeText(mainActivity.this, "This Cheese!", Toast.LENGTH_SHORT).show();
                    textb.setText("Cheese");
                }
                if (!checked) {
                    Toast.makeText(mainActivity.this, "Cheese Unchecked!", Toast.LENGTH_SHORT).show();
                    textb.setText("");
                }
                break;
        }
    }
}
