package idadedecachorro.cursoandroid.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // criando os atributos
    private EditText caixaTexto;
    private Button btnIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // recuperando os id's da tela
        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        btnIdade = (Button) findViewById(R.id.botaoIdade);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdade);
        // adicionando funcionalidade para clique no botão
        btnIdade.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // recurar informação da tela
                String txt = caixaTexto.getText().toString();
                // validando se o usuario entrou com uma idade
                if(!txt.isEmpty()){
                    //String com valor
                    // convertendo de string para int para conseguir calcular
                    int vlrDigitado = Integer.parseInt(txt);
                    int result = vlrDigitado * 7;
                    resultadoIdade.setText("A idade do cachorro é : " + result + " anos.");
                }else{
                    //String vazia
                    resultadoIdade.setText("Nenhum numero digitado!!!");
                }
            }
        });
    }
}
