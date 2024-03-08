package com.example.technotestyandex.repository;

import com.example.technotestyandex.model.Photo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
	Page<Photo> findByAlbumId(Long albumId, Pageable pageable);
}