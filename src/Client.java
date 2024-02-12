public class Client {
    public  Client (String name) {
        this.id = SUniqueId.getInstance().getId();
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Id: ");
        str.append(this.id);
        str.append( ", name: ");
        str.append(this.name);

        return str.toString();
    }
    public int id;
    public String name;
}
