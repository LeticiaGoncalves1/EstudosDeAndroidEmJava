package devandroid.leticia.applistacurso.view;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import devandroid.leticia.applistacurso.R;
import devandroid.leticia.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    //Objeto pessoa do tipo Pessoa
    Pessoa pessoa;
    Pessoa pessoa2;

    //Atributos do objeto pessoa do tipo String
    String dadosPessoa;
    String dadosPessoa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();


        //Atribuindo dados ao objeto pessoa do tipo Pessoa
        pessoa.setNome("Letícia");
        pessoa.setSobrenome("Gonçalves");
        pessoa.setCursoDesejado("Java Android");
        pessoa.setTelefone("11981424242");
        pessoa.setEmail("leticia@email.com");

        pessoa2 = new Pessoa();
        pessoa2.setNome("Vanessa");
        pessoa2.setSobrenome("Moura");
        pessoa2.setCursoDesejado("HTML e CSS");
        pessoa2.setTelefone("47987654321");
        pessoa2.setEmail("vanessa@email.com");








        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

}