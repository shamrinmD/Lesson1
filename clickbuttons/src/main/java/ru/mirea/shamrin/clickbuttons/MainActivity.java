package ru.mirea.shamrin.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Найдем View-элементы
        textView = (TextView) findViewById(R.id.tvOut);
        buttonOk = (Button) findViewById(R.id.btnOk);
        buttonCancel = (Button)  findViewById(R.id.btnCancel);

        View.OnClickListener oclBtnOk = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textView.setText("Нажата кнопка OK");
            }
        };

        // Присвоим обработчик кнопке OK (btnOk)
        buttonOk.setOnClickListener(oclBtnOk);

        View.OnClickListener oclBtnCancel = new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                textView.setText("Нажата кнопка Cancel");
            }
        };
        // Присвоим обработчик кнопке Cancel (btnCancel)
        buttonCancel.setOnClickListener(oclBtnCancel);
    }
}