package com.example.pooencapsulamento;

/**
 * Classe Livro - Encapsulamento
 *
 * Atributos (- significa privado)
 *
 * - título - caracteres / String
 * - autor - caracteres / String
 * - editora - caracteres / String
 * - páginas - números inteiros / int / Integer
 * - localização - caracteres / String
 *
 * Construtores - cria a instância dos objetos da Classe.
 *
 * Métodos (+ significa público)
 *
 * + gets
 * + sets
 *
 * + cadastrar
 * + alterar
 * + deletar
 */

public class Livro {

    private String titulo;
    private String autor;
    private String editora;
    private Integer paginas;
    private String localizacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
