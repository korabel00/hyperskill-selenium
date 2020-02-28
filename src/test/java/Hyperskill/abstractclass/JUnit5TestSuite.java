package Hyperskill.abstractclass;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Triangle-Rectangle-Circle Suite")
@SelectClasses({TriangleTest.class, RectangleTest.class, CircleTest.class})
class RunSuiteOne  {
}
