package com.example.springbootboardpractice.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article; //게시글 (id)
    private String title; // 제목
    private String content; // 본문

    private LocalDateTime createAt; //생성일
    private String createBy; //생성자
    private LocalDateTime modifiedAt; //수정일
    private String modifiedBy; //수정자
}
