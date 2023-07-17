package ru.dev.skinny.stockmarket.service;

import ru.dev.skinny.stockmarket.model.Stock;

public interface StockService {
    Stock getStockByTicker(String ticker);
}
