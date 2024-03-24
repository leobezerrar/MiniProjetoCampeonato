package miniprojeto;

public class Clube {
    private String nome;
    public int pontos;
    public int saldoGols;

    Clube(String nome){ 
        this.nome = nome;
        this.pontos = 0;
        this.saldoGols = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public int getSaldoGols() {
        return saldoGols;
    }

    public void ganhar(int saldoGols){
        this.pontos += 3;
        this.saldoGols += saldoGols;
    }

    public void empatar(int saldoGols){
        this.pontos += 1;
    }

    public void perder(int saldoGols){
        this.saldoGols += saldoGols;
    }

}
