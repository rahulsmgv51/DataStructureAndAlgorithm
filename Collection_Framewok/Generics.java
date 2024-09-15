package Collection_Framewok;

public class Generics implements Animal{
    public static void main(String[] args) {
        Cow<String> c1 = new Cow("Jursey");
        Cow<String> c2 = new Cow("Sahivaal");
        Cow<Integer> c3 = new Cow(12);
        System.out.println(c2.getId());
        System.out.println(c3.getId());
        
        Generics obj = new Generics();
        obj.eat("cow");
       
    }

    @Override
    public void eat(Object name) {
        System.out.println(name + " eat green grass");
    }
}

class Cow<G> {
    // G or any word/char
    G id;

    public Cow(G id) {
        this.id = id;
    }

    G getId() {
        return id;
    }
}


interface Animal<T>  {
    void eat(T name);
}
