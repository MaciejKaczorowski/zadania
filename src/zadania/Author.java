package zadania;

public class Author {

    // moja wersja pliku

    private String surname;
    private String nationality;

    Author(String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    }
    public String getName (){
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
