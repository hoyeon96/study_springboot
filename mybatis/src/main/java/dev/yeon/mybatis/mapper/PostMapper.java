package dev.yeon.mybatis.mapper;

import dev.yeon.mybatis.dto.PostDto;

import java.util.List;

public interface PostMapper {

    int createPost(PostDto postDto);

    int createPostAll(List<PostDto> postDto);

    PostDto readPost(int id);

    List<PostDto> readPostAll();

    PostDto readPostQuery(PostDto postDto);

    int updatePost(PostDto postDto);

    int deletePost(int id);
}
