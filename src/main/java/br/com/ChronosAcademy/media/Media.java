package br.com.ChronosAcademy.media;

public class Media {

    public String calulaMedia(double v, double v1) {
        double media = (v+v1)/2;
        if (media<5){
            return "Reprovado";

        }
            return "Aprovado";

    }
}
