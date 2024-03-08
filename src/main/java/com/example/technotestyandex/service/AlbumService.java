package com.example.technotestyandex.service;

import com.example.technotestyandex.model.Album;
import com.example.technotestyandex.payload.AlbumResponse;
import com.example.technotestyandex.payload.ApiResponse;
import com.example.technotestyandex.payload.PagedResponse;
import com.example.technotestyandex.payload.request.AlbumRequest;
import com.example.technotestyandex.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface AlbumService {

	PagedResponse<AlbumResponse> getAllAlbums(int page, int size);

	ResponseEntity<Album> addAlbum(AlbumRequest albumRequest, UserPrincipal currentUser);

	ResponseEntity<Album> getAlbum(Long id);

	ResponseEntity<AlbumResponse> updateAlbum(Long id, AlbumRequest newAlbum, UserPrincipal currentUser);

	ResponseEntity<ApiResponse> deleteAlbum(Long id, UserPrincipal currentUser);

	PagedResponse<Album> getUserAlbums(String username, int page, int size);

}
