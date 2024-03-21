package com.spring.Mokito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class SomeBussinessimplMokeTest {

    @Mock
    private Datasource datasource;
    @InjectMocks
    SomeBussinessiml someBussinessiml;

    @Test
    void test(){
//        Datasource dataServiceMock=mock(Datasource.class); // when we will write the @Mock and @injectMocks then no need to write this line.
        when(datasource.maxnum()).thenReturn(new int[]{25,15,5});
//        SomeBussinessiml someBussinessiml=new SomeBussinessiml(dataServiceMock);
        int maxfind = someBussinessiml.maxfind();
        assertEquals(25,maxfind);
    }
    @Test
    void test_OneValue(){
        Datasource dataServiceMock=mock(Datasource.class);
        when(dataServiceMock.maxnum()).thenReturn(new int[]{35});
        SomeBussinessiml someBussinessiml=new SomeBussinessiml(dataServiceMock);
        int maxfind = someBussinessiml.maxfind();
        assertEquals(35,maxfind);
    }

}
