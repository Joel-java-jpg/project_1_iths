package se.iths.joel.project_1;

public class Project1 {
    public static void main(String[] args) {

        String[] ord = {"Hello", "World", "!"};

        skrivUtArray(ord);
    }

    public static void skrivUtArray(String[] ord) {
        for (String element : ord) {
            System.out.print(element + " ");
        }
    }
}