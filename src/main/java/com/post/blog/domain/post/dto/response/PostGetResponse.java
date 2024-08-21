package com.post.blog.domain.post.dto.response;

import com.post.blog.domain.post.entity.Post;
import lombok.Builder;

@Builder
public record PostGetResponse(
    String category,
    String title,
    String content
) {

    public static PostGetResponse from(Post post) {
        return PostGetResponse.builder()
            .content(post.getContent())
            .title(post.getTitle())
            .category(post.getCategory())
            .build();
    }

}
