package test.java.fr.ensai.mediaplayer;

import java.util.List;

import fr.ensai.mediaplayer.Podcast;

public class PlaylistTest {

    @BeforeEach
    void init(){
        Artist Charlelie = new Artist("Charlélie", "Couture", "French");
        Song song1 = new Song("La rivière", Charlelie, 2025, 3, "texte", Charlelie, Charlelie, List.of(MusicalGenre.POP));
        Song song2 = new Song ("Comme un avion", Charlelie, 1980, 3, "texte2", Charlelie, Charlelie, List.of(MusicalGenre.POP));
        Podcast pod1 = new Podcast("histoire", "Ferrand","Renaissance", 4, 2026, "sous");
        Podcast pod2 = new Podcast("histoire", "Ferrand","14-18", 4, 2026, "sous2");        
    }
    
    @Test 
    void testaddMedia(){
        //Given
        Playlist playlisttest = new Playlist("playlisttest");

        //WHEN
        playlisttset.add.media(song1);

        //THEN
        assertEquals(3, playlisttest.getTotalDuration());
        assertEquals(1,playlisttest.size());
        assertTrue(playlisttest.contains("La rivière"));
    }
}
