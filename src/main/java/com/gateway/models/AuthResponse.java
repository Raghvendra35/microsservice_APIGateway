package com.gateway.models;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse
{
    private String userId;
    private String accessToken;
    private String refreshToken;
    private long login_expireAt;
    private Collection<String> authorities;
}
