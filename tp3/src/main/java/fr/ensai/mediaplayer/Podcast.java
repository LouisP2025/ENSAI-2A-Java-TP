package fr.ensai.mediaplayer;

public class Podcast extends Media{
    private String host;
    private String topic;
    private String subtitles;

    public Podcast(String title, String host, String topic, int duration, int year, String subtitles) {
            super(title, duration, year);
            this.host = host;
            this.topic = topic;
            this.subtitles = subtitles;
        }

    @Override
    public String toString() {
        return String.format("Podcast %s by %s",this.title, this.host);
    }

    @Override
    public String getText() {
        return this.subtitles;
    }
}
