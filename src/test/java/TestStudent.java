import javatpoint.CIWithCollection.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestStudent {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("studentContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Student student=(Student)factory.getBean("studentbean");
        student.displayInfo();
    }
}
