class Misogynist{
    void nice_man(){System.out.println("He is a nice man");}
}
class Wuman extends Misogynist{
    @Override
    void nice_man(){System.out.println("Run there is a misogynist among us");}
    @Deprecated
    void rights(){System.out.println("Wuman do not have rights women do");}
}

class annotation_31 {
public static void main(String[] args){
    Misogynist a = new Misogynist();
    Wuman b = new Wuman();
    b.nice_man();
    a.nice_man();
    b.rights();
}
}