package com.financeApp.stockAnalysis.transformer;

import com.financeApp.stockAnalysis.serializable.DTO;
import com.financeApp.stockAnalysis.serializable.Model;

public interface Transformer<M extends Model, D extends DTO> {
    M transformDtoM(D dto);
    D transformMtoD(M model);
}
