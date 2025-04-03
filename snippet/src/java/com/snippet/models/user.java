package com.snippet.models;

public class user {
    private String title;
    private String language;
    private String des;
    private String code;
    private String tage;

  
    public user() {}

    
    public user(String title, String language, String des, String code, String tage) {
        this.title = title;
        this.language = language;
        this.des = des;
        this.code = code;
        this.tage = tage;
    }

       public String getTitle() {
        return title;
    }

    public String getLanguage() {
        return language;
    }

    public String getDes() {
        return des;
    }

    public String getCode() {
        return code;
    }

    public String getTags() {
        return tage;
    }

        public void setTitle(String title) {
        this.title = title;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTags(String tags) {
        this.tage = tage;
    }
}
