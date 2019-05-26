package presenter;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.financialmanagement.R;

import model.MoneyJarUserDetail;

public class MoneyJar_PresenterImpl  extends AppCompatActivity implements MoneyJar_Presenter {
    private TextView txt_jar1;
    private TextView txt_jar2;
    private TextView txt_jar3;
    private TextView txt_jar4;
    private TextView txt_jar5;
    private TextView txt_jar6;
    private MoneyJarUserDetail moneyJarUserDetail;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moneyjarsetting_view);
    }
    public MoneyJar_PresenterImpl(Context context) {
        this.context = context;
    }

    @Override
    public boolean checkJarPercent(int jar1, int jar2, int jar3, int jar4, int jar5, int jar6) {
        int sum = 0;
        sum = sum + jar1 + jar2 + jar3 + jar4 + jar5 + jar6;
        if(sum == 100){
            return true;
        }
        return false;
    }
    public void anhxa(){
        txt_jar1 = findViewById(R.id.txt_jar1);
        txt_jar2 = findViewById(R.id.txt_jar2);
        txt_jar3 = findViewById(R.id.txt_jar3);
        txt_jar4 = findViewById(R.id.txt_jar4);
        txt_jar5 = findViewById(R.id.txt_jar5);
        txt_jar6 = findViewById(R.id.txt_jar6);
    }
}
