package exceptions;

public class NoHeroException extends Exception {


    @Override
    public String getMessage() {
        return "No such HeroName. Try again";
    }
}
