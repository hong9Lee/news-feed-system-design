package com.feed.request;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostFeedRequest {

    private long memberId;
    private String title;
    private String contents;
    private String writer;

}
