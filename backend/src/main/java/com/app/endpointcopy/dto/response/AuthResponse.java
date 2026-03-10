package com.app.endpointcopy.dto.response;

import lombok.Data;
import lombok.AllArgsConstructor;
import com.app.endpointcopy.entity.User;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private User user;
}
