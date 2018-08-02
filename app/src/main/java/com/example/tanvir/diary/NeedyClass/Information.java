package com.example.tanvir.diary.NeedyClass;

public class Information {
    private String id;
    private String subject;
    private String description;
    private String dateTime;
   // private int IconImage;
    public Information(String id, String subject, String description, String dateTime) {
        this.id = id;
        this.subject = subject;
        this.description = description;
        this.dateTime = dateTime;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }
}
