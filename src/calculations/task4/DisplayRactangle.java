package calculations.task4;

public class DisplayRactangle {

    private int row;
    private int column;

    public DisplayRactangle(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void display() {
        for (int i = 0; i < row; i ++) {
            for (int j = 0; j < column; j++) {
                System.out.print('A');
            }
            System.out.println();
        }
    }
}
