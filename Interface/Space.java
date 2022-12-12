package Interface;

import Enum.Names;
import exception.*;

public interface Space {
    public void po(String n1, String n2);
    public void po(String n, int s);
    public void po(String n1, String n2,Names em) ;
    public void po(String n, int s,Names em) throws NumberExc;
    public String po2(String n1,String n2);
    public String po2(String n1, String n2, Names em);
}