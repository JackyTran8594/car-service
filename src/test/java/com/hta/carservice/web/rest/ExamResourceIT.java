package com.hta.carservice.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.hta.carservice.IntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Test class for the ExamResource REST controller.
 *
 * @see ExamResource
 */
@IntegrationTest
class ExamResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        ExamResource examResource = new ExamResource();
        restMockMvc = MockMvcBuilders.standaloneSetup(examResource).build();
    }

    /**
     * Test getExam
     */
    @Test
    void testGetExam() throws Exception {
        restMockMvc.perform(get("/api/exam/get-exam")).andExpect(status().isOk());
    }
}
