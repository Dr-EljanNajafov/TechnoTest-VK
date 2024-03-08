package com.example.technotestyandex.service;

import com.example.technotestyandex.model.user.User;
import com.example.technotestyandex.payload.ApiResponse;
import com.example.technotestyandex.payload.InfoRequest;
import com.example.technotestyandex.payload.UserIdentityAvailability;
import com.example.technotestyandex.payload.UserProfile;
import com.example.technotestyandex.payload.UserSummary;
import com.example.technotestyandex.security.UserPrincipal;

public interface UserService {

	UserSummary getCurrentUser(UserPrincipal currentUser);

	UserIdentityAvailability checkUsernameAvailability(String username);

	UserIdentityAvailability checkEmailAvailability(String email);

	UserProfile getUserProfile(String username);

	User addUser(User user);

	User updateUser(User newUser, String username, UserPrincipal currentUser);

	ApiResponse deleteUser(String username, UserPrincipal currentUser);

	ApiResponse giveAdmin(String username);

	ApiResponse removeAdmin(String username);

	UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}