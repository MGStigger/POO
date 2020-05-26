public class App {

    public static void main(String[] args) throws Exception {

        Animal animal01, animal02, animal03;
        animal01 = new Cachorro(6, 12, 4, false);
        animal02 = new Gato(6, 12, 4, false);
        animal03 = new Pato(2, 8, 2, true);
        animal01.som();
        animal02.som();
        animal03.som();

    }
    
}