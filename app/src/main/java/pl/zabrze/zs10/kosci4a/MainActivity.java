package pl.zabrze.zs10.kosci4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textViewPunkty;
    Button buttonRzuc;
    ImageView[] imageView ;
    Kosc [] kosci = new Kosc[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPunkty = findViewById(R.id.textView);
        imageView = new ImageView[]{findViewById(R.id.imageView),
                findViewById(R.id.imageView2),
                findViewById(R.id.imageView3),
                findViewById(R.id.imageView4),
                findViewById(R.id.imageView5)};
        buttonRzuc = findViewById(R.id.button);

        buttonRzuc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        int suma =0;
                        for (int i = 0; i < imageView.length; i++) {
                            kosci[i] = new Kosc();
                            imageView[i].setImageResource(kosci[i].getIdObrazka());
                        }

                       textViewPunkty.setText(Integer.toString(suma));
                    }
                }
        );
    }
}