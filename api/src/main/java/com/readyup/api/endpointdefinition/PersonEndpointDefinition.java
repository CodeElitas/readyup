package com.readyup.api.endpointdefinition;

import com.readyup.api.request.CreatePersonRequest;
import com.readyup.api.request.FriendRequest;
import com.readyup.api.request.RespondFriendRequest;
import com.readyup.api.request.SearchUsernameRequest;
import com.readyup.api.response.CreatePersonResponse;
import com.readyup.api.response.GetFriendsResponse;
import com.readyup.domain.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@Api(value = "/api/person",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public interface PersonEndpointDefinition {

    //DEVTOOL
    @ApiOperation(value = "Get all people in the DB")
    ResponseEntity<List<Person>> getAll();

    //NO AUTH
    @ApiOperation(value = "Create a person if they do not already exist")
    ResponseEntity<CreatePersonResponse> createPerson(@RequestBody CreatePersonRequest request);

    //AUTH on fromUsername user
    @ApiOperation(value = "Send a friend request to an account's username")
    ResponseEntity friendRequest(@RequestHeader(name = "Authorization") String bearerToken, @RequestBody FriendRequest request);

    @ApiOperation(value = "Accept or reject a usernames friend request")
    ResponseEntity<Boolean> respondFriendRequest(@RequestHeader(name = "Authorization") String bearerToken, @RequestBody RespondFriendRequest request);


        @ApiOperation(value = "Get all friends in friends list")
    ResponseEntity<GetFriendsResponse> getFriends(@RequestHeader(name = "Authorization") String bearerToken);

    @ApiOperation(value = "Search for a username")
    ResponseEntity<List<Person>> searchUsername(@RequestBody SearchUsernameRequest request);

}
