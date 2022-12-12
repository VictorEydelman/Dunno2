package Persons;
import Interface.people;

import java.util.Objects;

public class person extends Alper implements people {
    public person(String name) {
        super(name);
    }
    public class object extends person{
        public object(String name) {
            super(name);
        }

        @Override
        public int hashCode () {
        return Objects.hash(name);
        }
        @Override
        public String toString () {
        return "person[name=" + name + " ,getClass=" + getClass().getName() + "]";
        }
        @Override
        public boolean equals (Object o){
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        person human = (person) o;
        return name.equals(human.name);
        }
    }
}