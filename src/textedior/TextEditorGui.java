
package textedior;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;


public class TextEditorGui extends javax.swing.JFrame {

  String filename;
  Clipboard clipboard=getToolkit().getSystemClipboard();
    public TextEditorGui() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newFile = new javax.swing.JMenuItem();
        OpenFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        exitFile = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cutFile = new javax.swing.JMenuItem();
        copyFile = new javax.swing.JMenuItem();
        PasteFile = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchButton.setBackground(new java.awt.Color(0, 51, 51));
        searchButton.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        searchButton.setForeground(new java.awt.Color(240, 240, 240));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        newFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newFile.setText("New");
        newFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFileActionPerformed(evt);
            }
        });
        jMenu1.add(newFile);

        OpenFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenFile.setText("Open");
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });
        jMenu1.add(OpenFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setText("Save");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        exitFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitFile.setText("Exit");
        exitFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitFileActionPerformed(evt);
            }
        });
        jMenu1.add(exitFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        cutFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cutFile.setText("Cut");
        cutFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutFileActionPerformed(evt);
            }
        });
        jMenu2.add(cutFile);

        copyFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copyFile.setText("Copy");
        copyFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyFileActionPerformed(evt);
            }
        });
        jMenu2.add(copyFile);

        PasteFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        PasteFile.setText("Paste");
        PasteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteFileActionPerformed(evt);
            }
        });
        jMenu2.add(PasteFile);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFileActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newFileActionPerformed

    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
        
        FileDialog fileDialog=new FileDialog(TextEditorGui.this,"Open File",FileDialog.LOAD);
        fileDialog.setVisible(true);
        if(fileDialog.getFile()!=null){
            filename=fileDialog.getDirectory() + fileDialog.getFile();
           setTitle(filename);
        }
        try{
            BufferedReader reader=new BufferedReader(new FileReader(filename));
            StringBuilder sb=new StringBuilder();
            String line=null;
            
            while((line = reader.readLine())!= null){
               sb.append(line + "\n");
               textArea.setText(sb.toString());
            }
            reader.close();
        }catch(IOException e){
            System.out.println("File not found");
        }
    }//GEN-LAST:event_OpenFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed
        
        FileDialog fileDialog=new FileDialog(TextEditorGui.this,"Save File",FileDialog.SAVE);
        fileDialog.setVisible(true);
        if(fileDialog.getFile()!=null){
            filename=fileDialog.getDirectory() + fileDialog.getFile();
            setTitle(filename);
        }
        try{
            FileWriter fileWriter=new FileWriter(filename);
            fileWriter.write(textArea.getText());
            setTitle(filename);
            fileWriter.close();
        }catch(IOException e){
            System.out.println("File not save");
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void exitFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitFileActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitFileActionPerformed

    private void cutFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutFileActionPerformed
        String cutString=textArea.getSelectedText();
        StringSelection cutselection=new StringSelection(cutString);
        clipboard.setContents(cutselection, cutselection);
        textArea.replaceRange("", textArea.getSelectionStart(),textArea.getSelectionEnd( ));
    }//GEN-LAST:event_cutFileActionPerformed

    private void PasteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteFileActionPerformed
      try{
          Transferable pasteText=clipboard.getContents(TextEditorGui.this);
        String sel=(String) pasteText.getTransferData(DataFlavor.stringFlavor);
        textArea.replaceRange(sel, textArea.getSelectionStart(),textArea.getSelectionEnd());
      }catch(Exception e){
          
      }
    }//GEN-LAST:event_PasteFileActionPerformed

    private void copyFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyFileActionPerformed
        String copyText=textArea.getSelectedText();
        StringSelection copySelection = new StringSelection(copyText);
        clipboard.setContents(copySelection, copySelection);
    }//GEN-LAST:event_copyFileActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
    searchTextArea(textArea,searchField.getText());
    }//GEN-LAST:event_searchButtonActionPerformed

    class myHighLighter extends DefaultHighlighter.DefaultHighlightPainter{
    
        public myHighLighter(Color color) {
            super(color);
        }
}
    DefaultHighlighter.DefaultHighlightPainter myhighlight=new myHighLighter(Color.YELLOW);
    
    public void removeHightLighter(JTextComponent textcomp){
        Highlighter removeHighlight = textcomp.getHighlighter();
        Highlighter.Highlight[]remove = removeHighlight.getHighlights();
        for(int i=0;i<remove.length;i++){
            if(remove[i].getPainter() instanceof myHighLighter){
            removeHighlight.removeHighlight(remove[i]);
        }
        }
    }
    
    
    public void searchTextArea(JTextComponent textcom,String textString){
        removeHightLighter(textcom);
        try{
           Highlighter hilight = textcom.getHighlighter();
           Document doc = textcom.getDocument();
           String text=doc.getText(0,doc.getLength());
           
           int pos=0;
           while((pos=text.toUpperCase().indexOf(textString.toUpperCase(),pos))>=0){
             hilight.addHighlight(pos,pos+textString.length(),myhighlight); 
             pos+=textString.length();
           }
        }catch(Exception e){
            
        }
    }
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextEditorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem OpenFile;
    private javax.swing.JMenuItem PasteFile;
    private javax.swing.JMenuItem copyFile;
    private javax.swing.JMenuItem cutFile;
    private javax.swing.JMenuItem exitFile;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newFile;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
