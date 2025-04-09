package com.eazyBytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold Error Response information"
)

@Data
@AllArgsConstructor
public class ErrorResponseDto {
    @Schema(
            description = "API path of the request",
            example = "/v1/customers"
    )
    private  String apiPath;
    @Schema(
            description = "Error code of the request",
            example = "404"
    )
    private HttpStatus errorCode;
    @Schema(
            description = "Error message of the request",
            example = "Customer not found"
    )
    private  String errorMessage;
    @Schema(
            description = "Error time of the request",
            example = "2023-10-01T10:15:30"
    )
    private LocalDateTime errorTime;
}
