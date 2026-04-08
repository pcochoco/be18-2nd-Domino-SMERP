package com.domino.smerp.workorder.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CompleteWorkOrderRequest {

    @NotNull
    //0보다 생산수량 커야함 : 최소 기준 0.0, 0.0 포함 x
    @DecimalMin(value = "0.0", inclusive = false)
    private BigDecimal producedQty;
}