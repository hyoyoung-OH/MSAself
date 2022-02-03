package com.jojoldu.book.webprojectpractice.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Getter
@NoArgsConstructor //기본생성자 자동 추가 //
@Entity
public class Posts {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@Column(length = 500, nullable = false)
    private String title;

@Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

@Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }
}
