package dev.yeon.jpa;

import dev.yeon.jpa.entity.BoardEntity;
import dev.yeon.jpa.entity.PostEntity;
import dev.yeon.jpa.repository.BoardRepository;
import dev.yeon.jpa.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {
    public TestComponent(
            @Autowired BoardRepository boardRepository,
            @Autowired PostRepository postRepository
            ){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setName("new board");
        BoardEntity newBoardEntity = boardRepository.save(boardEntity);
        System.out.println(newBoardEntity.getName());

        PostEntity postEntity = new PostEntity();
        postEntity.setTitle("hello ORM");
        postEntity.setContent("This Entity is create by hibernate!");
        postEntity.setWriter("devyeon");
        postEntity.setBoardEntity(newBoardEntity);



        PostEntity newPostEntity = postRepository.save(postEntity);


    }
}
