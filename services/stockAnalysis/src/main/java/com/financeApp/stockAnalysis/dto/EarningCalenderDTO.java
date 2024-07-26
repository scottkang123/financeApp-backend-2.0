package com.financeApp.stockAnalysis.dto;
import com.financeApp.stockAnalysis.model.EarningsCalender;
import com.financeApp.stockAnalysis.serializable.DTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Builder
public class EarningCalenderDTO implements DTO{
    private String symbol;
    private String name;
    private LocalDate reportDate;
    private LocalDate fiscalDateEnding;
    private String estimate;
    private String currency;

    @Override
    public String toString() {
        return "EarningCalenderDTO{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", reportDate='" + reportDate + '\'' +
                ", fiscalDateEnding='" + fiscalDateEnding + '\'' +
                ", estimate='" + estimate + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }


}
