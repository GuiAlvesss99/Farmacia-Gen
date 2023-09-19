package com.generation.farmacia.security;



import java.util.List;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.farmacia.model.Usuario;
import com.generation.farmacia.model.UsuarioLogin;

import java.util.Collection;

public class UserDetailsImpl implements UserDetails {

    private static final long serialVersionUID = 1L;

    private String userName;
    private String password;
    private List<GrantedAuthority> authorities;

    public UserDetailsImpl(UsuarioLogin user) {
        this.userName = user.getUsuario();
        this.password = user.getSenha();
    }

    

   

	public UserDetailsImpl(Usuario usuario) {
		// TODO Auto-generated constructor stub
	}



	@Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return authorities;
    }

    @Override
    public String getPassword() {

        return password;
    }

    @Override
    public String getUsername() {

        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}