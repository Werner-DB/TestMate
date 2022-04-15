package com.afd.mate.api;

import com.afd.mate.domain.model.GetStockPositionAndMarketValueApiResponseDTOAuto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link AutoStockPositionMarketValueApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-04-15T08:44:52.405243057Z[Etc/UTC]")
public interface AutoStockPositionMarketValueApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /auto-stock-position-market-value/{symbol} : Find stock position and market value by symbol
     * Returns a GetStockPositionAndMarketValueApiResponseDTO
     *
     * @param symbol name of the symbol (required)
     * @return successful operation (status code 200)
     * @see AutoStockPositionMarketValueApi#autoStockPositionMarketValueSymbolGet
     */
    default Mono<ResponseEntity<GetStockPositionAndMarketValueApiResponseDTOAuto>> autoStockPositionMarketValueSymbolGet(String symbol,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"symbol\" : \"symbol\", \"quantity\" : 0.8008281904610115, \"cost\" : 6.027456183070403, \"marketValue\" : 1.4658129805029452, \"currencyCode\" : \"currencyCode\" }";
                result = ApiUtil.getExampleResponse(exchange, mediaType, exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

}
