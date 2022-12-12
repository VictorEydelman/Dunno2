package exception;

import java.io.IOException;

public class NumberExc extends IOException{
    public NumberExc(String message){
        super(message);
    }
}
