import java.util.*;

public class ThisisATFile{
    private static final boolean isTrue = false;
    private int counter = 0;

    public synchronized void increment(){
        if(isTrue) counter++;
    }
}
