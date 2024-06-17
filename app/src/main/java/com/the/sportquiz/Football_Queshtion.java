package com.the.sportquiz;

public class Football_Queshtion {

    private int question;
    private boolean answerOne ;
    private boolean answerTwo ;
    private boolean answerThree ;


    public Football_Queshtion(boolean answerOne, boolean answerTwo,
                              boolean answerThree,  int question)
    {
        this.question = question;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;

    }

    public int getQuestion() {
        return question;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public boolean getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(boolean answerOne) {
        this.answerOne = answerOne;
    }

    public boolean getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(boolean answerTwo) {
        this.answerTwo = answerTwo;
    }

    public boolean getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(boolean answerThree) {
        this.answerThree = answerThree;
    }





}

