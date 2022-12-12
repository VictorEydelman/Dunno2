package Persons;
import Enum.Names;
import Interface.people;

public abstract class Alper extends All.po implements people {
    Alper(String name) {
        super(name);
    }
    @Override
    public void in(String n1, String n2, int s, Names em, String r1) {
        class Anonim extends Alper {
            Anonim(String name) {
                super(name);
            }
            public void anon() {
                if (em != null) {
                    this.name = em.getValue();
                }
                System.out.println(this.name + n1 + r1 + n2);
            }
        }
        Anonim happing2 = new Anonim(name) {
            public void anon() {
                System.out.println(n1 + r1 + this.name + n2);
            }
        };
        Anonim happing1 = new Anonim(name);
        if (s==0) {
            happing1.anon();
        } else {
            happing2.anon();
        }
    }
}