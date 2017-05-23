package Table;


import javax.swing.table.AbstractTableModel;

public class MyTableModel extends AbstractTableModel{

     private int rowCount = 0;
     private final int ELEMENTS_AMOUNT = 0;
     private final int TIME = 1;
     private final int[][] dataMassive;

     public MyTableModel(int[][] dataMassive){
         this.dataMassive = dataMassive;
         rowCount = dataMassive.length;
     }

     public int getRowCount(){
         return rowCount;
     }

     public int getColumnCount(){
         return 2;
     }

     public String getColumnName(int column){
         switch (column){
             case ELEMENTS_AMOUNT:
                 return "N";
             case TIME:
                 return "T";
             default:
                 return "";
         }
     }

     public Object getValueAt(int row, int column){

         int[] currentRow = dataMassive[row];

         switch(column){
             case ELEMENTS_AMOUNT:
                 return currentRow[ELEMENTS_AMOUNT];
             case TIME:
                 return currentRow[TIME];
             default:
                 return "";
         }
     }
}
