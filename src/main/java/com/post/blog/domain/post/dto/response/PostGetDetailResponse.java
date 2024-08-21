package com.post.blog.domain.post.dto.response;

import com.post.blog.domain.post.entity.Post;
import lombok.Builder;

@Builder
public record PostGetDetailResponse(
    String category,
    String title,
    String author,
    String content,
    boolean isLike,
    String createAt
) {

    public static PostGetDetailResponse from(Post post) {
        return PostGetDetailResponse.builder()
            .category(post.getCategory())
            .createAt(post.getCreatedAt().toString())
            .content(post.getContent())
            .author(post.getAuthor())
            .title(post.getTitle())
            .isLike(post.getIsLike())
            .build();
    }
}
