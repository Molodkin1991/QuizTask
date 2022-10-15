package com.kuhnenagel.QuizTask.model;

public class Response {
    private Integer id;
    private Integer questionId;
    private String content;
    private boolean correct;

    public Response(String content, boolean correct) {
        new Response(null, content, correct);
    }

    public Response(Integer questionId, String content, boolean correct) {
        new Response(null, questionId, content, correct);
    }

    public Response(Integer id, Integer questionId, String content, boolean correct) {
        this.id = id;
        this.questionId = questionId;
        this.content = content;
        this.correct = correct;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
}
