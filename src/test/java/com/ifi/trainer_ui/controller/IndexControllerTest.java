package com.ifi.trainer_ui.controller;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.reflect.Method;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexControllerTest {

    @Test
    public void controllerShouldBeAnnotated(){
        assertNotNull(IndexController.class.getAnnotation(Controller.class)); 
    }

    @Test
    public void index_shouldReturnTheNameOfTheIndexTemplate() {
        IndexController indexController = new IndexController();
        String viewName = indexController.index();

        assertEquals("index", viewName); 
    }

    @Test
    public void index_shouldBeAnnotated() throws NoSuchMethodException {
        Method indexMethod = IndexController.class.getMethod("index");
        GetMapping getMapping = indexMethod.getAnnotation(GetMapping.class);

        assertNotNull(getMapping);
        assertArrayEquals(new String[]{"/"}, getMapping.value()); 
    }
}