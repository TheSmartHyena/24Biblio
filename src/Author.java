public class Author {
    public  Author (int id, String name) {
        this.id = SUniqueId.getInstance().getId();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", name: " + this.name;
    }
    public int id;
    public String name;
}
