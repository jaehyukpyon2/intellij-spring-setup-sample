package org.zerock.springex.sample;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:../../../../../../main/webapp/WEB-INF/spring/root-context.xml")
class SampleTests {

    @Autowired
    private SampleService sampleService;

    @Test
    @DisplayName("bean 주입이 잘 되어야 한다")
    public void testService() {
        log.info(sampleService);
        assertNotNull(sampleService);
    }
}