package id.sch.smktelkom_mlg.tugas01.xirpl4018.advancedwidget2;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import butterknife.BindColor;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.editTextNama)
    EditText etNama;
    @BindView(R.id.textViewHasil)
    TextView tvHasil;
    @BindColor(R.color.colorAccent)
    int colorAccent;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tvHasil.setTextColor(colorAccent);

    }

   @OnClick(R.id.buttonProses)
    public void doProcess(){tvHasil.setText("Nama Anda "+etNama.getText());}
}
