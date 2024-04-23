/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Piloto;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author luizg
 */
public class ControllerArquivoTextoPiloto extends ControllerArquivoTexto {

    private ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public boolean escreverPiloto(boolean append) {
        boolean aux = false;
        for (int i = 0; i < pilotos.size(); i++) {
            Piloto piloto = pilotos.get(i);
            if (piloto.getId() == 0) {
                if (i > 0) {
                    int ultimoId = pilotos.get(i - 1).getId();
                    piloto.setId(ultimoId + 1);
                } else {
                    piloto.setId(1);
                }
            }
            String texto
                    = piloto.getId() + ";\n"
                    + piloto.getNome() + ";\n"
                    + piloto.getNacionalidade() + ";\n"
                    + piloto.getEquipe() + ";\n"
                    + piloto.getNumero() + ";\n"
                    + piloto.getPontos() + ";\n"
                    + "--"
                    + "\n\n";
            setTexto(texto);
            if (i == 0) {
                aux = (escrever(false));
            } else {
                aux = (escrever(append));
            }
        }
        return aux;
    }

    public boolean lerPiloto() {
        pilotos = new ArrayList<Piloto>();
        if (ler()) {
            String conteudo = getTexto();
            StringTokenizer linha = new StringTokenizer(conteudo, "--");
            while (linha.hasMoreTokens()) {
                StringTokenizer registro = new StringTokenizer(linha.nextToken(), ";");
                Piloto piloto = new Piloto();
                piloto.setId(Integer.parseInt(registro.nextToken()));
                piloto.setNome(registro.nextToken());
                piloto.setNacionalidade(registro.nextToken());
                piloto.setEquipe(registro.nextToken());
                piloto.setNumero(Integer.parseInt(registro.nextToken()));
                piloto.setPontos(Integer.parseInt(registro.nextToken()));
                getPilotos().add(piloto);
            }
            return true;
        } else {
            return false;
        }
    }

    public Piloto getPilotoPorId(int id) {
        for (Piloto piloto : pilotos) {
            if (piloto.getId() == id) {
                return piloto;
            }
        }
        return null;
    }

    public boolean deletarPilotoPorId(int id) {
        Piloto pilotoParaDeletar = null;
        for (Piloto piloto : pilotos) {
            if (piloto.getId() == id) {
                pilotoParaDeletar = piloto;
                break;
            }
        }
        if (pilotoParaDeletar != null) {
            pilotos.remove(pilotoParaDeletar);
            limparConteudoArquivo();
            return escreverPiloto(true);
        } else {
            return false;
        }
    }

    public boolean editarCircuitoPorId(int id, Piloto pilotoEditado) {
        for (Piloto piloto : pilotos) {
            if (piloto.getId() == id) {
                piloto.setNome(pilotoEditado.getNome());
                piloto.setNacionalidade(pilotoEditado.getNacionalidade());
                piloto.setEquipe(pilotoEditado.getEquipe());
                piloto.setNumero(pilotoEditado.getNumero());
                piloto.setPontos(pilotoEditado.getPontos());
                limparConteudoArquivo();
                return escreverPiloto(true);
            }
        }
        return false;
    }
}
