package com.example.openApi.demoOpenApi.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-30T21:31:13.265268800-05:00[America/Bogota]")
@Controller
@RequestMapping("${openapi.simple.base-path:}")
public class ArtistsApiController implements ArtistsApi {

    private final ArtistsApiDelegate delegate;

    public ArtistsApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ArtistsApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ArtistsApiDelegate() {});
    }

    @Override
    public ArtistsApiDelegate getDelegate() {
        return delegate;
    }

}
