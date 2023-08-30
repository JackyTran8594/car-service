package com.hta.carservice.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.hta.carservice.IntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Test class for the ExamineeResource REST controller.
 *
 * @see ExamineeResource
 */
@IntegrationTest
class ExamineeResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        ExamineeResource examineeResource = new ExamineeResource();
        restMockMvc = MockMvcBuilders.standaloneSetup(examineeResource).build();
    }

    /**
     * Test search
     */
    @Test
    void testSearch() throws Exception {
        restMockMvc.perform(get("/api/examinee/search")).andExpect(status().isOk());
    }

    /**
     * Test create
     */
    @Test
    void testCreate() throws Exception {
        restMockMvc.perform(post("/api/examinee/create")).andExpect(status().isOk());
    }

    /**
     * Test update
     */
    @Test
    void testUpdate() throws Exception {
        restMockMvc.perform(put("/api/examinee/update")).andExpect(status().isOk());
    }

    /**
     * Test getById
     */
    @Test
    void testGetById() throws Exception {
        restMockMvc.perform(get("/api/examinee/get-by-id")).andExpect(status().isOk());
    }

    /**
     * Test deleteById
     */
    @Test
    void testDeleteById() throws Exception {
        restMockMvc.perform(delete("/api/examinee/delete-by-id")).andExpect(status().isOk());
    }

    /**
     * Test deleteAll
     */
    @Test
    void testDeleteAll() throws Exception {
        restMockMvc.perform(post("/api/examinee/delete-all")).andExpect(status().isOk());
    }
}
