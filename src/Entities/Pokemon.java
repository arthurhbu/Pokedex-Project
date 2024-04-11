package Entities;

public class Pokemon {
    //Atributos
    private String nome, tipo1, tipo2, classificacao;
    private int id, ataque, vida, velocidade, geracao, defesa;
    private boolean is_legendary;
    private float peso, altura;
    private byte[] img;
 
    //Construtores
    public Pokemon(){}  
    
    public Pokemon(int id, String nome, int ataque, String classificacao, int defesa, float altura, int vida, int velocidade, String tipo1, String tipo2, float peso, int geracao, boolean is_legendary, byte[] img) { 
        this.id = id;
        this.nome = nome;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.classificacao = classificacao;
        this.ataque = ataque;
        this.vida = vida;
        this.velocidade = velocidade;
        this.geracao = geracao;
        this.defesa = defesa;
        this.is_legendary = is_legendary;
        this.peso = peso;
        this.altura = altura;
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getGeração() {
        return geracao;
    }

    public void setGeração(int geração) {
        this.geracao = geração;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public boolean isIs_legendary() {
        return is_legendary;
    }

    public void setIs_legendary(boolean is_legendary) {
        this.is_legendary = is_legendary;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setImg(byte[] img){
        this.img = img;
    }
    
    public byte[] getimg(){
        return img;
    }
    
    
}