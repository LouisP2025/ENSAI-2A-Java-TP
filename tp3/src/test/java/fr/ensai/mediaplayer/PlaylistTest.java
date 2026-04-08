package fr.ensai.mediaplayer;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PlaylistTest {
    private Artist Charlelie;
    private Song song1;
    private Song song2;
    private Podcast pod1;
    private Podcast pod2;

    @BeforeEach
    void init(){
        Charlelie = new Artist("Charlélie", "Couture", "French");
        song1 = new Song("La rivière", Charlelie, 2025, 3, "texte", Charlelie, Charlelie, List.of(MusicalGenre.POP));
        song2 = new Song ("Comme un avion", Charlelie, 1980, 3, "texte2", Charlelie, Charlelie, List.of(MusicalGenre.POP));
        pod1 = new Podcast("histoire", "Ferrand","Renaissance", 4, 2026, "sous");
        pod2 = new Podcast("histoire", "Ferrand","14-18", 4, 2026, "sous2");        
    }
    
    @Test 
    void testaddMedia(){
        //Given
        Playlist playlisttest = new Playlist("playlisttest");

        //WHEN
        playlisttest.addMedia(song1);

        //THEN
        assertEquals(3, playlisttest.getTotalDuration());
        assertEquals(1,playlisttest.size());
        assertTrue(playlisttest.contains("La rivière"));
    }
}
