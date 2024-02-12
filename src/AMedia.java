public abstract class AMedia {
    public int id;
    public String name;
    public AMedia(String name) {
        this.id = SUniqueId.getInstance().getId();
        this.name = name;
    }
}
