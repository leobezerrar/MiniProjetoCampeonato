package miniprojeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Campeonato {

    private List<Clube> clubs;

    Campeonato(){
        this.clubs = new ArrayList<>();
    }

    void addClube(Clube clube){
        this.clubs.add(clube);
    }

    public void jogarCampeonato(){
        for(int k = 0; k < clubs.size(); k++){
            for(int j = k + 1; j < clubs.size(); j++){
                jogarPartida(clubs.get(k), clubs.get(j));
                jogarPartida(clubs.get(j), clubs.get(k));
            }
        }
    }
    private void jogarPartida(Clube c1, Clube c2){
        Random random = new Random();
        int golsClub1 = random.nextInt(6);
        int golsClub2 = random.nextInt(6);
        int saldoGols = golsClub1 - golsClub2;

        if (golsClub1 > golsClub2) {
            c1.ganhar(saldoGols);
            c2.perder(saldoGols);
            // imprimir o placar da partida
        } else if (golsClub2 > golsClub1) {
            c2.ganhar(saldoGols);
            c1.perder(saldoGols);    
            // imprimir o placar da partida        
        }else{
            c1.empatar(saldoGols);
            c2.empatar(saldoGols);
            // imprimir o placar da partida
        }
        
        System.out.println("[" + c1.getNome() + " " +  golsClub1 + " X " + golsClub2 + " " + c2.getNome() + "]\n");        

    }

    public String getClassificacao(){
        Collections.sort(clubs, (clube1, clube2) -> {
            if (clube1.getPontos() != clube2.getPontos()) {
                return Integer.compare(clube2.getPontos(), clube1.getPontos());
            } else {
                return Integer.compare(clube2.getSaldoGols(), clube1.getSaldoGols());
            }
        });

        for (int i = 0; i < clubs.size(); i++) {
            System.out.println("   " + (i + 1) + "      " + clubs.get(i).getNome() +
             "      " + clubs.get(i).getPontos() + "        " + clubs.get(i).getSaldoGols());
        }
        return "";
    }

    public String getCampeao(){
        return clubs.get(0).getNome();
    }

}
