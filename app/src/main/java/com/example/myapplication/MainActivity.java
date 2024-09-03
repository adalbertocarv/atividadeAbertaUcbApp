package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextProductName;
    private EditText editTextProductPrice;
    private CheckBox checkBoxImported;
    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializa todos os componentes
        editTextProductName = findViewById(R.id.editTextProductName);
        editTextProductPrice = findViewById(R.id.editTextProductPrice);
        checkBoxImported = findViewById(R.id.checkBoxImported);
        buttonSave = findViewById(R.id.buttonSave);

        // Definir o listener do botão
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSaveClick(v);
            }
        });
    }

    public void onSaveClick(View view) {
        String productName = editTextProductName.getText().toString();
        String productPrice = editTextProductPrice.getText().toString();
        boolean isImported = checkBoxImported.isChecked();

        if (productName.isEmpty()) {
            showCustomToast("O nome do produto não foi informado.");
            return;
        }

        if (productPrice.isEmpty()) {
            showCustomToast("O preço do produto não foi informado.");
            return;
        }

        // Exibir as informações coletadas
        String importStatus = isImported ? "sim" : "não";
        String message = "Dados informados:\n" +
                "Nome do produto: " + productName + "\n" +
                "Preço do produto: " + productPrice + "\n" +
                "Produto importado: " + importStatus;

        showCustomToast(message);
    }

    // Método para exibir um Toast personalizado
    // Tive que criar um Toast costumizado para aparecer no centro da tela
    private void showCustomToast(String message) {
        LayoutInflater inflater = getLayoutInflater();
        // Inflando o layout personalizado sem a necessidade de um ID de container
        View layout = inflater.inflate(R.layout.toast_customizado, null);

        TextView toastText = layout.findViewById(R.id.toastText);
        toastText.setText(message);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

}
