import java.util.Objects;

public class Author {
    private String name;
    private String firstName;

    public Author(String name, String firstName){
        this.name = name;
        this.firstName = firstName;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getAuthor(){
        return name + firstName;
    }
    @Override
    public String toString (){
        return name + " " + firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(firstName, author.firstName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, firstName);
    }
}
