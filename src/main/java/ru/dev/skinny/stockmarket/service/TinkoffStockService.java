package ru.dev.skinny.stockmarket.service;

import org.springframework.stereotype.Service;
import ru.dev.skinny.stockmarket.model.Stock;

@Service
public class TinkoffStockService implements StockService {
    @Override
    public Stock getStockByTicker(String ticker) {
        return null;
    }
}
