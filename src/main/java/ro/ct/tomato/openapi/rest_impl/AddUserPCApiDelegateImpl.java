package ro.ct.tomato.openapi.rest_impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ro.ct.tomato.openapi.rest_spec_admin.AddUserPCApiDelegate;
import ro.ct.tomato.openapi.rest_spec_admin.model.UserDTORequest;
import ro.ct.tomato.openapi.rest_spec_admin.model.UserDTOResponse;

@Component
public class AddUserPCApiDelegateImpl implements AddUserPCApiDelegate {
    @Override
    public ResponseEntity<UserDTOResponse> addUserPC(UserDTORequest userDTORequest) {
        UserDTOResponse userDTOResponse = new UserDTOResponse();
        //put user in LDAP etc
        userDTOResponse.setSucces(true);
        userDTOResponse.setMessage("User created: "+userDTORequest.getUsername());
        return new ResponseEntity<>(userDTOResponse, HttpStatus.OK);
    }
}
