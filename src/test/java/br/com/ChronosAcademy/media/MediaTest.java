package br.com.ChronosAcademy.media;

import org.junit.Test;

import static org.junit.Assert.*;

public class MediaTest {
@Test
    public void ValidaAprovado(){
        Media media = new Media();
        String resultado = media.calulaMedia (5.0,5.0);
        assertEquals("Aprovado", resultado);

    }
@Test
    public void ValidaReprovado() {
    Media media = new Media();
    String resultado = media.calulaMedia(4.9, 5.0);
    assertEquals("Reprovado", resultado);

}
}