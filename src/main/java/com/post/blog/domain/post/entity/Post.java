package com.post.blog.domain.post.entity;

import com.post.blog.global.common.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Post extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String title;

    private String content;

    private String author;

    private String category;

    private Boolean isLike;

    @Builder
    public Post(String title, String content, String author, String category, Boolean isLike) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.category = category;
        this.isLike = isLike;
    }
}
