package miniprojeto;

public class Teste {
    public static void main(String[] args) {

        Campeonato champ = new Campeonato();

        champ.addClube(new Clube("Computação"));
        champ.addClube(new Clube(" Eng Civil"));
        champ.addClube(new Clube(" Materiais"));
        champ.addClube(new Clube("Mat Comput"));
        champ.addClube(new Clube(" Medicina "));
        champ.addClube(new Clube("Sist Infor"));

        System.out.println("\n#---#---#---#---#---#---#---#---#");
        System.out.println("\n    WELLCOME TO UFCA CUP");

        System.out.println("\n#---#---#---#---#---#---#---#---#\n");
        System.out.println("      PLACAR DOS JOGOS:\n");
        champ.jogarCampeonato();

        System.out.println("\n#---#---#---#---#---#---#---#---#---#---#\n");
        System.out.println("\t      CLASSIFICAÇÃO\n");
        System.out.println("POSIÇÃO      TIME       PONTOS\tSALDOGOLS");
        System.out.println(champ.getClassificacao());

        System.out.println("\n#---#---#---#---#---#---#---#---#---#---#\n");
        System.out.println("     O CAMPEÃO DO CAMPEONATO FOI:\n");

        System.out.println("  *-*-*-*-*-* " + champ.getCampeao().toUpperCase() + " *-*-*-*-*-*\n\n");
    }
}
