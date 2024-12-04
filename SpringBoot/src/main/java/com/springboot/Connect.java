package com.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/classification")
public class Connect {
    @PostMapping
    public ResponseEntity<Map<String, Object>> classifyReview(@RequestParam("review") String review) {
        System.out.println("Received review: " + review);

        // 반환 데이터
        Map<String, Object> response = Map.of(
                "result", Map.of(
                        "label", "LABEL_1",
                        "score", 0.95 // 임의의 점수
                )
        );

        return ResponseEntity.ok(response);
    }
}
