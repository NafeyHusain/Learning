package com.sprintboot.learning.Leaning;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class ReactorTest {


    @Test
    public void testingMono(){
        Mono<?> monoreactor=Mono.just("Hello").then(Mono.error(new RuntimeException("Exception Occured"))).log();

    }
}
