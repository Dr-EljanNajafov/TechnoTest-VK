package com.example.technotestyandex.service;

import com.example.technotestyandex.model.Comment;
import com.example.technotestyandex.payload.ApiResponse;
import com.example.technotestyandex.payload.CommentRequest;
import com.example.technotestyandex.payload.PagedResponse;
import com.example.technotestyandex.security.UserPrincipal;

public interface CommentService {

	PagedResponse<Comment> getAllComments(Long postId, int page, int size);

	Comment addComment(CommentRequest commentRequest, Long postId, UserPrincipal currentUser);

	Comment getComment(Long postId, Long id);

	Comment updateComment(Long postId, Long id, CommentRequest commentRequest, UserPrincipal currentUser);

	ApiResponse deleteComment(Long postId, Long id, UserPrincipal currentUser);

}
