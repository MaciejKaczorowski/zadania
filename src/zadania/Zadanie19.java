package zadania;

public class Zadanie19 {

    public static void main(String[] args) {
        Author author1 = new Author("Williams", "American");
        Author author2 = new Author("Shakespeare", "British");
        Author author3 = new Author("Pushkin", "Russian");

        Poem poem1 = new Poem (author1, 10);
        Poem poem2 = new Poem (author2, 12);
        Poem poem3 = new Poem (author3, 8);

        Poem [] poems = {poem1, poem2, poem3};
        int max = 0;
        String name = "";

        for (Poem poem : poems) {
            if (poem.getStropheNumbers() > max) {
                max = poem.getStropheNumbers();
                name = poem.getCreator().getName();

            }


        }
        System.out.println(name);




    }


}


