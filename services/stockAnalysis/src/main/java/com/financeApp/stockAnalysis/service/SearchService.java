package com.financeApp.stockAnalysis.service;

import com.financeApp.stockAnalysis.serializable.DTO;

import java.util.List;

public interface SearchService {
    // TODO: Simple query interpretation for now (Break into words using '+')
    String DELIMITER = "\\+";
    List<DTO> getSearchResults(String query);
}
