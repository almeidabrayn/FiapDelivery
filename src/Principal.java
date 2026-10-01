import Classes.Caminhao;
import Classes.Moto;
import Classes.Pacote;
import Classes.Rota;

public class Principal {

    static void main(String[] args) {

        Caminhao caminhao = new Caminhao(
                "ABC1234",
                500.0,
                3
        );

        Moto moto = new Moto(
                "XYZ5678",
                50.0,
                true
        );

        Pacote pacote = new Pacote(
                "BR999",
                10.5,
                "Pendente"
        );

        Rota rotaCaminhao = new Rota(
                pacote,
                caminhao
        );

        Rota rotaMoto = new Rota(
                pacote,
                moto
        );

        rotaCaminhao.realizarEntrega();
        rotaMoto.realizarEntrega();
    }
}