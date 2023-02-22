package originals;

public class PrinterNew {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Constructor
    public PrinterNew(int tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = ((tonerLevel > 100  || tonerLevel <0 ) ? -1 : tonerLevel);
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    // Methods
    public int addToner(int tonerAmount) {
        if ((tonerLevel + tonerAmount) > 100 || (tonerLevel + tonerAmount) < 0) {
            return -1;
        }
        return (tonerLevel + tonerAmount);
    }

    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

}
