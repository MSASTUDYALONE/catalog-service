package com.example.catalogsevice.CatalogService;

import com.example.catalogsevice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
