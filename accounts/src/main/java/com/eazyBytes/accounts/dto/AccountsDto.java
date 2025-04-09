package com.eazyBytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information")
@Data
public class    AccountsDto {
    //    private Long accountNumber;
//    private String accountType;
//    private String branchAddress;
    @NotEmpty(message = "AccountNumber can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(
            description = "Account number of easyBank account ",example = "1234567890"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType can not be a null or empty")
    @Schema(
            description = "AccountType of easyBank account ",example = "SAVINGS"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress can not be a null or empty")
    @Schema(
            description = "Easy Bank branch address"
    )
    private String branchAddress;
}
