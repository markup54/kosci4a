package pl.zabrze.zs10.kosci4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewPunkty;
    Button buttonRzuc;
    ImageView[] imageViews;
    Kosc [] kosci = new Kosc[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewPunkty = findViewById(R.id.textView);
        imageViews = new ImageView[]{findViewById(R.id.imageView),
                findViewById(R.id.imageView2),
                findViewById(R.id.imageView3),
                findViewById(R.id.imageView4),
                findViewById(R.id.imageView5)};
        buttonRzuc = findViewById(R.id.button);
        for (int i = 0; i < imageViews.length; i++) {
            kosci[i] = new Kosc();
        }
        buttonRzuc.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        int suma =0;
                        for (int i = 0; i < imageViews.length; i++) {
                            kosci[i].rzucKoscia();
                            imageViews[i].setImageResource(kosci[i].getIdObrazka());
                            suma = suma +kosci[i].getWartosc();
                        }

                       textViewPunkty.setText(Integer.toString(suma));
                    }
                }
        );
        for (int i = 0; i < imageViews.length; i++) {
            final int ind =i;
            imageViews[i].setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            kosci[ind].odblokujzablokuj();
                            if(kosci[ind].isZablokowana()){
                                imageViews[ind].setAlpha(0.5f);
                            }
                            else{
                                imageViews[ind].setAlpha(1.0f);
                            }
                        }
                    }
            );
        }
    }
}