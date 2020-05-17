package com.smithbee.first;

//定义一个Vocabulary类

public class Vocabulary {
    private String words ;
    private String wordsExplain ;

    public Vocabulary() {
    }

    public Vocabulary(String words,String wordsExplain){
        this.words = words;
        this.wordsExplain = wordsExplain;
    }



    public void setWords(String words) {
        this.words = words;
    }

    public void setWordsExplain(String wordsExplain) {
        this.wordsExplain = wordsExplain;
    }

    public String getWords() {
        return words;
    }

    public String getWordsExplain() {
        return wordsExplain;
    }
}
