package com.feed.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Table(name = "feed")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FeedEntity {
    @Id
    @Column(name = "feed_seq", nullable = false)
    private long feedSeq;

    @Column(name = "member_id", nullable = false)
    private long memberId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "contents", nullable = false)
    private String contents;

    @Column(name = "writer", nullable = false)
    private String writer;

    @Column(name = "wish_count", nullable = false)
    private int wishCount;

    @Column(name = "updated_at", nullable = false, columnDefinition = "DATETIME")
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at", columnDefinition = "DATETIME")
    private LocalDateTime deletedAt;
}
