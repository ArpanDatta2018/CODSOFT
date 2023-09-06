package com.wordcount;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class WordCount {
    @FXML
    private TextArea text;

    @FXML
    private TextField u_words;

    @FXML
    private TextField words;

    @FXML
    void OnClickCheck(ActionEvent event) {
        String str=text.getText();
        int count=1;
        int dup = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        String check[]=str.split(" ");
        for (int i = 0; i < check.length; i++) {
            for (int j = i+1; j < check.length; j++) {
                if (check[i].equals(check[j])){
                    dup++;
                }
            }
        }
        if (dup>0){
            String duplicate= String.valueOf(dup);
            u_words.setText(duplicate);
        }
        String temp= String.valueOf(count);
        words.setText(temp);
    }
}
