package com.acumatica.vmware.service;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/vmware")
public class VmWareServiceApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<>();
        s.add(VmWareService.class);
        s.add(VmWareExceptionMapper.class);
        return s;
    }
}
