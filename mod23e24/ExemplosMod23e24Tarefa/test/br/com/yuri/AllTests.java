package br.com.yuri;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SelectClasses({ ClienteServiceTest.class, ContratoServiceTest.class })
public class AllTests {

}
