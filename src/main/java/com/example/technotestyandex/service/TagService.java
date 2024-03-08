package com.example.technotestyandex.service;

import com.example.technotestyandex.model.Tag;
import com.example.technotestyandex.payload.ApiResponse;
import com.example.technotestyandex.payload.PagedResponse;
import com.example.technotestyandex.security.UserPrincipal;

public interface TagService {

	PagedResponse<Tag> getAllTags(int page, int size);

	Tag getTag(Long id);

	Tag addTag(Tag tag, UserPrincipal currentUser);

	Tag updateTag(Long id, Tag newTag, UserPrincipal currentUser);

	ApiResponse deleteTag(Long id, UserPrincipal currentUser);

}
