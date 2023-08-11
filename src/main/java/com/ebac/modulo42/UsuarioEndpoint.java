package com.ebac.modulo42;

import com.ebac.modulo42.usuario.UsuarioRequest;
import com.ebac.modulo42.usuario.UsuarioResponse;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
@Component
public class UsuarioEndpoint {

    private static final String NAMESPACE_URI = "http://modulo42.ebac.com/usuario";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UsuarioRequest")
    @ResponsePayload
    public UsuarioResponse saludo(@RequestPayload UsuarioRequest request) {
        UsuarioResponse response = new UsuarioResponse();
        response.setSaludo("Hola, " + request.getNombre() + "!");
        return response;
    }
}
