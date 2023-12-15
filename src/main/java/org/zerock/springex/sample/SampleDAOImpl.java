package org.zerock.springex.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "normal")
@ToString
public class SampleDAOImpl implements SampleDAO {
}
