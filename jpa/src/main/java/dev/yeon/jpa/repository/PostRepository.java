package dev.yeon.jpa.repository;

import dev.yeon.jpa.entity.BoardEntity;
import dev.yeon.jpa.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
}
