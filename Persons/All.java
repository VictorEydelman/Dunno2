package Persons;


import Enum.Names;
import Interface.Space;
import exception.*;

public abstract class All extends Abstract implements Space {

    All(String name) {
        super(name);
    }
    public static class po extends All.po2{
        po(String name) {
            super(name);
        }

        @Override
        public void po(String n1, String n2) {
            if (n1 != null) {
                System.out.println(n1 + this.name + n2);
            } else {
                throw new StringRuntime("Нет частьи строк");
            }
        }

        @Override
        public void po(String n, int s) {
            if (s == 1) {
                System.out.println(n + this.name);
            } else {
                System.out.println(this.name + n);
            }
        }

        @Override
        public void po(String n1, String n2, Names em) {
            class Local extends po{
                Local(Names em){
                    super(String.valueOf(em));
                }
                public String local(Names em) {
                    return em.getValue();
                }
            }
            Local name =new Local(em);
            this.name=name.local(em);
            System.out.println(n1 + this.name + n2);
        }

        @Override
        public void po(String n, int s, Names em) throws NumberExc{
            this.name = em.getValue();
            if (s == 1) {
                System.out.println(n + this.name);
            } else if (s == 0) {
                System.out.println(this.name + n);
            } else {
                throw new NumberExc("Неверное число");
            }
        }
    }
    public static abstract class po2 extends All{
        po2(String name){
            super(name);
        }
        @Override
        public String po2(String n1, String n2) {
            return (n1 + this.name + n2);
        }

        @Override
        public String po2(String n1, String n2, Names em) {
            this.name = em.getValue();
            return (n1 + this.name + n2);
        }
    }
}