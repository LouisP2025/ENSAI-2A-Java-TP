package fr.ensai.mediaplayer;

import java.util.Objects;

/**
 * Represents an artist with essential attributes.
 */
public class Artist {
    private String firstName;
    private String lastName;
    private String nationality;
    
    
    /**
     * Constructs a new artist object.
     *
     * @param firstName   The firstName of the artist.
     * @param lastName   The lastName of the artist.
     * @param nationality    The nationality of the artist
     */
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return String.format("Artist name %s %s",this.firstName, this.lastName);
    }
    
}