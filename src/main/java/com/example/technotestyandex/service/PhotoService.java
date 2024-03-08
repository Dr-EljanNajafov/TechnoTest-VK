package com.example.technotestyandex.service;

import com.example.technotestyandex.payload.ApiResponse;
import com.example.technotestyandex.payload.PagedResponse;
import com.example.technotestyandex.payload.PhotoRequest;
import com.example.technotestyandex.payload.PhotoResponse;
import com.example.technotestyandex.security.UserPrincipal;

public interface PhotoService {

	PagedResponse<PhotoResponse> getAllPhotos(int page, int size);

	PhotoResponse getPhoto(Long id);

	PhotoResponse updatePhoto(Long id, PhotoRequest photoRequest, UserPrincipal currentUser);

	PhotoResponse addPhoto(PhotoRequest photoRequest, UserPrincipal currentUser);

	ApiResponse deletePhoto(Long id, UserPrincipal currentUser);

	PagedResponse<PhotoResponse> getAllPhotosByAlbum(Long albumId, int page, int size);

}