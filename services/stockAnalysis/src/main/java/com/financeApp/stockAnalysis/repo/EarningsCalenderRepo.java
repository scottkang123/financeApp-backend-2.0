package com.financeApp.stockAnalysis.repo;

import com.financeApp.stockAnalysis.model.EarningsCalender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EarningsCalenderRepo extends JpaRepository<EarningsCalender, Long> {


}
