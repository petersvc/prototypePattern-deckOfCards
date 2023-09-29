package implementation;

public class Tests {
    public static void sizeTest(CardGame original, CardGame clone){
        var elementoZeroDoOriginal = original.getDeck().get(0);
        original.getDeck().remove(0);

        System.out.println("---------------- Size test ----------------");
        if(original.size() != clone.size())
        {
            System.out.println("São diferentes");
            System.out.println("Size original: " + original.size() + "\nSize clone: " + clone.size());
        }
        else{
            System.out.println("São iguais");
            System.out.println("Size original: " + original.size() + "\nSize clone: " + clone.size());
        }

        original.getDeck().add(0, elementoZeroDoOriginal);
    }

    public static void hashTest(CardGame original, CardGame clone){

        System.out.println("---------------- Hash test ----------------");
        if(original.hashCode() != clone.hashCode())
        {
            System.out.println("São diferentes");
            System.out.println("hashCode original: " + original.hashCode() + "\nhashCode clone: " + clone.hashCode());
        }
        else {
            System.out.println("São iguais");
            System.out.println("hashCode original: " + original.hashCode() + "\nhashCode clone: " + clone.hashCode());
        }
    }
}
