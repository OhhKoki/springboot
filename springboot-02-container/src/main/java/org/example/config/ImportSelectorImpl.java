package org.example.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ImportSelectorImpl implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 需要往容器中添加哪些 Bean 对象，就往这个数组中添加该对象的全限定类名
        return new String[]{"org.example.entity.Person"};
    }

}
