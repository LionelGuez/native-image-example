package somepackage;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;

@TargetClass(JavaClass.class)
final public class SubstrateClass {
    @Substitute
    public void printMyself(){
        System.out.println("Hello I'm native-image code");
    }
}

