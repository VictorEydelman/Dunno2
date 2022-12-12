import Persons.Spobject;
import Persons.person;
import exception.ewf;
import exception.rfr;

import static Enum.Names.*;

public class Main {
    public static void main(String[] args) throws Exception, rfr {
        person Friends = new person("Друзья");
        person Ponchic = new person("Пончик");
        person Dunno = new person("Незнайка");
        person He = new person("Он");
        Spobject Moon = new Spobject("Луна");
        Spobject Sun = new Spobject("Солнце");
        Spobject Sky = new Spobject("небо");
        Spobject Task = new Spobject("задача");
        Spobject Sleep = new Spobject("сон");

        Friends.po(" спустились в пищевой отсек.",0);
        Dunno.po(" совсем еще не хотелось есть, и",0,Dunne);
        He.in("", "съел одну космическую котлетку.",0,he,
                Ponchic.po2(" только для того, чтоб составить компанию ",", ",Ponchicy));
        Ponchic.po(" Но "," решил не" +
                " теряться в создавшейся обстановке и отнесся к делу со всей серьезностью.");
        He.po(" заявил, что должен произвести в пищевом отсеке ревизию и " +
                "проверить качество всех космических блюд, а для этого" +
                " ему нужно съесть хотя бы по одной порции каждого блюда.",0);

        try{
            Task.po("Эта "," оказалось, однако, для него не под силу,");
        } catch (rfr e){
            throw new rfr(e.getMessage());
        }
        Sleep.po(" потому что уже на десятой или на одиннадцатой порции его сморил ",1);
        try{
            Ponchic.po(", и "," заснул с недоеденной космической сосиской во рту.");
        } catch (rfr e){
            throw new rfr(e.getMessage());
        }
        Ponchic.po(" В этом ничего не было, так как ночью "," спал мало, к тому же каждый, " +
                "кто находится в состоянии невесомости, может заснуть в любой позе, не укладываясь для этого специально в постель.");
        Dunno.in(" Зная, "," решил дать ему отдохнуть, а сам отправился в астрономическую кабину, чтобы вгзлянуть,",1,null,
                Ponchic.po2("что "," всю ночь прокувыркался в поисках выхода из ракеты, "));
        Moon.po(" насколько приблизился космический корабль к ",".",Moone);
        try{
            Sky.po(" В иллюминаторах по-прежнему чернело "," со звёздами,");
        } catch (rfr e){
            throw new rfr(e.getMessage());
        }
        try{
            Sun.po(" с ярко сверкающим диском ",1,suna);
        } catch (ewf e) {
            System.out.println(e.getMessage());
        }
        Moon.po(" и серебристой, светящейся "," сверху. ",Moonoi);
        try {
            Sun.po(" было такого же размера, каким оно обычно видно с Земли,", 0, Sune);
        } catch (ewf e) {
            System.out.println(e.getMessage());
        }
        try{
        Moon.po(" но "," сделалась уже вдвое больше. ");
        } catch (rfr e){
            throw new rfr(e.getMessage());
        }
        Dunno.in(" казалось, что он замечает "," которых не замечал раньше,",0,null,
                Moon.po2("на поверхности "," такие подробности,", Mooni));
        Moon.po(" но так как прежде он никогда не смотрел на "," внимательно, " +
                "то и не мог сказать с уверенностью, видит ли он эти подробности потому,",Moony);
        Moon.po(" что подлетел к "," ближе,",Moone);
        He.po(" или "," видит их потому, что теперь стал смотреть",he);
        Moon.po(" на "," внимательнее.",Moony);
    }
}