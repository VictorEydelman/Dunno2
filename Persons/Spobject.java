package Persons;
import Interface.Space;

import java.util.Objects;

public class Spobject extends All.po implements Space {
    public Spobject(String name) {
        super(name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
    @Override
    public String toString(){
        return "Spobject[name=" + name + " ,getClass=" + getClass().getName()+"]";
    }
    @Override
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (o==null || getClass()!=o.getClass()){
            return false;
        }
        Spobject space = (Spobject) o;
        return name.equals(space.name);
    }
}
