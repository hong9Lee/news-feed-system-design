package com.feed.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
@Slf4j
public class PostController {

    /**
     * feed 발행
     */
    @PostMapping("/{memberId}")
    public void create(@PathVariable("memberId") String memberId) {
      log.info("memberId:{}", memberId);

    }
}
