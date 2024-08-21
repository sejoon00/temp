package com.post.blog.domain.post.service;

import com.post.blog.domain.post.dto.request.PostCreateRequest;
import com.post.blog.domain.post.dto.response.PostGetDetailResponse;
import com.post.blog.domain.post.dto.response.PostGetResponse;
import com.post.blog.domain.post.entity.Post;
import com.post.blog.domain.post.repository.PostRepository;
import com.post.blog.global.error.exception.ErrorCode;
import com.post.blog.global.error.exception.NotFoundException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public PostGetDetailResponse getPost(Long postId) {
        Post post = postRepository.findById(postId)
            .orElseThrow(() -> new NotFoundException(ErrorCode.POST_NOT_FOUND));

        return PostGetDetailResponse.from(post);
    }

    @Override
    @Transactional
    public Long createPost(PostCreateRequest request) {
        Post post = Post.builder()
            .author(request.author())
            .title(request.title())
            .content(request.content())
            .category(request.category())
            .build();

        return postRepository.save(post).getId();
    }

    @Override
    public List<PostGetResponse> getPostList(String author) {
        return postRepository.findAllByAuthor(author).stream()
            .map(PostGetResponse::from)
            .toList();
    }

    @Override
    public void updatePost() {

    }

    @Override
    public void deletePost() {

    }

    @Override
    public void updateLike() {

    }

    @Override
    public void getPostCount() {

    }
}
