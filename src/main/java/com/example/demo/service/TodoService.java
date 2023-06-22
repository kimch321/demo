package com.example.demo.service;

import com.example.demo.model.TodoEntity;
import com.example.demo.persistence.TodoRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepositoty repositoty;

    public String testService() {
        // TodoEntity 생성
        TodoEntity entity = TodoEntity.builder().title("my first todo item").build();
        // TodoEntity 저장
        repositoty.save(entity);
        // TodoEntity 검색
        TodoEntity savedEntity = repositoty.findById(entity.getId()).get();
        return savedEntity.getTitle();
    }
}
