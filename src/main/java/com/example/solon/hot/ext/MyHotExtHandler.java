package com.example.solon.hot.ext;

import org.noear.solon.Solon;
import org.noear.solon.core.BeanWrap;
import org.noear.solon.core.mvc.ActionLoaderDefault;

public class MyHotExtHandler implements IHotExtHandler {
    @Override
    public void preHandle(ClassLoader classLoader, String path, byte[] content) {
        try {
            final Class<?> clz = Class.forName(path);
            BeanWrap beanWrap = new BeanWrap(Solon.context(), clz);
            final MyActionLoaderDefault actionLoader = new MyActionLoaderDefault(beanWrap);

            actionLoader.load(Solon.app());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void afterHandle(ClassLoader classLoader, Class<?> classz, String path, byte[] content) {
    }
}
