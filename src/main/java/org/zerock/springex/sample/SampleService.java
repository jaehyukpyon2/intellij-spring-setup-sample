package org.zerock.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@ToString
public class SampleService {

    /*@Autowired
    private SampleDAO sampleDAO;*/

    private final SampleDAO sampleDAO;
}
