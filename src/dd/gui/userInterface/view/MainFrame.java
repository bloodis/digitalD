package dd.gui.userInterface.view;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private JPanel mainPanel;

    private JTextField searchBar;
    private JList resultArea;
    private JTextPane detailsArea;
    private JButton searchBtn;
    private JTabbedPane panelSelector;
    private JPanel searchPanel;
    private JPanel homePanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTable table3;
    private JList list1;
    private JTable table4;
    private JTable table5;
    private JTable table6;
    private JTable table7;
    private JTextArea textArea1;
    private JEditorPane editorPane1;
    private DefaultListModel<String> list = new DefaultListModel<>();
    private StyleContext context = new StyleContext();
    private StyledDocument document = new DefaultStyledDocument(context);
    private Style style = context.getStyle(StyleContext.DEFAULT_STYLE);

    public MainFrame(){
        setSize(500,500);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);
        resultArea.setModel(list);
    }

    public JTextField getSearchBar() {
        return searchBar;
    }

    public JList getResultArea() {
        return resultArea;
    }

    public JTextPane getDetailsArea() {
        return detailsArea;
    }

    public JButton getSearchBtn() {
        return searchBtn;
    }

    public DefaultListModel<String> getList() {
        return list;
    }

    public StyleContext getContext() {
        return context;
    }

    public StyledDocument getDocument() {
        return document;
    }

    public Style getStyle() {
        return style;
    }
}
