package com.example.subham.repository;

import com.example.subham.model.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepo extends JpaRepository<Notice,Integer> {
    public List<Notice> findAllByNoticeTitle(String name);

}
