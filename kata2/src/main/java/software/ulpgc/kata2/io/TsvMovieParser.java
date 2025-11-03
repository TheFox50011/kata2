package software.ulpgc.kata2.io;

import software.ulpgc.kata2.model.Movie;

public class TsvMovieParser implements MovieParser{
    public Movie parse(String str){

        return parse(str.split("\t"));
    }

    private Movie parse(String[] split){

        return new Movie(split[2], toInt(split[7]));
    }

    private  int toInt(String str){
        if(str.equals("\\N")){
            return -1;
        }
        return  Integer.parseInt(str);
    }
}
