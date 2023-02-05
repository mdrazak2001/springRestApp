package com.example.springrest;

import com.example.springrest.entities.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.ResultActions;

@SpringBootTest
@AutoConfigureMockMvc
class SpringrestApplicationTests {

	@Test
	void testRockBeatsScissors() {
		Entity rock = Entity.createEntity("rock");
		Entity scissors = Entity.createEntity("scissors");
		assertTrue(rock.beats(scissors));
	}

	@Test
	void testPaperBeatsRock() {
		Entity paper = Entity.createEntity("paper");
		Entity rock = Entity.createEntity("rock");
		assertTrue(paper.beats(rock));
	}

	@Test
	public void testScissorsBeatsPaper() {
		Entity scissors = Entity.createEntity("scissors");
		Entity paper = Entity.createEntity("paper");
		assertTrue(scissors.beats(paper));
	}

	@Autowired
	private MockMvc mockMvc;
	@Test
	public void testGetHome() throws Exception {
		mockMvc.perform(get("/"))
				.andExpect(status().isOk());
	}
	@Test
	public void testApiEndpoint() throws Exception {
		this.mockMvc.perform(post("/play?move=rock"))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.playerMove", is("rock")));
	}

}
