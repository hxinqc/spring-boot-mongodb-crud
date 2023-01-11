package com.sg.springbootmongodb.model;

import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.Objects;

@Document("log")
public class Log {
    @Transient
    public static final String SEQUENCE_NAME = "log_sequence";
    @MongoId
    private Long id;
    @Field
    private LocalDateTime recordTime;
    @Field("title")
    private String title;
    @Field
    private String memo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(id, log.id) && Objects.equals(title, log.title) && Objects.equals(memo, log.memo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, memo);
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
