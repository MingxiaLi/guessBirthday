//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Singer extends Person {
    private String debutAlbum;
    private Date debutAlbumReleaseDate;

    public Singer(String name, Date birthday) {
        super(name, birthday);
    }

    public Singer(String name, Date birthday, String gender, String debutAlbum, Date debutAlbumReleaseDate, double difficulty) {
        super(name, birthday, gender, difficulty);
        this.debutAlbum = debutAlbum;
        this.debutAlbumReleaseDate = debutAlbumReleaseDate;
    }

    public Singer(Singer singer) {
        super(singer);
        this.debutAlbum = singer.debutAlbum;
        this.debutAlbumReleaseDate = singer.debutAlbumReleaseDate;
    }

    public String entityType() {
        return "This entity is a Singer!";
    }

    public Singer clone() {
        return new Singer(this);
    }

    public String toString() {
        return super.toString() + "Debut Album: " + this.debutAlbum + "\n" + "Release Date: " + this.debutAlbumReleaseDate;
    }
}
