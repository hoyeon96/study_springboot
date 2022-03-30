package dev.yeon.crud.post;

import java.util.List;

public interface PostRepository {

    boolean save(PostDto dto);
    List<PostDto> findAll();
    PostDto findById(int id);
    boolean update(int id, PostDto dto);
    boolean delete(int id);

}
