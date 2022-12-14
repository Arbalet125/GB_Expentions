package dz_3_seminar.base.exceptions;

public class GetDataArrayException extends RuntimeException{
    public GetDataArrayException() {
        super("Data array is null. Before getting the data you need to run the parseData method!!!");
    }
}
