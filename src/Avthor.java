public class Avthor {
    private String nameAvtor;
    private String surname;

    public Avthor(String nameAvtor, String surname) {
        this.nameAvtor = nameAvtor;
        this.surname = surname;
    }

    public String getNameAvtor() {
        return this.nameAvtor;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "ИМЯ АВТОРА - " + this.nameAvtor + this.surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Avthor avthor2 = (Avthor) other;
        return nameAvtor.equals(avthor2.nameAvtor) && surname.equals(avthor2.surname);
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(nameAvtor, surname);
    }

}
