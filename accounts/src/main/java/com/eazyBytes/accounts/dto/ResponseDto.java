package com.eazyBytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema to hold Response information"
)
@Data
@AllArgsConstructor
public class ResponseDto {
    @Schema(
            description = "Response code of the request"
    )
    private String statusCode;
    @Schema(
            description = "Response message of the request"
    )
    private String statusMsg;
}
