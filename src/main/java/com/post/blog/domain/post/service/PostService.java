package com.post.blog.domain.post.service;

import com.post.blog.domain.post.dto.request.PostCreateRequest;
import com.post.blog.domain.post.dto.response.PostGetDetailResponse;
import com.post.blog.domain.post.dto.response.PostGetResponse;
import java.util.List;

public interface PostService {

    PostGetDetailResponse getPost(Long id);

    Long createPost(PostCreateRequest request);

    void updatePost();

    void deletePost();

    List<PostGetResponse> getPostList(String author);

    void updateLike();

    void getPostCount();
}
