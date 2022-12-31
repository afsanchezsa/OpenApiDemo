package com.example.openApi.demoOpenApi.api;

import com.example.openApi.demoOpenApi.model.Artist;
import com.example.openApi.demoOpenApi.model.InlineResponse200;
import com.example.openApi.demoOpenApi.model.InlineResponse400;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ArtistsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-30T21:31:13.265268800-05:00[America/Bogota]")
public interface ArtistsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /artists
     * Returns a list of artists
     *
     * @param limit Limits the number of items on a page (optional)
     * @param offset Specifies the page number of the artists to be displayed (optional)
     * @return Successfully returned a list of artists (status code 200)
     *         or Invalid request (status code 400)
     * @see ArtistsApi#artistsGet
     */
    default ResponseEntity<List<Artist>> artistsGet(Integer limit,
        Integer offset) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"artist_name\" : \"artist_name\", \"albums_recorded\" : 0, \"artist_genre\" : \"artist_genre\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /artists
     * Lets a user post a new artist
     *
     * @param artist  (required)
     * @return Successfully created a new artist (status code 200)
     *         or Invalid request (status code 400)
     * @see ArtistsApi#artistsPost
     */
    default ResponseEntity<Void> artistsPost(Artist artist) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /artists/{username}
     * Obtain information about an artist from his or her unique username
     *
     * @param username  (required)
     * @return Successfully returned an artist (status code 200)
     *         or Invalid request (status code 400)
     * @see ArtistsApi#artistsUsernameGet
     */
    default ResponseEntity<InlineResponse200> artistsUsernameGet(String username) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"artist_name\" : \"artist_name\", \"albums_recorded\" : 0, \"artist_genre\" : \"artist_genre\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
