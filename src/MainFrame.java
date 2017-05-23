import Table.MyTable;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private final JFrame mainFrame = new JFrame("PPVIS #3");
    private final int[][] massiveSortedMassives = new int[10][2];

    private void generateTableInfo() {
        for (int massivesCounter = 0; massivesCounter < 10; massivesCounter++) {
            massiveSortedMassives[massivesCounter][0] = new MergeSort().getResultMassive().length;
        }
    }

    private JFrame buildMainFrame() {
        mainFrame.setPreferredSize(new Dimension(500, 500));
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new GridLayout());

        generateTableInfo();
        MyTable myTable = new MyTable(massiveSortedMassives);

        mainFrame.add(myTable.getTableScrollPane());

        return mainFrame;
    }

    public static void main(String[] args) {
        Frame objectMainFrame = new MainFrame().buildMainFrame();
        objectMainFrame.setVisible(true);
        objectMainFrame.setResizable(false);
    }
}
