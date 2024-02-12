public class Book extends  AMedia implements IMedia {

    public Book(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("Je suis en train de lire");
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", name: " + this.name;
    }

}
