import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {

    private final JFrame mainFrame = new JFrame("PPVIS #3");
    private final int[][] massiveSortedMassives = new int[10][2];
    private JButton paintGraphicsButton = new JButton("Paint");
    private JPanel drawPanel = new JPanel();
    private GraphicsPainter graphicsPainter = new GraphicsPainter();

    public int[][] getMassiveSortedMassives() {
        return massiveSortedMassives;
    }

    public JPanel getDrawPanel(){
        return drawPanel;
    }

    private void generateTableInfo() {
        for (int massivesCounter = 0; massivesCounter < 10; massivesCounter++) {
            MergeSort mergeSort = new MergeSort();
            massiveSortedMassives[massivesCounter][0] = mergeSort.getResultMassive().length;
            massiveSortedMassives[massivesCounter][1] = (int) mergeSort.getSortTime();
        }
    }

    private JFrame buildMainFrame() {

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(new GridLayout());

        generateTableInfo();

        MyTableModel myTableModel = new MyTableModel(massiveSortedMassives);
        JTable table = new JTable(myTableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);
        JPanel tablePanel = new JPanel();
        tablePanel.add(tableScrollPane);

        mainFrame.add(tablePanel);

        paintGraphicsButton.addActionListener(new paintGraphicsButtonActionListener());

        mainFrame.pack();

        return mainFrame;
    }

    public class paintGraphicsButtonActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static void main(String[] args) {
        JFrame objectMainFrame = new MainFrame().buildMainFrame();
        objectMainFrame.setVisible(true);
    }
}
