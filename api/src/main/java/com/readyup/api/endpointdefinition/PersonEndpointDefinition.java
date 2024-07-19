package com.readyup.api.endpointdefinition;

import com.readyup.api.request.CreatePersonRequest;
import com.readyup.api.request.FriendRequest;
import com.readyup.api.response.CreatePersonResponse;
import com.readyup.domain.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(value = "/api/person",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public interface PersonEndpointDefinition {

    @ApiOperation(value = "Get all people in the DB")
    ResponseEntity<List<Person>> getAll();

    @ApiOperation(value = "Create a person if they do not already exist")
    ResponseEntity<CreatePersonResponse> createPerson(@RequestBody CreatePersonRequest request);


    @ApiOperation(value = "Create a person if they do not already exist")
    ResponseEntity friendRequest(@RequestBody FriendRequest request);

}
