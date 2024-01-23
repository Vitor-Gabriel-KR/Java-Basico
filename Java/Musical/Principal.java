package Musical;

import Musical.br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import Musical.br.com.alura.minhasmusicas.modelos.Musica;
import Musical.br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Rap do Naruto e Sasuke - somos iguais!");
        minhaMusica.setCantor("Dazai Vorgh");
        minhaMusica.setGenero("Macho Alpha");

        for (int i = 0; i < 50000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 5000; i++) {
            minhaMusica.Curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("FlowPodcast");
        meuPodcast.setHost("Igor 3k");
        for (int i = 0; i < 3000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 500; i++) {
            meuPodcast.Curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
