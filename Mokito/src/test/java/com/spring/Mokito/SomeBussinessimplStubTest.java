package com.spring.Mokito;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class SomeBussinessimplStubTest {

    @Test
    void test(){
        DatasourceImp datasourceImp=new DatasourceImp();
        SomeBussinessiml someBussinessiml=new SomeBussinessiml(datasourceImp);
        int maxfind = someBussinessiml.maxfind();
        assertEquals(25,maxfind);
    }

}
class DatasourceImp implements Datasource{
   int arr[]={25,15,5};
    @Override
    public int[] maxnum() {
        return arr;
    }
}
