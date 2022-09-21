

import java.util.List;
import java.util.Set;

public class Movies {
    private Set<String> movieName;
    private List<String> songs;

    @Override
    public String toString() {
        return "Movies{" +
                "movieName=" + movieName +
                ", songs=" + songs +
                '}';
    }

    public Set<String> getMovieName() {
        return movieName;
    }

    public void setMovieName(Set<String> movieName) {
        this.movieName = movieName;
    }

    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
    }
    public void show(){
        for (String s:movieName) {
            System.out.println("Movie name is:"+s);

        }

        System.out.println(songs);
    }
}
