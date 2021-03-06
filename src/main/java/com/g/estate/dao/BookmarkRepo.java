package com.g.estate.dao;

import com.g.estate.entity.Bookmark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookmarkRepo extends JpaRepository<Bookmark, Long> {
}
