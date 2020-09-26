package javatpoint;

import javatpoint.CIWithCollection.Question;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestQuestion {
    public static void main(String[] args) {
        Resource r=new ClassPathResource("CIWithCollection/questionContext.xml");
        BeanFactory factory=new XmlBeanFactory(r);

        Question q=(Question)factory.getBean("q");
        q.displayInfo();

    }
}