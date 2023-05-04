package com.kbstar.marker;

import com.kbstar.dto.Marker;
import com.kbstar.dto.MarkerSearch;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class SearchTest {
    @Autowired
    MarkerService service;

    @Test
    void contextLoads() throws Exception {

        try {
            MarkerSearch ms = new MarkerSearch("", "");
            service.search(ms);
        }catch (Exception e) {
            log.info("에러");
            e.printStackTrace();
        }
    }
}

