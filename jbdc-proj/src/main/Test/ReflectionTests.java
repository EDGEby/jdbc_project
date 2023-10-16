import dao.impl.ProductDAOImpl;
import model.Product;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTests {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Product product1 = new Product();
        Product product2 = new Product();

        //root reflection class
        Class<Product> pClass = Product.class;


        System.out.println(pClass == product1.getClass());
        System.out.println(pClass == product2.getClass());

        System.out.println("---------- Fields name");
        for(Field field : pClass.getDeclaredFields()){
            String fieldName = field.getName();
            System.out.println(fieldName);
        }

        System.out.println("---------- Methods name");
        for (Method method : pClass.getDeclaredMethods()){
            String methodName = method.getName();
            if (methodName.startsWith("set"))
                System.out.println(methodName);

            if (methodName.startsWith("get")){
                Object o = method.invoke(product1, null);
                System.out.println(o);
            }
        }


        new ProductDAOImpl().findById("110_4698");



    }
}
