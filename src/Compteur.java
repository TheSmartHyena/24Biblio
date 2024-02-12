public class Compteur {
    public int compter = 0;
    public int bookIds = 0;

    public int getId () {
        this.compter = this.compter + 1;
        return this.compter;
    }

    public int getIdBook() {
        this.bookIds = this.bookIds+1;
        return this.bookIds;
    }

}
