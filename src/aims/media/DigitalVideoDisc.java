package aims.media;

public class DigitalVideoDisc extends Media {
    private String director;
    private int length;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DigitalVideoDisc(String title) {
        super();
        this.setTitle(title);
    }

    public boolean search(String title) {
        String[] tokens = title.split(" ");
        for (int i = 0; i < tokens.length; ++i)
            if (!this.getTitle().contains(tokens[i])) return false;
        return true;
    }
}
