package com.example.pooencapsulamento;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    /* Declaração de 5 objetos do tipo TextView para exibir dados do livro que estao no campo de atributos*/
    TextView txtTituloLivro;
    TextView txtAutor;
    TextView txtEditora;
    TextView txtPaginas;
    TextView txtLocalizacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Ativa o modo Edge-to-Edge para melhor adaptação do layout na tela
        EdgeToEdge.enable(this);

        // Define o layout da interface  de usuário como activity_main.xml
        setContentView(R.layout.activity_main);

        // Aplica padding nas bordas do layout principal para evitar sobreposição de elementos com as system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializa os componentes do layout (método vazio por enquanto)
        iniciarComponentesDoLayout();

        // Chama o método que cria e configura um objeto do tipo Livro
        criarObjetos();
    }

    private void iniciarComponentesDoLayout() {
        txtTituloLivro = findViewById(R.id.androidTxtTitulo);
        txtAutor = findViewById(R.id.androidTxtAutor);
        txtEditora = findViewById(R.id.androidTxtEditora);
        txtPaginas = findViewById(R.id.androidTxtPaginas);
        txtLocalizacao = findViewById(R.id.androidTxtLocalizacao);
    }

    // Método para criar e configurar um objeto do tipo Livro
    public void criarObjetos() {

        // Instancia um novo objeto do tipo Livro
        Livro objLivro = new Livro();

        // Define os valores dos atributos do objeto Livro usando métodos setters
        objLivro.setAutor("Prof Marco");
        objLivro.setTitulo("POO Encapsulamento Seguro");
        objLivro.setEditora("Mundial");
        objLivro.setPaginas(200);
        objLivro.setLocalizacao("A1,C4");

        // Exibe informações sobre o objeto Livro no Logcat para depuração
        Log.i("POO", "Obj Livro: Autor: " + objLivro.getAutor());
        Log.i("POO", "Obj Livro: Titulo: " + objLivro.getTitulo());
        Log.i("POO", "Obj Livro: Editora: " + objLivro.getEditora());
        Log.i("POO", "Obj Livro: Paginas: " + objLivro.getPaginas());
        Log.i("POO", "Obj Livro: Localizacao: " + objLivro.getLocalizacao());

        txtTituloLivro.setText(objLivro.getTitulo());
        txtAutor.setText(objLivro.getAutor());
        txtEditora.setText(objLivro.getEditora());
        txtPaginas.setText(objLivro.getPaginas().toString());
        txtLocalizacao.setText(objLivro.getLocalizacao());











    }
}
