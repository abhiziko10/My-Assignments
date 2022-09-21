import java.util.Set;

public class Director {
    private String name;

    private Movies movies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
    void display(){
        System.out.println("******************Director********************");
        System.out.println("Director name :"+getName());
//        for(Movies movie:movies){
//            System.out.println("Movie name: "+movie.getMovieName());
//            System.out.println("songs : "+movie.getSongs());
//
        movies.show();

        }

    }

