package com.smithbee.first;

import java.util.ArrayList;

public class VocabularyList {
    private ArrayList<Vocabulary> vocabularyList = new ArrayList<>();

    public VocabularyList(ArrayList<Vocabulary> vocabularyList) {
        this.vocabularyList = vocabularyList;
    }

    public VocabularyList() {
    }

    public ArrayList<Vocabulary> getVocabularyList() {
        return vocabularyList;
    }

    public void setVocabularyList(ArrayList<Vocabulary> vocabularyList) {
        this.vocabularyList = vocabularyList;
    }
}
