package oop2.module03.trashcan;

/**
 * @author Dieter Holz
 */
public class RecyclingBin<T> {
    private T[] allTheWaste;

    public void trash(T object){
    }

    public T getLast(){
        return null;
    }

    public T[] purge(){
        return null;
    }



    public static void main(String[] args) {
        RecyclingBin<Banana> recyclingBin = new RecyclingBin<>();
        RecyclingBin<Papier> altpapierSammlung = new RecyclingBin<>();

        Banana banana = new Banana();
        Papier papier = new Papier();

        recyclingBin.trash(banana);
        altpapierSammlung.trash(papier);

        banana = recyclingBin.getLast();
        papier = altpapierSammlung.getLast();

        altpapierSammlung.purge();

    }

    static class Banana {

    }

    static class Papier {

    }
}
