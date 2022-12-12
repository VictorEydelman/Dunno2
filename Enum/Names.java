package Enum;

public enum Names {
    suna("солнца"),
    Moone("Луне"),
    Moonoi("Луной"),
    Sune("Солнце"),
    Moony("Луну"),
    Mooni("Луны"),
    he("он"),
    Dunne("Незнайке"),
    Ponchicy("Пончику");

    Names(String value){
        this.value=value;
    }
    private final String value;


    public String getValue(){
        return value;
    }
}
