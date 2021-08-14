package com.example.subham.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Arrays;

@Entity
@Table(name = "notice")
public class Notice {

    @Id
    @GeneratedValue
    private int id;

    @NotNull

    private String noticeTitle;
    @Lob
    private String content;



    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Notice(int id, @NotNull String noticeTitle, String content) {
        this.id = id;
        this.noticeTitle = noticeTitle;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Notice() {

    }


    public void setNoticeTitle() {
    }

    public void setContent() {
    }

    public void setId() {
    }
}
