package com.example.openapicodegenerator.controller;

import com.example.openapicodegenerator.domain.Product;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    @Operation(summary = "product 조회 API", description = "상태에 따른 product 조회")
    @ApiResponse(responseCode = "200", description = "상품 조회가 성공한 경우",
        content = @Content(schema = @Schema(implementation = Product.class)))
    @ApiResponse(responseCode = "400", description = "잘못된 요청")
    public ResponseEntity<List<Product>> findProductsByStatus(
            @RequestParam(required = false, defaultValue = "available") String status) {
        // 실제 로직을 추가하여 상태에 따른 상품 조회 처리
        List<Product> products = Arrays.asList(
            Product.of(1L, "Table"),
            Product.of(2L, "Chair")
        );
        return ResponseEntity.ok(products);
    }
}