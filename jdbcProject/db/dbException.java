package jdbcProject.db;

public class dbException extends RuntimeException{

    private static final long serialVersionID = 1L;

    public dbException(String msg){
        super(msg);
    }
}
