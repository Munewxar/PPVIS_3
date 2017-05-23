package Table;

import javax.swing.*;
import java.awt.*;

public class MyTable {
    private final JTable table;
    private JScrollPane tableScrollPane;

    public MyTable(int[][] dataMassive){
        table = new JTable(new MyTableModel(dataMassive));
        setTableScrollPane();
    }

    private void setTableScrollPane(){
        tableScrollPane = new JScrollPane();
        tableScrollPane.setPreferredSize(new Dimension(250, 250));

        table.setPreferredSize(new Dimension(245, 245));

        tableScrollPane.add(table.getTableHeader());
        tableScrollPane.add(table);

        table.setVisible(true);
    }

    public JScrollPane getTableScrollPane(){
        return tableScrollPane;
    }
}
