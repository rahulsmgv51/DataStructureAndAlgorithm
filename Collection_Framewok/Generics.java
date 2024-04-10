package Collection_Framewok;

public class Generics {
    public static void main(String[] args) {
        Cow<String> c1 = new Cow("Jursey");
        Cow<String> c2 = new Cow("Sahivaal");
        Cow<Integer> c3 = new Cow(12);
        System.out.println(c3.getId());
    }
}

/**
 * InnerGenerics
 */
class Cow<E> {
    E id;

    public Cow(E id) {
        this.id = id;
    }

    E getId() {
        return id;
    }
}
