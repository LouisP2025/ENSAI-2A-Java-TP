package fr.ensai.mediaplayer;

public abstract class Media {
    protected String title;
    protected int year;
    protected int duration;

    protected Media(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public abstract String getText();

    public void play() {
        String text = getText();
        String[] mots = text.split(" ");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Thread was interrupted");
    }
        for (String mot : mots) {
                System.out.println(mot);
        }
    }  

}
