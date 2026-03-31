import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

import fr.ensai.mediaplayer.Artist;
import fr.ensai.mediaplayer.MusicalGenre;

public class Playlist {
    private String name;
    private List<Media> mediaList;
    private int totalDuration;

/**
     * Constructs a new Playlist object
     *
     * @param name    The name of the Playlist
     * @param mediaList   The list of the Medias
     * @param totalDuration   The total duration of the Playlist
 */
    public Playlist(String name) {
        this.name = name;
        this.mediaList = new ArrayList<>();
        this.totalDuration = 0; 
    }

/**
     * method to add a media at the end of the playlist
     * @param media   The new media to add
 */
    public void addMedia(Media media){
        this.mediaList.add(media);
        this.totalDuration += media.duration;
    }

    /**
     * method to remove a media if it exists in the playlist
     * @param media   The  media to remove
 */
    public boolean removeMedia(Media media){
        boolean present = this.mediaList.contains(media);
        if (present){
            this.mediaList.remove(media);
            this.totalDuration -= media.duration;
        }
        return present;
    }

    public String getName() {
        return name;
    }

    public List<Media> getMediaList() {
        return mediaList;
    }

    public int getTotalDuration() {
        return totalDuration;
    }
    

}
