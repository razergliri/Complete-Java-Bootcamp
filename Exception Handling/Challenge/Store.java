import java.util.ArrayList;

public class Store {
    private ArrayList<Movie> movies;
    public Store(){
        this.movies = new ArrayList<>();
    }
    public Movie getMovie(int index){
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie newMovie){
        this.movies.set(index, new Movie(newMovie));
    }

    public void addMovie(Movie newMovie){
        this.movies.add(new Movie(newMovie));

    }

    public String toString(){
        String temp="";
        for(Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }
}
