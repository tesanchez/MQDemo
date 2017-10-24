package io.swagger.api;

import io.swagger.model.InlineResponse200;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-24T15:21:55.022Z")

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "", notes = "Allows users to get employees from the database", response = InlineResponse200.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InlineResponse200.class) })
    @RequestMapping(value = "/users",
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> usersGet();

}
