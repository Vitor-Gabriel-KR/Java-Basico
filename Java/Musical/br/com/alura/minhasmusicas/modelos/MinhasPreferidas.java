package Musical.br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " E considerado um sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " Uma exelente opção para ser ouvida!");
        }
    }
}
