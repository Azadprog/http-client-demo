package no.krsitiania.httpclient;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuerryStringTest {

    @Test

    void shouldRetrieveQuerryParameter(){
        QuerryString querryString = new QuerryString("status=200");
        assertEquals("200", querryString.getParameter("status"));

    }
}
