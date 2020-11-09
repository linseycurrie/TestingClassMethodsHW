public class Printer {

    private int pages;
    private int toner;

    public Printer(int pages, int toner){
        this.pages = pages;
        this.toner = toner;
    }

    public int getPages() {
        return pages;
    }

    public int getToner() {
        return toner;
    }

    public void printPages(int pages, int copies) {
        if(this.pages - (pages * copies) > 0 ){
            this.pages = this.pages - (pages * copies);
            this.toner = this.toner - (pages * copies);
        }
    }
}
