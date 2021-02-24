public class Position implements InterfacePosition {

    private int lineCounter;
    private int columnCounter;

    public Position(int lineCounter, int columnCounter) {
        this.lineCounter = lineCounter;
        this.columnCounter = columnCounter;
    }

    public int getLineCounter() {
        return lineCounter;
    }

    public int getColumnCounter() {
        return columnCounter;
    }

}
