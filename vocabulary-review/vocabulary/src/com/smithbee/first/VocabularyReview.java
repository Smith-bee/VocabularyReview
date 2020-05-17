package com.smithbee.first;

import java.util.ArrayList;
import java.util.Scanner;
/*
实现功能：
1.可以存储每天新输入的单词和词意
2.有一个计数器，统计记忆单词的list数，便于针对复习
3.对于每个具体的单词出现的可能性利用随机数生成
4.对于每个单词，如果出现，知道词意就可以进行下一个，否则展示词意
 */

public class VocabularyReview {
    public static void main(String[] args) {
        ArrayList<VocabularyList> vocabulary = new ArrayList<>();//创建一个VocabularyList对象数组 vocabulary用于存储单词
        int listNumber ;//list计数器
        Vocabulary voca = new Vocabulary();//创建一个vocabulary对象，
        Scanner sc = new Scanner(System.in);//从键盘输入
        VocabularyList vocaList = new VocabularyList();//创建VocabularyList对象

        String words = sc.next();
        String wordsExplain = sc.next();


        voca.setWords(words);
        voca.setWordsExplain(wordsExplain);

        vocaList.getVocabularyList().add(voca);



        vocabulary.add(vocaList);

        System.out.println(vocabulary.get(0).getVocabularyList().get(0).getWords());


    }
}
