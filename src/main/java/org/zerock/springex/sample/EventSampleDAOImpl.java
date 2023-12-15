package org.zerock.springex.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
@Qualifier(value = "event")
@ToString
public class EventSampleDAOImpl implements SampleDAO {
}
