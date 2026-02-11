Minimal demo for https://github.com/spring-projects/spring-framework/issues/36309

Start the application, got to http://localhost:8080/index, the warning will be in the log.

Example:

WARN 9421 --- [minimal-demo] [nio-8080-exec-2] o.s.w.s.h.HandlerMappingIntrospector     : Cache miss for REQUEST dispatch to '/index' (previous null). Performing CorsConfiguration lookup. This is logged once only at WARN level, and every time at TRACE.


To get rid of the warning uncomment lines 29 - 38 and the imports in DemoApplication.java.
