package com.quoc.store.vuahanghieu.repositories;

import com.quoc.store.vuahanghieu.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, String> {
}
