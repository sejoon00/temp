package com.post.blog.domain.post.dto.request;

public record PostCreateRequest(
    String category,
    String title,
    String author,
    String content
) {
}
