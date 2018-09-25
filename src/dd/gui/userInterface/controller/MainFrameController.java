package dd.gui.userInterface.controller;

import dd.db.crud.Crud;
import dd.gui.userInterface.view.MainFrame;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainFrameController {

    private MainFrame mainFrame;
    private JTextField searchBar;
    private JList resultArea;
    private JTextPane detailsArea;
    private JButton searchBtn;
    private DefaultListModel list;
    private StyleContext context;
    private StyledDocument document;
    private Style style;

    public MainFrameController() {
        initComponents();
        initListeners();

        StyleConstants.setAlignment(style, StyleConstants.ALIGN_JUSTIFIED);
    }

    private void initComponents(){
        mainFrame = new MainFrame();

        searchBar = mainFrame.getSearchBar();
        resultArea = mainFrame.getResultArea();
        detailsArea = mainFrame.getDetailsArea();
        searchBtn = mainFrame.getSearchBtn();
        list = mainFrame.getList();
        context = mainFrame.getContext();
        document = mainFrame.getDocument();
        style = mainFrame.getStyle();
    }

    private void initListeners() {

        searchBtn.addActionListener(new searchBtnListener());
        resultArea.addListSelectionListener(new resultAreaListener());
    }

    private class resultAreaListener implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {


            Crud crud = new Crud();
            LinkedHashMap<String,String[]> results = crud.searchSpellByWord(searchBar.getText());

            detailsArea.setText("");

            if (resultArea.getSelectedValue() != null) {

                String selected = (String) resultArea.getSelectedValue();
                String[] value = results.get(selected);

                String level = value[0];
                String school = value[1];
                String description = value[2];

                if (!resultArea.getValueIsAdjusting()) {
//                    detailsArea.append(level + "\n");
//                    detailsArea.append(school + "\n");
//                    detailsArea.append(description + "\n");
                    try {
                        document.insertString(document.getLength(),level+"\n"+school+"\n"+description, style);
                    } catch (BadLocationException e1) {
                        e1.printStackTrace();
                    }
                    detailsArea.setStyledDocument(document);
//                    detailsArea.setText(level+"\n"+school+"\n"+description);
                }
            }
        }
    }

    private class searchBtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            list.removeAllElements();

            String search = searchBar.getText();
            Crud crud = new Crud();

            LinkedHashMap<String,String[]> results = new LinkedHashMap<>();
            results = crud.searchSpellByWord(search);

            for (Map.Entry<String, String[]> entry : results.entrySet()){

                list.addElement((String)entry.getKey());
            }

        }
    }

    public void showMainFrame(){

        mainFrame.setVisible(true);
    }

}
