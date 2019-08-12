package com.jack.tmall.web;

import com.jack.tmall.pojo.Property;
import com.jack.tmall.service.PropertyService;
import com.jack.tmall.util.Page4Navigator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @GetMapping("/categories/{cid}/properties")
    public Page4Navigator<Property> list(@PathVariable("cid")int cid, @RequestParam(value = "start",defaultValue = "0")int start,@RequestParam(value = "size",defaultValue = "5")int size)throws Exception{

        start=start<0?0:start;
        Page4Navigator<Property> page = propertyService.list(cid, start, size, 5);
        return page;
    }

    @GetMapping("/properties/{id}")
    public Property get(@PathVariable("id") int id){
        return propertyService.get(id);
    }

    @PostMapping("/properties")
    public void add(@RequestBody Property bean){
         propertyService.add(bean);
    }

    @DeleteMapping("/properties/{id}")
    public void delete(@PathVariable("id") int id){
        propertyService.delete(id);
    }

    @PutMapping("/properties")
    public Property update(@RequestBody Property bean){
        propertyService.update(bean);
        return bean;
    }


}
