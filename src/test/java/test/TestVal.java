package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVal {
    private static final Logger logger = LogManager.getLogger(TestVal.class);
    @Test
    public void test() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        ImmutableVal immutableVal = ImmutableVal.builder()
                .a(1)
                .second("B")
                .build();
        String json = objectMapper.writeValueAsString(
                immutableVal);
        logger.info(json);
        logger.error(json);
        ImmutableVal deserialized = objectMapper.readValue(json, ImmutableVal.class);
        assertEquals(immutableVal, deserialized);
    }
}
